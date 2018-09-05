package com.integriks.smev.nwxRewrite.client.src.factory.loaders;

import com.integriks.smev.nwxRewrite.client.src.clientApi.services.identification.IdentityService;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.identification.configuration.IdentityServiceConfiguration;

/**
 * The interface Identity loader.
 */
public interface IdentityLoader {
    /**
     * Gets identity.
     *
     * @param <T>    the type parameter
     * @param config the config
     * @return the identity
     */
    <T extends IdentityServiceConfiguration> IdentityService getIdentity(T config);
}
