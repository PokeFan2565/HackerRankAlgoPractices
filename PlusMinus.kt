fun plusMinus(arr:Array<Int>){
    val positive:Int = arr.count { it > 0 }
    val negative:Int = arr.count { it < 0 }
    val zeros:Int = arr.count { it == 0 }
    val size:Double = arr.size.toDouble()

    println("%.6f".format(positive/size))
    println("%.6f".format(negative/size))
    println("%.6f".format(zeros/size))
}