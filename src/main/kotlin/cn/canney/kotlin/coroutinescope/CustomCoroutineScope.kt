package cn.canney.kotlin.coroutinescope

import kotlinx.coroutines.*

fun main() {

    val scope: CoroutineScope = CoroutineScope(Dispatchers.IO)

    scope.launch{
        try {
            var i = 0
            while (true) {
                println("${Thread.currentThread().name} --> ${i++}")
                delay(10)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }


    Thread.sleep(100)
    scope.cancel()


    /*
    //print
    DefaultDispatcher-worker-1 --> 0
    DefaultDispatcher-worker-1 --> 1
    DefaultDispatcher-worker-1 --> 2
    DefaultDispatcher-worker-1 --> 3
    DefaultDispatcher-worker-1 --> 4
    DefaultDispatcher-worker-1 --> 5
    DefaultDispatcher-worker-1 --> 6
    kotlinx.coroutines.JobCancellationException: Job was cancelled; job=JobImpl{Cancelling}@397924a2
     */
}