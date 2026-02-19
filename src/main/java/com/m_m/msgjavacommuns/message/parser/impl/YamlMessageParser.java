package com.m_m.msgjavacommuns.message.parser.impl;

import com.m_m.msgjavacommuns.message.parser.ExceptionFileMessageParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;

public class YamlMessageParser implements ExceptionFileMessageParser {
    private static final String DEFAULT_PARSE_EXCEPTION_MESSAGE = "exception.message.parser.yamlMessageParser.parseException";
    private final Logger LOGGER = LoggerFactory.getLogger(YamlMessageParser.class);

    private String parse(InputStream inputStream, String key){
        Yaml yaml = new Yaml
    }

}
