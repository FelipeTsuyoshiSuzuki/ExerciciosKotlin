import kotlin.math.pow
import kotlin.math.sqrt

fun main() {

    //1- Faça um programa que receba três inteiros e diga qual deles é o maior.
    /*
    var maior = 0

    for(i in 0..2) {
        println("Digite o ${i + 1}º número: ")
        val n = readLine()!!.toInt()
        if(n > maior) {
            maior = n
        }

    }

    println("O maior número digitado foi $maior")
    */

//---------------------------------------------------------------------------------------------------------------

    //2- Faça um programa que entre com três números e coloque em ordem crescente.

    /*val numbers = mutableListOf<Int>()

    for(i in 0..2) {
        println("Digite o ${i + 1}º número: ")
        val n = readLine()!!.toInt()
        numbers.add(n)
    }

    for(i in numbers.sorted()) {
        println(i)
    }
    */

    print("Digite um número: ")
    var n1 = readLine()!!.toInt()
    print("Digite um número: ")
    var n2 = readLine()!!.toInt()
    print("Digite um número: ")
    var n3 = readLine()!!.toInt()

    //Descobrir qual é o menor número
    if(n1 < n2 && n1 < n3) {
        println(n1)
        n1 += n1 + n2 + n3
    }else if(n2 < n1 && n2 < n3) {
        println(n2)
        n2 += n1 + n2 + n3
    }else {
        println(n3)
        n3 += n1 + n2 + n3
    }

    // descobrir o segundo
    if(n1 < n2 && n1 < n3) {
        println(n1)
        n1 += n1 + n2 + n3
    }else if(n2 < n1 && n2 < n3) {
        println(n2)
        n2 += n1 + n2 + n3
    }else {
        println(n3)
        n3 += n1 + n2 + n3
    }

    // descobrir o terceiro
    if(n1 < n2 && n1 < n3) {
        println(n1)
        n1 += n1 + n2 + n3
    }else if(n2 < n1 && n2 < n3) {
        println(n2)
        n2 += n1 + n2 + n3
    }else {
        println(n3)
        n3 += n1 + n2 + n3
    }

//---------------------------------------------------------------------------------------------------------------

    /*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:

    10-14 infantil
    15-17 juvenil
    18-25 adulto
    */

   /* println("Digite sua idade: ")
    val idade = readLine()!!.toInt()

    when(idade) {
        in 10..14 -> println("Você esta na categoria infantil")
        in 15..17 -> println("Você esta na categoria juvenil")
        in 18..25 -> println("Você esta na categoria adulto")
        else -> println("Você não se encaixa em nenhuma categoria")
    }
    */

//---------------------------------------------------------------------------------------------------------------

    /*
    4- Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. Se for par exiba
    também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
    */

    /*
    print("Digite um número: ")
    val numero = readLine()!!.toDouble()

    when(numero % 2){
        0.0 -> println("O número ${"%.0f".format(numero)} é par e sua raiz quadrada é ${"%.2f".format(sqrt(numero))}")
        1.0 -> println("O número ${"%.0f".format(numero)} é impar e ele elevado ao quadrado é igual a ${"%.0f".format(numero.pow(2))}")
    }
    */

//---------------------------------------------------------------------------------------------------------------

    //5- Faça um programa que o usuário digite um número e o programa retorne o mês referente ao valor.

    /*
    print("Coloque o número de um mês: ")
    val mes = readLine()!!.toInt()

    when(mes) {
        1 -> println("O mês digitado é Janeiro")
        2 -> println("O mês digitado é Fevereiro")
        3 -> println("O mês digitado é Março")
        4 -> println("O mês digitado é Abril")
        5 -> println("O mês digitado é Maio")
        6 -> println("O mês digitado é Junho")
        7 -> println("O mês digitado é Julho")
        8 -> println("O mês digitado é Agosto")
        9 -> println("O mês digitado é Setembro")
        10 -> println("O mês digitado é Outubro")
        11 -> println("O mês digitado é Novembro")
        12 -> println("O mês digitado é Dezembro")
        else -> println("O numero digitado não corresponde a nenhum mês")
    }
*/

}