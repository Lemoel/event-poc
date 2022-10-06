package com.poc.event.listener

import com.poc.event.entities.MyAsyncEvent
import org.springframework.context.event.EventListener
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component

@Component
class MyAsyncEventListener {

    @Async
    @EventListener
    @Throws(InterruptedException::class)
    fun listener(event: MyAsyncEvent) {
        Thread.sleep(10000)
        println("A request teve resposta imediatamente após o lançamento do evento pois é ASSÍNCRONO")
    }

}