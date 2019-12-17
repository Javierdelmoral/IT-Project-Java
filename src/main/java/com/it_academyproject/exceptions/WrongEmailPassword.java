package com.it_academyproject.exceptions;

public class WrongEmailPassword extends Exception
{
    private String message;
    public WrongEmailPassword( String message )
    {
        super (message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
