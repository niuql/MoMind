package com.itmob.mind.res

import java.util.Locale

object Res {
    val string = when (Locale.getDefault().language) {
        Locale("en").language -> StringsEn
        Locale("zh").language -> {
            when (Locale.getDefault().country) {
                Locale("zh", "TW").country,
                Locale("zh", "HK").country,
                Locale("zh", "MO").country -> StringsZhHk
                else -> StringsZh
            }
        }
        else -> StringsEn
    }

    val drawable: Drawables = Drawables
}