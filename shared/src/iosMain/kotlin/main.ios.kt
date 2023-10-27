import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIDevice

actual fun getPlatformName(): String = UIDevice.currentDevice.systemVersion +
        " " + UIDevice.currentDevice.model +
        " " + UIDevice.currentDevice.systemName()

    @Suppress("FunctionName", "unused")
fun MainViewController() = ComposeUIViewController { App() }