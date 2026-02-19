package com.m_m.msgjavacommuns.util;

import com.m_m.msgjavacommuns.message.parser.ExceptionFileMessageParser;

import java.io.IOException;
import java.io.InputStream;

public final class ExceptionFileMessageParseUtil {
    private ExceptionFileMessageParseUtil() {}

    public static String parser(String path, ExceptionFileMessageParser parser, String key, String defaultMessage) {
        ClassLoader classLoader= ExceptionFileMessageParseUtil.class.getClassLoader();
        try (InputStream inputStream = classLoader.getResourceAsStream(path)) {
            if (inputStream == null) {
                return defaultMessage;
            }else {
                String message = parser.parser(inputStream, key);
                return message != null ? message : defaultMessage;
            }
        }catch (IOException var10){
            return defaultMessage;
        }
    }
}
