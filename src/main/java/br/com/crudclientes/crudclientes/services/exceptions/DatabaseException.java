package br.com.crudclientes.crudclientes.services.exceptions;

public class DatabaseException extends RuntimeException{
    public DatabaseException(String msg){
        super(msg);
    }
}
