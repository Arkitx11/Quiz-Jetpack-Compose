package com.example.quiz.data.repository

import com.example.quiz.data.models.Question

val testQuestions = listOf(
    // 1. Valid question
    Question(
        id = 1,
        question = "What is the capital of France?",
        options = listOf("Paris", "Berlin", "Madrid", "Rome"),
        answer = "Paris"
    ),
    // 2. Error: Question is an empty string
    Question(
        id = 2,
        question = "",
        options = listOf("Option1", "Option2", "Option3"),
        answer = "Option1"
    ),
    // 3. Error: Question is only whitespace
    Question(
        id = 3,
        question = "    ",
        options = listOf("Yes", "No"),
        answer = "Yes"
    ),
    // 4. Error: Options list is empty
    Question(
        id = 4,
        question = "What is 2 + 2?",
        options = emptyList(),
        answer = "4"
    ),
    // 5. Error: Options list contains only one element
    Question(
        id = 5,
        question = "Select the correct answer for 1+1",
        options = listOf("2"),
        answer = "2"
    ),
    // 6. Error: Answer not present in options
    Question(
        id = 6,
        question = "What is the largest ocean on Earth?",
        options = listOf("Atlantic", "Indian", "Arctic"),
        answer = "Pacific"
    ),
    // 7. Error: Answer is an empty string
    Question(
        id = 7,
        question = "Which element does 'O' represent?",
        options = listOf("Oxygen", "Gold", "Silver", "Iron"),
        answer = ""
    ),
    // 8. Error: Options list contains a blank option
    Question(
        id = 8,
        question = "Which is a programming language?",
        options = listOf("Kotlin", "  ", "Python", "Java"),
        answer = "Python"
    ),
    // 9. Error: Answer is only whitespace
    Question(
        id = 9,
        question = "What is the chemical symbol for water?",
        options = listOf("H2O", "CO2", "NaCl", "O2"),
        answer = "    "
    ),
    // 10. Valid question (a control case)
    Question(
        id = 10,
        question = "Which planet is known as the Red Planet?",
        options = listOf("Mars", "Venus", "Earth", "Jupiter"),
        answer = "Mars"
    ),
    // 11. Edge: Duplicate options (not an error if answer is present)
    Question(
        id = 11,
        question = "Which animal is known as the king of the jungle?",
        options = listOf("Lion", "Lion", "Tiger", "Elephant"),
        answer = "Lion"
    ),
    // 12. Subtle: Options with extra whitespace; answer matches one option exactly
    Question(
        id = 12,
        question = "What is the boiling point of water at sea level?",
        options = listOf("100°C", " 100°C", "90°C", "110°C"),
        answer = "100°C"
    ),
    // 13. Error: Answer case does not match any option (if filtering is case-sensitive)
    Question(
        id = 13,
        question = "Who is the author of '1984'?",
        options = listOf("George Orwell", "Aldous Huxley", "Ray Bradbury", "J.K. Rowling"),
        answer = "george orwell"
    ),
    // 14. Valid question
    Question(
        id = 14,
        question = "What is the capital of Japan?",
        options = listOf("Tokyo", "Osaka", "Kyoto", "Nagoya"),
        answer = "Tokyo"
    ),
    // 15. Error: Answer has a typo and doesn't exactly match any option
    Question(
        id = 15,
        question = "What is the largest planet in our solar system?",
        options = listOf("Earth", "Mars", "Jupiter", "Saturn"),
        answer = "Jupitar"
    ),
    // 16. Error: Question is only tab characters
    Question(
        id = 16,
        question = "\t\t",
        options = listOf("OptionA", "OptionB"),
        answer = "OptionA"
    ),
    // 17. Valid question with proper formatting
    Question(
        id = 17,
        question = "What does CPU stand for?",
        options = listOf(
            "Central Processing Unit",
            "Computer Personal Unit",
            "Central Performance Unit",
            "Core Processing Unit"
        ),
        answer = "Central Processing Unit"
    ),
    // 18. Error: Options list includes a blank string as one of the options
    Question(
        id = 18,
        question = "What is the primary color of the sky?",
        options = listOf("", "Blue", "Green", "Red"),
        answer = "Blue"
    ),
    // 19. Error: Both question and answer are blank
    Question(
        id = 19,
        question = "",
        options = listOf("Option1", "Option2"),
        answer = ""
    ),
    // 20. Error: Options list has only one valid option and the rest are blank
    Question(
        id = 20,
        question = "Which programming language is used for Android development?",
        options = listOf("Kotlin", "", "   ", "\t"),
        answer = "Kotlin"
    ),
    // 21. Valid question but with extra spaces in the question text
    Question(
        id = 21,
        question = "  What is the tallest mountain in the world?  ",
        options = listOf("K2", "Everest", "Kangchenjunga", "Lhotse"),
        answer = "Everest"
    ),
    // 22. Error: Answer does not match any option due to trailing space
    Question(
        id = 22,
        question = "Which fruit is typically red?",
        options = listOf("Apple", "Banana", "Grapes", "Orange"),
        answer = "Apple "  // note the trailing space
    ),
    // 23. Valid question (for control)
    Question(
        id = 23,
        question = "What is the smallest prime number?",
        options = listOf("1", "2", "3", "5"),
        answer = "2"
    ),
    // 24. Error: Answer is a partial match (should be full match)
    Question(
        id = 24,
        question = "Who discovered penicillin?",
        options = listOf("Alexander Fleming", "Marie Curie", "Louis Pasteur", "Gregor Mendel"),
        answer = "Fleming"
    ),
    // 25. Valid question
    Question(
        id = 25,
        question = "Which country is known as the Land of the Rising Sun?",
        options = listOf("Japan", "China", "South Korea", "Thailand"),
        answer = "Japan"
    ),
    // 26. Error: Options list has several blank entries alongside one valid answer
    Question(
        id = 26,
        question = "Which gas do plants primarily absorb?",
        options = listOf("", "Carbon Dioxide", "", "  "),
        answer = "Carbon Dioxide"
    ),
    // 27. Valid question
    Question(
        id = 27,
        question = "What is the square root of 16?",
        options = listOf("2", "4", "8", "16"),
        answer = "4"
    ),
    // 28. Error: Question contains only special characters
    Question(
        id = 28,
        question = "!!!???",
        options = listOf("Option1", "Option2", "Option3", "Option4"),
        answer = "Option1"
    ),
    // 29. Error: Options list contains a typo among other options
    Question(
        id = 29,
        question = "What is the chemical symbol for gold?",
        options = listOf("Au", "Ag", "Gd", "Auu"),
        answer = "Au"
    ),
    // 30. Valid question
    Question(
        id = 30,
        question = "Who wrote 'To Kill a Mockingbird'?",
        options = listOf("Harper Lee", "Mark Twain", "F. Scott Fitzgerald", "Ernest Hemingway"),
        answer = "Harper Lee"
    )
)
