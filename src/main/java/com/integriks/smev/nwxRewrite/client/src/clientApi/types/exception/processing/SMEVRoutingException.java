package com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.processing;

import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVProcessingException;

/**
 * The type Smev routing exception.
 */
public class SMEVRoutingException
        extends SMEVProcessingException {
    /**
     * The Description.
     */
    protected String description;

    /**
     * Instantiates a new Smev routing exception.
     */
    public SMEVRoutingException() {
        super(null);
    }

    /**
     * Instantiates a new Smev routing exception.
     *
     * @param message the message
     * @param code    the code
     * @param cause   the cause
     */
    public SMEVRoutingException(String message, String code, Throwable cause) {
        super(message, cause, code);
    }

    /**
     * Instantiates a new Smev routing exception.
     *
     * @param message the message
     */
    public SMEVRoutingException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Smev routing exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public SMEVRoutingException(String message, Throwable cause) {
        super(message, cause, null);
    }

    /**
     * Instantiates a new Smev routing exception.
     *
     * @param cause the cause
     */
    public SMEVRoutingException(Throwable cause) {
        super(cause, null);
    }

    /**
     * Instantiates a new Smev routing exception.
     *
     * @param message            the message
     * @param cause              the cause
     * @param enableSuppression  the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    public SMEVRoutingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace, null);
    }

    /**
     * Instantiates a new Smev routing exception.
     *
     * @param message     the message
     * @param cause       the cause
     * @param description the description
     */
    public SMEVRoutingException(String message, Throwable cause, String description) {
        super(message, cause, null);
        this.description = description;
    }

    /**
     * The type Access denied exception.
     */
    public static class AccessDeniedException
            extends SMEVRoutingException {

        /**
         * Instantiates a new Access denied exception.
         *
         * @param message the message
         */
        public AccessDeniedException(String message) {
            super(message);

        }

        /**
         * Instantiates a new Access denied exception.
         *
         * @param message the message
         * @param cause   the cause
         */
        public AccessDeniedException(String message, Throwable cause) {
            super(message, cause);
        }

        /**
         * Instantiates a new Access denied exception.
         *
         * @param message     the message
         * @param description the description
         * @param ex          the ex
         */
        public AccessDeniedException(String message, String description, Throwable ex) {
            super(message, ex, description);
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

    /**
     * The type Recipient is not found exception.
     */
    public static class RecipientIsNotFoundException
            extends SMEVRoutingException {


        /**
         * Instantiates a new Recipient is not found exception.
         *
         * @param message the message
         */
        public RecipientIsNotFoundException(String message) {
            super(message);
        }


        /**
         * Instantiates a new Recipient is not found exception.
         *
         * @param message the message
         * @param cause   the cause
         */
        public RecipientIsNotFoundException(String message, Throwable cause) {
            super(message, cause);
        }


        /**
         * Instantiates a new Recipient is not found exception.
         *
         * @param message     the message
         * @param description the description
         * @param cause       the cause
         */
        public RecipientIsNotFoundException(String message, String description, Throwable cause) {
            super(message, cause, description);
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

    /**
     * The type Sender is not registered exception.
     */
    public static class SenderIsNotRegisteredException
            extends SMEVRoutingException {

        /**
         * Instantiates a new Sender is not registered exception.
         *
         * @param message the message
         */
        public SenderIsNotRegisteredException(String message) {
            super(message);

        }


        /**
         * Instantiates a new Sender is not registered exception.
         *
         * @param message the message
         * @param cause   the cause
         */
        public SenderIsNotRegisteredException(String message, Throwable cause) {
            super(message, cause);
        }


        /**
         * Instantiates a new Sender is not registered exception.
         *
         * @param message     the message
         * @param description the description
         * @param cause       the cause
         */
        public SenderIsNotRegisteredException(String message, String description, Throwable cause) {
            super(message, cause, description);
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

    /**
     * The type Target message is not found exception.
     */
    public static class TargetMessageIsNotFoundException
            extends SMEVRoutingException {


        /**
         * Instantiates a new Target message is not found exception.
         *
         * @param message the message
         */
        public TargetMessageIsNotFoundException(String message) {
            super(message);

        }

        /**
         * Instantiates a new Target message is not found exception.
         *
         * @param message the message
         * @param cause   the cause
         */
        public TargetMessageIsNotFoundException(String message, Throwable cause) {
            super(message, cause);
        }

        /**
         * Instantiates a new Target message is not found exception.
         *
         * @param message     the message
         * @param description the description
         * @param cause       the cause
         */
        public TargetMessageIsNotFoundException(String message, String description, Throwable cause) {
            super(message, cause, description);
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

    /**
     * The type End of life exception.
     */
    public static class EndOfLifeException
            extends SMEVRoutingException {
        /**
         * Instantiates a new End of life exception.
         *
         * @param message the message
         */
        public EndOfLifeException(String message) {
            super(message);

        }

        /**
         * Instantiates a new End of life exception.
         *
         * @param message the message
         * @param cause   the cause
         */
        public EndOfLifeException(String message, Throwable cause) {
            super(message, cause);

        }

        /**
         * Instantiates a new End of life exception.
         *
         * @param message     the message
         * @param description the description
         * @param cause       the cause
         */
        public EndOfLifeException(String message, String description, Throwable cause) {
            super(message, cause, description);

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
}
