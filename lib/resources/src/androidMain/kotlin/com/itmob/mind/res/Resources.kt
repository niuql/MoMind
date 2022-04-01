package com.itmob.mind.res

import android.annotation.SuppressLint
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ErrorOutline
import androidx.compose.material.icons.outlined.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource

actual object Drawables {

    @Composable
    actual fun appIcon(): Painter = painterResource(R.drawable.ic_launcher)
    @Composable
    actual fun defAvatar(): ImageVector = Icons.Outlined.Person
    @Composable
    actual fun titleBarClose(): Painter = painterResource(R.drawable.ic_desktop_title_bar_close)
    @Composable
    actual fun titleBarMaximize(): Painter = painterResource(R.drawable.ic_desktop_title_bar_maximize)
    @Composable
    actual fun titleBarMinimize(): Painter = painterResource(R.drawable.ic_desktop_title_bar_minimize)
    @Composable
    actual fun titleBarRestore(): Painter = painterResource(R.drawable.ic_desktop_title_bar_restore)
    @SuppressLint("ResourceType")
    @Composable
    actual fun state404(): ImageVector = Icons.Outlined.ErrorOutline
    @SuppressLint("ResourceType")
    @Composable
    actual fun state500(): ImageVector = Icons.Outlined.ErrorOutline

}