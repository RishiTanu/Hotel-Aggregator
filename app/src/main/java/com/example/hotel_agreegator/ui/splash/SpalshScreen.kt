package com.example.hotel_agreegator.ui.activity.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.democompose.R
import com.example.hotel_agreegator.utils.AppConstants.HOME_SCREEN
import com.example.hotel_agreegator.utils.AppConstants.SPLASH_SCREEN
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        // Replace "R.drawable.logo" with your logo resource
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "Logo")

        // Launching effect for delay and navigation
        LaunchedEffect(key1 = true) {
            delay(2000) // 5-second delay
            navController.navigate(HOME_SCREEN) {
                popUpTo(SPLASH_SCREEN) {
                    inclusive = true
                } // Remove splash from the back stack
            }
        }
    }
}
