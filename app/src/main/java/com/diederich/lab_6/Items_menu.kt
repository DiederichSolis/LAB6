package com.diederich.lab_6

sealed class Items_menu (
    val icon: Int,
    val title:String,
    val ruta:String,

        ){
    object p1: Items_menu(R.drawable.baseline_event_24,"Eventos","pantalla1")
    object p2: Items_menu(R.drawable.baseline_place_24,"Lugares","p2")
    object p3: Items_menu(R.drawable.baseline_favorite_24,"Fav","p3")
    object p4: Items_menu(R.drawable.baseline_supervised_user_circle_24,"Usuario","p4")
}
