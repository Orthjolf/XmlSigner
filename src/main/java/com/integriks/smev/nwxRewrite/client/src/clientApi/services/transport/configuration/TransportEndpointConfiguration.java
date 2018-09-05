package com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport.configuration;

public interface TransportEndpointConfiguration {

    /**
     * Идентификатор
     * @return строка уникально идентифицирующая Endpoint
     */
    String getId();

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

    /**
     * Количество попыток обращения к сервису
     *
     * @return количество попыток обращения к сервису
     */
    int getRetries();

}
