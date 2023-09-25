package com.diederich.lab_6

sealed class Items_menu (
    val icon: Int,
    val title:String,
    val ruta:String,

        ){
    object MainActivity: Items_menu(R.drawable.baseline_event_24,"Eventos","mainactivity")
    object pantalla2: Items_menu(R.drawable.baseline_place_24,"Eventos","mainactivity")
    object pantalla3: Items_menu(R.drawable.baseline_favorite_24,"Eventos","mainactivity")
    object pantalla4: Items_menu(R.drawable.baseline_supervised_user_circle_24,"Eventos","mainactivity")
}
