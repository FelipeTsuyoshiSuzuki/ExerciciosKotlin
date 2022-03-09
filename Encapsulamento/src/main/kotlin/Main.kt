import `class`.Cliente
import `object`.Estoque

fun main() {
    try {
        val cliente = Cliente("João")
        val cliente2 = Cliente("Kleber", "964587451", "13526847903", "rua tananam")
        val cliente3 = Cliente("Jade", "87361248", "32145698745", "rua tananam", "35162574", "jadde@email.com")

        while(true) {
            println("*** MENU ***")
            println("\nESCOLHA UMA OPÇÃO")
            println("\n1. PARA ADICIONAR ITEM AO CARRINHO")
            println("\n2. PARA REMOVER ITEM DO CARRINHO")
            println("\n3. PARA VER ITENS NO CARRINHO")
            println("\nOUTROS NUMEROS PARA FINALIZAR")

            val opc = readLine()!!

            when(opc) {
                "1" -> {
                    print("Qual item você gostaria de adicionar ao carrinho: ")
                    val item = readLine()!!.uppercase()
                    cliente.addCompra(item)
                }
                "2" -> {
                    print("Qual item você gostaria de remover do carrinho: ")
                    val item = readLine()!!.uppercase()
                    cliente.removeCompra(item)
                }
                "3" -> {
                    cliente.show()
                }
                else -> {
                    cliente.calcConta()
                    break
                }
            }

        }

    }catch (e: Exception){
        println(e.message)
    }

/*

    Estoque.addProduto()
    Estoque.removeProduto()
    Estoque.showProduto()
*/

}