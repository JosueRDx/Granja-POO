package granja

// Implementación de Interfaces
interface AccionAnimal {
    fun hacerSonido()
}

// Implementación de clases abstractas
abstract class Animal : AccionAnimal {
    abstract val tipo: String
}

class Vaca : Animal() {
    override val tipo = "Vaca"

    override fun hacerSonido() {
        println("Y Dice: Muuu")
    }
}

class Gallo : Animal() {
    override val tipo = "Gallo"

    override fun hacerSonido() {
        println("Y Dice: Quiquiriquí")
    }
}
