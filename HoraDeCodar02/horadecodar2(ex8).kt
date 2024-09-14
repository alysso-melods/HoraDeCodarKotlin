fun main() {
    val numero1: Double
    val numero2: Double
    val numero3: Double
    val numero4: Double
    var media: Double
    print("Insira o primeiro número: ")
    numero1 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Insira o segundo número: ")
    numero2 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Insira o terceiro número: ")
    numero3 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Insira o quarto número: ")
    numero4 = readLine()?.toDoubleOrNull() ?: 0.0

    if (numero1 >= 0.0 && numero1 <= 10.0 &&
        numero2 >= 0.0 && numero2 <= 10.0 &&
        numero3 >= 0.0 && numero3 <= 10.0 &&
        numero4 >= 0.0 && numero4 <= 10.0) {
        media = (numero1 + numero2 + numero3 + numero4) / 4

        if (media > 5) {
            println("Você passou no teste. Sua média é: $media")
        } else {
            println("Tente novamente. Sua média é: $media")
        }
    } else {
        println("Todos os números devem estar entre 0 e 10. Tente novamente.")
    }
}

