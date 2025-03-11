package com.example.quiz.ui

data class QuizScreenState(
    val question: String = "",
    val options: List<String> = listOf(),
    val answer: String = "",
    val quizProgress: Float = 0.0f,
    val isCompleted: Boolean = false,
    val highScore: Int = 0,
    val showResetDialog: Boolean = false,
    val showScoreDialog: Boolean = false
)