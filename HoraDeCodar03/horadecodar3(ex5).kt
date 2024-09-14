fun main()
{
   var soma = 0
   var totalnumeros = 0

    println("Insira o primeiro número: ")
    var numero1 = readlnOrNull()?.toIntOrNull() ?:0
    println("Insira o segundo número:")
    val numero2 = readlnOrNull()?.toIntOrNull()?:0

    while(numero1 <= numero2)
    {
        totalnumeros += 1
        soma += numero1
        numero1 += 1
    }
     val media = (soma / totalnumeros) .toFloat()
    println("A média aritmética dos números inteiros informados entre eles: $media")
}