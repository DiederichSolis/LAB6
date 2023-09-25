package com.diederich.lab_6

sealed class Items_menu (
    val icon: Int,
    val title:String,
    val ruta:String,

        ){
    object pantalla1: Items_menu(R.drawable.baseline_event_24,"Mainactivity","pantalla1")
    object p2: Items_menu(R.drawable.baseline_place_24,"pantalla2","p2")
    object p3: Items_menu(R.drawable.baseline_favorite_24,"pantalla3","p3")
    object p4: Items_menu(R.drawable.baseline_supervised_user_circle_24,"pantalla4","p4")
}
