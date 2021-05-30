package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var output = "Bon Appetit"
        var sum = 0
        var costOfBrainMeals = 0

        for (i in bill.indices) if (i != k) {
            sum += bill[i]
        } else {
            costOfBrainMeals += bill[i]
            print("costOfBrainMeals = " + costOfBrainMeals + "\n")
        }

        sum /= 2
        if (b != sum) {
            output = (b - sum).toString()
        }

        return output
    }
}
