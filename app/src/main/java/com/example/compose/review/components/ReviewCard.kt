package com.example.compose.review.components


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.R
import com.example.compose.models.Review
import com.example.compose.ui.theme.Purple200
import com.example.compose.ui.theme.buttonContainerGray
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun ReviewCard(review: Review) {
    Card(
        shape = RoundedCornerShape(24.dp),
        backgroundColor = Color.White,
        elevation = 0.dp,
        modifier = Modifier.width(280.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(14.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {



            GlideImage(
                imageModel = review.user.avatarUrl,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(2.dp))
            )

            Text(text = review.reviewDescription, fontSize = 22.sp, fontWeight = FontWeight.Bold)
            Text(text = review.user.name, color = Color.LightGray)

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Row(
                    horizontalArrangement = Arrangement.spacedBy(14.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .background(
                                buttonContainerGray,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .padding(vertical = 8.dp, horizontal = 6.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_baseline_thumb_up_24),
                            contentDescription = null,
                            tint = Purple200,
                            modifier = Modifier.size(20.dp)
                        )
                    }

                    Column(
                        verticalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Text(
                            text = "Last bid",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.LightGray
                        )

                        Text(
                            text = "0.08 ETH",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.ExtraBold
                        )
                    }
                }

                Button(
                    onClick = {},
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Purple200)
                ) {
                    Text(text = "Place a bid", color = Color.White)
                }
            }
        }
    }
}