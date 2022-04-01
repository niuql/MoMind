package com.itmob.mind.res

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.ErrorOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource

actual object Drawables {
    @Composable
    actual fun appIcon(): Painter = painterResource("drawable/ic_launcher.xml")
    @Composable
    actual fun defAvatar(): ImageVector = Icons.Outlined.AccountCircle
    @Composable
    actual fun titleBarClose(): Painter = painterResource("drawable/ic_desktop_title_bar_close.xml")
    @Composable
    actual fun titleBarMaximize(): Painter = painterResource("drawable/ic_desktop_title_bar_maximize.xml")
    @Composable
    actual fun titleBarMinimize(): Painter = painterResource("drawable/ic_desktop_title_bar_minimize.xml")
    @Composable
    actual fun titleBarRestore(): Painter = painterResource("drawable/ic_desktop_title_bar_restore.xml")
    @Composable
    actual fun state404(): ImageVector = Icons.Outlined.ErrorOutline
    @Composable
    actual fun state500(): ImageVector = Icons.Outlined.ErrorOutline
}