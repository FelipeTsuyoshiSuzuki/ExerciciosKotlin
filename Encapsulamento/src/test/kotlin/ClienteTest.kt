import `class`.Cliente
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ClienteTest {

    val c = Cliente("Julio")
    val c2 = Cliente("Ana")

    @Test
    fun addCompraTeste() {
        c.addCompra("CALÇA")
        assertEquals(
            "CALÇA", c.listaCompras[0])
    }

    @Test
    fun removeCompraTeste() {
        //Adicionando itens ao carrinho
        c2.listaCompras.add("CALÇA")
        c2.listaCompras.add("CAMISA")

        // Removendo itens
        c2.removeCompra("CALÇA")

        // Verificando se o item que sobrou é a camisa
        assertEquals("CAMISA", c2.listaCompras[0])
    }


}