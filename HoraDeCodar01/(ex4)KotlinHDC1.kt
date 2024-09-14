fun main() {
    val forma: Int = readln().toInt()
    println("Escolha a forma geométrica para calcular a área")
    println("1. Retângulo")
    println("2. Quadrado")
    println("3. Paralelogramo")
    println("4. Losango")
    println("5. Círculo")
    println("6. Trapézio")
    println("7. Triângulo")
    print("Digite o número da sua escolha: ")

    if (forma == 1) {
        println("Insira a base do Retângulo: ")
        val baseRetangulo: Float = readln().toFloat()
        println("Insira a altura do Retângulo: ")
        val alturaRetangulo: Float = readln().toFloat()
        val areaRetangulo: Float = (baseRetangulo * alturaRetangulo)
        println("A área total do Retângulo é: $areaRetangulo")
    }
    else if (forma == 2) {
        println("Insira o lado do Quadrado: ")
        val ladoQuadrado: Float = readln().toFloat()
        val areaQuadrado: Float = (ladoQuadrado * ladoQuadrado)
        println("A área total do Quadrado é: $areaQuadrado")
    }
    else if (forma == 3) {
        println("Insira a base do Paralelogramo: ")
        val baseParalelogramo: Float = readln().toFloat()
        println("Insira a altura do Paralelogramo: ")
        val alturaParalelogramo: Float = readln().toFloat()
        val areaParalelogramo: Float = (baseParalelogramo * alturaParalelogramo)
        println("A área total do Paralelogramo é: $areaParalelogramo")
    }
    else if (forma == 4) {
        println("Insira a diagonal maior do Losango: ")
        val diagonalMaior: Float = readln().toFloat()
        println("Insira a diagonal menor do Losango: ")
        val diagonalMenor: Float = readln().toFloat()
        val areaLosango: Float = (diagonalMaior * diagonalMenor) / 2
        println("A área total do Losango é: $areaLosango")
    }
    else if (forma == 5) {
        val numeroPi: Double = 3.14
        println("Insira o raio do Círculo: ")
        val raioCirculo: Double = readln().toDouble()
        val areaCirculo: Double = (numeroPi * raioCirculo * raioCirculo)
        println("A área total do Círculo é: $areaCirculo")
    }
    else if (forma == 6) {
        println("Insira a base maior do Trapézio: ")
        val baseMaiorTrapezio: Float = readln().toFloat()
        println("Insira a base menor do Trapézio: ")
        val baseMenorTrapezio: Float = readln().toFloat()
        println("Insira a altura do Trapézio: ")
        val alturaTrapezio: Float = readln().toFloat()
        val areaTrapezio: Float = (baseMaiorTrapezio + baseMenorTrapezio) * alturaTrapezio / 2
        println("A área total do Trapézio é: $areaTrapezio")
    }
    else if (forma == 7) {
        println("Insira a base do Triângulo: ")
        val baseTriangulo: Float = readln().toFloat()
        println("Insira a altura do Triângulo: ")
        val alturaTriangulo: Float = readln().toFloat()
        val areaTriangulo: Float = (baseTriangulo * alturaTriangulo) / 2
        println("A área total do Triângulo é: $areaTriangulo")
    }
    else {
        println("ERRO: Escolha inválida, tente novamente.")
    }
}