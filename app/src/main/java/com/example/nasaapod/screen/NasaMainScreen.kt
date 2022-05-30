package com.example.nasaapod.screen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.nasaapod.repository.NasaFakeRepository

@Composable
fun NasaMainScreen(
    navController: NavController
){
    Surface(
        color = MaterialTheme.colors.background,
        modifier = Modifier.fillMaxSize()
    ) {
//        val personRepository = PersonRepository()
//        val getAllData = personRepository.getAllData()

        val nasaRepository = NasaFakeRepository()
        val getAllData = nasaRepository.getAllData()

        LazyColumn(
            contentPadding = PaddingValues(12.dp)
        ) {
            items(items = getAllData) { nasa ->
                CustomItem(nasa = nasa)
            }
        }
    }
}