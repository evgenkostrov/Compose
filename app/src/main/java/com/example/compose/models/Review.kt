package com.example.compose.models

import java.util.*

data class Review(
    val id: Int,
    val user: User,
    val date: Date,
    val ratingReview:Int,
    val ratingProduct:Int,
    val reviewDescription: String,
    val reviewContent: List<ReviewContent>
)