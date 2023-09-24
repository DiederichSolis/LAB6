package com.diederich.lab_6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.diederich.lab_6.ui.theme.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*




class pantalla3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LAB_6Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
contett()
                }
            }
        }
    }
}




@Composable
fun contett(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // TOPAPPBAR
        TopAppBar(
            backgroundColor = pink, // Color de fondo personalizado
            elevation = AppBarDefaults.TopAppBarElevation,
            contentPadding = PaddingValues(16.dp),
            modifier = Modifier
                .height(300.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.BottomStart // Alinea el texto en la parte inferior izquierda
            ) {
                Text(
                    text = " Lugar",
                    color = Color.DarkGray,

                    fontSize = 14.sp
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp)) // Espacio entre los dos Rows


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(
                text = "Title",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(8.dp)) // Espacio entre los dos Rows


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.DateRange,
                    contentDescription = null,
                    tint = Color.DarkGray,
                    modifier = Modifier.size(20.dp)
                )
                Text(
                    text = "Fecha",
                    fontSize = 14.sp,
                    color = Color.DarkGray,
                    modifier = Modifier.padding(start = 4.dp) // Ajusta el espacio entre el ícono y el texto
                )
            }


            Text(
                text = "Hora",
                fontSize = 14.sp,
                color = Color.DarkGray
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(
                text = "About",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(
                text = "Lorem ipsum dolor sit amet, consectetur            adipiscing elit. Aliquam sit amet pellentes.      Lorem ipsum dolor sit amet, consectetur           adipiscing elit. Aliquam sit amet pellentes.",
                fontSize = 16.sp,
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        // Agrega los botones en la parte inferior
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {
                    // Manejar la acción del primer botón
                },
                modifier = Modifier
                    .size(width = 175.dp, height = 40.dp) // Ajusta el tamaño del botón aquí
                    ,colors = ButtonDefaults.buttonColors(
                    backgroundColor = purple1, // Cambia el color de fondo del botón
                    contentColor = Color.Black // Cambia el color del texto del botón

                ), shape = RoundedCornerShape(18.dp)
            ) {
                Text(text = "Favorite")
            }
            Spacer(modifier = Modifier.width(16.dp))

            Button(
                onClick = {
                    // Manejar la acción del segundo botón
                },
                modifier = Modifier
                    .size(width = 175.dp, height = 40.dp) // Ajusta el tamaño del botón aquí
                    , colors = ButtonDefaults.buttonColors(
                    backgroundColor = purple1, // Cambia el color de fondo del botón
                    contentColor = Color.Black // Cambia el color del texto del botón
                ), shape = RoundedCornerShape(18.dp)
            ) {
                Text(text = "Buy")
            }
        }
    }
    }





@Preview
@Composable

fun ppcontent(){
    contett()
}



