package com.example.nasaapod.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
//import com.google.accompanist.coil.CoilImage
import persistent.app.mynasa.DataClassModel.MyNasa
import coil.compose.rememberImagePainter

@Composable
fun CustomItem(nasa: MyNasa) {
    Row(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxWidth()
            .padding(24.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Column {
//            Image(
//                painter = painterResource(id = R.drawable.ic_logo),
//                contentDescription = "Nasa",
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(200.dp)
//                    .align(Alignment.CenterHorizontally)
//            )
//            CoilImage(
//                request = ImageRequest.Builder(LocalContext.current)
//                    .data(nasa.url)
//                    .build(),
//                contentDescription = nasa.title,
//                fadeIn = true,
//                modifier = Modifier
//                    .size(120.dp)
//                    .align(CenterHorizontally)
//            )

            Image(
                painter = rememberImagePainter(nasa.url),
                contentDescription = "My content description",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = nasa.title,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
//                fontFamily = firaSansFamily,
//                fontWeight = FontWeight.Bold
            )
            Text(
                text = nasa.explanation,
                color = Color.Black,
//            fontSize = Typography.h5.fontSize,
                fontWeight = FontWeight.Normal,
                maxLines = 2
            )
        }


    }
}
