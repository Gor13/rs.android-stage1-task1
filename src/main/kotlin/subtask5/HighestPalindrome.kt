package subtask5

import kotlin.random.Random

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        // throw NotImplementedError("Not implemented")
        if (n % 2 != 0) return "-1"
        var str = digitString
        var digits = mutableListOf<String>()
        var setOfPalindromes = mutableSetOf<String>()
        for (i in 0..n - 1) {
            digits.add(str.get(i).toString())
        }
        println(digits.toString())
        var range = 1
        var s = n
        while (s > 0) {
            range = range * 10
            s--
        }
        var bool = true
        var caunt1 = 0
        while (bool) {
            var b = (Math.random() * range).toInt()

            if (isPalindrome("${b}") && "${b}".length == n) {
                var caunt = 0
                for ((index, str) in digits.withIndex()) {
                    if ("${b}".get(index).toString().equals(str))
                        caunt++
                }
                if (caunt == n - k) {
                    setOfPalindromes.add(b.toString())
                    caunt1++
                }
                if (caunt1 > 1000) {
                    bool = false
                }
            }

        }

        var finalString = 0
        for (s in setOfPalindromes) {
            if (s.toInt() > finalString) {
                finalString = s.toInt()
            }
        }

        return finalString.toString()
    }

    fun isPalindrome(str: String): Boolean {
        return str.equals(str.reversed())
    }
}
