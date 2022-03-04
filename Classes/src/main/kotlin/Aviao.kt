class Aviao(var passageiro: Int, var piloto: String,var combustivel: Boolean) {


    var linhaAerea = "Latam"
    var modelo = "Embraer E-195"


    fun decolar(piloto: String,combustivel: Boolean) {
        if(!(piloto.isEmpty()) && combustivel == true) {
            println("Avião decolando")
        } else {
            println("O avião ainda não pode decolar")
        }
    }

    fun pousar() {
        print("As pista de pouso está livre? ")
        val pista = readLine()!!
        if(pista == "SIM") {
            println("O avião pousou com sucesso")
        } else {
            println("O avião não pode pousar no momento")
        }
    }

    override fun toString(): String {
        return "O modelo do avião é $modelo\n" +
                "o piloto é $piloto\n" +
                "a viagem terá $passageiro passageiros\n" +
                "a linha aérea é a $linhaAerea\n" +
                "o tanque esta cheio $combustivel"
    }

}