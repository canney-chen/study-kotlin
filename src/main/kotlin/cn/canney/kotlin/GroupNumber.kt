package cn.canney.kotlin

import java.util.*


fun main() {
    var res = GroupNumber().comThreeNums2(arrayOf(-1, 0, 1, 2, -1, -4))
    res.forEach{t->
        println(t.contentToString())
    }
}

class GroupNumber {

    fun comThreeNums(numbers: Array<Int>): ArrayList<Array<Int>> {
        //[-1, 0, 1, 2, -1, -4]
        //[[-1,-1,2],[-1,0,1]]
        var result: ArrayList<Array<Int>> = ArrayList()
        for (i in 0..numbers.lastIndex) {
            var a = numbers[i]
            for (j in i + 1 until numbers.lastIndex) {
                var b = numbers[j]
                var c = numbers[j + 1]
                if (a + b + c == 0) {
                    result.add(arrayOf(a, b, c).apply { sort()})
                }
            }
        }

        return result
    }

    fun comThreeNums2(numbers: Array<Int>): ArrayList<Array<Int>> {
        //[-1, 0, 1, 2, -1, -4]
        //[[-1,-1,2],[-1,0,1]]
        var result: ArrayList<Array<Int>> = ArrayList()
        for (i in numbers.indices) {
            var a = numbers[i]
            for (j in i + 1 until numbers.lastIndex) {
                var b = numbers[j]
                var c = numbers[j + 1]
                if (a + b + c == 0) {
                    result.add(arrayOf(a, b, c))
                }
            }
        }

        return result
    }
}