object q2{
    def sub(x_num: Int , x_den: Int , y_num: Int , y_den: Int):(Int,Int)={
        val finalNum = (x_num *y_den) - (y_num * x_den)
        val finalDen = x_den * y_den
        (finalNum , finalDen)
    }

    def main(args: Array[String]): Unit = {
    val x_num = 3
    val x_den = 4
    val y_num = 5
    val y_den = 8
    val z_num = 2
    val z_den = 7
    
    val (result_num, result_den) = sub(x_num, x_den, y_num, y_den)
    val (final_num , final_den) = sub(result_num , result_den , z_num , z_den)
    
    println(s"The result of x-y-z is: $final_num/$final_den")
  }
}