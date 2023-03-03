package com.multiplatforge.whisper

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform