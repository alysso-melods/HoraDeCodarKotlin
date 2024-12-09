import kotlin.system.exitProcess

data class Pessoa(
    val nome: String,
    val endereco: String,
    val telefone: String
)

fun main()
{
    val agenda = mutableListOf<Pessoa>()
    var opcao: Int

    do {
        println("\nAgenda - Menu Principal")
        println("1. Cadastro")
        println("2. Pesquisar")
        println("3. Classificar por nome")
        println("4. Exibir todos os registros")
        println("5. Sair")
        print("Escolha uma opção: ")

        opcao = readlnOrNull()?.toIntOrNull() ?: 0

        when (opcao)
        {
            1 -> cadastrarRegistros(agenda)
            2 -> pesquisarRegistro(agenda)
            3 -> classificarPorNome(agenda)
            4 -> exibirRegistros(agenda)
            5 -> {
                println("Saindo do programa...")
                exitProcess(0)
            }
            else -> println("Opção inválida, tente novamente.")
        }
    } while (opcao != 5)
}

fun cadastrarRegistros(agenda: MutableList<Pessoa>)
{
    println("\nCadastro de registros (máximo 10 pessoas):")
    var i = 1
    while (i <= 10) {
        print("Digite o nome da ${i}ª pessoa: ")
        val nome = readlnOrNull() ?: ""
        print("Digite o endereço da ${i}ª pessoa: ")
        val endereco = readlnOrNull() ?: ""
        print("Digite o telefone da ${i}ª pessoa: ")
        val telefone = readlnOrNull() ?: ""

        agenda.add(Pessoa(nome, endereco, telefone))

        if (i < 10)
        {
            println("Deseja cadastrar mais uma pessoa? (sim/não): ")
            val resposta = readlnOrNull()?.trim()?.lowercase()
            if (resposta != "sim")
            {
                println("\nCadastro interrompido!")
                break
            }
        }
        i++
    }
    println("\nCadastro finalizado!")
}


fun pesquisarRegistro(agenda: List<Pessoa>)
{
    print("\nDigite o nome para pesquisa: ")
    val nomePesquisa = readlnOrNull() ?: ""

    val pessoa = agenda.find { it.nome.equals(nomePesquisa, ignoreCase = true) }

    if (pessoa != null)
    {
        println("\nRegistro encontrado:")
        println("Nome: ${pessoa.nome}")
        println("Endereço: ${pessoa.endereco}")
        println("Telefone: ${pessoa.telefone}")
    }
    else
    {
        println("\nRegistro não encontrado.")
    }
}

fun classificarPorNome(agenda: MutableList<Pessoa>) {
    agenda.sortBy { it.nome }

    println("\nRegistros classificados por nome:")
    agenda.forEach { pessoa ->
        println("Nome: ${pessoa.nome}, Endereço: ${pessoa.endereco}, Telefone: ${pessoa.telefone}")
    }
}


fun exibirRegistros(agenda: List<Pessoa>) {
    if (agenda.isEmpty())
    {
        println("\nNenhum registro cadastrado.")
    }
    else
    {
        println("\nTodos os registros:")
        agenda.forEach{ pessoa ->
            println("Nome: ${pessoa.nome}, Endereço: ${pessoa.endereco}, Telefone: ${pessoa.telefone}")
        }
    }
}
