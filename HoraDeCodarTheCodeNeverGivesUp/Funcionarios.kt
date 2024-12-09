import kotlin.system.exitProcess

data class Funcionario(val matricula: Int, val nome: String, val salario: Double)

fun main()
{
    val funcionarios = mutableListOf<Funcionario>()
    var opcao: Int

    do
    {
        println("\nMenu Principal")
        println("1. Cadastrar funcionários e classificar por matrícula")
        println("2. Pesquisar funcionário por matrícula")
        println("3. Exibir funcionários com salário > R$1.000,00")
        println("4. Exibir funcionários com salário < R$1.000,00")
        println("5. Exibir funcionários com salário = R$1.000,00")
        println("6. Sair")
        print("Escolha uma opção: ")

        opcao = readlnOrNull()?.toIntOrNull() ?: 0

        when (opcao)
        {
            1 -> cadastrarFuncionarios(funcionarios)
            2 -> pesquisarFuncionario(funcionarios)
            3 -> exibirSalarioAcima1000(funcionarios)
            4 -> exibirSalarioAbaixo1000(funcionarios)
            5 -> exibirSalarioIgual1000(funcionarios)
            6 ->
                {
                println("Saindo do programa...")
                exitProcess(0)
            }
            else -> println("Opção inválida, tente novamente.")
        }
    } while (true)
}

fun cadastrarFuncionarios(funcionarios: MutableList<Funcionario>)
{
    println("\nCadastro de 20 funcionários:")
    var i = 1
    while (i <= 20)
    {
        print("Digite a matrícula do ${i}º funcionário: ")
        val matricula = readlnOrNull()?.toIntOrNull() ?: 0
        print("Digite o nome do ${i}º funcionário: ")
        val nome = readlnOrNull()?.trim() ?: ""
        print("Digite o salário do ${i}º funcionário: ")
        val salario = readlnOrNull()?.toDoubleOrNull() ?: 0.0

        if (matricula > 0 && nome.isNotBlank() && salario > 0)
        {
            funcionarios.add(Funcionario(matricula, nome, salario))
            i++
        }
        else
        {
            println("Dados inválidos, por favor, preencha corretamente.")
        }
    }
    funcionarios.sortBy { it.matricula }
    println("\nCadastro finalizado e registros classificados por matrícula!")
}

fun pesquisarFuncionario(funcionarios: List<Funcionario>)
{
    print("\nDigite o número da matrícula para pesquisa: ")
    val matriculaPesquisa = readlnOrNull()?.toIntOrNull() ?: 0

    val funcionario = funcionarios.find { it.matricula == matriculaPesquisa }

    if (funcionario != null)
    {
        println("\nFuncionário encontrado:")
        println("Matrícula: ${funcionario.matricula}")
        println("Nome: ${funcionario.nome}")
        println("Salário: R$${funcionario.salario}")
    }
    else
    {
        println("\nFuncionário não encontrado.")
    }
}

fun exibirSalarioAcima1000(funcionarios: List<Funcionario>)
{
    val acima1000 = funcionarios.filter { it.salario > 1000 }
    if (acima1000.isEmpty())
    {
        println("\nNenhum funcionário com salário acima de R$1.000,00.")
    }
    else
    {
        println("\nFuncionários com salário acima de R$1.000,00:")
        acima1000.forEach { println("Matrícula: ${it.matricula}, Nome: ${it.nome}, Salário: R$${it.salario}") }
    }
}

fun exibirSalarioAbaixo1000(funcionarios: List<Funcionario>)
{
    val abaixo1000 = funcionarios.filter { it.salario < 1000 }
    if (abaixo1000.isEmpty())
    {
        println("\nNenhum funcionário com salário abaixo de R$1.000,00.")
    }
    else
    {
        println("\nFuncionários com salário abaixo de R$1.000,00:")
        abaixo1000.forEach { println("Matrícula: ${it.matricula}, Nome: ${it.nome}, Salário: R$${it.salario}") }
    }
}

fun exibirSalarioIgual1000(funcionarios: List<Funcionario>)
{
    val igual1000 = funcionarios.filter { it.salario == 1000.0 }
    if (igual1000.isEmpty())
    {
        println("\nNenhum funcionário com salário igual a R$1.000,00.")
    }
    else
    {
        println("\nFuncionários com salário igual a R$1.000,00:")
        igual1000.forEach { println("Matrícula: ${it.matricula}, Nome: ${it.nome}, Salário: R$${it.salario}") }
    }
}
