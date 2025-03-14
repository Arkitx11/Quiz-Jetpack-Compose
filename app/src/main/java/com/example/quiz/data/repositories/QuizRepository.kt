package com.example.quiz.data.repositories

import com.example.quiz.data.models.Question

object QuizRepository {
    fun getQuestions(index: Int): List<Question> {
        return when (index) {
            1 -> flutterQuestionsList
            2 -> algorithmsQuestionsList
            3 -> dataStructuresQuestionsList
            4 -> deepLearningQuestionsList
            5 -> machineLearningQuestionsList
            6 -> softComputingQuestionsList
            else -> videoAnalyticsQuestionsList
        }
    }

    fun getTopicsTitle(): List<String> {
        return listOf(
            "Flutter",
            "Algorithms",
            "Data Structures",
            "Deep Learning",
            "Machine Learning",
            "Soft Computing",
            "Video Analytics"
        )
    }
}
