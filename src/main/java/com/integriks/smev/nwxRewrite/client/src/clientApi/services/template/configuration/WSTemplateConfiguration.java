package com.integriks.smev.nwxRewrite.client.src.clientApi.services.template.configuration;

import com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport.configuration.MessageTransportConfiguration;

/**
 * Конфигурация шаблона взаимодествия клиента СМЭВ
 */
public interface WSTemplateConfiguration extends BaseTemplateConfiguration {
    /**
     * Возвращает конфигурацию основного транспорта сообщений
     *
     * @return конфигурацию транспорта сообщений
     */
    MessageTransportConfiguration getMessageTransportConfiguration();
}
