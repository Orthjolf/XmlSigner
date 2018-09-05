package com.integriks.smev.nwxRewrite.client.src.clientApi.services.admin.configuration;

import com.integriks.smev.nwxRewrite.client.src.clientApi.configuration.SMEVConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.identification.configuration.IdentityServiceConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.signature.configuration.SignerConfiguration;

/**
 * Конфигурация административного сервиса
 */
public interface AdminServiceConfiguration extends SMEVConfiguration {

    /**
     * @return строковое представление URL для WSDL сервиса
     */
    String getUrl();

    /**
     * @return timeout подключения к сервису
     */
    int getTimeout();

    /**
     * Возвращает конфигурацию сервиса идентификации
     *
     * @return конфигурацию сервиса идентификации
     */
    IdentityServiceConfiguration getIdentityConfig();

    /**
     * Возвращает конфигурацию сервиса электронной подписи
     *
     * @return конфигурацию сервиса электронной подписи
     */
    SignerConfiguration getSignerConfig();
}
