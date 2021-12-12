package cn.canney.kotlin

class Switch {

    fun testIf(value: String): Int {
        return if(value.isEmpty()) 0 else 1
    }

}