package com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.processing;

import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVProcessingException;

/**
 * The type Smev failure exception.
 */
public class SMEVFailureException
        extends SMEVProcessingException {
    private String description;

    /**
     * Instantiates a new Smev failure exception.
     *
     * @param message the message
     */
    public SMEVFailureException(String message) {
        super(message);
    }


    /**
     * Instantiates a new Smev failure exception.
     *
     * @param message the message
     * @param code    the code
     * @param cause   the cause
     */
    public SMEVFailureException(String message, String code, Throwable cause) {
        super(message, cause, code);

    }

    /**
     * Instantiates a new Smev failure exception.
     *
     * @param message     the message
     * @param code        the code
     * @param description the description
     * @param cause       the cause
     */
    public SMEVFailureException(String message, String code, String description, Throwable cause) {
        super(message, cause, code);
        this.description = description;

    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }
}
