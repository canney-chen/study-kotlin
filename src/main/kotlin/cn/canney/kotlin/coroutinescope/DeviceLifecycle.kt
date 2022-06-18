package cn.canney.kotlin.coroutinescope

import kotlinx.coroutines.*

class DeviceLifecycle {

    val deviceScope = CoroutineScope(Dispatchers.IO + SupervisorJob())

    fun cancel(){
        deviceScope.cancel()
    }

    fun onDisconnected(){
        println("disconnected")
        cancel()
    }

    fun onConnected() {
        println("onConnected")
    }
}


fun main(){

    val deviceLifecycle = DeviceLifecycle()

    deviceLifecycle.onConnected()

    deviceLifecycle.deviceScope.launch {

        while(true){
            println("${System.currentTimeMillis()}:reading...")
            delay(100)
        }
    }

    Thread.sleep(1000)

    //user disconnect or device error
    deviceLifecycle.onDisconnected()

}