package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        //throw NotImplementedError("Not implemented")
        var arr = IntArray(2)
        var summ = input.sum()
        arr[0] = summ - input[0]
        arr[1] = summ - input[0]
        for (i in 0..input.size - 1){
            if ((summ - input[i]) < arr[0] ){
                arr[0] = (summ - input[i])
            }
            if ((summ - input[i]) > arr[1] ){
                arr[1] = (summ - input[i])
            }
        }
        return arr
    }
}
