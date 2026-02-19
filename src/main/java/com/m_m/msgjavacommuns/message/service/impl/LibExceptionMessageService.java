package com.m_m.msgjavacommuns.message.service.impl;

import com.m_m.msgjavacommuns.exception.ApiCustomException;
import com.m_m.msgjavacommuns.message.parser.impl.YamlMessageParser;
import com.m_m.msgjavacommuns.message.service.ExceptionMessageService;
import com.m_m.msgjavacommuns.util.ExceptionFileMessageParseUtil;

public class LibExceptionMessageService implements ExceptionMessageService {
    private static final String LIB_MESSAGES_FILE_NAME = "lib-messages.properties";

    public String obterMensagem(ApiCustomException ex, String defaultMessage) {
        String code = ex.getCode();
        return this.obterMensagem(code, defaultMessage);
    }
    public  String obterMensagem(String code, String defaultMessage) {
        return ExceptionFileMessageParseUtil.parser(LIB_MESSAGES_FILE_NAME, new YamlMessageParser(), code, defaultMessage);
    }
}
