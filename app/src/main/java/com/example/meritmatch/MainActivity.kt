    package com.example.meritmatch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

    class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
           Surface(
              modifier = Modifier.fillMaxSize(),
               color=   MaterialTheme.colors.background
           ) {
               val navController = rememberNavController()
               NavHost(navController = navController, startDestination = "firstscreen"){
                   composable("firstscreen"){
                       Login {
                           if (pageNum.value == 1) {
                                   navController.navigate("secondscreen")
                               }
                           else if(pageNum.value==2){
                               navController.navigate("thirdscreen")
                           }
                       }
                   }
                   composable("secondscreen"){
                       SignUp{
                           navController.navigate("firstscreen" )
                       }
                   }
                   composable("thirdscreen"){
                       Transaction{
                       }
                   }

               }
           }
        }
    }
}




