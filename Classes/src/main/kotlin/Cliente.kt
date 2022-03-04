class Cliente(var nome: String, var dinheiro: Double, var saldo: Double) {

    val bolsa = mutableListOf<String>()
    var cCredito = true
    var cDebito = false

    fun comprar(produto: String, valor: Double, opc: Int) {
        when(opc) {
            1 -> {
                if(cCredito == true && saldo >= valor) {
                    bolsa.add(produto)
                    saldo -= valor
                }else {
                    println("Cartão negado")
                }
            }
            2 -> {
                bolsa.add(produto)
                saldo += valor
            }
            3 -> {
                if(dinheiro >= valor) {
                    dinheiro -= valor
                    bolsa.add(produto)
                } else {
                    println("Na volta a gente compra")
                }
            }
        }

    }
    fun pechinchar(valor: Double): Double{
        var nValor = valor * 0.9
        return nValor
    }

    fun opcDePagamento(): Int{
        print("Quer pagar no crédito digite 1\n" +
                "pagar no débito digite 2\n" +
                "pagar no dinheiro digite 3\n")
        val opc = readLine()!!.toInt()
        return opc
    }



    override fun toString(): String {
        return "dinheiro: $dinheiro\n" +
                "bolsa: $bolsa\n" +
                "saldo: $saldo"
    }
}