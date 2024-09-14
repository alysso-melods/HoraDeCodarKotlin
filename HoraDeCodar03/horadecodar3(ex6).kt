fun main() {
    var aprovados = 0
    var continuar = "S"

    while (continuar == "S")
    {
        print("Insira a primeira nota do aluno: ")
        val nota1 = readlnOrNull()?.toDoubleOrNull() ?: 0.0
        print("Insira a segunda nota do aluno: ")
        val nota2 = readlnOrNull()?.toDoubleOrNull() ?: 0.0
        val media = (nota1 + nota2) / 2
        println("A média final do aluno é: $media")

        if (media >= 9.5)
        {
            println("O aluno passou de ano!!!")
            aprovados += 1
        }
        else
        {
            println("O aluno foi reprovado!!!")
        }
        print("Calcular a média de outro aluno (S/N)? ")
        continuar = readlnOrNull() ?: "N"
    }
        println("Número de alunos aprovados: $aprovados")
}
