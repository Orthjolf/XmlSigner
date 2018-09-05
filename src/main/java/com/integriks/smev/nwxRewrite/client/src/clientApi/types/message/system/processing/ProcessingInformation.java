package com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.system.processing;


/**
 * Метаданные об обработке сообщения
 */
public abstract class ProcessingInformation {

    /**
     * Идентификатор узла СМЭВ
     */
    private String nodeId;

    /**
     * Тип сообщения
     */
    private Type messageType;

    /**
     * Конструктор
     *
     * @param nodeId идентификатор узла СМЭВ
     * @param type   тип сообщения
     */
    protected ProcessingInformation(String nodeId, Type type) {
        this.nodeId = nodeId;
        this.messageType = type;
    }

    /**
     * Возвращает идентификатор узла СМЭВ
     *
     * @return идентификатор узла СМЭВ
     */
    public String getNodeId() {
        return nodeId;
    }

    /**
     * Типы сообщения
     */
    public enum Type {

        /**
         * Запрос
         */
        REQUEST,

        /**
         * Ответ
         */
        RESPONSE,

        /**
         * Статус
         */
        STATUS
    }

    /**
     * Возвращает тип сообщения
     *
     * @return тип сообщения
     */
    public Type getType() {
        return messageType;
    }

    /**
     * Устанавливает тип сообщения
     *
     * @param type тип сообщения
     */
    protected void setMessageType(Type type) {
        messageType = type;
    }

}
