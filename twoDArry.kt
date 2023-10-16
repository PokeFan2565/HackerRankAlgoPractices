fun diagonalDifference(arr:Array<Array<Int>>):Int {
    var left_diagoonal: Int = 0
    var rightDiagonal: Int = 0
    var n:Int = arr.size-1

    for (i in 0..n){
        left_diagoonal += arr[i][i]
        rightDiagonal += arr[i][n-i]
    }

return abs(left_diagoonal - rightDiagonal)

}
