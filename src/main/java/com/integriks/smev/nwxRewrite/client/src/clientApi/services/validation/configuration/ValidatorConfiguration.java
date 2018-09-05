package com.integriks.smev.nwxRewrite.client.src.clientApi.services.validation.configuration;


import com.integriks.smev.nwxRewrite.client.src.clientApi.configuration.SMEVConfiguration;

import java.net.URI;

/**
 * Конфигурация сервиса валидации
 */
public interface ValidatorConfiguration extends SMEVConfiguration {

    /**
     * Не используется
     *
     * @return не используется
     */
    URI getLocation();
}
