package com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.system;


import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVException;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.system.enums.SMEVStatus;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Метаданные сообщения, вспомогательная информация об отправке/получении и т.п. сообщения
 */
public class SMEVContext {

    /**
     * Идентификатор транспорта, отправителя
     */
    private String idTransport;

    /**
     * Адрес отправителя запроса, в ответ на который отправляется текущее сообщение
     */
    private String replyTo;

    /**
     * Отправитель сообщения
     */
    private Participant sender;

    /**
     * Получатель сообщения
     */
    private Participant recipient;

    /**
     * Название точки назначения
     */
    private String destinationName;

    /**
     * Тип содержимого
     */
    private String contentTypeName;

    /**
     * Дата отправки
     */
    private XMLGregorianCalendar sendingTimestamp;

    /**
     * Дата доставки
     */
    private XMLGregorianCalendar deliveryTimestamp;

    /**
     * Дополнительная информация об отправке сообщения
     */
    private String processingDetails;

    /**
     * Тип взаимодействия
     */
    private String interactionType;

    /**
     * Статус сообщения в СМЭВ
     */
    private SMEVStatus smevStatus;

    /**
     * Возникшее исключение
     */
    private SMEVException exception;

    /**
     * Конструктрр
     *
     * @param sender            отправитель
     * @param recipient         получатель
     * @param destinationName   имя точки назначения
     * @param contentTypeName   тип содержимого
     * @param sendingTimestamp  дата отправления
     * @param deliveryTimestamp дата доставки
     * @param processingDetails детали
     * @param interactionType   тип взаимодействия
     * @param smevStatus        статус сообщения
     * @param replyTo           обратный адрес
     * @param exception         возникшее исключение
     */
    public SMEVContext(Participant sender, Participant recipient, String destinationName, String contentTypeName, XMLGregorianCalendar sendingTimestamp, XMLGregorianCalendar deliveryTimestamp, String processingDetails, String interactionType, SMEVStatus smevStatus, String replyTo, SMEVException exception) {
        this.sender = sender;
        this.recipient = recipient;
        this.destinationName = destinationName;
        this.contentTypeName = contentTypeName;
        this.sendingTimestamp = sendingTimestamp;
        this.deliveryTimestamp = deliveryTimestamp;
        this.processingDetails = processingDetails;
        this.interactionType = interactionType;
        this.smevStatus = smevStatus;
        this.exception = exception;
        this.replyTo = replyTo;
    }

    /**
     * Конструктор копирующий
     *
     * @param idTransport идентификатор транспорта
     * @param context     контекст для копирования
     */
    public SMEVContext(String idTransport, SMEVContext context) {
        this.idTransport = idTransport;
        if (context != null) {
            this.replyTo = context.getReplyTo();
            this.sender = context.getSender();
            this.recipient = context.getRecipient();
            this.destinationName = context.getDestinationName();
            this.contentTypeName = context.getContentTypeName();
            this.sendingTimestamp = context.getSendingTimestamp();
            this.deliveryTimestamp = context.getDeliveryTimestamp();
            this.processingDetails = context.getProcessingDetails();
            this.interactionType = context.getInteractionType();
            this.smevStatus = context.getSmevStatus();
            this.exception = context.getException();
        }
    }

    /**
     * Возвращает идентификатор отранспорта
     *
     * @return идентификатор
     */
    public String getIdTransport() {
        return idTransport;
    }

    /**
     * Возвращает отправителя сообщения
     *
     * @return отправителя сообщения
     */
    public Participant getSender() {
        return sender;
    }

    /**
     * Возвращает получателя сообщения
     *
     * @return получателя сообщения
     */
    public Participant getRecipient() {
        return recipient;
    }

    /**
     * Возвращает имя точки назначения
     *
     * @return имя точки назначения
     */
    public String getDestinationName() {
        return destinationName;
    }

    /**
     * Возвращает тип содержимого
     *
     * @return тип содержимого
     */
    public String getContentTypeName() {
        return contentTypeName;
    }

    /**
     * Возвращает дату отправки
     *
     * @return дату отправки
     */
    public XMLGregorianCalendar getSendingTimestamp() {
        return sendingTimestamp;
    }

    /**
     * Возвращает дату доставки
     *
     * @return дату доставки
     */
    public XMLGregorianCalendar getDeliveryTimestamp() {
        return deliveryTimestamp;
    }

    /**
     * Возвращает детали передачи
     *
     * @return детали передачи
     */
    public String getProcessingDetails() {
        return processingDetails;
    }

    /**
     * Возвращает тип взаимодействия
     *
     * @return тип взаимодействия
     */
    public String getInteractionType() {
        return interactionType;
    }

    /**
     * Возвращает статус сообщения
     *
     * @return статус сообщения
     */
    public SMEVStatus getSmevStatus() {
        return smevStatus;
    }

    /**
     * Возвращает возникшее исключение
     *
     * @return возникшее исключение
     */
    public SMEVException getException() {
        return exception;
    }

    /**
     * Возвращает обратный адрес
     *
     * @return адрес отправителя запроса, в ответ на который отправляется текущее сообщение
     */
    public String getReplyTo() {
        return replyTo;
    }

    /**
     * Информация об отправителе или получателе сообщения
     */
    public static class Participant {

        /**
         * Мнемонический идентификатор участника взаимодействия
         */
        private String mnemonic;

        /**
         * Удобочитаемое имя участника взаимодействия
         */
        private String humanReadableName;

        /**
         * Конструктор
         *
         * @param mnemonic          мнемонический код участника взаимодействия
         * @param humanReadableName удобочитаемое имя
         */
        public Participant(String mnemonic, String humanReadableName) {
            this.mnemonic = mnemonic;
            this.humanReadableName = humanReadableName;
        }

        /**
         * Возвращает мнемонический код
         *
         * @return мнемонический код
         */
        public String getMnemonic() {
            return mnemonic;
        }

        /**
         * Возвращает удобочитаемое имя
         *
         * @return удобочитаемое имя
         */
        public String getHumanReadableName() {
            return humanReadableName;
        }
    }
}
