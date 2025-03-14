package com.example.quiz.data.repositories

import com.example.quiz.data.models.Question

val dataStructuresQuestionsList = listOf(
    // 1. Fibonacci Heap decrease-key
    Question(
        id = 1,
        question = "Fibonacci Heap decrease-key?",
        options = listOf("O(1)", "O(log)", "O(n)", "O(nα)"),
        answer = "O(1)"
    ),
    // 2. Splay tree access cost
    Question(
        id = 2,
        question = "Splay tree cost?",
        options = listOf("amort.", "worst", "avg", "best"),
        answer = "amort."
    ),
    // 3. Persistent DS update technique
    Question(
        id = 3,
        question = "Persistent update?",
        options = listOf("path", "copy", "lazy", "redo"),
        answer = "path"
    ),
    // 4. Optimal BST with Knuth's optimization
    Question(
        id = 4,
        question = "Optimal BST?",
        options = listOf("O(n²)", "O(n³)", "O(n)", "O(nlog)"),
        answer = "O(n²)"
    ),
    // 5. k-d Tree in high dimensions
    Question(
        id = 5,
        question = "k-d Tree high-d?",
        options = listOf("slow", "fast", "best", "none"),
        answer = "slow"
    ),
    // 6. Union-Find efficiency trick
    Question(
        id = 6,
        question = "UF trick?",
        options = listOf("rank", "size", "link", "none"),
        answer = "rank"
    ),
    // 7. Heap decrease-key difference
    Question(
        id = 7,
        question = "Heap dec-key?",
        options = listOf("fib", "bin", "both", "none"),
        answer = "fib"
    ),
    // 8. Suffix array construction
    Question(
        id = 8,
        question = "Suffix array?",
        options = listOf("radix", "merge", "dp", "naiv"),
        answer = "radix"
    ),
    // 9. Persistent DS: fat vs. path
    Question(
        id = 9,
        question = "Fat vs. path?",
        options = listOf("fat", "copy", "both", "diff"),
        answer = "fat"
    ),
    // 10. B-Tree vs. B+ Tree storage
    Question(
        id = 10,
        question = "B vs. B+?",
        options = listOf("leaf", "node", "both", "none"),
        answer = "leaf"
    )
)