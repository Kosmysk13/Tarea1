package org.example;

public class PagoIncorrectoException extends Exception{
    public static final long serialVersionUID = 400;
    public PagoIncorrectoException(String errorMessage){
        super(errorMessage);
    }
}
