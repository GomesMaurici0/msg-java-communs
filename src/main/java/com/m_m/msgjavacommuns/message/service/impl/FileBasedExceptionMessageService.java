package com.m_m.msgjavacommuns.message.service.impl;

import com.m_m.msgjavacommuns.exception.ApiCustomException;
import com.m_m.msgjavacommuns.exception.LibException;
import com.m_m.msgjavacommuns.message.parser.ExceptionFileMessageParser;
import com.m_m.msgjavacommuns.message.service.ExceptionMessageService;
import com.m_m.msgjavacommuns.util.ExceptionFileMessageParseUtil;

public class FileBasedExceptionMessageService implements ExceptionMessageService {

    private final ExceptionFileMessageParser parser;
    private final String appMessagesFileName;

    public FileBasedExceptionMessageService(ExceptionFileMessageParser parser,String appMessagesFileName) {
        this.parser = parser;
        this.appMessagesFileName = appMessagesFileName;
    }

    @Override
    public String obterMensagem(ApiCustomException ex, String defaultMessage) {
        String code = ex.getCode();
        if (this.parser != null) {
            throw new LibException("exception.message.fileBasedExceptionMessageService.parserNaoDefinido");
        }
        else {
            return ExceptionFileMessageParseUtil.parser(this.appMessagesFileName, this.parser, code, defaultMessage);
        }
    }
}
