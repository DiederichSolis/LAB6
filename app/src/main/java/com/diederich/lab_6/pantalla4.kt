package com.diederich.lab_6


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.materialIcon
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
import com.diederich.lab_6.ui.theme.pink
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource

class pantalla4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LAB_6Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    contenttview()
                }
            }
        }
    }
}

@Composable
fun contenttview(){

Column(modifier = Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally
) { // TOPAPPBAR
    TopAppBar(
        backgroundColor = pink, // Color de fondo personalizado
        elevation = AppBarDefaults.TopAppBarElevation,
        contentPadding = PaddingValues(16.dp),
        modifier = Modifier
            .height(250.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()

        ) {
            Row(
                modifier = Modifier.align(Alignment.Center),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column( modifier = Modifier
                    .width(150.dp)
                    .padding(16.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Icon( imageVector = Icons.Default.AccountCircle,
                        contentDescription = null,
                        tint = Color.Gray,

                        modifier = Modifier.size(150.dp) )

                    Text(
                        text = "   Cecilia Castillo",
                        color = Color.White,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

            }
        }
    }
    Divider(color = Color.LightGray, modifier = Modifier.padding(vertical =8.dp ))
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
            modifier = Modifier.size(40.dp)
        )

        Column(
            modifier = Modifier
                .weight(1f) // Hace que la Columna ocupe todo el espacio restante horizontalmente
                .padding(start = 16.dp), // Añade un espacio a la izquierda de los textos
            verticalArrangement = Arrangement.Top // Alinea los elementos en la parte superior
        ) {
            Text(
                text = "Edit Profile",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Icon(
            imageVector = Icons.Default.PlayArrow,
            contentDescription = "user"
        )
    }
    Divider(color = Color.LightGray, modifier = Modifier.padding(vertical =8.dp ))

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
                text = "Reset Password",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Image(
            painter = painterResource(id = R.drawable.twotone_arrow_drop_up_24),
            contentDescription = null, // Descripción del contenido para accesibilidad
            modifier = Modifier
                .size(80.dp)
                .wrapContentSize(Alignment.Center)

        )
    }

    Divider(color = Color.LightGray, modifier = Modifier.padding(vertical =8.dp ))

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
                text = "Notifications",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Image(
            painter = painterResource(id = R.drawable.twotone_arrow_drop_up_24),
            contentDescription = null, // Descripción del contenido para accesibilidad
            modifier = Modifier
                .size(80.dp)
                .wrapContentSize(Alignment.Center)

        )
    }

    Divider(color = Color.LightGray, modifier = Modifier.padding(vertical =8.dp ))

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
                text = "Favorite",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Image(
            painter = painterResource(id = R.drawable.twotone_arrow_drop_up_24),
            contentDescription = null, // Descripción del contenido para accesibilidad
            modifier = Modifier
                .size(10.dp)
                .wrapContentSize(Alignment.Center)

        )
    }
    Divider(color = Color.LightGray, modifier = Modifier.padding(vertical =8.dp ))
}
}

@Preview
@Composable
fun prevcontenttview(){

}