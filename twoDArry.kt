fun diagonalDifference(a:Array<Array<Int>>):Int {
    var num1: Int = 0
    var num2: Int = 0
    var index:Int = 0
    for (i in 0..1) {
        if (i==0){
            index=0
        }else{
            index=a[0].size-1
        }

        a.forEach {

            if (i == 0) {
                num1 += it[index]
                index += 1
            }else{
                num2 += it[index]
                index -= 1
            }

        }
    }

    val def:Int = if (num2>num1){
        num2-num1
    }else{
        num1-num2
    }

    return def
}
