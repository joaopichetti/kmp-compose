package br.edu.utfpr.kmpcompose

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform