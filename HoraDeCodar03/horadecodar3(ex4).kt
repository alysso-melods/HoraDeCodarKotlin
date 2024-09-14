fun main()
{
    var soma = 0
    var quantidade = 0
    var numero = 15
    val media: Float

    while (numero <= 100)
    {
        quantidade += 1
        soma += numero
        numero += 1
    }
    media = (soma / quantidade) .toFloat()
    println("A média aritmética dos números inteiros entre 15 e 100 é: $media")
}