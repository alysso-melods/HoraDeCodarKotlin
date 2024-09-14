fun main() {

    println("Insira a base do Retangulo: ")
    val base: Float = readln().toFloat()
    println("Insira a altura do Retângulo: ")
    val altura: Float = readln().toFloat()
    val area: Float
    area = base*altura
    println("A araa total do Retângulo é: $area")

    println("Insira o lado do Quadrado: ")
    val lado: Float = readln().toFloat()
    val area: Float
    area = lado*lado
    println("A area total do Quadrado é: $area")

    println("Insira a base do Paralelogramo: ")
    val base: Float = readln().toFloat()
    println("Insira a altura do Paralelogramo: ")
    val altura: Float = readln().toFloat()
    val area: Float
    area = base*altura
    println("Area total do Paralelograma é: $area")

    println("Insira a diagonal maior do Losango: ")
    val diagonal_maior: Float = readln().toFloat()
    println("Insira a diagonal menor do Losango: ")
    val diagonal_menor: Float = readln().toFloat()
    val area: Float
    area = (diagonal_maior * diagonal_menor) / 2
    println("A area total do Losango é: $area")

    val numero_pi: Double = 3.14
    println("Insira o raio do Circulo: ")
    val raio: Double = readln().toDouble()
    val area: Double
    area = (numero_pi * raio)
    println("A aréa total do Circulo é:$area")


    println("Insira a base maior do Trapézio: ")
    val base_maior: Float = readln().toFloat()
    println("Insira a base menor do Trapézio: ")
    val base_menor: Float = readln().toFloat()
    println("Insira a altura do Trapézioo: ")
    val altura: Float = readln().toFloat()
    val area: Float
    area = (base_maior + base_menor)*altura / 2
    println("A area total do trapézio: $area")

    println("Insira a base do Triângulo: ")
    val base: Float = readln().toFloat()
    println("Insira a altura do Triângulo: ")
    val altura: Float = readln().toFloat()
    val area: Float
    area = (base*altura) / 2
    println("A aréa total do Triângulo é:$area")

}

