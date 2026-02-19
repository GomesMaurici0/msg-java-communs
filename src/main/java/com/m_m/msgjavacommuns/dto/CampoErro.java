package com.m_m.msgjavacommuns.dto;

import org.springframework.validation.FieldError;

public record CampoErro(String campo, String mensagem, Object valor) {
    public CampoErro(FieldError fieldError){
        this(fieldError.getField(), fieldError.getDefaultMessage(), fieldError.getRejectedValue());
    }
    public static class Builder {
        private String campo;
        private String mensagem;
        private Object valor;

        public Builder campo(String campo) {
            this.campo = campo;
            return this;
        }

        public Builder mensagem(String mensagem) {
            this.mensagem = mensagem;
            return this;
        }

        public Builder valor(Object valor) {
            this.valor = valor;
            return this;
        }

        public CampoErro build() {
            return new CampoErro(campo, mensagem, valor);
        }
    }
}
