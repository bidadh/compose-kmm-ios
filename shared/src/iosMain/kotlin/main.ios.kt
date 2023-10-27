import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIDevice

actual fun getPlatformName(): String = UIDevice.currentDevice.model +
    " " + UIDevice.currentDevice.systemName() +
    " " + UIDevice.currentDevice.systemVersion

@Suppress("FunctionName", "unused")
fun MainViewController() = ComposeUIViewController { App() }