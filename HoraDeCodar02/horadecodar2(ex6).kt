fun main() {
    var valor1: Double
    var valor2: Double
    var valor3: Double
    var valor4: Double
    var valormaior: Double
    print("Insira o primeiro valor:")
    valor1 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Insira o segundo valor:")
    valor2 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Insira o terceiro valor:")
    valor3 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Insira o quarto valor:")
    valor4 = readLine()?.toDoubleOrNull() ?: 0.0

    valormaior = valor1
    if (valor2 > valormaior) {
        valormaior = valor2
    }
    if (valor3 > valormaior) {
        valormaior = valor3
    }
    if (valor4 > valormaior) {
        valormaior = valor4
    }

    println("Primeiro valor:$valor1")
    println("Último valor:$valor4")
    println("O maior valor é:$valormaior")
}