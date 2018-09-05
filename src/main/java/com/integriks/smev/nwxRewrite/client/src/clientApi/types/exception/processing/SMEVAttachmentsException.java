package com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.processing;

import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVProcessingException;

/**
 * The type Smev attachments exception.
 */
public class SMEVAttachmentsException
        extends SMEVProcessingException {
    /**
     * The Description.
     */
    protected String description;

    /**
     * Instantiates a new Smev attachments exception.
     */
    public SMEVAttachmentsException() {
        super(null);
    }

    /**
     * Instantiates a new Smev attachments exception.
     *
     * @param message the message
     * @param code    the code
     * @param cause   the cause
     */
    public SMEVAttachmentsException(String message, String code, Throwable cause) {
        super(message, cause, code);
    }

    /**
     * Instantiates a new Smev attachments exception.
     *
     * @param message the message
     */
    public SMEVAttachmentsException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Smev attachments exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public SMEVAttachmentsException(String message, Throwable cause) {
        super(message, cause, null);
    }

    /**
     * Instantiates a new Smev attachments exception.
     *
     * @param message     the message
     * @param cause       the cause
     * @param description the description
     */
    public SMEVAttachmentsException(String message, Throwable cause, String description) {
        super(message, cause, null);
        this.description = description;
    }

    /**
     * Instantiates a new Smev attachments exception.
     *
     * @param cause the cause
     */
    public SMEVAttachmentsException(Throwable cause) {
        super(cause, null);
    }

    /**
     * Instantiates a new Smev attachments exception.
     *
     * @param message            the message
     * @param cause              the cause
     * @param enableSuppression  the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    public SMEVAttachmentsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace, null);
    }

    /**
     * The type Metadata exception.
     */
    public static class MetadataException
            extends SMEVAttachmentsException {


        /**
         * Instantiates a new Metadata exception.
         *
         * @param message the message
         */
        public MetadataException(String message) {
            super(message);

        }

        /**
         * Instantiates a new Metadata exception.
         *
         * @param message the message
         * @param cause   the cause
         */
        public MetadataException(String message, Throwable cause) {
            super(message, cause);
        }

        /**
         * Instantiates a new Metadata exception.
         *
         * @param message     the message
         * @param description the description
         * @param cause       the cause
         */
        public MetadataException(String message, String description, Throwable cause) {
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
     * The type Size limit exceeded exception.
     */
    public static class SizeLimitExceededException
            extends SMEVAttachmentsException {


        private SizeLimitInfo faultInfo;

        /**
         * Instantiates a new Size limit exceeded exception.
         *
         * @param message   the message
         * @param faultInfo the fault info
         */
        public SizeLimitExceededException(String message, SizeLimitInfo faultInfo) {
            super(message);
            this.faultInfo = faultInfo;
        }

        /**
         * Instantiates a new Size limit exceeded exception.
         *
         * @param message   the message
         * @param faultInfo the fault info
         * @param cause     the cause
         */
        public SizeLimitExceededException(String message, SizeLimitInfo faultInfo, Throwable cause) {
            super(message, cause);
            this.faultInfo = faultInfo;
        }


        /**
         * Instantiates a new Size limit exceeded exception.
         *
         * @param message                 the message
         * @param attachmentSizeFaultInfo the attachment size fault info
         * @param description             the description
         * @param cause                   the cause
         */
        public SizeLimitExceededException(String message, SizeLimitInfo attachmentSizeFaultInfo, String description, Throwable cause) {
            super(message, cause, description);
            this.faultInfo = attachmentSizeFaultInfo;
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
         * @return returns fault bean: ru.it.smev.message_exchange.autogenerated.types.fault.v1_1.AttachmentSizeLimitExceeded
         */
        public SizeLimitInfo getFaultInfo() {
            return faultInfo;
        }

        /**
         * The type Size limit info.
         */
        public static class SizeLimitInfo {
            /**
             * The Permitted total attachment size.
             */
            protected long permittedTotalAttachmentSize;
            /**
             * The Real total attachment size.
             */
            protected long realTotalAttachmentSize;

            /**
             * Instantiates a new Size limit info.
             *
             * @param permittedTotalAttachmentSize the permitted total attachment size
             * @param realTotalAttachmentSize      the real total attachment size
             */
            public SizeLimitInfo(long permittedTotalAttachmentSize, long realTotalAttachmentSize) {
                this.permittedTotalAttachmentSize = permittedTotalAttachmentSize;
                this.realTotalAttachmentSize = realTotalAttachmentSize;
            }

            /**
             * Gets permitted total attachment size.
             *
             * @return the permitted total attachment size
             */
            public long getPermittedTotalAttachmentSize() {
                return permittedTotalAttachmentSize;
            }

            /**
             * Sets permitted total attachment size.
             *
             * @param value the value
             */
            public void setPermittedTotalAttachmentSize(long value) {
                this.permittedTotalAttachmentSize = value;
            }

            /**
             * Gets real total attachment size.
             *
             * @return the real total attachment size
             */
            public long getRealTotalAttachmentSize() {
                return realTotalAttachmentSize;
            }

            /**
             * Sets real total attachment size.
             *
             * @param value the value
             */
            public void setRealTotalAttachmentSize(long value) {
                this.realTotalAttachmentSize = value;
            }

        }

    }

    /**
     * The type Quote limit exceeded exception.
     */
    public static class QuoteLimitExceededException
            extends SMEVAttachmentsException {

        private QuoteLimitExceeded faultInfo;

        /**
         * Instantiates a new Quote limit exceeded exception.
         *
         * @param message   the message
         * @param faultInfo the fault info
         */
        public QuoteLimitExceededException(String message, QuoteLimitExceeded faultInfo) {
            super(message);
            this.faultInfo = faultInfo;
        }

        /**
         * Instantiates a new Quote limit exceeded exception.
         *
         * @param message   the message
         * @param faultInfo the fault info
         * @param cause     the cause
         */
        public QuoteLimitExceededException(String message, QuoteLimitExceeded faultInfo, Throwable cause) {
            super(message, cause);
            this.faultInfo = faultInfo;
        }

        /**
         * Instantiates a new Quote limit exceeded exception.
         *
         * @param message     the message
         * @param faultInfo   the fault info
         * @param description the description
         * @param cause       the cause
         */
        public QuoteLimitExceededException(String message, QuoteLimitExceeded faultInfo, String description, Throwable cause) {
            super(message, cause, description);
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
         * @return returns fault bean: ru.it.smev.message_exchange.autogenerated.types.fault.v1_1.QuoteLimitExceeded
         */
        public QuoteLimitExceeded getFaultInfo() {
            return faultInfo;
        }


        /**
         * The type Quote limit exceeded.
         */
        public static class QuoteLimitExceeded {

            /**
             * The Remained total quote size.
             */
            protected long remainedTotalQuoteSize;

            /**
             * The Real total attachment size.
             */
            protected long realTotalAttachmentSize;

            /**
             * Instantiates a new Quote limit exceeded.
             *
             * @param remainedTotalQuoteSize  the remained total quote size
             * @param realTotalAttachmentSize the real total attachment size
             */
            public QuoteLimitExceeded(long remainedTotalQuoteSize, long realTotalAttachmentSize) {
                this.remainedTotalQuoteSize = remainedTotalQuoteSize;
                this.realTotalAttachmentSize = realTotalAttachmentSize;
            }

            /**
             * Gets remained total quote size.
             *
             * @return the remained total quote size
             */
            public long getRemainedTotalQuoteSize() {
                return remainedTotalQuoteSize;
            }


            /**
             * Sets remained total quote size.
             *
             * @param value the value
             */
            public void setRemainedTotalQuoteSize(long value) {
                this.remainedTotalQuoteSize = value;
            }


            /**
             * Gets real total attachment size.
             *
             * @return the real total attachment size
             */
            public long getRealTotalAttachmentSize() {
                return realTotalAttachmentSize;
            }


            /**
             * Sets real total attachment size.
             *
             * @param value the value
             */
            public void setRealTotalAttachmentSize(long value) {
                this.realTotalAttachmentSize = value;
            }

        }
    }


}
