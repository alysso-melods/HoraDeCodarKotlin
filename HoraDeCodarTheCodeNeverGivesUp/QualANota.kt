import kotlin.system.exitProcess

data class Aluno(val nome: String, val notas: List<Double>)
{
    fun calcularMedia(): Double = notas.average()

    fun situacao(): String
    {
        return if (calcularMedia() >= 5) "Aprovado" else "Reprovado"
    }
}

fun main()
{
    val alunos = mutableListOf<Aluno>()
    var opcao: Int

    do
    {
        println("\nAgenda - Menu Principal")
        println("1. Cadastrar Alunos")
        println("2. Pesquisar Aluno")
        println("3. Exibir Todos os Registros")
        println("4. Sair")
        print("Escolha uma opção: ")

        opcao = readlnOrNull()?.toIntOrNull() ?: 0

        when (opcao)
        {
            1 -> cadastrarAlunos(alunos)
            2 -> pesquisarAluno(alunos)
            3 -> exibirRegistros(alunos)
            4 -> { println("Saindo do programa...")
                exitProcess(0)
            }
            else -> println("Opção inválida, tente novamente.")
        }
    } while (true)
}

fun cadastrarAlunos(alunos: MutableList<Aluno>)
{
    println("\nCadastro de alunos (máximo de 20 alunos):")
    for (i in 1..20)
    {
        print("Digite o nome do ${i}º aluno: ")
        val nome = readlnOrNull() ?: ""
        val notas = mutableListOf<Double>()
        for (bimestre in 1..4)
        {
            print("Digite a nota do ${bimestre}º bimestre: ")
            val nota = readlnOrNull()?.toDoubleOrNull() ?: 0.0
            notas.add(nota)
        }
        alunos.add(Aluno(nome, notas))

        if (i < 20)
        {
            println("Deseja cadastrar mais um aluno? (sim/não): ")
            val resposta = readlnOrNull()?.trim()?.lowercase()
            if (resposta != "sim")
            {
                break
            }
        }
    }
    alunos.sortBy { it.nome }  // Classifica os alunos por nome
    println("\nCadastro concluído e registros classificados por nome!")
}

fun pesquisarAluno(alunos: List<Aluno>)
{
    print("\nDigite o nome do aluno para pesquisa: ")
    val nomePesquisa = readlnOrNull() ?: ""

    val aluno = alunos.find { it.nome.equals(nomePesquisa, ignoreCase = true) }

    if (aluno != null)
    {
        println("\nRegistro encontrado:")
        println("Nome: ${aluno.nome}")
        println("Média: ${aluno.calcularMedia()}")
        println("Situação: ${aluno.situacao()}")
    }
    else
    {
        println("\nAluno não encontrado.")
    }
}

fun exibirRegistros(alunos: List<Aluno>)
{
    if (alunos.isEmpty())
    {
        println("\nNenhum aluno cadastrado.")
    }
    else
    {
        println("\nTodos os registros:")
        alunos.forEach{ aluno ->
            println("Nome: ${aluno.nome}, Média: ${aluno.calcularMedia()}, Situação: ${aluno.situacao()}")
        }
    }
}