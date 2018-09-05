package com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.processing;

import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVProcessingException;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Smev message content exception.
 */
public class SMEVMessageContentException
        extends SMEVProcessingException {
    /**
     * The Description.
     */
    protected String description;

    /**
     * Instantiates a new Smev message content exception.
     */
    public SMEVMessageContentException() {
        super(null);
    }

    /**
     * Instantiates a new Smev message content exception.
     *
     * @param message the message
     * @param code    the code
     * @param cause   the cause
     */
    public SMEVMessageContentException(String message, String code, Throwable cause) {
        super(message, cause, code);
    }

    /**
     * Instantiates a new Smev message content exception.
     *
     * @param message the message
     */
    public SMEVMessageContentException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Smev message content exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public SMEVMessageContentException(String message, Throwable cause) {
        super(message, cause, null);
    }

    /**
     * Instantiates a new Smev message content exception.
     *
     * @param cause the cause
     */
    public SMEVMessageContentException(Throwable cause) {
        super(cause, null);
    }

    /**
     * Instantiates a new Smev message content exception.
     *
     * @param message            the message
     * @param code               the code
     * @param cause              the cause
     * @param enableSuppression  the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    public SMEVMessageContentException(String message, String code, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, writableStackTrace, enableSuppression, code);
    }

    /**
     * The type Incorrect response content type exception.
     */
    public static class IncorrectResponseContentTypeException
            extends SMEVMessageContentException {

        /**
         * Instantiates a new Incorrect response content type exception.
         *
         * @param message the message
         */
        public IncorrectResponseContentTypeException(String message) {
            super(message);
        }

        /**
         * Instantiates a new Incorrect response content type exception.
         *
         * @param message the message
         * @param cause   the cause
         */
        public IncorrectResponseContentTypeException(String message, Throwable cause) {
            super(message, cause);
        }

        /**
         * Instantiates a new Incorrect response content type exception.
         *
         * @param message     the message
         * @param description the description
         * @param cause       the cause
         */
        public IncorrectResponseContentTypeException(String message, String description, Throwable cause) {
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
     * The type Unknown message type exception.
     */
    public static class UnknownMessageTypeException
            extends SMEVMessageContentException {


        /**
         * Instantiates a new Unknown message type exception.
         *
         * @param message the message
         */
        public UnknownMessageTypeException(String message) {
            super(message);

        }


        /**
         * Instantiates a new Unknown message type exception.
         *
         * @param message the message
         * @param cause   the cause
         */
        public UnknownMessageTypeException(String message, Throwable cause) {
            super(message, cause);
        }

        /**
         * Instantiates a new Unknown message type exception.
         *
         * @param message     the message
         * @param description the description
         * @param cause       the cause
         */
        public UnknownMessageTypeException(String message, String description, Throwable cause) {
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
     * The type Invalid content exception.
     */
    public static class InvalidContentException
            extends SMEVMessageContentException {


        private InvalidContent faultInfo;

        /**
         * Instantiates a new Invalid content exception.
         *
         * @param message   the message
         * @param faultInfo the fault info
         */
        public InvalidContentException(String message, InvalidContent faultInfo) {
            super(message);
            this.faultInfo = faultInfo;
        }

        /**
         * Instantiates a new Invalid content exception.
         *
         * @param message   the message
         * @param faultInfo the fault info
         * @param cause     the cause
         */
        public InvalidContentException(String message, InvalidContent faultInfo, Throwable cause) {
            super(message, cause);
            this.faultInfo = faultInfo;
        }


        /**
         * Instantiates a new Invalid content exception.
         *
         * @param message     the message
         * @param faultInfo   the fault info
         * @param description the description
         * @param cause       the cause
         */
        public InvalidContentException(String message, InvalidContent faultInfo, String description, Throwable cause) {
            super(message, cause);
            this.description = description;
            this.faultInfo = faultInfo;
        }

        /**
         * Gets description.
         *
         * @return the description
         */
        public String getDescription() {
            return description;
        }

        /**
         * Gets fault info.
         *
         * @return the fault info
         */
        public InvalidContent getFaultInfo() {
            return faultInfo;
        }

        /**
         * The type Invalid content.
         */
        public static class InvalidContent {
            /**
             * The Validation error.
             */
            protected List<ValidationError> validationError;

            /**
             * Instantiates a new Invalid content.
             *
             * @param validationError the validation error
             */
            public InvalidContent(List<ValidationError> validationError) {
                if (validationError == null) {
                    validationError = new ArrayList<>();
                }
                this.validationError = validationError;
            }

            /**
             * Instantiates a new Invalid content.
             */
            public InvalidContent() {
                validationError = new ArrayList<>();
            }

            /**
             * Gets validation error.
             *
             * @return the validation error
             */
            public List<ValidationError> getValidationError() {
                return this.validationError;
            }

            /**
             * The type Validation error.
             */
            public static class ValidationError {

                /**
                 * The Value.
                 */
                protected String value;
                /**
                 * The Error position.
                 */
                protected int errorPosition;

                /**
                 * Instantiates a new Validation error.
                 *
                 * @param value         the value
                 * @param errorPosition the error position
                 */
                public ValidationError(String value, int errorPosition) {
                    this.value = value;
                    this.errorPosition = errorPosition;
                }

                /**
                 * Instantiates a new Validation error.
                 */
                public ValidationError() {

                }

                /**
                 * Gets value.
                 *
                 * @return the value
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets value.
                 *
                 * @param value the value
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets error position.
                 *
                 * @return the error position
                 */
                public int getErrorPosition() {
                    return errorPosition;
                }

                /**
                 * Sets error position.
                 *
                 * @param value the value
                 */
                public void setErrorPosition(int value) {
                    this.errorPosition = value;
                }

            }
        }


    }

    /**
     * The type Business data type is not supported exception.
     */
    public static class BusinessDataTypeIsNotSupportedException
            extends SMEVMessageContentException {

        /**
         * Java type that goes as soapenv:Fault detail element.
         */
        private BusinessDataTypeIsNotSupported faultInfo;

        /**
         * Instantiates a new Business data type is not supported exception.
         *
         * @param message           the message
         * @param dataTypeFaultInfo the data type fault info
         * @param description       the description
         * @param cause             the cause
         */
        public BusinessDataTypeIsNotSupportedException(String message, BusinessDataTypeIsNotSupported dataTypeFaultInfo, String description, Throwable cause) {
            super(message, description, cause);
            this.faultInfo = dataTypeFaultInfo;
        }

        /**
         * Instantiates a new Business data type is not supported exception.
         *
         * @param message   the message
         * @param faultInfo the fault info
         */
        public BusinessDataTypeIsNotSupportedException(String message, BusinessDataTypeIsNotSupported faultInfo) {
            super(message);
            this.faultInfo = faultInfo;
        }

        /**
         * Instantiates a new Business data type is not supported exception.
         *
         * @param message   the message
         * @param faultInfo the fault info
         * @param cause     the cause
         */
        public BusinessDataTypeIsNotSupportedException(String message, BusinessDataTypeIsNotSupported faultInfo, Throwable cause) {
            super(message, cause);
            this.faultInfo = faultInfo;
        }

        /**
         * Gets description.
         *
         * @return the description
         */
        public String getDescription() {
            return description;
        }

        /**
         * Gets fault info.
         *
         * @return returns fault bean: ru.it.smev.message_exchange.autogenerated.types.fault.v1_1.BusinessDataTypeIsNotSupported
         */
        public BusinessDataTypeIsNotSupported getFaultInfo() {
            return faultInfo;
        }

        /**
         * The type Business data type is not supported.
         */
        public static class BusinessDataTypeIsNotSupported

        {

            /**
             * The Root element local name.
             */
            protected String rootElementLocalName;
            /**
             * The Root element namespace uri.
             */
            protected String rootElementNamespaceURI;

            /**
             * Instantiates a new Business data type is not supported.
             *
             * @param rootElementLocalName    the root element local name
             * @param rootElementNamespaceURI the root element namespace uri
             */
            public BusinessDataTypeIsNotSupported(String rootElementLocalName, String rootElementNamespaceURI) {
                this.rootElementLocalName = rootElementLocalName;
                this.rootElementNamespaceURI = rootElementNamespaceURI;
            }

            /**
             * Gets root element local name.
             *
             * @return the root element local name
             */
            public String getRootElementLocalName() {
                return rootElementLocalName;
            }


            /**
             * Sets root element local name.
             *
             * @param value the value
             */
            public void setRootElementLocalName(String value) {
                this.rootElementLocalName = value;
            }


            /**
             * Gets root element namespace uri.
             *
             * @return the root element namespace uri
             */
            public String getRootElementNamespaceURI() {
                return rootElementNamespaceURI;
            }


            /**
             * Sets root element namespace uri.
             *
             * @param value the value
             */
            public void setRootElementNamespaceURI(String value) {
                this.rootElementNamespaceURI = value;
            }

        }

    }
}
