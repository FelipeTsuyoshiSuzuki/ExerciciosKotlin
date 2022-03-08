package animais

open class Animal2(
    override var nome: String, override var idade: Int
    ): Animal {

    protected open var som = ""

    override fun emitirSom() {
        println("$nome esta $som")
    }

    fun corre() {
        println("$nome esta correndo")
    }

    fun escalar() {
        println("$nome escalou a árvore")
    }


}