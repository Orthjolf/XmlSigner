package com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.processing;

import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVProcessingException;

/**
 * The type Smev message identity exception.
 */
public class SMEVMessageIdentityException
        extends SMEVProcessingException {
    /**
     * The Description.
     */
    protected String description;

    /**
     * Instantiates a new Smev message identity exception.
     */
    public SMEVMessageIdentityException() {
        super(null);
    }

    /**
     * Instantiates a new Smev message identity exception.
     *
     * @param message the message
     * @param code    the code
     * @param cause   the cause
     */
    public SMEVMessageIdentityException(String message, String code, Throwable cause) {
        super(message, cause, code);
    }

    /**
     * Instantiates a new Smev message identity exception.
     *
     * @param message the message
     */
    public SMEVMessageIdentityException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Smev message identity exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public SMEVMessageIdentityException(String message, Throwable cause) {
        super(message, cause, null);
    }

    /**
     * Instantiates a new Smev message identity exception.
     *
     * @param cause the cause
     */
    public SMEVMessageIdentityException(Throwable cause) {
        super(cause, null);
    }

    /**
     * Instantiates a new Smev message identity exception.
     *
     * @param message            the message
     * @param cause              the cause
     * @param enableSuppression  the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    public SMEVMessageIdentityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace, null);
    }

    /**
     * The type Stale message id exception.
     */
    public static class StaleMessageIdException
            extends SMEVMessageIdentityException {


        /**
         * Instantiates a new Stale message id exception.
         *
         * @param message the message
         */
        public StaleMessageIdException(String message) {
            super(message);
        }

        /**
         * Instantiates a new Stale message id exception.
         *
         * @param message the message
         * @param cause   the cause
         */
        public StaleMessageIdException(String message, Throwable cause) {
            super(message, cause);
        }

        /**
         * Instantiates a new Stale message id exception.
         *
         * @param message     the message
         * @param description the description
         * @param cause       the cause
         */
        public StaleMessageIdException(String message, String description, Throwable cause) {
            super(message, cause);
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

    /**
     * The type Invalid message id format exception.
     */
    public static class InvalidMessageIdFormatException
            extends SMEVMessageIdentityException {

        /**
         * Instantiates a new Invalid message id format exception.
         *
         * @param message the message
         */
        public InvalidMessageIdFormatException(String message) {
            super(message);
        }


        /**
         * Instantiates a new Invalid message id format exception.
         *
         * @param message the message
         * @param cause   the cause
         */
        public InvalidMessageIdFormatException(String message, Throwable cause) {
            super(message, cause);
        }

        /**
         * Instantiates a new Invalid message id format exception.
         *
         * @param message     the message
         * @param description the description
         * @param cause       the cause
         */
        public InvalidMessageIdFormatException(String message, String description, Throwable cause) {
            super(message, cause);
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

    /**
     * The type Message is already sent exception.
     */
    public static class MessageIsAlreadySentException
            extends SMEVMessageIdentityException {

        /**
         * Instantiates a new Message is already sent exception.
         *
         * @param message the message
         */
        public MessageIsAlreadySentException(String message) {
            super(message);
        }

        /**
         * Instantiates a new Message is already sent exception.
         *
         * @param message the message
         * @param cause   the cause
         */
        public MessageIsAlreadySentException(String message, Throwable cause) {
            super(message, cause);

        }

        /**
         * Instantiates a new Message is already sent exception.
         *
         * @param message     the message
         * @param description the description
         * @param cause       the cause
         */
        public MessageIsAlreadySentException(String message, String description, Throwable cause) {
            super(message, cause);
            this.description = description;
        }
    }

    /**
     * The type Transaction code invalid exception.
     */
    public static class TransactionCodeInvalidException
            extends SMEVMessageIdentityException {

        /**
         * Instantiates a new Transaction code invalid exception.
         *
         * @param message the message
         */
        public TransactionCodeInvalidException(String message) {
            super(message);

        }


        /**
         * Instantiates a new Transaction code invalid exception.
         *
         * @param message the message
         * @param cause   the cause
         */
        public TransactionCodeInvalidException(String message, Throwable cause) {
            super(message, cause);

        }

        /**
         * Instantiates a new Transaction code invalid exception.
         *
         * @param message     the message
         * @param description the description
         * @param cause       the cause
         */
        public TransactionCodeInvalidException(String message, String description, Throwable cause) {
            super(message, cause);
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
}
