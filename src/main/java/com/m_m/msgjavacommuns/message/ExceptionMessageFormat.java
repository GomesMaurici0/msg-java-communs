package com.m_m.msgjavacommuns.message;

import com.m_m.msgjavacommuns.exception.LibException;

public enum ExceptionMessageFormat {
    YAML("yaml"),
    YML("yml"),
    LIB("lib"),
    PROPERTIES("properties");

    private final String name;

    private ExceptionMessageFormat(String name) {this.name = name;}

    public static ExceptionMessageFormat fromName(String name){
        for (ExceptionMessageFormat format : ExceptionMessageFormat.values()) {
            if(format.getName().equalsIgnoreCase(name)){
                return format;
            }
        }
        throw new LibException("exception.message.exceptionMessageFormat.naoLocalizado", new String[]{name});
    }
    public String getName() {return name;}
}
