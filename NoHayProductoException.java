package org.example;

public class NoHayProductoException extends Exception{
    public static final long serialVersionUID = 401;
    public NoHayProductoException(String errorMensaje){
        super(errorMensaje);
    }
}
