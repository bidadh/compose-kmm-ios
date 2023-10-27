import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIDevice

actual fun getPlatformName(): String = UIDevice.currentDevice.systemName() +
        " " + UIDevice.currentDevice.systemVersion +
        " " + UIDevice.currentDevice.model

@Suppress("FunctionName", "unused")
fun MainViewController() = ComposeUIViewController { App() }