import `class`.Cliente
import `object`.Estoque

fun main() {
    try {
        val cliente = Cliente("")
        val cliente2 = Cliente("Kleber", "964587451", "13526847903", "rua tananam")
        val cliente3 = Cliente("Jade", "87361248", "32145698745", "rua tananam", "35162574", "jadde@email.com")

        cliente.addCompra()
        cliente.removeCompra()
        cliente.show()
        cliente.calcConta()

    }catch (e: Exception){
        println(e.message)
    }

/*

    Estoque.addProduto()
    Estoque.removeProduto()
    Estoque.showProduto()
*/

}