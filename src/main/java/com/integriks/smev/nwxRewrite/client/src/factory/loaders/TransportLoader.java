package com.integriks.smev.nwxRewrite.client.src.factory.loaders;


import com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport.GeoMessageTransport;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport.MessageTransport;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport.configuration.GeoMessageTransportConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport.configuration.MessageTransportConfiguration;

/**
 * The interface Transport loader.
 */
public interface TransportLoader {
    /**
     * Gets transport instance.
     *
     * @param <T>    the type parameter
     * @param config the config
     * @return the transport instance
     */
    <T extends MessageTransportConfiguration> MessageTransport getTransportInstance(T config);

    <T extends GeoMessageTransportConfiguration> GeoMessageTransport getTransportInstance(T config);
}
