package subtask3

class StringParser {

    private val openBracket = "(";
    private val closeBracket = ")";
    private val openStaple = "[";
    private val closeStaple = "]";
    private val openBtk = "<";
    private val closeBtk = ">";

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val outputlist = mutableListOf<String>()

        val listOfBracket = listOf<String>(openBracket, openBtk, openStaple)
        for (i in inputString.indices) {
            for (j in listOfBracket) {
                if (inputString[i].toString() == j) {
                    outputlist.add(makeString(inputString.substring(i, inputString.length), j))
                }
            }
        }
    return outputlist.toTypedArray()
    }

    private fun makeString(inputString: String, bracket: String): String {
        if (bracket == openBracket) {
            val index = inputString.indexOf(closeBracket)
            var result = ""
            if (index != -1) {
                var count = 0
                for (i in inputString.indices) {
                    if (inputString[i].toString() == openBracket) {
                        count = count + 1
                    }
                    if (inputString[i].toString() == closeBracket) {
                        count = count - 1
                        if (count == 0) {
                            result = inputString.substring(1, i)
                            break
                        }
                    }
                }
                return result
            }
        }

        if (bracket == openStaple) {
            val index = inputString.indexOf(closeStaple)
            var result = ""
            if (index != -1) {
                var count = 0
                for (i in inputString.indices) {
                    if (inputString[i].toString() == openStaple) {
                        count = count + 1
                    }
                    if (inputString[i].toString() == closeStaple) {
                        count = count - 1
                        if (count == 0) {
                            result = inputString.substring(1, i)
                            break
                        }
                    }
                }
                return result
            }
        }

        if (bracket == openBtk) {
            val index = inputString.indexOf(closeBtk)
            var result = ""
            if (index != -1) {
                var count = 0
                for (i in inputString.indices) {
                    if (inputString[i].toString() == openBtk) {
                        count = count + 1
                    }
                    if (inputString[i].toString() == closeBtk) {
                        count = count - 1
                        if (count == 0) {
                            result = inputString.substring(1, i)
                            break
                        }
                    }
                }
                return result
            }
        }
        return "Error \n"
    }
}
