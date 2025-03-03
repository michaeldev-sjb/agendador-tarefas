package com.michaeldevsjb.agendadortarefas.infrastructure.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String mensagem){
        super(mensagem);
    }

    public ResourceNotFoundException(String mesagem, Throwable throwable){
        super(mesagem, throwable);
    }
}
