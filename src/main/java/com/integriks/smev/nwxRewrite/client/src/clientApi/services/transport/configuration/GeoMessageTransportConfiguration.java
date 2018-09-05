package com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport.configuration;

import com.integriks.smev.nwxRewrite.client.src.clientApi.configuration.SMEVConfiguration;

import java.util.List;

/**
 * Конфигурация транспорта сообщений
 */
public interface GeoMessageTransportConfiguration extends SMEVConfiguration {
    List<TransportEndpointConfiguration> getEndpointConfigurations();
}
