package com.example.myapplication
import android.media.Image import android.os.Bundle
import androidx.activity.ComponentActivity import
androidx.activity.compose.setContent import
androidx.compose.foundation.Image import
androidx.compose.foundation.layout.Arrangement import
androidx.compose.foundation.layout.Box import
androidx.compose.foundation.layout.Column import
androidx.compose.foundation.layout.fillMaxSize import
androidx.compose.foundation.layout.padding import
androidx.compose.material3.MaterialTheme import
androidx.compose.material3.Surface import
androidx.compose.material3.Text import
androidx.compose.runtime.Composable import
androidx.compose.ui.Alignment import
androidx.compose.ui.Modifier import
androidx.compose.ui.graphics.Color import
androidx.compose.ui.layout.ContentScale import
androidx.compose.ui.res.painterResource import
androidx.compose.ui.res.stringResource import
androidx.compose.ui.text.style.TextAlign import
androidx.compose.ui.tooling.preview.Preview import
androidx.compose.ui.unit.dp import
androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import java.time.format.TextStyle
class MainActivity : ComponentActivity() { override
fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
 setContent {
 MyApplicationTheme {
 // A surface container using the 'background' color from the theme
 Surface(
 modifier = Modifier.fillMaxSize(),
 color = MaterialTheme.colorScheme.background
 ) {
 GreetingiImage(message1 =
stringResource(R.string.jetpack_compose_tutorial),message2= stringResource(
 R.string.ssecond_string
 ),message3= stringResource(R.string.third_string)
 )
 }
 }
 }
 }
}
@Composable
fun GreetingiImage(message1:String,message2:String,message3:String, modifier: Modifier =
Modifier) {
 val image= painterResource(R.drawable.bg_compose_background)
 Column(
 verticalArrangement = Arrangement.Bottom,
 modifier = modifier
 ) {
 Image(
painter=image,
 contentDescription=null,

 )
 Surface(color = Color.White) {
Column(
 verticalArrangement = Arrangement.Bottom,
 modifier = modifier
 ) {
 Text(
 text = message1,
fontSize = 24.sp,
 modifier = Modifier.padding(16.dp)
 )
 Text(
 text = message2,
textAlign = TextAlign.Justify,
modifier = Modifier.padding(16.dp)
 )
 Text(
 text = message3,
textAlign = TextAlign.Justify,
modifier = Modifier.padding(16.dp)
 )
 }
 }
 }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
MyApplicationTheme {
 GreetingiImage(message1 = stringResource(R.string.jetpack_compose_tutorial),message2=
stringResource(
 R.string.ssecond_string
 ),message3= stringResource(R.string.third_string)
 )
 }
} 
