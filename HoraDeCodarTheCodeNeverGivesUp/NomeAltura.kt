import kotlin.system.exitProcess

data class Persona(val nome: String, val altura: Double)

fun main()
{
    val pessoas = mutableListOf<Persona>()
    var opcao: Int

    do
    {
        println("\nMenu Principal")
        println("1. Cadastrar pessoas")
        println("2. Exibir pessoas com altura <= 1.5m")
        println("3. Exibir pessoas com altura > 1.5m")
        println("4. Exibir pessoas com altura entre 1.5m e 2.0m")
        println("5. Exibir média das alturas")
        println("6. Sair")
        print("Escolha uma opção: ")

        opcao = readlnOrNull()?.toIntOrNull() ?: 0

        when (opcao)
        {
            1 -> cadastrarPessoas(pessoas)
            2 -> exibirMenoresOuIguais15(pessoas)
            3 -> exibirMaioresQue15(pessoas)
            4 -> exibirEntre15e20(pessoas)
            5 -> exibirMediaAlturas(pessoas)
            6 ->
                {
                println("Saindo do programa...")
                exitProcess(0)
            }
            else -> println("Opção inválida, tente novamente.")
        }
    } while (true)
}

fun cadastrarPessoas(pessoas: MutableList<Persona>)
{
    println("\nCadastro de 15 pessoas:")
    var i = 1
    while (i <= 15)
    {
        print("Digite o nome da ${i}ª pessoa: ")
        val nome = readlnOrNull()?.trim() ?: ""
        print("Digite a altura da ${i}ª pessoa (em metros): ")
        val altura = readlnOrNull()?.toDoubleOrNull() ?: 0.0

        if (nome.isNotBlank() && altura > 0)
        {
            pessoas.add(Persona(nome, altura))
            i++
        }
        else
        {
            println("Dados inválidos, por favor, preencha corretamente.")
        }
    }
    println("\nCadastro finalizado!")
}

fun exibirMenoresOuIguais15(pessoas: List<Persona>)
{
    val menoresOuIguais15 = pessoas.filter { it.altura <= 1.5 }
    if (menoresOuIguais15.isEmpty())
    {
        println("\nNenhuma pessoa com altura menor ou igual a 1.5m.")
    }
    else
    {
        println("\nPessoas com altura menor ou igual a 1.5m:")
        menoresOuIguais15.forEach { println("Nome: ${it.nome}, Altura: ${it.altura}m") }
    }
}

fun exibirMaioresQue15(pessoas: List<Persona>)
{
    val maioresQue15 = pessoas.filter { it.altura > 1.5 }
    if (maioresQue15.isEmpty())
    {
        println("\nNenhuma pessoa com altura maior que 1.5m.")
    }
    else
    {
        println("\nPessoas com altura maior que 1.5m:")
        maioresQue15.forEach { println("Nome: ${it.nome}, Altura: ${it.altura}m") }
    }
}

fun exibirEntre15e20(pessoas: List<Persona>)
{
    val entre15e20 = pessoas.filter { it.altura > 1.5 && it.altura < 2.0 }
    if (entre15e20.isEmpty())
    {
        println("\nNenhuma pessoa com altura entre 1.5m e 2.0m.")
    }
    else
    {
        println("\nPessoas com altura entre 1.5m e 2.0m:")
        entre15e20.forEach { println("Nome: ${it.nome}, Altura: ${it.altura}m") }
    }
}

fun exibirMediaAlturas(pessoas: List<Persona>)
{
    if (pessoas.isEmpty())
    {
        println("\nNenhuma pessoa cadastrada.")
    }
    else
    {
        val somaAlturas = pessoas.sumOf { it.altura }
        val mediaAlturas = somaAlturas / pessoas.size
        println("\nMédia das alturas: $mediaAlturas metros")
    }
}

