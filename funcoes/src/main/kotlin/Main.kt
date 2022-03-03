fun main() {

    print("Digite um número: ")
    val n1 = readLine()!!.toDouble()
    print("Escolha uma operação +, -, * ou /: ")
    val op = readLine()!!
    print("Digite o segundo número: ")
    val n2 = readLine()!!.toDouble()

    val result = ver(op, n1, n2)

    escrever(n1,n2, result, op)

}


