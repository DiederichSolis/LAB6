package com.diederich.lab_6

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.diederich.lab_6.Items_menu.*


@Composable
fun NavigationHost(navController:NavHostController){
    NavHost(navController = navController , startDestination = pantalla1.ruta  ){
        composable(pantalla1.ruta){
            MainActivity()

        }
        composable(p2.ruta){
            pantalla2()
        }
        composable(p3.ruta){
            pantalla3()
        }
        composable(p4.ruta){
            pantalla4()
        }

    }
    }

