package com.example.quiz.data.repositories

import com.example.quiz.data.models.Question

val softComputingQuestionsList = listOf(
    // 1. Fuzzy Logic Basics
    Question(
        id = 1,
        question = "What is fuzzy logic?",
        options = listOf("Handling uncertainty", "Binary logic", "Precise rules", "Exact values"),
        answer = "Handling uncertainty"
    ),
    // 2. Membership Function
    Question(
        id = 2,
        question = "What does a membership function do?",
        options = listOf("Assigns degree of truth", "Calculates averages", "Counts elements", "Sorts data"),
        answer = "Assigns degree of truth"
    ),
    // 3. Fuzzy Inference
    Question(
        id = 3,
        question = "What is a fuzzy inference system used for?",
        options = listOf("Reasoning with uncertain data", "Exact computation", "Data encryption", "Sorting numbers"),
        answer = "Reasoning with uncertain data"
    ),
    // 4. Genetic Algorithms
    Question(
        id = 4,
        question = "What is a genetic algorithm?",
        options = listOf("Optimization via evolution", "Deterministic search", "Linear programming", "Statistical regression"),
        answer = "Optimization via evolution"
    ),
    // 5. Simulated Annealing
    Question(
        id = 5,
        question = "What is the main idea behind simulated annealing?",
        options = listOf("Probabilistic optimization", "Exact search", "Binary classification", "Clustering"),
        answer = "Probabilistic optimization"
    ),
    // 6. Neural Fuzzy Systems
    Question(
        id = 6,
        question = "What combines neural networks with fuzzy logic?",
        options = listOf("Neuro-fuzzy systems", "Deep networks", "Genetic programming", "SVMs"),
        answer = "Neuro-fuzzy systems"
    ),
    // 7. Evolutionary Computation
    Question(
        id = 7,
        question = "Evolutionary computation is inspired by:",
        options = listOf("Natural selection", "Deterministic rules", "Linear equations", "Static models"),
        answer = "Natural selection"
    ),
    // 8. Hard vs. Soft Computing
    Question(
        id = 8,
        question = "The difference between hard and soft computing is:",
        options = listOf("Precision vs. tolerance", "Speed vs. accuracy", "Memory vs. CPU", "Static vs. dynamic"),
        answer = "Precision vs. tolerance"
    ),
    // 9. Swarm Intelligence
    Question(
        id = 9,
        question = "What is swarm intelligence?",
        options = listOf("Collective problem solving", "Individual optimization", "Linear search", "Exact reasoning"),
        answer = "Collective problem solving"
    ),
    // 10. Soft Computing in NP-Hard Problems
    Question(
        id = 10,
        question = "How does soft computing help solve NP-hard problems?",
        options = listOf("Provides approximate solutions", "Guarantees optimality", "Eliminates complexity", "Uses brute force"),
        answer = "Provides approximate solutions"
    )
)