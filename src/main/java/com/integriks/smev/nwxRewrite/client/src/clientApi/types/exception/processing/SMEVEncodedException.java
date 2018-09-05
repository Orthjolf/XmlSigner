package com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.processing;

import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVProcessingException;


/**
 * The type Smev encoded exception.
 */
public class SMEVEncodedException extends SMEVProcessingException {

    /**
     * Instantiates a new Smev encoded exception.
     *
     * @param code the code
     */
    public SMEVEncodedException(String code) {
        super(code);
    }

    /**
     * Instantiates a new Smev encoded exception.
     *
     * @param message the message
     * @param code    the code
     */
    public SMEVEncodedException(String message, String code) {
        super(message, code);
    }

    /**
     * Instantiates a new Smev encoded exception.
     *
     * @param message the message
     * @param code    the code
     * @param cause   the cause
     */
    public SMEVEncodedException(String message, String code, Throwable cause) {
        super(message, cause, code);
    }

    /**
     * Instantiates a new Smev encoded exception.
     *
     * @param cause the cause
     * @param code  the code
     */
    public SMEVEncodedException(Throwable cause, String code) {
        super(cause, code);
    }

    /**
     * Instantiates a new Smev encoded exception.
     *
     * @param message            the message
     * @param cause              the cause
     * @param enableSuppression  the enable suppression
     * @param writableStackTrace the writable stack trace
     * @param code               the code
     */
    public SMEVEncodedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String code) {
        super(message, cause, enableSuppression, writableStackTrace, code);
    }
}
