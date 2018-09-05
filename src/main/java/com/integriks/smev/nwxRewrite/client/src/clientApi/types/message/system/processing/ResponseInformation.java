package com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.system.processing;


/**
 * Метаданные сообщения-ответа
 */
public class ResponseInformation extends ProcessingInformation {

    /**
     * Адрес отправителя запроса, в ответ на который отправляется текущее сообщение
     */
    private String replyTo;

    /**
     * Идентификатор сообщения, в ответ на которое отсылается текущее
     */
    private String originalMessageId;

    /**
     * Конструктор
     *
     * @param replyTo адрес отправителя запроса, в ответ на который отправляется текущее сообщение
     */
    public ResponseInformation(String replyTo) {
        this(null, replyTo);
    }

    /**
     * Конструктор
     *
     * @param originalMessageId идентификатор сообщения, в ответ на которое отсылается текущее
     * @param replyTo           адрес отправителя запроса, в ответ на который отправляется текущее сообщение
     */
    public ResponseInformation(String originalMessageId, String replyTo) {
        super(null, Type.RESPONSE);
        this.replyTo = replyTo;
        this.originalMessageId = originalMessageId;
    }

    /**
     * Возвращает адрес отправителя
     *
     * @return адрес отправителя запроса, в ответ на который отправляется текущее сообщение
     */
    public String getReplyTo() {
        return replyTo;
    }

    /**
     * Возвращает идентификатор сообщения, в ответ на которое отсылается текущее
     *
     * @return идентификатор сообщения, в ответ на которое отсылается текущее
     */
    public String getOriginalMessageId() {
        return originalMessageId;
    }

}
