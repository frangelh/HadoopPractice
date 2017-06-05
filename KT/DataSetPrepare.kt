#!/usr/bin/kotlinc-jvm
import java.io.File
import java.security.SecureRandom
data class Tienda(var tienda: String, var mes: String, var monto: Int)
fun main(args: Array<String>) {
    val listado: ArrayList<Tienda> = ArrayList()
    val tiendas: List<String> = listOf("Macdonalds", "BurgerKing", "Quiznos", "Dominos", "PizzaHut", "HeladosBon", "Pizzarelli", "KFC")
    val meses: List<String> = listOf("ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic")
    for (i in 1 until 10000) 
        listado.add(Tienda(tiendas[SecureRandom().nextInt(7)], meses[SecureRandom().nextInt(12)], SecureRandom().nextInt(5000)))
    File("./input").printWriter().use { out ->
        listado.forEach { out.println("${it.tienda} \t ${it.mes} \t ${it.monto}") }
    }
}