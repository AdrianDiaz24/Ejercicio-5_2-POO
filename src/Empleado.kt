import java.math.RoundingMode


abstract class Empleado(val nombre: String, val id: Int) {

    abstract fun calcularSalario(): Double

    override fun toString(): String {
        return "$nombre con ID $id tiene un salario de ${this.calcularSalario().rendondear()}€ al mes"
    }

}