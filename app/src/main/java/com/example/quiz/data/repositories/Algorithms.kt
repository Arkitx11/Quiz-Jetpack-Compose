package com.example.quiz.data.repositories

import com.example.quiz.data.models.Question

val algorithmsQuestionsList = listOf(
    // 1. QuickSort average complexity
    Question(
        id = 1,
        question = "What is the average-case time complexity of QuickSort?",
        options = listOf("n log n", "n²", "n", "log n"),
        answer = "n log n"
    ),
    // 2. MergeSort average complexity
    Question(
        id = 2,
        question = "What is the average-case time complexity of MergeSort?",
        options = listOf("n log n", "n²", "n", "log n"),
        answer = "n log n"
    ),
    // 3. Dijkstra's algorithm type
    Question(
        id = 3,
        question = "Dijkstra's algorithm is an example of which approach?",
        options = listOf("Greedy", "DP", "BFS", "DFS"),
        answer = "Greedy"
    ),
    // 4. Bellman-Ford time complexity
    Question(
        id = 4,
        question = "What is the time complexity of the Bellman-Ford algorithm?",
        options = listOf("O(n*m)", "O(n²)", "O(m)", "O(n)"),
        answer = "O(n*m)"
    ),
    // 5. KMP algorithm complexity
    Question(
        id = 5,
        question = "What is the time complexity of the KMP string matching algorithm?",
        options = listOf("O(n+m)", "O(n*m)", "O(n)", "O(m)"),
        answer = "O(n+m)"
    ),
    // 6. Longest Increasing Subsequence approach
    Question(
        id = 6,
        question = "Which method is most commonly used to solve the Longest Increasing Subsequence problem?",
        options = listOf("DP", "Greedy", "Binary Search", "DFS"),
        answer = "DP"
    ),
    // 7. Floyd-Warshall algorithm complexity
    Question(
        id = 7,
        question = "What is the time complexity of the Floyd-Warshall algorithm?",
        options = listOf("O(n³)", "O(n²)", "O(n log n)", "O(n)"),
        answer = "O(n³)"
    ),
    // 8. Prim's algorithm application
    Question(
        id = 8,
        question = "Prim's algorithm is used to find which of the following?",
        options = listOf("MST", "SP", "TS", "Matching"),
        answer = "MST"
    ),
    // 9. Sieve of Eratosthenes complexity
    Question(
        id = 9,
        question = "What is the time complexity of the Sieve of Eratosthenes?",
        options = listOf("O(n log log n)", "O(n)", "O(n log n)", "O(n²)"),
        answer = "O(n log log n)"
    ),
    // 10. NP-complete problems description
    Question(
        id = 10,
        question = "Which label best describes NP-complete problems?",
        options = listOf("NPC", "P", "NP", "Undecidable"),
        answer = "NPC"
    )
)