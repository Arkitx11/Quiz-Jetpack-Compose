package com.example.quiz.ui.test

import com.example.quiz.data.repository.testQuestions
import com.example.quiz.data.models.Question
import com.example.quiz.ui.QuizViewModel
import org.junit.Test
import org.junit.Assert.*

class QuizViewModelTest {
    private val viewModel = QuizViewModel(questionsList = testQuestions)

    // Test to select the correct answer, update the score and then update the state with new Screen
    @Test
    fun quizViewModel_correctAnswerSelected_updateScoreAndNextQuestion() {
        val currentQuizUiState = viewModel.uiState.value
        val currentScore = currentQuizUiState.highScore
        viewModel.onTap(currentQuizUiState.answer)
        val newQuizUiState = viewModel.uiState.value
        val updateScore = newQuizUiState.highScore
        assertNotEquals("Score gets incremented", updateScore, currentScore)
        assertNotEquals(
            "Question gets updated",
            currentQuizUiState.question,
            newQuizUiState.question
        )
        assertNotEquals("Answer gets updated", currentQuizUiState.answer, newQuizUiState.answer)
        assertNotEquals(
            "Progress bar gets incremented",
            currentQuizUiState.quizProgress, newQuizUiState.quizProgress
        )
        assertNotEquals("Options gets updated", currentQuizUiState.options, newQuizUiState.options)
    }

    // Test to simulate wrong answer
    @Test
    fun quizViewModel_wrongAnswerSelected_nextQuestion() {
        val currentQuizUiState = viewModel.uiState.value
        val currentScore = currentQuizUiState.highScore
        viewModel.onTap(currentQuizUiState.question) // Simulating wrong answer by passing the question itself
        val newQuizUiState = viewModel.uiState.value
        val updatedScore = newQuizUiState.highScore
        assertEquals("Score doesn't get updated", currentScore, updatedScore)
    }

    // Test to simulate reset dialog pop up logic and dialog dismisss
    @Test
    fun quizViewModel_onPressingResetAndDismiss_progressConstant() {
        // Simulate a few correct answers
        repeat(3) {
            viewModel.onTap(viewModel.uiState.value.answer)
        }
        val currentQuizUiState = viewModel.uiState.value
        val currentQuizProgress = currentQuizUiState.quizProgress
        var showResetDialog = currentQuizUiState.showResetDialog
        assertEquals("Reset Dialog Box is not shown", false, showResetDialog)
        viewModel.onPressingResetIcon()
        showResetDialog = viewModel.uiState.value.showResetDialog
        assertEquals("Reset Dialog Box is shown", true, showResetDialog)
        viewModel.resetDialogReset()
        showResetDialog = viewModel.uiState.value.showResetDialog
        assertEquals("Reset Dialog Box is dismissed", false, showResetDialog)
        val updatedQuizProgress = currentQuizUiState.quizProgress
        assertEquals("Progress is preserved", currentQuizProgress, updatedQuizProgress)
    }

    // Test that score dialog box is shown upon quiz completion
    @Test
    fun quizViewModel_onQuizCompletion_showResultDialog() {
        // Completing all quiz questions to trigger the end of the quiz state
        repeat(viewModel.questionsCount) {
            val currentCorrectAnswer = viewModel.uiState.value.answer
            viewModel.onTap(currentCorrectAnswer)
        }
        val updatedQuizState = viewModel.uiState.value
        assertTrue("Score Dialog pop up is shown", updatedQuizState.showScoreDialog)
    }

    @Test
    fun quizViewModel_emptyQuestionsListInstanitation() {
        assertThrows(IllegalArgumentException::class.java) {
            QuizViewModel(questionsList = listOf<Question>())
        }
    }


}