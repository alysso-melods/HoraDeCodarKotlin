fun main()
{
    println("Insira um valor:")
    val valorEscolhido = readlnOrNull()?.toIntOrNull() ?: return

    var numero = 1
    while (numero <= valorEscolhido)
    {
        println("Tabuada do Número$numero:")
        var multiplicacao = 1

        while (multiplicacao <= 10)
        {
            print("${numero * multiplicacao} ")
            multiplicacao++
        }
        println()
        numero++
    }
}
