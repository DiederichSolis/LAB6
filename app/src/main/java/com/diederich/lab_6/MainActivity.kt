package com.diederich.lab_6

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.diederich.lab_6.ui.theme.LAB_6Theme
import com.diederich.lab_6.ui.theme.barra

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.runtime.*
import androidx.compose.ui.draw.clip
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.diederich.lab_6.ui.theme.cc

import com.diederich.lab_6.Items_menu.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LAB_6Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                my_components()
                }
            }
        }
    }
}



@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun my_components(){
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    val navigation_item = listOf(
        p1,
        p2,
        p3,
        p4)

  Scaffold(scaffoldState=scaffoldState, bottomBar = {Navegacioninferior(navController,navigation_item)}) {
NavigationHost(navController)
  }
    Column (    modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally)
    {

        //TOPAPPBAR
        TopAppBar(
            backgroundColor = barra, // Color de fondo personalizado
            elevation = AppBarDefaults.TopAppBarElevation,
            contentPadding = PaddingValues(16.dp),
            modifier = Modifier
                .height(60.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = "  TodoEventos",
                    modifier = Modifier
                        .weight(1f)
                        .height(56.dp),
                    style = MaterialTheme.typography.h6,
                    color = Color.Black, // Color del texto
                )

                IconButton(
                    onClick = {
                        // Acción cuando se presiona el botón
                    },
                    modifier = Modifier
                        .height(56.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.icon), // Reemplaza con tu ícono
                        contentDescription = null, // Descripción del contenido para accesibilidad
                        tint = Color.Black, // Color del ícono
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp)) // Espacio entre los dos Rows



        //TEXTO
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "   Your Favorites",
                modifier = Modifier
                    .weight(1f)
                    .height(40.dp),
                style = TextStyle(
                    fontSize = 17.sp,
                    color = Color.Black

                )

            )
        }


        Spacer(modifier = Modifier.height(2.dp)) // Espacio entre los Rows y la Card

        //CARDS
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically

        ) {

            Spacer(modifier = Modifier.width(16.dp))

            Card(
                modifier = Modifier
                    .width(175.dp)
                    .height(225.dp),
                shape = RoundedCornerShape(11.dp), // Forma redondeada, ajusta el radio según lo desees
                backgroundColor = cc
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Top // Alinea los elementos en la parte superior
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.cardimage1),
                        contentDescription = null, // Descripción del contenido para accesibilidad
                        modifier = Modifier
                            .fillMaxWidth() // La imagen se extenderá en toda la parte superior de la Card
                            .height(150.dp) // Altura de la imagen
                            .padding(bottom = 8.dp) // Espacio inferior entre la imagen y los textos
                            .aspectRatio(1f) // Relación de aspecto cuadrada
                            .clip(MaterialTheme.shapes.small) // Forma de círculo

                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Title",
                        style = TextStyle(
                            fontSize = 16.sp, // Ajusta el tamaño del texto aquí
                            color = Color.Black // Color del texto
                        )
                    )

                    Text(
                        text = "Supporting text",
                        style = TextStyle(
                            fontSize = 14.sp, // Ajusta el tamaño del texto aquí
                            color = Color.Black // Color del texto
                        )
                    )
                }
                // Puedes agregar otro elemento en esta fila si lo necesitas
            }



            Spacer(modifier = Modifier.width(16.dp))

            //Segundo card
            Card(
                modifier = Modifier
                    .width(175.dp)
                    .height(225.dp),
                shape = RoundedCornerShape(11.dp), // Forma redondeada, ajusta el radio según lo desees
                backgroundColor = cc
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Top // Alinea los elementos en la parte superior
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.micro),
                        contentDescription = null, // Descripción del contenido para accesibilidad
                        modifier = Modifier
                            .fillMaxWidth() // La imagen se extenderá en toda la parte superior de la Card
                            .height(145.dp) // Altura de la imagen
                            .padding(bottom = 8.dp) // Espacio inferior entre la imagen y los textos
                            .aspectRatio(1f) // Relación de aspecto cuadrada
                            .clip(MaterialTheme.shapes.small) // Forma de círculo

                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Title",
                        style = TextStyle(
                            fontSize = 16.sp, // Ajusta el tamaño del texto aquí
                            color = Color.Black // Color del texto
                        )
                    )

                    Text(
                        text = "Supporting text",
                        style = TextStyle(
                            fontSize = 14.sp, // Ajusta el tamaño del texto aquí
                            color = Color.Black // Color del texto
                        )
                    )
                }
                // Puedes agregar otro elemento en esta fila si lo necesitas
            }
        }


        Spacer(modifier = Modifier.height(16.dp)) // Espacio entre los dos Rows
        //Segundo row
        //CARDS
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically

        ) {

            Spacer(modifier = Modifier.width(16.dp))

            Card(
                modifier = Modifier
                    .width(175.dp)
                    .height(225.dp),
                shape = RoundedCornerShape(11.dp), // Forma redondeada, ajusta el radio según lo desees
                backgroundColor = cc
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Top // Alinea los elementos en la parte superior
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.planta),
                        contentDescription = null, // Descripción del contenido para accesibilidad
                        modifier = Modifier
                            .fillMaxWidth() // La imagen se extenderá en toda la parte superior de la Card
                            .height(150.dp) // Altura de la imagen
                            .padding(bottom = 8.dp) // Espacio inferior entre la imagen y los textos
                            .aspectRatio(1f) // Relación de aspecto cuadrada
                            .clip(MaterialTheme.shapes.small) // Forma de círculo

                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Title",
                        style = TextStyle(
                            fontSize = 16.sp, // Ajusta el tamaño del texto aquí
                            color = Color.Black // Color del texto
                        )
                    )

                    Text(
                        text = "Supporting text",
                        style = TextStyle(
                            fontSize = 14.sp, // Ajusta el tamaño del texto aquí
                            color = Color.Black // Color del texto
                        )
                    )
                }
                // Puedes agregar otro elemento en esta fila si lo necesitas
            }



            Spacer(modifier = Modifier.width(16.dp))

            //Segundo card
            Card(
                modifier = Modifier
                    .width(175.dp)
                    .height(225.dp),
                shape = RoundedCornerShape(11.dp), // Forma redondeada, ajusta el radio según lo desees
                backgroundColor = cc
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Top // Alinea los elementos en la parte superior
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.azul),
                        contentDescription = null, // Descripción del contenido para accesibilidad
                        modifier = Modifier
                            .fillMaxWidth() // La imagen se extenderá en toda la parte superior de la Card
                            .height(145.dp) // Altura de la imagen
                            .padding(bottom = 8.dp) // Espacio inferior entre la imagen y los textos
                            .aspectRatio(1f) // Relación de aspecto cuadrada
                            .clip(MaterialTheme.shapes.small) // Forma de círculo

                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Title",
                        style = TextStyle(
                            fontSize = 16.sp, // Ajusta el tamaño del texto aquí
                            color = Color.Black // Color del texto
                        )
                    )

                    Text(
                        text = "Supporting text",
                        style = TextStyle(
                            fontSize = 14.sp, // Ajusta el tamaño del texto aquí
                            color = Color.Black // Color del texto
                        )
                    )
                }
                // Puedes agregar otro elemento en esta fila si lo necesitas
            }
        }

        Spacer(modifier = Modifier.height(16.dp)) // Espacio entre los row y el texto
        //TEXTO
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "     All Concerts",
                modifier = Modifier
                    .weight(1f)
                    .height(40.dp),
                style = TextStyle(
                    fontSize = 17.sp,
                    color = Color.Black

                )

            )
        }


                }

            }


@Composable
fun currentRoute(navController: NavHostController,
): String ?{
    val entrada by navController.currentBackStackEntryAsState()
    return entrada?.destination?.route

}
@Composable
fun Navegacioninferior(navController: NavHostController,
menu_items : List<Items_menu>){
BottomAppBar() {
    BottomNavigation() {
        val currentRoute = currentRoute(navController = navController)
        menu_items.forEach{ item->
            BottomNavigationItem(
                selected = currentRoute == item.ruta ,
                onClick = { navController.navigate(item.ruta) },
            icon = {
                Icon(painter = painterResource(id = item.icon), contentDescription = item.title)
            },
            label = {Text(item.title)},
            alwaysShowLabel = false)
        }
    }
}
}
@Preview
@Composable
fun previous(){
    my_components()
}

