package com.example.quiz.ui

import androidx.lifecycle.ViewModel
import com.example.quiz.data.models.Question
import com.example.quiz.data.repositories.questions
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class QuizViewModel(
    questionsList: List<Question> = questions
) : ViewModel() {
    // Sanitized list containing only valid questions
    val sanitizedQuestionsList: List<Question> = questionsList.filter {
        it.question.isNotBlank() &&
                it.answer.isNotBlank() &&
                it.options.isNotEmpty() &&
                it.options.contains(it.answer)
    }
    private val questionsCount = sanitizedQuestionsList.size
    private val _uiState =
        MutableStateFlow(
            QuizScreenState(
            )
        )

    init {
        require(questionsList.isNotEmpty()) {
            "QuizViewModel requires a non-empty questions List"
        }
        initalizeState()
    }

    val uiState: StateFlow<QuizScreenState> = _uiState.asStateFlow()
    private val scoreCountIncrement: Int = 10
    var currentQuestionIndex = 0
    private val progressIncrement = if (questionsCount > 0) 1f / questionsCount else 0f

    private fun initalizeState() {
        val question = sanitizedQuestionsList.first()
        _uiState.update {
            it.copy(
                answer = question.answer,
                options = question.options,
                question = question.question
            )
        }
    }

    fun resetDialogReset() {
        _uiState.update { it.copy(showResetDialog = false) }
    }

    fun onPressingResetIcon() {
        _uiState.update { it.copy(showResetDialog = true) }
    }

    fun onTap(option: String) {
        if (option == _uiState.value.answer) _uiState.update { it.copy(highScore = it.highScore + scoreCountIncrement) }
        nextQuestion()
    }

    private fun nextQuestion() {
        currentQuestionIndex++
        if (currentQuestionIndex >= questionsCount)
            _uiState.update {
                it.copy(
                    quizProgress = 1.0f,
                    isCompleted = true,
                    showScoreDialog = true
                )
            }
        else {
            val currentIndexQuestion = sanitizedQuestionsList[currentQuestionIndex]
            _uiState.update {
                it.copy(
                    question = currentIndexQuestion.question,
                    answer = currentIndexQuestion.answer,
                    options = currentIndexQuestion.options,
                    quizProgress = it.quizProgress + progressIncrement
                )
            }
        }
    }

    fun onPressingResetButton() {
        currentQuestionIndex = 0
        _uiState.update { QuizScreenState() }
        initalizeState()
    }

}