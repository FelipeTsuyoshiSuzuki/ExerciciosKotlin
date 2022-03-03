fun main() {


    /*

    Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
    trabalhar com Collection do tipo List para manipular os dados desse estoque, o
    programa deverá atender as seguintes funcionalidades:

    Armazenar dados da List
    Remover dados da list;
    Atualizar dados da list.
    Apresentar todos os dados da list.
     */
/*

    val estoque = mutableListOf<String>()

    while(true) {
        print("Escolha uma opção \n" +
                "0 - Finalizar \n" +
                "1 - Adicionar um produto no estoque\n" +
                "2 - Remover um produto do estoque \n" +
                "3 - Trocar algum produto do estoque \n" +
                "4 - Apresentar os produtos em estoque\n")
        val opt = readLine()!!.toInt()

        when(opt) {
            0 -> break
            1 -> {
                print("Produto que será adicionado: ")
                val produto = readLine()!!
                estoque.add(produto)
            }
            2 -> {
                print("Produto que será removido: ")
                val produto = readLine()!!
                estoque.remove(produto)
            }
            3 -> {
                print("Produto que será trocado: ")
                val produto = readLine()!!
                val index = estoque.indexOf(produto)
                print("Por: ")
                val nProduto = readLine()!!
                estoque[index] = nProduto
            }
            4 -> {
                print(estoque.joinToString(
                    separator = "\n",
                    prefix = "\nEstoque:\n",
                    postfix = "\n\n"
                ))
            }
            else -> continue
        }
*/

    }


}