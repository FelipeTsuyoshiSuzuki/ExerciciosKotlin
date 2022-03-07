package `class`

import `object`.Estoque

data class Cliente (var nome: String) {

    private var rg = ""
    private var cpf = ""
    private var telefone = ""
    private var endereco = ""
    private var email = ""
    private var conta = 0.0

    // Construtor secundario
    constructor(
        nome: String, rg: String, cpf: String, endereco: String
    ): this(nome) {
        this.rg = rg
        this.cpf = cpf
        this.endereco = endereco
    }

    // Construtor terciario
    constructor(
        nome: String, rg: String, cpf: String, endereco: String, telefone: String, email: String
    ): this(nome, rg, cpf, endereco) {
        this.telefone = telefone
        this.email = email
    }


    private val listaCompras = mutableListOf<String>()

    // Adicionar item à lista de compras
    fun addCompra () {
        while(true) {

            print("Gostaria de adicionar mais alguma coisa sim/nao ")
            var resp = readLine()!!.uppercase()
            if(resp == "NAO" || resp == "NÃO") {
                break
            }

            print("Qual item você gostaria de adicionar ao carrinho: ")
            var item = readLine()!!.uppercase()

            if (item.isEmpty() || !(Estoque.existe(item))) {
                println("Produto inválido")
            } else {
                listaCompras.add(item)
                println("Item adicionado com sucesso")
            }


        }
    }

    // Remover item do carrinho de compras
    fun removeCompra() {
        while(true) {

            print("Gostaria de remover mais algum item sim/nao ")
            var resp = readLine()!!.uppercase()
            if(resp == "NAO" || resp == "NÃO") {
                break
            }

            print("Qual item você gostaria de remover do carrinho: ")
            var item = readLine()!!.uppercase()

            if (item.isEmpty() || !(listaCompras.contains(item))) {
                println("Este item não existe na lista")
            } else {
                listaCompras.remove(item)
                println("Item removido com sucesso")
            }


        }
    }

    // Mostrar lista de compras
    fun show() {
        listaCompras.forEach() {
            println(it)
        }
    }

    fun calcConta() {
        listaCompras.forEach() {
            conta += Estoque.verPreco(it)
        }
        println("No total ficou R$$conta")

    }

    // Verificar ao iniciar se o nome esta preenchido
    init{
        // Se estiver vazio jogar o exception
        if(nome.isEmpty()) {
            throw Exception("O nome esta vazio")
        }
    }


}