fun main() {

    print("Digite um número: ")
    val n1 = readLine()!!.toDouble()
    print("Escolha uma operação +, -, * ou /: ")
    val op = readLine()!!
    print("Digite o segundo número: ")
    val n2 = readLine()!!.toDouble()

    val result = Calculadora.menu(op, n1, n2)

    Calculadora.escrever(n1,n2, result, op)

}


