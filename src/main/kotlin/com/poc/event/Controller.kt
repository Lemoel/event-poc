package com.poc.event

import com.poc.event.entities.MyAsyncEvent
import com.poc.event.entities.MySyncEvent
import org.springframework.context.ApplicationEventPublisher
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1")
class Controller(
    private val publisher: ApplicationEventPublisher
) {

    @PostMapping("/sync")
    fun startSyncEvent(): ResponseEntity<String> {
        publisher.publishEvent(MySyncEvent())
        return ResponseEntity.status(HttpStatus.CREATED)
            .body("A request ficou presa até o evento ser lançad, ouvido e a execução total do método que ouviu")
    }


    @PostMapping("/async")
    fun startAsyncEvent(): ResponseEntity<String> {
        publisher.publishEvent(MyAsyncEvent())
        return ResponseEntity.status(HttpStatus.CREATED).body("Evento Assíncrono")
    }

}