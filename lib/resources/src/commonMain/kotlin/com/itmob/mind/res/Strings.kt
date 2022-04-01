package com.itmob.mind.res

interface Strings {
    val app_name: String
    val home: String
    val settings: String
    val terms_of_service: String
    val privacy_policy: String
    val open_source_licenses: String

    val state404: String
    val state500: String

    val desc_home: String
        get() = home
    val desc_settings: String
        get() = settings
    val desc_logo_icon: String
        get() = app_name

    // Sample data
    val randomImgUrl: String
        get() = "https://source.unsplash.com/random/400x400"
}

object StringsEn : Strings {
    override val app_name = "MobMind"
    override val home = "Home"
    override val settings = "Settings"
    override val terms_of_service = "Terms of service"
    override val privacy_policy = "Privacy policy"
    override val open_source_licenses ="Open source licenses"
    override val state404 = "404"
    override val state500 = "Something went wrong, try again in a few minutes. ¯\\_(ツ)_/¯"
}

object StringsZh : Strings {
    override val app_name = StringsEn.app_name
    override val home = "首页"
    override val settings = "设置"
    override val terms_of_service = StringsEn.terms_of_service
    override val privacy_policy = StringsEn.privacy_policy
    override val open_source_licenses = StringsEn.open_source_licenses
    override val state404 = StringsEn.state404
    override val state500 = StringsEn.state500
}

object StringsZhHk : Strings {
    override val app_name = StringsEn.app_name
    override val home = "首页"
    override val settings = "設置"
    override val terms_of_service = StringsEn.terms_of_service
    override val privacy_policy = StringsEn.privacy_policy
    override val open_source_licenses = StringsEn.open_source_licenses
    override val state404 = StringsEn.state404
    override val state500 = StringsEn.state500
}