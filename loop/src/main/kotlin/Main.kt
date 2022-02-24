fun main() {


    // 1- Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
/*

    for(i in 1000..1999) {
        if(i % 11 == 5) {
            println(i)
        }
    }
*/

    //-----------------------------------------------------------------------------------------------------

    //2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
/*

    var par = 0
    var impar = 0

    for(i in 1..10) {
        print("Digite um número: ")
        val n = readLine()!!.toInt()

        if(n % 2 == 0) {
            par++
        }else {
            impar++
        }

    }

    println("O usuário digitou $par números pares \n" +
            "e $impar números impares")
*/

    //-----------------------------------------------------------------------------------------------------

    //3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de
    // pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
/*

    println("O programa será finalizado apenas quando a idade -99 for digitada.")
    var idade = 0
    var novos = 0
    var velhos = 0

    while(idade != -99) {
        print("Digite uma idade: ")
        idade = readLine()!!.toInt()
        if(idade < 21) {
            novos++
        }else if(idade > 50) {
            velhos++
        }else {
            continue
        }
    }
    print("$novos pessoas tem menos de 21 anos e \n" +
            "$velhos pessoas tem mais de 50 anos")
*/
    //-----------------------------------------------------------------------------------------------------
/*
    4- Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma
    região. Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros),
    e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
    Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
    o número de pessoas calmas;
    o número de mulheres nervosas;
    o número de homens agressivos;
    o número de outros calmos;
    o número de pessoas nervosas com mais de 40 anos;
    o número de pessoas calmas com menos de 18 anos.
*/

    var calmos = 0
    var outrosCalmos = 0
    var velhosNervosos = 0
    var jovensCalmos = 0
    var mulheresNervosas = 0
    var homensAgressivos = 0

    var contador = 0

    while(contador < 150) {
        print("Qual sua idade: ")
        val idade = readLine()!!.toInt()
        print("Qual seu genero digite 1-feminino / 2-masculino / 3-Outros ")
        val genero = readLine()!!.toInt()
        print("Digite 1, se você é calma; 2, se você é nervosa e 3, se você é agressiva")
        val traco = readLine()!!.toInt()

       // verificação dos calmos
        if(traco == 1) {
            calmos++
        }

        if(genero == 3 && traco == 1) {
            outrosCalmos++
        }

        if(idade < 18 && traco == 1) {
            jovensCalmos++
        }

        // Verificação dos nervosos

        if(idade > 40 && traco == 2) {
            velhosNervosos++
        }

        if(genero == 1 && traco == 2) {
            mulheresNervosas++
        }

        //Verificação agressivos

        if(genero == 2 && traco == 3) {
            homensAgressivos++
        }

        contador++

    }

    print(
        "O número de pessoas calmas: $calmos, \n" +
                "de mulhers nervosas: $mulheresNervosas, \n" +
                "de homens agressivos: $homensAgressivos, \n" +
                "de outros gêneros calmos: $outrosCalmos, \n" +
                "acima de 40 nervosas: $velhosNervosos, \n" +
                "com menos de 18 calmas: $jovensCalmos.",
    )

    //-----------------------------------------------------------------------------------------------------

    //5- Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final,
    //   mostre a soma dos números digitados.(DO...WHILE)
/*

    var soma = 0

    do {
        print("Escreva um número: ")
        val n = readLine()!!.toInt()
        soma += n
    }while(n != 0)

    print("A soma dos números é $soma")
*/

    //-----------------------------------------------------------------------------------------------------

    //6- Escrever um programa que receba vários números inteiros no teclado. E no final imprimir a média dos
    //   números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
/*

    var soma = 0
    var quantidade = 0

    do {
        print("Digite um número: ")
        val n = readLine()!!.toInt()
        if(n % 3 == 0 && n != 0) {
            soma += n
            quantidade++
        }else {
            continue
        }
    }while(n != 0)

    print("A média dos números multiplos de 3 é ${soma/quantidade}")
*/

}