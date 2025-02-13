

class EmpleadoPorHora(nombre: String, id:Int, val tarifaPorHora: Double, val horasTrabajadas: Int = 0): Empleado(nombre, id) {
    override fun calcularSalario(): Double {
        return tarifaPorHora * horasTrabajadas
    }

}