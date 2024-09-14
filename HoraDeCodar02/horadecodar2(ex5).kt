fun main() {

    print("Insira o primeiro número: ")
    val numero1 = readLine()?.toDoubleOrNull() ?: 0.0

    print("Insira o segundo número: ")
    val numero2 = readLine()?.toDoubleOrNull() ?: 0.0

    print("Insira o terceiro número: ")
    val numero3 = readLine()?.toDoubleOrNull() ?: 0.0

    print("Insira o quarto número: ")
    val numero4 = readLine()?.toDoubleOrNull() ?: 0.0

    print("Insira o quinto número: ")
    val numero5 = readLine()?.toDoubleOrNull() ?: 0.0

    print("Insira o sexto número: ")
    val numero6 = readLine()?.toDoubleOrNull() ?: 0.0

    val soma = numero1 + numero2 + numero3 + numero4 + numero5 + numero6
    val media = soma / 6

    println("A média aritmética dos números é: $media")
}

