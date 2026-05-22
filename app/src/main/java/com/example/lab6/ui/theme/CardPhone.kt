package com.example.lab6.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab6.R


@Composable
fun CardPhone(){
    Card(modifier = Modifier.padding(8.dp,50.dp,8.dp,8.dp)
        .dropShadow(
            shape = RectangleShape,
            block = {
                radius = 10f
            }
        )
        .background(Color.White, shape = RoundedCornerShape(20.dp)))
    {
        Image(
            painter = painterResource(id=R.drawable.phonecar),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth().size(200.dp).background(Color.White)
        )
        Text(text = "iPhone 6", fontSize = 28.sp, modifier = Modifier.padding(start = 10.dp, top = 10.dp))

        Row(modifier = Modifier.width(400.dp).padding(start = 12.dp,top =10.dp)) {
            Image(
                painter = painterResource(id=R.drawable.zvezda),
                contentDescription = null,
                modifier = Modifier.width(55.dp).padding(end = 4.dp)
            )
            Image(
                painter = painterResource(id=R.drawable.zvezda),
                contentDescription = null,
                modifier = Modifier.width(55.dp).padding(end = 4.dp)
            )
            Image(
                painter = painterResource(id=R.drawable.zvezda),
                contentDescription = null,
                modifier = Modifier.width(55.dp).padding(end = 4.dp)
            )
            Image(
                painter = painterResource(id=R.drawable.zvezda),
                contentDescription = null,
                modifier = Modifier.width(55.dp).padding(end = 4.dp)
            )
            Image(
                painter = painterResource(id=R.drawable.zvezda),
                contentDescription = null,
                modifier = Modifier.width(55.dp).padding(end = 4.dp)
            )
        }
        Row(modifier = Modifier.width(400.dp).padding(start = 12.dp,top = 30.dp)){
            Text(text = "1000",fontSize = 28.sp)
            Spacer(modifier = Modifier.width(240.dp))
            Image(
                painter = painterResource(id=R.drawable.garba),
                contentDescription = null,
                modifier = Modifier.width(55.dp).padding(end = 4.dp)
            )
        }
    }
}
@Preview
@Composable
fun PreviewCard(){
    Lab6Theme() {
        CardPhone()
    }
}