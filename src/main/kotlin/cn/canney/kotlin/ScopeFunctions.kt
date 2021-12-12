package cn.canney.kotlin

class User(var name: String){

    override fun toString(): String {
        return "User(name='$name')"
    }
}

fun main(){

    var user: User? = null

    user?.let {

    }

    user.run {  }

    var user1 = User("Canney 1")

    val user1Name = with(user1){
        name
    }

    println(user1Name)

    user?.also {
        it.name = "also"
    }

    println(user1)

    println(user1::name.set("11"))

    println(user1)
}
