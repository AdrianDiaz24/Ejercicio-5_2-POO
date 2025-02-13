class EmpleadoFijo(nombre: String, id:Int, val salarioFijo: Double, val numPagas: Int  = 1):Empleado(nombre, id) {

    override fun calcularSalario(): Double {
        return salarioFijo * numPagas
    }

}