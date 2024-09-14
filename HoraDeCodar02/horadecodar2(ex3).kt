fun main() {

    var numeroinformado1: Double
    var numeroinformado2: Double
    var numeroinformado3: Double
    print("Insira o primeiro valor:")
    numeroinformado1 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Insira o segundo valor:")
    numeroinformado2 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Insira o terceiro valor:")
    numeroinformado3 = readLine()?.toDoubleOrNull() ?: 0.0

    if (numeroinformado1 > numeroinformado2 && numeroinformado1 > numeroinformado3)
    {
        println("o primeiro valor é maior que os demais")
    }
    else if (numeroinformado2 > numeroinformado1 && numeroinformado2 > numeroinformado3)
    {
        println("o segundo valor é maior que os demais")
    }
    else if (numeroinformado3 > numeroinformado1 && numeroinformado3 > numeroinformado2)
    {
        println("o terceiro valor é maior que os demais")
    }
}