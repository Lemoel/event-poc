package com.poc.event.listener

import com.poc.event.entities.MySyncEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class MySyncEventListener {

    @EventListener
    @Throws(InterruptedException::class)
    fun listener(event: MySyncEvent) {
        Thread.sleep(10000)
        println("A request ficou presa até o evento ser lançad, ouvido e a execução total do método que ouviu")
    }

}