fun main(args: Array<String>) {
     println("Digite o valor em metros: ")
    val metros = readLine()!!.toInt()
      val centimetros = metros/100
    println("Em centimetros é: $centimetros cm")
}