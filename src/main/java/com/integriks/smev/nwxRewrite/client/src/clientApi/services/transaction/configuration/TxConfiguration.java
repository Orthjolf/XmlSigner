package com.integriks.smev.nwxRewrite.client.src.clientApi.services.transaction.configuration;

import com.integriks.smev.nwxRewrite.client.src.clientApi.configuration.SMEVConfiguration;

import java.net.URL;

/**
 * Конфигурация сервиса транзакций
 */
public interface TxConfiguration extends SMEVConfiguration {

    /**
     * Возвращает адрес сервиса
     *
     * @return url сервиса
     */
    URL getServiceUrl();

    /**
     * Возврщащает таймаут обращения к сервису
     *
     * @return таймаут обращения к сервису
     */
    int getTimeout();
}
