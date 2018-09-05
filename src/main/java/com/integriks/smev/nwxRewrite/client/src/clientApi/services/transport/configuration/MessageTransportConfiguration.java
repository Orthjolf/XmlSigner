package com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport.configuration;

import com.integriks.smev.nwxRewrite.client.src.clientApi.configuration.SMEVConfiguration;

import java.util.List;

/**
 * Конфигурация транспорта сообщений
 */
public interface MessageTransportConfiguration extends SMEVConfiguration {

    /**
     * Адрес СМЭВ
     *
     * @return url-адрес СМЭВ
     */
    String getUrl();

    /**
     * Таймаут обращения к сервису
     *
     * @return таймаут обращения к сервису
     */
    int getTimeout();
}
