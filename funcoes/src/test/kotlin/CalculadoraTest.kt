import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalculadoraTest {

    @Test
    fun somaTeste() {
        assertEquals(5.0, Calculadora.soma(2.0, 3.0))
    }

    @Test
    fun subTeste() {
        assertEquals(3.0, Calculadora.sub(5.0, 2.0))
    }

    @Test
    fun multTeste() {
        assertEquals(6.0, Calculadora.mult(2.0, 3.0))
    }

    @Test
    fun divTeste() {
        assertEquals(4.0, Calculadora.div(20.0, 5.0))
        assertEquals(0.5, Calculadora.div(1.0, 2.0))
        assertEquals(2.5, Calculadora.div(5.0, 2.0))
    }
}