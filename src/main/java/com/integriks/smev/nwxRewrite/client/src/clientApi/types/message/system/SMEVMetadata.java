package com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.system;

import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.system.processing.ProcessingInformation;

import java.util.Collections;
import java.util.Map;


/**
 * Метаданные сообщения СМЭВ
 */
public class SMEVMetadata {

    /**
     * Идентификация сообщения
     */
    private MessageIdentity messageIdentity;

    private ProcessingInformation processingInformation;
    private SMEVContext smevContext;
    private Map<String, String> extendedProperties;

    /**
     * Instantiates a new Smev metadata.
     *
     * @param messageIdentity       the message identity
     * @param processingInformation the processing information
     */
    public SMEVMetadata(MessageIdentity messageIdentity, ProcessingInformation processingInformation) {
        this(messageIdentity, processingInformation, Collections.EMPTY_MAP);
    }

    /**
     * Instantiates a new Smev metadata.
     *
     * @param messageIdentity       the message identity
     * @param processingInformation the processing information
     * @param extendedProperties    the extended properties
     */
    public SMEVMetadata(MessageIdentity messageIdentity, ProcessingInformation processingInformation, Map<String, String> extendedProperties) {
        this.messageIdentity = messageIdentity;
        this.processingInformation = processingInformation;
        this.extendedProperties = extendedProperties;
    }

    /**
     * Gets message identity.
     *
     * @return the message identity
     */
    public MessageIdentity getMessageIdentity() {
        return messageIdentity;
    }

    /**
     * Gets processing information.
     *
     * @return the processing information
     */
    public ProcessingInformation getProcessingInformation() {
        return processingInformation;
    }

    /**
     * Gets smev context.
     *
     * @return the smev context
     */
    public SMEVContext getSmevContext() {
        return smevContext;
    }

    /**
     * Sets smev context.
     *
     * @param smevContext the smev context
     */
    public void setSmevContext(SMEVContext smevContext) {
        this.smevContext = smevContext;
    }

    /**
     * Gets extended properties.
     *
     * @return the extended properties
     */
    public Map<String, String> getExtendedProperties() {
        return extendedProperties;
    }

    /**
     * The type Message identity.
     */
    public static class MessageIdentity {
        private String messageId;
        private String referenceMessageId;
        private String transactionCode;

        /**
         * Instantiates a new Message identity.
         *
         * @param messageId          the message id
         * @param referenceMessageId the reference message id
         * @param transactionCode    the transaction code
         */
        public MessageIdentity(String messageId, String referenceMessageId, String transactionCode) {
            this.referenceMessageId = referenceMessageId;
            this.transactionCode = transactionCode;
            this.messageId = messageId;
        }

        /**
         * Gets message id.
         *
         * @return the message id
         */
        public String getMessageId() {
            return messageId;
        }

        /**
         * Gets reference message id.
         *
         * @return the reference message id
         */
        public String getReferenceMessageId() {
            return referenceMessageId;
        }

        /**
         * Gets transaction code.
         *
         * @return the transaction code
         */
        public String getTransactionCode() {
            return transactionCode;
        }
    }
}
