fun main() {

    val anoAtual = 2024
    val anoDeNascimento: Double
    val idade: Double
    print("Escreva seu ano de nascimento: ")
    anoDeNascimento = readLine()?.toDoubleOrNull() ?: 0.0
    idade = anoAtual - anoDeNascimento

    if (idade >= 16)
    {
        println("Você pode votar este ano :)")
    }
    else
    {
        println("Você não pode votar este ano :(")
    }
}
