fun main() {

    var altura: Double
    var genero: Double
    var pesoideal: Double
    print("Insira seu gênero (1 para feminino, 2 para masculino): ")
    genero = readLine()?.toDoubleOrNull() ?: 0.0
    print("Insira sua altura em metros: ")
    altura = readLine()?.toDoubleOrNull() ?: 0.0

    if (genero == 1.0)
    {
        pesoideal = (72.7 * altura) - 58
    }
    else
    {
        pesoideal = (62.1 * altura) - 44.7
    }
    println("Seu peso ideal é $pesoideal")

}