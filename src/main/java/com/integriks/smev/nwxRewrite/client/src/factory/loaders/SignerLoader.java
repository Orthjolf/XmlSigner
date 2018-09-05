package com.integriks.smev.nwxRewrite.client.src.factory.loaders;


import com.integriks.smev.nwxRewrite.client.src.clientApi.services.signature.Signer;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.signature.configuration.SignerConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVRuntimeException;

/**
 * The interface Signer loader.
 */
public interface SignerLoader {

    /**
     * Gets signer.
     *
     * @param <T>    the type parameter
     * @param config the config
     * @return the signer
     * @throws SMEVRuntimeException the smev runtime exception
     */
    <T extends SignerConfiguration> Signer getSigner(T config) throws SMEVRuntimeException;

}
