package cn.canney.kotlin

sealed class SealedClass{
    fun fun1(){

    }
}

data class Const(val number: Double) : SealedClass(){

    //密封类不可以重写方法
    /*
    override fun fun1(){

    }*/
}
