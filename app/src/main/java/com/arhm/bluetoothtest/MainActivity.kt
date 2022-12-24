package com.arhm.bluetoothtest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.arhm.bluetoothtest.ui.theme.BluetoothTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComponent()
//            BluetoothTestTheme {
//            BluetoothTestTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
//                    Greeting("Android")
//                }
//            }
        }
    }
}

@Composable
fun MyComponent(){
    Row() {
        MyImage()
        MyTexts()
    }
}

@Composable
fun MyImage(){
    Image(
        painterResource(R.drawable.ic_launcher_foreground),
        "Mi imagen de prueba"
    )
}

@Composable
fun MyText(text: String){
    Text(text, style = TextStyle(color = Color(0xffff4455)))
}

@Composable
fun MyTexts(){
    Column() {
        MyText("Hola, atte Alvaro....")
        MyText("Hola, atte Alvaro,")
        MyText("Hola, atte Alvaro:")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTexts(){
    MyComponent()
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BluetoothTestTheme {
        Greeting("Android")
    }
}