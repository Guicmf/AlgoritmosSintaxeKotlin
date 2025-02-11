fun main(args: Array<String>) {
     println("Digite a 1 nota: ")
    val num1 = readLine()!!.toInt()
  println("Digite a 2 nota: ")
    val num2 = readLine()!!.toInt()
    println("Digite a 3 nota: ")
    val num3 = readLine()!!.toInt()
    println("Digite a 4 nota: ")
    val num4 = readLine()!!.toInt()
    val soma  = num1 + num2 + num3 + num4
    val resultado = soma/4
    println("A média é: $resultado")
}