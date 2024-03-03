import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    // input temperature in Fahrenheit
    val temperature: Int = scan.nextLine().trim().toInt()

    // your code goes here
    when{
        temperature > 85 -> print("High temperature")
        temperature < 50 -> print("Low temperature")
        else -> print("Normal temperature")
    }


}