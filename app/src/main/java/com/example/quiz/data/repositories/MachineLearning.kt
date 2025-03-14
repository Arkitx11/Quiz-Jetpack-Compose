package com.example.quiz.data.repositories

import com.example.quiz.data.models.Question

val machineLearningQuestionsList = listOf(
    // 1. Basic Concept
    Question(
        id = 1,
        question = "What is supervised learning?",
        options = listOf("Labeled data", "Unlabeled data", "Random search", "None"),
        answer = "Labeled data"
    ),
    // 2. Overfitting
    Question(
        id = 2,
        question = "What does overfitting mean?",
        options = listOf("Model learns noise", "Model is too simple", "No training error", "Underfitting"),
        answer = "Model learns noise"
    ),
    // 3. Classification Algorithm
    Question(
        id = 3,
        question = "Which algorithm is commonly used for binary classification?",
        options = listOf("Logistic Regression", "K-Means", "PCA", "Apriori"),
        answer = "Logistic Regression"
    ),
    // 4. Regularization Purpose
    Question(
        id = 4,
        question = "What is the primary purpose of regularization?",
        options = listOf("Prevent overfitting", "Increase training speed", "Reduce bias", "Enhance features"),
        answer = "Prevent overfitting"
    ),
    // 5. Bias-Variance Tradeoff
    Question(
        id = 5,
        question = "The bias-variance tradeoff is about:",
        options = listOf("Balancing underfitting and overfitting", "Choosing the right features", "Improving data quality", "Speeding up training"),
        answer = "Balancing underfitting and overfitting"
    ),
    // 6. Cross-Validation
    Question(
        id = 6,
        question = "What is cross-validation used for?",
        options = listOf("Model evaluation", "Feature extraction", "Data augmentation", "Parameter initialization"),
        answer = "Model evaluation"
    ),
    // 7. Clustering Algorithm
    Question(
        id = 7,
        question = "Which algorithm is used for unsupervised clustering?",
        options = listOf("K-Means", "Decision Trees", "SVM", "Linear Regression"),
        answer = "K-Means"
    ),
    // 8. Ensemble Learning
    Question(
        id = 8,
        question = "Ensemble learning involves:",
        options = listOf("Combining multiple models", "Using a single model", "Data scaling", "Feature selection"),
        answer = "Combining multiple models"
    ),
    // 9. Optimization Technique
    Question(
        id = 9,
        question = "What is gradient descent used for?",
        options = listOf("Optimization", "Clustering", "Regularization", "Dimensionality reduction"),
        answer = "Optimization"
    ),
    // 10. Boosting
    Question(
        id = 10,
        question = "How does boosting improve model performance?",
        options = listOf("Combining weak learners", "Averaging strong models", "Reducing data noise", "Increasing model depth"),
        answer = "Combining weak learners"
    )
)