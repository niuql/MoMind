package com.itmob.mind.res

interface Strings {
    val app_name: String
        get() = "MobMind"

    val menu_home: String
    val menu_file: String
    val menu_edit: String
    val menu_insert: String
    val menu_view: String
    val menu_tools: String
    val menu_help: String

    // File menu
    val new_map: String
    val new_map_from_template: String
    val new_encrypted_map: String
    val open_map: String
    val open_recent: String
    val close_current: String
    val close_all: String
    val close_other: String
    val print: String
    val exit: String

    // Edit menu


    // Insert menu
    val note: String
    val label: String
    val link: String
    val image: String
    val mark: String
    val attachment: String
    val video: String
    val audio: String

    val settings: String
    val supportLanguages: Array<String>
    val about: String
    val check_update: String
    val terms_of_service: String
    val privacy_policy: String
    val open_source_licenses: String

    val state404: String
    val state500: String

    val desc_home: String
        get() = menu_home
    val desc_settings: String
        get() = settings
    val desc_logo_icon: String
        get() = app_name
}

object StringsEn : Strings {
    override val menu_home = "Home"
    override val menu_file = "File"
    override val menu_edit = "Edit"
    override val menu_insert = "Insert"
    override val menu_view = "View"
    override val menu_tools = "Tools"
    override val menu_help = "Help"

    override val new_map = "New..."
    override val new_map_from_template = "New from Template..."
    override val new_encrypted_map = "New encrypted Map..."
    override val open_map = "Open..."
    override val open_recent = "Open Recent"
    override val close_current = "Close Current Map"
    override val close_all = "Close All Maps"
    override val close_other = "Close Other Maps"
    override val print = "Print"
    override val exit = "Exit"
    
    override val note = "note"
    override val label = "label"
    override val link = "link"
    override val image = "image"
    override val mark = "mark"
    override val attachment = "file"
    override val video = "video"
    override val audio = "audio"

    override val settings = "Settings"
    override val supportLanguages = arrayOf("English", "简体中文", "繁體中文")
    override val about = "About"
    override val check_update = "Check for Update"
    override val terms_of_service = "Terms of service"
    override val privacy_policy = "Privacy policy"
    override val open_source_licenses ="Open source licenses"
    override val state404 = "404"
    override val state500 = "Something went wrong, try again in a few minutes. ¯\\_(ツ)_/¯"
}

object StringsZh : Strings {
    override val menu_home = "首页"
    override val menu_file = "文件"
    override val menu_edit = "编辑"
    override val menu_insert = "插入"
    override val menu_view = "视图"
    override val menu_tools = "工具"
    override val menu_help = "帮助"

    override val new_map = "新建..."
    override val new_map_from_template = "从模板新建..."
    override val new_encrypted_map = "新建加密导图..."
    override val open_map = "打开..."
    override val open_recent = "最近"
    override val close_current = "关闭当前导图"
    override val close_all = "关闭所有导图"
    override val close_other = "关闭其它导图"
    override val print = "打印"
    override val exit = "退出"
    
    override val note = "笔记"
    override val label = "标签"
    override val link = "链接"
    override val image = "图片"
    override val mark = "标记"
    override val attachment = "附件"
    override val video = "视频"
    override val audio = "语音"

    override val settings = "设置"
    override val supportLanguages = arrayOf("简体中文", "繁體中文", "English")
    override val about = "关于"
    override val check_update = "检查更新"
    override val terms_of_service = StringsEn.terms_of_service
    override val privacy_policy = StringsEn.privacy_policy
    override val open_source_licenses = StringsEn.open_source_licenses
    override val state404 = StringsEn.state404
    override val state500 = StringsEn.state500
}

object StringsZhHk : Strings {
    override val menu_home = "首页"
    override val menu_file = "文件"
    override val menu_edit = "編輯"
    override val menu_insert = "插入"
    override val menu_view = "視圖"
    override val menu_tools = "工具"
    override val menu_help = "幫助"

    override val new_map = "新建..."
    override val new_map_from_template = "從模板新建..."
    override val new_encrypted_map = "新建加密導圖..."
    override val open_map = "打開..."
    override val open_recent = "最近"
    override val close_current = "關閉當前導圖"
    override val close_all = "關閉所有導圖"
    override val close_other = "關閉其它導圖"
    override val print = "打印"
    override val exit = "退出"
    
    override val note = ""
    override val label = ""
    override val link = ""
    override val image = ""
    override val mark = ""
    override val attachment = ""
    override val video = ""
    override val audio = ""

    override val settings = "設置"
    override val supportLanguages = arrayOf("繁體中文", "简体中文", "English")
    override val about = "關於"
    override val check_update = "檢查更新"
    override val terms_of_service = StringsEn.terms_of_service
    override val privacy_policy = StringsEn.privacy_policy
    override val open_source_licenses = StringsEn.open_source_licenses
    override val state404 = StringsEn.state404
    override val state500 = StringsEn.state500
}