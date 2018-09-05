package com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.processing;

import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVProcessingException;

/**
 * The type Smev resource exception.
 */
public class SMEVResourceException
        extends SMEVProcessingException {
    /**
     * Instantiates a new Smev resource exception.
     */
    public SMEVResourceException() {
        super(null);
    }

    /**
     * Instantiates a new Smev resource exception.
     *
     * @param message the message
     * @param code    the code
     * @param cause   the cause
     */
    public SMEVResourceException(String message, String code, Throwable cause) {
        super(message, cause, code);
    }

    /**
     * Instantiates a new Smev resource exception.
     *
     * @param message the message
     */
    public SMEVResourceException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Smev resource exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public SMEVResourceException(String message, Throwable cause) {
        super(message, cause, null);
    }

    /**
     * Instantiates a new Smev resource exception.
     *
     * @param cause the cause
     */
    public SMEVResourceException(Throwable cause) {
        super(cause, null);
    }

    /**
     * Instantiates a new Smev resource exception.
     *
     * @param message            the message
     * @param cause              the cause
     * @param enableSuppression  the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    public SMEVResourceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace, null);
    }

    /**
     * The type Destination overflow exception.
     */
    public static class DestinationOverflowException
            extends SMEVResourceException {


        private DestinationOverflow faultInfo;


        /**
         * Instantiates a new Destination overflow exception.
         *
         * @param message   the message
         * @param faultInfo the fault info
         */
        public DestinationOverflowException(String message, DestinationOverflow faultInfo) {
            super(message);
            this.faultInfo = faultInfo;
        }


        /**
         * Instantiates a new Destination overflow exception.
         *
         * @param message   the message
         * @param faultInfo the fault info
         * @param cause     the cause
         */
        public DestinationOverflowException(String message, DestinationOverflow faultInfo, Throwable cause) {
            super(message, cause);
            this.faultInfo = faultInfo;
        }

        /**
         * Instantiates a new Destination overflow exception.
         *
         * @param message     the message
         * @param faultInfo   the fault info
         * @param description the description
         * @param cause       the cause
         */
        public DestinationOverflowException(String message, DestinationOverflow faultInfo, String description, Throwable cause) {
            super(message, description, cause);
            this.faultInfo = faultInfo;
        }


        /**
         * Gets fault info.
         *
         * @return the fault info
         */
        public DestinationOverflow getFaultInfo() {
            return faultInfo;
        }

        /**
         * The type Destination overflow.
         */
        public static class DestinationOverflow {

            /**
             * The Message broker address.
             */
            protected String messageBrokerAddress;

            /**
             * The Destination name.
             */
            protected String destinationName;

            /**
             * Instantiates a new Destination overflow.
             *
             * @param messageBrokerAddress the message broker address
             * @param destinationName      the destination name
             */
            public DestinationOverflow(String messageBrokerAddress, String destinationName) {
                this.messageBrokerAddress = messageBrokerAddress;
                this.destinationName = destinationName;
            }

            /**
             * Gets message broker address.
             *
             * @return the message broker address
             */
            public String getMessageBrokerAddress() {
                return messageBrokerAddress;
            }

            /**
             * Sets message broker address.
             *
             * @param value the value
             */
            public void setMessageBrokerAddress(String value) {
                this.messageBrokerAddress = value;
            }

            /**
             * Gets destination name.
             *
             * @return the destination name
             */
            public String getDestinationName() {
                return destinationName;
            }

            /**
             * Sets destination name.
             *
             * @param value the value
             */
            public void setDestinationName(String value) {
                this.destinationName = value;
            }

        }
    }

}
