import animais.*


fun main(args: Array<String>) {

    val sid = Preguiça("Sid", 5)
    val peDePano = Cavalo("Pé de Pano", 10)
    val caramelo = Cachorro("Max", 8)

    sid.emitirSom()
    sid.escalar()
    peDePano.emitirSom()
    peDePano.corre()
    caramelo.emitirSom()
    caramelo.corre()

}