package com.example.controlgastos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.controlgastos.ui.home.HomeScreen
import com.example.controlgastos.ui.login.LoginScreen
import com.example.controlgastos.ui.theme.ControlGastosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ControlGastosTheme {
                val nav = rememberNavController()
                NavHost(navController = nav, startDestination = "login") {
                    composable("login") {
                        LoginScreen(onLoginSuccess = {
                            nav.navigate("home") { popUpTo("login") { inclusive = true } }
                        })
                    }
                    composable("home") {
                        HomeScreen(onLogout = {
                            nav.navigate("login") { popUpTo("home") { inclusive = true } }
                        })
                    }
                }
            }
        }
    }
}
