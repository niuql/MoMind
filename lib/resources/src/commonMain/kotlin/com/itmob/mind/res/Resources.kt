package com.itmob.mind.res

import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector

expect object Drawables {
    fun appIcon(): Painter
    fun defAvatar(): ImageVector

    fun titleBarClose(): Painter
    fun titleBarMaximize(): Painter
    fun titleBarMinimize(): Painter
    fun titleBarRestore(): Painter

    fun state404(): ImageVector
    fun state500(): ImageVector
}
