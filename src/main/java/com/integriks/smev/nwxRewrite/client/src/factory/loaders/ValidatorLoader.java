package com.integriks.smev.nwxRewrite.client.src.factory.loaders;

import com.integriks.smev.nwxRewrite.client.src.clientApi.services.validation.Validator;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.validation.configuration.ValidatorConfiguration;
import org.w3c.dom.Element;


/**
 * The interface Validator loader.
 */
public interface ValidatorLoader {
    /**
     * Gets validator.
     *
     * @param <T>    the type parameter
     * @param config the config
     * @return the validator
     */
    <T extends ValidatorConfiguration> Validator getValidator(T config);

    /**
     * Get xml validator.
     *
     * @param config the config
     * @param <T> the type parameter
     * @return the validator
     */
    <T extends ValidatorConfiguration> Validator<Element> getXmlValidator(T config);
}
