package cn.canney.kotlin.coroutine

import kotlinx.coroutines.*

val Dispatchers.Single: ExecutorCoroutineDispatcher get() = newSingleThreadContext("Single")

fun main(){

    runBlocking {
        launch {
            println("main runBocking        :I'm  working in thread ${Thread.currentThread().name}")
        }

        launch (Dispatchers.Unconfined){
            println("Unconfined             :I'm  working in thread ${Thread.currentThread().name}")
        }

        launch (Dispatchers.Default){
            println("Default                :I'm  working in thread ${Thread.currentThread().name}")
        }

        launch (Dispatchers.Single){
            println("newSingleThreadContext :I'm  working in thread ${Thread.currentThread().name}")
        }

    }
    /*
    >
    Unconfined             :I'm  working in thread main
    Default                :I'm  working in thread DefaultDispatcher-worker-1
    main runBocking        :I'm  working in thread main
    newSingleThreadContext :I'm  working in thread Single
    */
}