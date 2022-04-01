import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Divider
import com.itmob.mind.ui.App
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.*
import com.itmob.mind.ui.components.AppWindowTitleBar

fun main() = application {
    val rememberWindowState = rememberWindowState(width = 1280.dp, height = 768.dp)

    Window(
        title = "ITmob",
        state = rememberWindowState,
        undecorated = true,
        onCloseRequest = ::exitApplication,
    ) {
        MaterialTheme {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .border(1.dp, MaterialTheme.colors.onSurface.copy(0.12f)),
            ) {
                AppWindowTitleBar(
                    onMinimizeRequest = { rememberWindowState.isMinimized = !rememberWindowState.isMinimized },
                    onMaximizeRequest = { onMaximizeRequest(rememberWindowState) },
                    onCloseRequest = ::exitApplication,
                    windowPlacement = rememberWindowState.placement
                )
                Divider(modifier = Modifier.fillMaxWidth().height(1.dp))
                App()
            }
        }
    }
}

private fun onMaximizeRequest(windowState: WindowState) = if (windowState.placement == WindowPlacement.Floating) {
    windowState.placement = WindowPlacement.Maximized
} else {
    windowState.placement = WindowPlacement.Floating
}