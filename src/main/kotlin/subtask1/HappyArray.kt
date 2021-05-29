package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        return checkList(sadArray.toMutableList()).toIntArray()
    }

    private fun checkList(sadList:  MutableList<Int>):  MutableList<Int> {
        var oneMoreTimeCheck = false
        val sadListCopy = sadList.toMutableList()
        for (i in 1..sadList.size - 2) if (sadList[i-1].toString().toInt() + sadList[i+1].toString().toInt() < sadList[i].toString().toInt() && !oneMoreTimeCheck) {
            val removeAt = sadListCopy.removeAt(i)
            oneMoreTimeCheck = true
            break
        }
        return if (oneMoreTimeCheck) {
            checkList(sadListCopy)
        } else {
            sadListCopy
        }
    }
}
