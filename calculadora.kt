fun main() {
    println("Ingrese el monto de la remesa enviada:")
    val montoEnviado = readLine()?.toDoubleOrNull() ?: 0.0
    
    val comision = calcularComision(montoEnviado)
    val itf = calcularITF(montoEnviado)
    val montoRecibido = montoEnviado - comision - itf
    
    println("Desglose de la remesa:")
    println("Monto enviado: $montoEnviado")
    println("Comisión: $comision")
    println("ITF: $itf")
    println("Monto recibido: $montoRecibido")
}

fun calcularComision(monto: Double): Double {
    return when {
        monto <= 1000 -> 5.0
        monto <= 10001 -> 0.05 * monto
        else -> 1.5 * monto / 100
    }
}

fun calcularITF(monto: Double): Double {
    return monto * 0.005 / 100
}