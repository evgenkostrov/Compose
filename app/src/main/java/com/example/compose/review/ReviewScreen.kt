package com.example.compose.review

import com.example.compose.ui.theme.textWarningColor
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material.TextButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.models.*
import com.example.compose.review.components.ReviewCard
import java.text.SimpleDateFormat
import java.util.*


@Composable
fun ReviewScreen() {

    val reviewItems = listOf(
        Review(
            id = 0,
            date = SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).format(Date()),
            user = User(
                name = "Buyer",
                avatarUrl = "https://e00-elmundo.uecdn.es/assets/multimedia/imagenes/2021/10/25/16351831527188.jpg"
            ),
            ratingReview = 5,
            ratingProduct = 5,
            reviewDescription = "Lorem Ipsum",
            reviewContent = listOf()

        ),
        Review(
            id = 0,
            date = SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).format(Date()),
            user = User(
                name = "Buyer",
                avatarUrl = "https://e00-elmundo.uecdn.es/assets/multimedia/imagenes/2021/10/25/16351831527188.jpg"
            ),
            ratingReview = 5,
            ratingProduct = 5,
            reviewDescription = "Lorem Ipsum",
            reviewContent = listOf()
        ),
        Review(
            id = 0,
            date = SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).format(Date()),
            user = User(
                name = "Buyer",
                avatarUrl = "https://e00-elmundo.uecdn.es/assets/multimedia/imagenes/2021/10/25/16351831527188.jpg"
            ),
            ratingReview = 5,
            ratingProduct = 5,
            reviewDescription = "Lorem Ipsum",
            reviewContent = listOf()
        ),
        Review(
            id = 0,
            date = SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).format(Date()),
            user = User(
                name = "Buyer",
                avatarUrl = "https://e00-elmundo.uecdn.es/assets/multimedia/imagenes/2021/10/25/16351831527188.jpg"
            ),
            ratingReview = 5,
            ratingProduct = 5,
            reviewDescription = "Lorem Ipsum",
            reviewContent = listOf()
        ),
    )

    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
            .padding(vertical = 24.dp)
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "Find the best \nNFTArt\uD83D\uDCA5",
                fontWeight = FontWeight.Bold,
                fontSize = 26.sp,
                lineHeight = 34.sp
            )

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Hot bids", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                TextButton(onClick = { /*TODO*/ }) {
                    Text(
                        text = "See all",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium,
                        color = textWarningColor
                    )
                }

            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
        ) {
            Row(
                modifier = Modifier.padding(horizontal = 24.dp),
                horizontalArrangement = Arrangement.spacedBy(18.dp)
            ) {
                for (item in reviewItems) {
                    ReviewCard(review = item)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OverviewScreenPreview() {
    Scaffold(Modifier.fillMaxWidth()) {
        ReviewScreen()
    }
}