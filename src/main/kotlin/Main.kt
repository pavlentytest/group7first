import java.util.*

fun main() {
    val (a, b, m, n) = readln().split(" ").map { it.toDouble() }
    println(if((a >= m && b >= n) || (a >= n && b >= m)) "YES" else "NO")
}

fun main2() {

    val x : Int = 100
    x = 200
    var y = 200
    y = 300
    val (a,b,m,n) = readln().split(" ").map { it.toInt() }

    val sc = Scanner(System.`in`)
    val number = sc.nextInt()
    val nums = 1..10 // Range [1,10]
    for(i in nums) {
        println(i)
    }
    val arr = arrayOf(1,3,42,3,23,235,2345235)
    for(j in arr) {
        println(j)
    }
    for(ii in arr.indices) {
        println(arr[ii])
    }
    println("a = ${a+200+mult(4,3)}, b = ${b+200}")
    println("Hello world!")
    println("$a $b")


    val result = if(a>100) 5 else 10
    val result2 = when {
        a>100 -> println("234234234")
        else -> println("sdfsdfsf")
    }
    when(a) {
        1,2,3 -> {
            if(a>100) {
                println("23234234")
            } else {

            }
        }
        else -> println("34234")
    }
    /*while() {

    }
    do {

    } while()
    */
    repeat(5) {

    }
    for(i in 100 downTo 50 step 3) {
        println(i)
    }


    var h : Int? = 0
    h = null
    var str: String? = null
    //val l = str?.length
    val l = if(str!!.length != null) str?.length else -1

    // Elvis operator
    val l2 = str?.length ?: -1



}
fun mult(a: Int, b: Int) = a * b

// javac - java compile
// byte code
// JVM - Java Virtual Machine
// Linux (Unix), MacOS, Windows
// MainKt.class
// JDK - Java Development Kit
// 21 (Java)