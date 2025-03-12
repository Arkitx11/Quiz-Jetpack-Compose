package com.example.quiz.data.models

data class Question(
    val id: Int,
    val question: String,
    val options: List<String>,
    val answer: String
)