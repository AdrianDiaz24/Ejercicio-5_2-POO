import java.math.RoundingMode


class Departamento(val nombre: String) {
    var empleados = mutableListOf<Empleado>()
    constructor(nombre: String, listaEmpleados: MutableList<Empleado>): this(nombre){
        this.empleados = listaEmpleados
    }

    fun agregarEmpleado(empleado: Empleado){
        empleados.add(empleado)
    }

    fun calcularSalarioTotal(): Double{
        var salarioTotal = 0.0
        for (empleado in empleados){
            salarioTotal += empleado.calcularSalario()
        }
        return salarioTotal.toBigDecimal().setScale(2,RoundingMode.HALF_UP).toDouble()
    }

}