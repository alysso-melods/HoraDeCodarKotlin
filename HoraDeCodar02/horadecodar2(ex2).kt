fun main() {

     var numeroinformado: Double
     print("Insira um numero para que eu verifique se ele é de valor positivo ou negativo:")
     numeroinformado = readLine()?.toDoubleOrNull() ?: 0.0

    if (numeroinformado > 0)
    {
        println("o numero inserido é positivo")
    }
    else if (numeroinformado < 0)
    {
        println("o numero inserido é negativo")
    }
    else
    {
        println("O numero inserido é igual a zero")
    }
}