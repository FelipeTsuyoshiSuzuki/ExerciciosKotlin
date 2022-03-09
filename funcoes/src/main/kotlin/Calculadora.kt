class Calculadora {

    companion object {

        fun menu(op: String, n1: Double, n2: Double): Double {
            when(op) {
                "+" -> return soma(n1, n2)
                "-" -> return  sub(n1, n2)
                "*" -> return mult(n1, n2)
                "/" -> return div(n1, n2)
            }
            return 0.0
        }

        fun soma(n1: Double, n2: Double): Double {
            return n1 + n2
        }

        fun sub(n1: Double, n2: Double): Double {
            return n1 - n2
        }

        fun mult(n1: Double, n2: Double): Double {
            return n1 * n2
        }

        fun div(n1: Double, n2: Double): Double {
            return n1 / n2
        }

        fun escrever(n1: Double, n2: Double, resultado: Double, op: String) {
            println("$n1 $op $n2 = $resultado")
        }

    }
}