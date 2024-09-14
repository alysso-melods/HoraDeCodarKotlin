fun main()
{
    var numero1: Double
    var numero2: Double
    print("Informe o primeiro número: ")
    numero1 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Informe o segundo número: ")
    numero2 = readLine()?.toDoubleOrNull() ?: 0.0

    if (numero1 > numero2)
    {
        println("O maior número é:$numero1")
    }
    else if (numero1 < numero2)
    {
        println("O maior numero é:$numero2")
    }
    else
    {
        println("Os números possuem o mesmo valor!")
    }
}
