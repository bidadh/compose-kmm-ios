import android.os.Build
import androidx.compose.runtime.Composable

actual fun getPlatformName(): String = Build.BRAND + " " + Build.MODEL

@Composable
fun MainView() = App()
