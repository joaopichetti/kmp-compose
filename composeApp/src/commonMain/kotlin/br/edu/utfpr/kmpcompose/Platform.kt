package br.edu.utfpr.kmpcompose

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

expect var index: Int