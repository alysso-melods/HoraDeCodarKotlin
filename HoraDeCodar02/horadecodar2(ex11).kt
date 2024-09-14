fun main() {
    var valor1: Int
    var valor2: Int
    var operacao: Int
    var resultado: Double
    print("Informe o primeiro valor: ")
    valor1 = readLine()?.toIntOrNull() ?: 0
    print("Informe o segundo valor: ")
    valor2 = readLine()?.toIntOrNull() ?: 0
    print("Escolha a operação (1. Adição, 2. Subtração, 3. Divisão, 4. Multiplicação): ")
    operacao = readLine()?.toIntOrNull() ?: 0

    if (operacao == 1)
    {
        resultado = (valor1 + valor2).toDouble()
        println("Resultado da adição: $resultado")
    }

    else if (operacao == 2)
    {
        resultado = (valor1 - valor2).toDouble()
        println("Resultado da subtração:$resultado")
    }
    else if (operacao == 3)
    {
        if (valor2 != 0)
        {
            resultado = (valor1 / valor2).toDouble()
            println("Resultado da divisão:$resultado")
        }
        else
        {
            println("ERRO: divisão por zero não existe")
        }
    }
    else if (operacao == 4)
    {
        resultado = (valor1 * valor2).toDouble()
        println("Resultado da multiplicação:$resultado")
    }
    else
    {
        println("ERRO:Operação inválida.Por favor,tente novamente")
    }
}