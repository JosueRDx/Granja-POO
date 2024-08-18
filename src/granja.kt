package granja

open class Granja(val nombre: String, open var numeroDeAnimales: Int = 0) {

    init {
        println("Inicializando la granja de $nombre")
    }

    fun agregarAnimales(cantidad: Int) {
        numeroDeAnimales += cantidad
        println("Actualizando Granja: Ahora hay $numeroDeAnimales animales en la granja $nombre")

    }

    fun mostrarInfo() {
        println("Granja: $nombre")
        println("Número de animales: $numeroDeAnimales")
    }
}
