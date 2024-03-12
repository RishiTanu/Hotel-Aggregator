package com.example.hotel_agreegator.utils

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.hotel_agreegator.ui.activity.splash.SplashScreen
import com.example.hotel_agreegator.ui.landing_ui.HomeScreen
import com.example.hotel_agreegator.utils.AppConstants.HOME_SCREEN
import com.example.hotel_agreegator.utils.AppConstants.SPLASH_SCREEN


@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = SPLASH_SCREEN) {
        composable(SPLASH_SCREEN) {
            SplashScreen(navController)
        }
        composable(HOME_SCREEN) {
            HomeScreen(navController)
        }
    }
}