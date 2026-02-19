package com.m_m.msgjavacommuns.exception;

import com.m_m.msgjavacommuns.message.ExceptionMessageFormat;
import org.springframework.http.HttpStatus;

public class NaoLocalizadoException extends ApiCustomException {

    private static final long serialVersionUID = 1L;

    public NaoLocalizadoException(String code, ExceptionMessageFormat messageFormat, Throwable cause) {
        super(HttpStatus.NOT_FOUND, code, messageFormat, cause);
    }
    public NaoLocalizadoException(String code, ExceptionMessageFormat messageFormat, String... args) {
        super(HttpStatus.NOT_FOUND, code, messageFormat, args);
    }
    public NaoLocalizadoException(String code, ExceptionMessageFormat messageFormat) {
        super(HttpStatus.NOT_FOUND, code, messageFormat);
    }
    public NaoLocalizadoException(String code) {
        super(HttpStatus.NOT_FOUND, code);
    }
    public NaoLocalizadoException(String code, String... args) {
        super(HttpStatus.NOT_FOUND, code, (ExceptionMessageFormat) null, args);
    }
     public NaoLocalizadoException(String code, Throwable cause) {
        super(HttpStatus.NOT_FOUND, code, (ExceptionMessageFormat) null, cause);
    }
}
