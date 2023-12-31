import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import ui.theme.AppTheme

@Composable
fun App() {
  AppTheme {
    Surface(
      modifier = Modifier.fillMaxSize(),
      color = MaterialTheme.colorScheme.background
    ) {
      RootScreen()
    }
  }
}

@OptIn(ExperimentalResourceApi::class)
@Composable
fun RootScreen() {
  MaterialTheme {
    var greetingText by remember { mutableStateOf("Hello, Compose iOS!") }
    var showImage by remember { mutableStateOf(false) }
    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
      Button(onClick = {
        greetingText = "Hello, ${getPlatformName()}"
        showImage = !showImage
      }) {
        Text(greetingText)
      }
      TextField(greetingText, onValueChange = { greetingText = it })
      AnimatedVisibility(showImage) {
        Image(
          painterResource("compose-multiplatform.xml"),
          null
        )
      }
    }
  }
}

expect fun getPlatformName(): String