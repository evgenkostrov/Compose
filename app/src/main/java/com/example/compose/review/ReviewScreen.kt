package com.example.compose.review

import com.example.compose.ui.theme.textWarningColor
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.TextButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.R
import com.example.compose.models.*
import com.example.compose.review.components.ReviewCard
import com.example.compose.ui.theme.Purple200
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
                avatarUrl = "https://images.unsplash.com/photo-1598705352140-be8e33a97d55?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1338&q=80"
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

                Card(
                    modifier = Modifier
                        .height(100.dp)
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(
                        topStart = 25.dp,
                        topEnd = 25.dp
                    ),
                    elevation = 10.dp
                ) {    Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_thumb_up_24),
                    contentDescription = null,
                    tint = Purple200,
                    modifier = Modifier.size(20.dp)
                )
                    Column(
                        modifier = Modifier
                            .offset(y=10.dp)
                            .fillMaxWidth()
                            .padding(horizontal = 24.dp),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Text(text = "Hot bids", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                        Text(text = "Hot bids", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    }
                }

                Card(
                    modifier = Modifier
                        .offset(y=10.dp)
                        .height(100.dp)
                        .width(290.dp),
                    shape = RoundedCornerShape(
                        bottomStart = 25.dp,
                        bottomEnd = 25.dp
                    ),
                    elevation = 10.dp
                ) {

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
            }

            Text(
                text = "Find the best \nNFTArt\uD83D\uDCA5",
                fontWeight = FontWeight.Bold,
                fontSize = 26.sp,
                lineHeight = 34.sp
            )



        Box(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
        ) {
            Column(
                modifier = Modifier.padding(horizontal = 24.dp),
                verticalArrangement = Arrangement.spacedBy(18.dp)
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

        ReviewScreen()
}