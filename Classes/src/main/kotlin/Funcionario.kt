class Funcionario(
    var id: Int,
    var nome: String,
    var cargo: String,
    var salario: Double) {

    var cargaHoraria = 0
    var empresa = ""

    fun aumento(aumento: Double) {
        print("De quanto será o aumento: ")
        val aumento = readLine()!!.toDouble()
        salario += aumento
    }

    fun demitido() {
        cargo = "Cliente"
        println("Parabéns você foi promovido a cliente")
    }

    override fun toString(): String {
        return "$nome é $cargo trabalha na empresa $empresa\n" +
                "tem uma carga horaria de $cargaHoraria horas\n" +
                "e recebe R$$salario."
    }

}