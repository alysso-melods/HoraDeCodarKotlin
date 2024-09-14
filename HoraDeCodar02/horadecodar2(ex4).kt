fun main() {

    var valor1: Double
    var valor2: Double
    var valor3: Double
    val valormaior1: Double
    val valormaior2: Double
    print("Insira o primeiro valor:")
    valor1 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Insira o segundo valor:")
    valor2 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Insira o terceiro valor:")
    valor3 = readLine()?.toDoubleOrNull() ?: 0.0

    if (valor1 > valor2 && valor1 > valor3)
    {
        valormaior1 = valor1
        valormaior2 = if (valor2 > valor3) valor2 else valor3
    }
    else if (valor2 > valor1 && valor2 > valor3)
    {
        valormaior1 = valor2
        valormaior2 = if (valor1 > valor3) valor1 else valor3
    }
    else
    {
        valormaior1 = valor3
        valormaior2 = if (valor1 > valor2) valor1 else valor2
    }

    val valortotal = valormaior1 + valormaior2
    println("somando os 2 valores maiores o resultado é: $valortotal")


}