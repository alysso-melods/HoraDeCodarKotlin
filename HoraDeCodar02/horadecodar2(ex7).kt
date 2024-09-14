fun main() {
    var valor1: Double
    var valor2: Double
    var valor3: Double
    var valor4: Double
    var valor5: Double
    var valor6: Double
    var adicao = 0.0

    print("Insira o primeiro valor: ")
    valor1 = readLine()?.toDoubleOrNull() ?: 0.0
    if (valor1 < 72) {
        adicao = adicao + valor1
    }

    print("Insira o segundo valor: ")
    valor2 = readLine()?.toDoubleOrNull() ?: 0.0
    if (valor2 < 72) {
        adicao = adicao + valor2
    }

    print("Insira o terceiro valor: ")
    valor3 = readLine()?.toDoubleOrNull() ?: 0.0
    if (valor3 < 72) {
        adicao = adicao + valor3
    }

    print("Insira o quarto valor: ")
    valor4 = readLine()?.toDoubleOrNull() ?: 0.0
    if (valor4 < 72) {
        adicao = adicao + valor4
    }

    print("Insira o quinto valor: ")
    valor5 = readLine()?.toDoubleOrNull() ?: 0.0
    if (valor5 < 72) {
        adicao = adicao + valor5
    }

    print("Insira o sexto valor: ")
    valor6 = readLine()?.toDoubleOrNull() ?: 0.0
    if (valor6 < 72) {
        adicao = adicao + valor6
    }
    println("\nValores informados que são inferiores a 72: $valor1, $valor2, $valor3, $valor4, $valor5, $valor6")
    println("A soma dos números inferiores a 72 é: $adicao")
}
