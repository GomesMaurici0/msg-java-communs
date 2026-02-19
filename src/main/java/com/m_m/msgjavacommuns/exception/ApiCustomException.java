package com.m_m.msgjavacommuns.exception;

import com.m_m.msgjavacommuns.message.ExceptionMessageFormat;
import org.springframework.http.HttpStatus;

public class ApiCustomException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private final HttpStatus httpStatus;
    private final String code;
    private final ExceptionMessageFormat messageFormat;
    private final String[] args;

   public ApiCustomException(HttpStatus httpStatus, String code, ExceptionMessageFormat messageFormat, Throwable cause, String... args){
       super(cause);
         this.httpStatus = httpStatus;
            this.code = code;
            this.messageFormat = messageFormat;
            this.args = args;
   }

   public ApiCustomException(HttpStatus httpStatus, String code, ExceptionMessageFormat messageFormat, Throwable cause){
       this(httpStatus, code, messageFormat, cause, (String[])null);
   }

   public ApiCustomException(HttpStatus httpStatus, String code, ExceptionMessageFormat messageFormat, String... args){
       this(httpStatus, code, messageFormat, (Throwable)null, args );
   }

   public ApiCustomException(HttpStatus httpStatus, String code, ExceptionMessageFormat messageFormat){
       this(httpStatus, code, messageFormat, (Throwable)null, (String[])null);
   }

   public ApiCustomException(HttpStatus httpStatus, String code, Throwable cause){
         this(httpStatus, code, (ExceptionMessageFormat) null, (Throwable) cause);
   }

   public ApiCustomException(HttpStatus httpStatus, String code, String[] args){
         this(httpStatus, code, (ExceptionMessageFormat) null, (Throwable) null, args);
   }

   public  ApiCustomException(HttpStatus httpStatus, String code){
            this(httpStatus, code, (ExceptionMessageFormat) null, (Throwable) null, (String[]) null);
   }

    public HttpStatus getHttpStatus() {return httpStatus;}

    public String getCode() {return code;}

    public ExceptionMessageFormat getMessageFormat() {return messageFormat;}

    public String[] getArgs() {return args;}
}
