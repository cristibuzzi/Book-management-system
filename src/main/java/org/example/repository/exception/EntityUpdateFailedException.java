package org.example.repository.exception;

public class EntityUpdateFailedException extends Exception{

    public EntityUpdateFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}
