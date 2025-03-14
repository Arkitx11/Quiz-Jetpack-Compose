package com.example.quiz.data.repositories

import com.example.quiz.data.models.Question

val videoAnalyticsQuestionsList = listOf(
    // 1. Video Analytics Basics
    Question(
        id = 1,
        question = "What is video analytics?",
        options = listOf("Extracting info from videos", "Editing videos", "Streaming videos", "Compressing videos"),
        answer = "Extracting info from videos"
    ),
    // 2. Frame Differencing
    Question(
        id = 2,
        question = "What is frame differencing used for?",
        options = listOf("Motion detection", "Color correction", "Video compression", "Noise reduction"),
        answer = "Motion detection"
    ),
    // 3. Background Subtraction
    Question(
        id = 3,
        question = "What does background subtraction accomplish?",
        options = listOf("Isolate moving objects", "Enhance colors", "Stabilize video", "Add effects"),
        answer = "Isolate moving objects"
    ),
    // 4. Object Tracking
    Question(
        id = 4,
        question = "What is the goal of object tracking in videos?",
        options = listOf("Follow objects over time", "Increase resolution", "Change frame rate", "Enhance contrast"),
        answer = "Follow objects over time"
    ),
    // 5. Optical Flow
    Question(
        id = 5,
        question = "What does optical flow measure?",
        options = listOf("Motion between frames", "Color intensity", "Frame brightness", "Edge detection"),
        answer = "Motion between frames"
    ),
    // 6. Feature Extraction
    Question(
        id = 6,
        question = "Why is feature extraction important in video analytics?",
        options = listOf("To reduce dimensionality", "To increase file size", "To alter frame rate", "To enhance audio"),
        answer = "To reduce dimensionality"
    ),
    // 7. Video Segmentation
    Question(
        id = 7,
        question = "What is video segmentation?",
        options = listOf("Dividing video into parts", "Compressing video", "Color correction", "Frame interpolation"),
        answer = "Dividing video into parts"
    ),
    // 8. Action Recognition
    Question(
        id = 8,
        question = "What does action recognition in video analytics involve?",
        options = listOf("Identifying human actions", "Measuring brightness", "Editing sequences", "Audio filtering"),
        answer = "Identifying human actions"
    ),
    // 9. Spatiotemporal Analysis
    Question(
        id = 9,
        question = "What does spatiotemporal analysis study?",
        options = listOf("Space and time features", "Color and texture", "Audio and video sync", "Compression and bitrate"),
        answer = "Space and time features"
    ),
    // 10. Deep Video Analytics
    Question(
        id = 10,
        question = "Which approach is increasingly used for advanced video analytics?",
        options = listOf("Deep learning", "Simple thresholding", "Basic filtering", "Manual tagging"),
        answer = "Deep learning"
    )
)