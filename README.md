# event-poc
Validar lançamento de evento spring

Objetivo desta poc é bem simples, ter dois endpoint's para lançar eventos do spring.

Prerequisito: @EnableAsync na classe de start do projeto.

*a)* Em um endpoint devemos lançar e depois escutar um evento *síncrono*;

*b)* Em outro lançar e depois escutar um evento *Assíncrono*; 


1) Foi criado um controller com estas duas possibilidades: 

   a) uma usando o lançamento de evento síncrono;
        url:  http://localhost:8080/v1/sync

   b) outro com lançamento de evento assíncrono;
        url: http://localhost:8080/v1/async

