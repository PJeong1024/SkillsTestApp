package com.jdw.skillstestapp.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.jdw.skillstestapp.screens.viewmodel.MainViewModel


@Composable
fun ThirdScreen(
    navController: NavController,
    viewModel: MainViewModel,
    paddingValues: PaddingValues
) {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
    ) {
       Text("Third Screen")
    }
}
