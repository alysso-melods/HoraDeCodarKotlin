fun main() {
    var valor1: Int
    var valor2: Int
    println("Insira o primeiro valor: ")
    valor1 = readlnOrNull()?.toIntOrNull() ?: 0

    do
    {
        println("Insira o segundo valor: ")
        valor2 = readlnOrNull()?.toIntOrNull() ?: 0

        if (valor2 <= 0)
        {
            println("Erro: O segundo valor não pode ser zero ou negativo. Por favor, tente novamente.")
        }
    }

    while (valor2 <= 0)
    var resultado = valor1 / valor2 .toDouble()
    println("O resultado da divisão é:$resultado")
}

