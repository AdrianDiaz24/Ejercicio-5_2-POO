import java.math.RoundingMode


fun main(){

    val empleados = mutableListOf(EmpleadoFijo("Adrian", 1, 1751.24, 3), EmpleadoPorHora("Rocio", 2, 254.3, 20), EmpleadoPorHora("Inda", 3, 758.348, 14))

    val departamento1 = Departamento("Ventas", empleados)

    for (empleado in empleados){
        println(empleado)
    }
    println("Salario total del departamento ${departamento1.nombre} es de ${departamento1.calcularSalarioTotal()}€")


}

fun Double.rendondear(): Double {
    return this.toBigDecimal().setScale(2, RoundingMode.HALF_UP).toDouble()
}