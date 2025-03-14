package com.example.quiz.data.repositories

import com.example.quiz.data.models.Question

val questions: List<Question> = listOf(
val flutterQuestionsList: List<Question> = listOf(
    Question(
        id = 1,
        question = "What is Flutter?",
        options = listOf("A bird", "A UI framework", "A programming language", "A game engine"),
        answer = "A UI framework"
    ),
    Question(
        id = 2,
        question = "Who developed Dart?",
        options = listOf("Google", "Microsoft", "Facebook", "Apple"),
        answer = "Google"
    ),
    Question(
        id = 3,
        question = "Which widget is immutable?",
        options = listOf("StatefulWidget", "StatelessWidget", "InheritedWidget", "Container"),
        answer = "StatelessWidget"
    ),
    Question(
        id = 4,
        question = "Which language does Flutter use?",
        options = listOf("Java", "Swift", "Dart", "Kotlin"),
        answer = "Dart"
    ),
    Question(
        id = 5,
        question = "What is the parent class of all Flutter widgets?",
        options = listOf("Widget", "Element", "RenderObject", "State"),
        answer = "Widget"
    ),
    Question(
        id = 6,
        question = "Which widget is used to create a scrollable list?",
        options = listOf("Column", "Row", "ListView", "Container"),
        answer = "ListView"
    ),
    Question(
        id = 7,
        question = "Which method is called when a StatefulWidget is created?",
        options = listOf("build()", "initState()", "dispose()", "setState()"),
        answer = "initState()"
    ),
    Question(
        id = 8,
        question = "How do you update the UI in a StatefulWidget?",
        options = listOf("Call setState()", "Rebuild the widget", "Use GlobalKey", "Restart the app"),
        answer = "Call setState()"
    ),
    Question(
        id = 9,
        question = "What does the pubspec.yaml file contain?",
        options = listOf("Dart code", "Widget tree", "Project metadata and dependencies", "Database schema"),
        answer = "Project metadata and dependencies"
    ),
    Question(
        id = 10,
        question = "Which widget allows user input?",
        options = listOf("Text", "TextField", "Container", "Row"),
        answer = "TextField"
    )
)
