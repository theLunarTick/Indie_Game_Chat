package com.amazinglystrange.indiegamechat

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform