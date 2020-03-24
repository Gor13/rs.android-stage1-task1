package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var sadArray = sadArray
        val happyArray = mutableListOf<Int>()
        if (sadArray.size != 0){

            happyArray.add(sadArray[0])
            for (i in 1..sadArray.size - 2){
                if (sadArray[i] < (sadArray[i-1]+ sadArray[i+1])){
                    happyArray.add(sadArray[i])
                }

            }
            happyArray.add(sadArray[sadArray.size-1])

            sadArray = happyArray.toIntArray()
            happyArray.clear()


            happyArray.add(sadArray[0])
            for (i in 1..sadArray.size - 2){
                if (sadArray[i] < (sadArray[i-1]+ sadArray[i+1])){
                    happyArray.add(sadArray[i])
                }

            }
            happyArray.add(sadArray[sadArray.size-1])

            sadArray = happyArray.toIntArray()
            happyArray.clear()


            happyArray.add(sadArray[0])
            for (i in 1..sadArray.size - 2){
                if (sadArray[i] < (sadArray[i-1]+ sadArray[i+1])){
                    happyArray.add(sadArray[i])
                }

            }
            happyArray.add(sadArray[sadArray.size-1])
            for (i in happyArray){
                println(i)
            }
            return happyArray.toIntArray()
        }

        return happyArray.toIntArray()
    }
}
