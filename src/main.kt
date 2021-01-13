fun main()
{
    println("дарова")
    println("хочешь фокус")
    println("введи первую цифру")
    val num1 = readLine().toString().toDouble()
    println("введи вторую цифру")
    val num2 = readLine().toString().toDouble()
    println("введи  операцию")
    val operation = readLine()
    when(operation)
    {
        "+" -> println(num1+num2)
        "-" -> println(num1-num2)
        "/" -> println(num1/num2)
        "*" -> println(num1*num2)
        else -> println("опа короч не получилось")
    }
    println("плати податки столько сколько написанно")
}