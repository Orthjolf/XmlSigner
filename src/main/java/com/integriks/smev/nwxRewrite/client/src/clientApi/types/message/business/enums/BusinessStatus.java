package com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.enums;


/**
 * Статус (тип) содержимого сообщений
 */
public enum BusinessStatus {

    /**
     * Сообщение-запрос
     */
    REQUEST,

    /**
     * Сообщение ответ на запрос
     */
    RESPONSE,

    /**
     * Получение статуса
     */
    STATUS,

    /**
     * Отклонение обработки запроса
     */
    REJECT,

    /**
     * Отмена обработки запроса
     */
    CANCEL,

    /**
     * Неизвестный тип
     */
    UNKNOWN
}
