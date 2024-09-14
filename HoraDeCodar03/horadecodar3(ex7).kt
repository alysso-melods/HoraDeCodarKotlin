fun main()
{
    var soma = 0
    var contador = 0

    do
    {
        print("Insira a nota ${contador + 1} (0 a 10): ")
        val nota = readlnOrNull()?.toIntOrNull()

        if (nota != null && nota in 0..10)
        {
            soma += nota
            contador++
        }
        else
        {
            println("ERRO: Insira uma nota válida de 0 a 10.")
        }
    }
    while (contador < 6)
    val media = (soma / 6).toFloat()
    println("A média do aluno é: $media")
}
