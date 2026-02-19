package com.m_m.msgjavacommuns.dto;

import java.util.List;


public record Erro(String codigo, String mensagem, List<CampoErro> campos) {
        public static class Builder {
            private String codigo;
            private String mensagem;
            private List<CampoErro> campos;

            public Builder codigo(String codigo) {
                this.codigo = codigo;
                return this;
            }

            public Builder mensagem(String mensagem) {
                this.mensagem = mensagem;
                return this;
            }

            public Builder campos(List<CampoErro> campos) {
                this.campos = campos;
                return this;
            }

            public Erro build() {
                return new Erro(codigo, mensagem, campos);
            }
        }
}
