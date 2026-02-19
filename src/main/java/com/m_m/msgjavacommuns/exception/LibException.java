package com.m_m.msgjavacommuns.exception;

import com.m_m.msgjavacommuns.message.ExceptionMessageFormat;
import org.springframework.http.HttpStatus;

public class LibException extends ApiCustomException {
    private static final long serialVersionUID = 1L;

    public LibException(String code,Throwable cause, String... args) {
        super(HttpStatus.INTERNAL_SERVER_ERROR, code, ExceptionMessageFormat.LIB, cause, args);
    }
    public LibException(String code, String... args) {
        this(code, (Throwable) null, args);
    }
    public LibException(String code, Throwable cause) {this(code, cause, (String[]) null);}

    public LibException(String code){ this(code, (Throwable) null, (String[]) null);}
}
