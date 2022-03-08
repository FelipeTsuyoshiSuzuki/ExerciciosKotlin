package animais

class Cachorro(
    nome: String, idade: Int
): Animal2(nome, idade) {

    override var som = "latindo"

}