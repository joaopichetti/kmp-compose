package br.edu.utfpr.kmpcompose

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}! [$index]"
    }
}