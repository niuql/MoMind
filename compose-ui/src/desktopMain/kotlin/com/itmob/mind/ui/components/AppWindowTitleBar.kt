package com.itmob.mind.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.window.WindowDraggableArea
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.FrameWindowScope
import androidx.compose.ui.window.WindowPlacement
import com.itmob.mind.res.Res

@Composable
fun FrameWindowScope.AppWindowTitleBar(
    onMinimizeRequest: () -> Unit,
    onMaximizeRequest: () -> Unit,
    onCloseRequest: () -> Unit,
    modifier: Modifier = Modifier,
    windowPlacement: WindowPlacement = WindowPlacement.Floating
) = WindowDraggableArea(
    modifier = modifier
) {
    Row(
        Modifier
            .fillMaxWidth()
            .height(28.dp)
            .background(TopAppBarDefaults.smallTopAppBarColors().containerColor(0f).value),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {

        Row(
            modifier = Modifier.padding(start = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                imageVector = Icons.Outlined.Home,
                contentDescription = null
            )
            Spacer(Modifier.width(8.dp))
            Text(
                text = Res.string.app_name,
                fontFamily = FontFamily.Serif
            )
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            IconButton(onClick = { onMinimizeRequest() }) {
                Icon(painter = Res.drawable.titleBarMinimize(), contentDescription = null)
            }
            IconButton(onClick = { onMaximizeRequest() }) {
                Icon(
                    painter = if (windowPlacement == WindowPlacement.Floating) Res.drawable.titleBarMaximize() else Res.drawable.titleBarRestore(),
                    contentDescription = null
                )
            }
            IndicatingIconButton(
                onClick = { onCloseRequest() },
                // TODO this is custom IconButton (Temporarily replace TouchTarget.kt/Modifier.minimumTouchTargetSize() with a fixed value 48.dp)
                modifier = Modifier.width(48.dp),
                indication = rememberRipple(bounded = false, color = Color.Red, radius = 24.dp)
            ) {
                Icon(painter = Res.drawable.titleBarClose(), contentDescription = null)
            }
        }
    }
}