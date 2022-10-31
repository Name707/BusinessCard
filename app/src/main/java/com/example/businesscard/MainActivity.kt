package com.example.businesscard


import android.graphics.Paint
import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.PhoneInTalk
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.PhoneInTalk
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.Icon

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme
import java.time.format.TextStyle


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            val image = painterResource(R.drawable.android_logo)
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(180.dp)
                    .border(BorderStroke(2.dp, Color.Black))
            )
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            MainText("N707", "Beginner Android Developer ")

        }
    }
}

@Composable
fun MainText(myName: String, myProfession: String) {
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = CenterHorizontally) {
        Text(
            text = myName,
            textAlign = TextAlign.Center,
            color = Color.Magenta,
            modifier = Modifier
                .padding(5.dp),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 30.sp

        )
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(
                text = myProfession,
                textAlign = TextAlign.Center,
                color = Color.Cyan,
                fontSize = 20.sp,


                )
        }
        MyContacts("ad", "asd", "asd")

    }
}

@Composable
fun MyContacts(number: String, telegram: String, email: String) {
    Icon(
        Icons.Outlined.PhoneInTalk,
        contentDescription = null,
        tint = Color(red = 233, 150, 122)
    )
    Icon(
        Icons.Default.Send,
        contentDescription = null,
        tint = Color(red = 233, 150, 122)
    )
    Icon(
        Icons.Outlined.Mail,
        contentDescription = null,
        tint = Color(red = 233, 150, 122)
    )

}


@Composable
fun BusinessCardText(name: String) {
    Column {


    }
}


@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}