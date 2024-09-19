fun main()
{
    var saldo = 1000.00
    val senha = "3589"
    val extrato = " Depósito: R$50.00\n " +
            "Comprou Death Stranding (Director's Cut): R$113.00\n " +
            "Depósito: R$200.00\n " +
            "Comprou Lego The Office Set: R$1390.00\n"

    print("Por favor, insira seu nome: ")
    val nome:String = readlnOrNull() ?: ""
    println("Olá $nome, é um prazer ter você por aqui!\n")
    while (true) {
        println(
            "Menu:\n" +
                    "1 - Saldo\n" +
                    "2 - Extrato\n" +
                    "3 - Saque\n" +
                    "4 - Depósito\n" +
                    "5 - Transferência\n" +
                    "6 - Sair\n" +
                    "Escolha uma opção: \n"
        )
        val opcaoEscolhida = readlnOrNull() ?: ""

        when (opcaoEscolhida)
        {
            "1" -> acessarSaldo(senha, saldo)
            "2" -> verExtrato(senha, extrato)
            "3" -> saldo = realizarSaque(senha, saldo)
            "4" -> saldo = realizarDeposito(saldo, extrato)
            "5" -> saldo = realizarTransferencia(senha, saldo)
            "6" -> {
                println("$nome, foi um prazer ter você por aqui")
            }
            else -> println("ERRO: Opção inválida. Tente novamente.")
        }
    }
}

fun acessarSaldo(senha:String, saldo:Double)
{
    print("Insira sua senha: ")
    val senhaInformada = readlnOrNull() ?: ""
    if (senhaInformada == senha)
    {
        println("Seu saldo atual é: R$$saldo\n")
    }
    else
    {
        println("ERRO: Senha incorreta. Tente novamente.")
        acessarSaldo(senha, saldo)
    }
}

fun verExtrato(senha:String,extrato:String)
{
    print("Insira sua senha: ")
    val senhaInformada = readlnOrNull() ?: ""
    if (senhaInformada == senha)
    {
        println("Extrato da conta:\n$extrato")
    }
    else
    {
        println("ERRO: Senha incorreta. Tente novamente.")
        verExtrato(senha, extrato)
    }
}

fun realizarSaque(senha:String,saldoAtual:Double):Double
{
    print("Insira sua senha: ")
    val senhaInformada = readlnOrNull() ?: ""
    if (senhaInformada == senha)
    {
        print("Insira o valor do saque: ")
        val valor = readlnOrNull()?.toDoubleOrNull() ?: 0.0
        return if (valor > 0 && valor <= saldoAtual)
        {
            println("Saque de R$$valor realizado com sucesso.\n")
            (saldoAtual - valor)
        }
        else
        {
            println("Operação não autorizada.\n")
            (saldoAtual)
        }
    }
    else
    {
        println("ERRO: Senha incorreta. Tente novamente.")
        return realizarSaque(senha,saldoAtual)
    }
}

fun realizarDeposito(saldoAtual:Double,extrato:String):Double
{
    print("Insira o valor do depósito: ")
    val valor = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    return if (valor > 0)
    {
        println("Depósito de R$$valor realizado com sucesso.\n")
        (saldoAtual + valor)
    }
    else
    {
        println("Operação não autorizada.\n")
        (saldoAtual)
    }
}

fun realizarTransferencia(senha:String, saldoAtual:Double):Double
{
    print("Insira sua senha: ")
    val senhaInformada = readlnOrNull() ?: ""
    if (senhaInformada == senha)
    {
        print("Insira o número da conta de destino: ")
        val numeroConta = readlnOrNull() ?: ""
        if (numeroConta.isEmpty())
        {
            println("ERRO: Número de conta inválido. Tente novamente.")
            return realizarTransferencia(senha, saldoAtual)
        }
        else
        {
            print("Insira o valor da transferência: ")
            val valor = readlnOrNull()?.toDoubleOrNull() ?: 0.0
            return if (valor > 0 && valor <= saldoAtual)
            {
                println("Transferência de R$$valor para a conta $numeroConta realizada com sucesso.\n")
                (saldoAtual - valor)
            }
            else
            {
                println("Operação não autorizada.\n")
                (saldoAtual)
            }
        }
    }
    else
    {
        println("ERRO: Senha incorreta. Tente novamente.")
        return realizarTransferencia(senha, saldoAtual)
    }
}