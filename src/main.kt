package granja

fun gestionarGranja() {

    val miGranja = Granja("Apaza", 5)
    miGranja.mostrarInfo()
    println()
    miGranja.agregarAnimales(4)
    miGranja.mostrarInfo()
    println()
}

fun crearAnimales() {
    val vaca = Vaca()
    val gallo = Gallo()

    println("El tipo de animal es: ${vaca.tipo}")
    vaca.hacerSonido()

    println("El tipo de animal es: ${gallo.tipo}")
    gallo.hacerSonido()
}

fun main() {
    gestionarGranja()
    crearAnimales()
}