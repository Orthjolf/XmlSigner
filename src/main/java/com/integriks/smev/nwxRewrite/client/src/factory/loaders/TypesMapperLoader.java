package com.integriks.smev.nwxRewrite.client.src.factory.loaders;


import com.integriks.smev.nwxRewrite.client.src.clientApi.services.messaging.ExceptionMapper;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.messaging.MessageMapper;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.messaging.configuration.MessageGenerationConfiguration;

/**
 * The interface Types mapper loader.
 */
public interface TypesMapperLoader {
    /**
     * Gets message mapper.
     *
     * @param <T>    the type parameter
     * @param config the config
     * @return the message mapper
     */
    <T extends MessageGenerationConfiguration> MessageMapper getMessageMapper(T config);

    /**
     * Gets exception mapper.
     *
     * @param <T>    the type parameter
     * @param config the config
     * @return the exception mapper
     */
    <T extends MessageGenerationConfiguration> ExceptionMapper getExceptionMapper(T config);
}
