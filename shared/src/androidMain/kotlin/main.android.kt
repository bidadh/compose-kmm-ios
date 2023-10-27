import android.os.Build
import androidx.compose.runtime.Composable

actual fun getPlatformName(): String = Build.BRAND +
    " " + Build.MODEL +
    " " + Build.MANUFACTURER +
    " " + Build.VERSION.RELEASE

@Composable
fun MainView() = App()
