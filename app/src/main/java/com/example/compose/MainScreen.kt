package com.example.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier
                .size(300.dp)
                .clip(CircleShape)
                .border(width = 1.dp, color = Color.Cyan, shape = CircleShape),
            painter = painterResource(id = R.drawable.ic_pattern__2_),
            contentDescription = "back"
        )

        Column(
            modifier = Modifier
                .padding(horizontal = 30.dp)
                .padding(top = 30.dp, bottom = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){

            Card(
                modifier = Modifier
                    .height(100.dp)
                    .width(290.dp),
                shape = RoundedCornerShape(
                    topStart = 25.dp,
                    topEnd = 25.dp
                ),
                elevation = 10.dp
            ) {}
//            Spacer(modifier = Modifier.border(width = 5.dp, brush = Brush.horizontalGradient(
//                listOf(
//                    Color(0xFFC4A0F4),
//                    Color(0xFFCF4CB9),
//                    Color(0xFFE60B41)
//                ))

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
            ) {}
        }
        
    }
}

@Composable
@Preview
fun MainScreenPreview(){
    MainScreen()
}