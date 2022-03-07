package `object`

object Estoque {

    // Lista de Produtos do estoque(nome, preço)
    private val listaProdutos = mutableMapOf("CALÇA" to 70.0, "CAMISA" to 30.0, "TENIS" to 200.0)

    // Adicionar produtos com seus nomes e respectivos preços
    fun addProduto() {
        print("Qual produto será adicionado: ")
        val produto = readLine()!!.uppercase()

        if(produto.isEmpty()) {
            println("Valor inválido")
        }else {
            print("Qual o preço desse produto: ")

            try {
                val valor = readLine()!!.toDouble()
                listaProdutos.put(produto, valor)
                println("Item adicionado com sucesso")
            } catch (e: Exception) {
                println("Valor de preço inválido")
            }

        }
    }

    // Remover produtos
    fun removeProduto() {
        print("Qual produto gostaria de remover: ")
        val produto = readLine()!!.uppercase()
        if(produto.isEmpty() || !(listaProdutos.contains(produto))){
            println("Produto não esta no estoque")
        }else {
            listaProdutos.remove(produto)
            println("Produto removido do estoque com sucesso")
        }

    }

    // verificar se o produto existe
    fun existe(produto: String): Boolean {
        return listaProdutos.containsKey(produto)
    }

    fun verPreco(produto: String): Double {
        return listaProdutos.getValue(produto)
    }

    // Mostrar lista de produtos e seus preços
    fun showProduto() {
        listaProdutos.forEach() {
            println(it)
        }
    }


}