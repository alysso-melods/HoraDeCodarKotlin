fun main()
{
    var valor: Double
    var dentro = 0
    var fora = 0
    var numero = 0

    while (numero < 10)
    {
        println("Insira o valor ${numero + 1}:")
        valor = readlnOrNull()?.toDoubleOrNull() ?: 0.0

        if (valor in 24.0..42.0)
        {
          dentro++
        }
        else
        {
          fora++
        }
          numero++
    }
    println("Estão dentro do intervalo (24 a 42): $dentro")
    println("Estão fora do intervalo (não entre 24 e 42): $fora")
}
