object q1{
    class Rational(val n:Int , val d:Int){
        val gcdValue= gcd(n,d)
        val numer = n/gcdValue
        val denom = d/gcdValue
        def gcd(a: Int, b: Int): Int = {
            if (b == 0){
                a
            }else{
                gcd(b, a % b)
            } 
        }
        def neg(): Unit ={
            if((n/d)>0){
                println(s"-$numer/$denom")
            }else{
                println(s"$numer/$denom")
            }
    }
    def main(args: Array[String]): Unit = {
        val num1 = Rational(22 , 2)
        num1.neg()
    }
}
