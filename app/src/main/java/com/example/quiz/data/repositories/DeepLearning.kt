package com.example.quiz.data.repositories

import com.example.quiz.data.models.Question

val deepLearningQuestionsList = listOf(
    // 1. Neural Network Basics
    Question(
        id = 1,
        question = "What is a perceptron?",
        options = listOf("Basic neuron", "Optimization algo", "Clustering method", "Data transformer"),
        answer = "Basic neuron"
    ),
    // 2. Backpropagation
    Question(
        id = 2,
        question = "What is backpropagation used for?",
        options = listOf("Training neural networks", "Data preprocessing", "Feature selection", "Model evaluation"),
        answer = "Training neural networks"
    ),
    // 3. Activation Functions
    Question(
        id = 3,
        question = "Why are activation functions important?",
        options = listOf("Introduce non-linearity", "Reduce dimensions", "Optimize weights", "Scale data"),
        answer = "Introduce non-linearity"
    ),
    // 4. Deep vs. Shallow Networks
    Question(
        id = 4,
        question = "What distinguishes deep networks from shallow ones?",
        options = listOf("More hidden layers", "Different activation", "Larger input size", "Lower training error"),
        answer = "More hidden layers"
    ),
    // 5. Dropout
    Question(
        id = 5,
        question = "What is the purpose of dropout in neural networks?",
        options = listOf("Prevent overfitting", "Increase speed", "Data augmentation", "Reduce dimensions"),
        answer = "Prevent overfitting"
    ),
    // 6. Convolutional Operation
    Question(
        id = 6,
        question = "In CNNs, what does convolution do?",
        options = listOf("Extract features", "Reduce noise", "Augment data", "Optimize weights"),
        answer = "Extract features"
    ),
    // 7. Recurrent Neural Networks
    Question(
        id = 7,
        question = "RNNs are best suited for:",
        options = listOf("Sequential data", "Image recognition", "Clustering", "Regression"),
        answer = "Sequential data"
    ),
    // 8. Transfer Learning
    Question(
        id = 8,
        question = "What is transfer learning?",
        options = listOf("Reuse pre-trained models", "Train from scratch", "Ensemble models", "Feature scaling"),
        answer = "Reuse pre-trained models"
    ),
    // 9. Generative Adversarial Networks
    Question(
        id = 9,
        question = "What is the main idea behind GANs?",
        options = listOf("Adversarial training", "Supervised learning", "Reinforcement", "Clustering"),
        answer = "Adversarial training"
    ),
    // 10. Transformer Architectures
    Question(
        id = 10,
        question = "What innovation is key in transformer models?",
        options = listOf("Self-attention mechanism", "Convolutions", "Recurrent loops", "Dropout layers"),
        answer = "Self-attention mechanism"
    )
)