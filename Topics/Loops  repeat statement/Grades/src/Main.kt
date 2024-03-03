fun main() {
    val n = readln().toInt()
    var gradeA = 0
    var gradeB = 0
    var gradeC = 0
    var gradeD = 0

    repeat(n){
        when (readln().toInt()) {
            5 -> gradeA++
            4 -> gradeB++
            3 -> gradeC++
            2 -> gradeD++
        }
    }

    println("$gradeD $gradeC $gradeB $gradeA")
}