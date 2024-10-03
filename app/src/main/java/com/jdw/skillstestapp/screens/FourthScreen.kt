package com.jdw.skillstestapp.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.jdw.skillstestapp.screens.viewmodel.FourthViewModel


@Composable
fun FourthScreen(
    navController: NavController,
    viewModel: FourthViewModel,
    paddingValues: PaddingValues
) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
    ) {
        FourthScreen(viewModel = viewModel)
    }
}


@Composable
fun FourthScreen(viewModel: FourthViewModel) {
    var bottomBarVisible by remember { mutableStateOf(false) }
    var bottomBarState by remember { mutableStateOf(FBottomBarState.EmptyState) }

    Scaffold(
        bottomBar = {
            when (bottomBarState) {
                FBottomBarState.EmptyState -> {
                    bottomBarVisible = true
                }

                else -> {

                }
            }
        }
    ) { innerPadding ->
        Surface(modifier = Modifier.padding(innerPadding)) {
            Text(text = "FourthScreen")
        }
    }
}

enum class FBottomBarState {
    EmptyState,
}


