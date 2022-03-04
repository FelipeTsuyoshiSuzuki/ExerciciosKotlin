data class Eletronico(var tipo: String, var marca: String) {

    fun ligando() {
        print("O aparelho tem bateria ou esta na tomada: ")
        val resp = readLine()!!
        if(!(resp.isEmpty()) && resp.uppercase() == "SIM") {
            println("O aparelho está ligando")
        } else {
            println("O aparelho não liga")
        }
    }

}