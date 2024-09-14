fun main()
{
    println("Insira o valor de N: ")
    val n = readlnOrNull()?.toIntOrNull() ?: return
    var contador = 1

    while (contador <= n)
    {
        println("$contador ")
        contador++
    }
}