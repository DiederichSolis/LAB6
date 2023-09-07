package com.diederich.lab_6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.diederich.lab_6.ui.theme.LAB_6Theme
import com.diederich.lab_6.ui.theme.cc


class pantalla2 : ComponentActivity() {
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










@Composable
fun componentsscreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(top = 0.dp) // Puedes ajustar este valor según tus necesidades
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = null,
                tint = cc,
                modifier = Modifier.size(50.dp)
            )

            Column(
                modifier = Modifier
                    .weight(1f) // Hace que la Columna ocupe todo el espacio restante horizontalmente
                    .padding(start = 16.dp), // Añade un espacio a la izquierda de los textos
                verticalArrangement = Arrangement.Top // Alinea los elementos en la parte superior
            ) {
                Text(
                    text = "Guns And Roses LA",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "LA Hall",
                    fontSize = 14.sp
                )
            }

            Icon(
                imageVector = Icons.Default.ArrowDropDown,
                contentDescription = "user"
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = null,
                tint = cc,
                modifier = Modifier.size(50.dp)
            )

            Column(
                modifier = Modifier
                    .weight(1f) // Hace que la Columna ocupe todo el espacio restante horizontalmente
                    .padding(start = 16.dp), // Añade un espacio a la izquierda de los textos
                verticalArrangement = Arrangement.Top // Alinea los elementos en la parte superior
            ) {
                Text(
                    text = "Guns And Roses Denver",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Denver Hall",
                    fontSize = 14.sp
                )
            }

            Icon(
                imageVector = Icons.Default.ArrowDropDown,
                contentDescription = "user"
            )
        }



        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = null,
                tint = cc,
                modifier = Modifier.size(50.dp)
            )

            Column(
                modifier = Modifier
                    .weight(1f) // Hace que la Columna ocupe todo el espacio restante horizontalmente
                    .padding(start = 16.dp), // Añade un espacio a la izquierda de los textos
                verticalArrangement = Arrangement.Top // Alinea los elementos en la parte superior
            ) {
                Text(
                    text = "Guns And Roses New York",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Maddison Square Garden" +
                            "",
                    fontSize = 14.sp
                )
            }

            Icon(
                imageVector = Icons.Default.ArrowDropDown,
                contentDescription = "user"
            )
        }





    }

}



@Preview
@Composable
fun previousscreen (){
    componentsscreen()
}
