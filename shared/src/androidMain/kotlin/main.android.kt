import android.os.Build
import androidx.compose.runtime.Composable

actual fun getPlatformName(): String = Build.MANUFACTURER +
    " " + Build.DISPLAY +
    " " + Build.VERSION.RELEASE

@Composable
fun MainView() = App()
