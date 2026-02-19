package com.m_m.msgjavacommuns.message.service;

import com.m_m.msgjavacommuns.exception.ApiCustomException;

public interface ExceptionMessageService {
        String obterMensagem(ApiCustomException var1, String var2);
}
