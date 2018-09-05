package com.integriks.smev.nwxRewrite.client.src.clientApi.services.poll;

import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVException;

import javax.xml.namespace.QName;

/**
 * Транспор для отправки и получения сообщений
 *
 * @param <T> тип отправляемого или получаемого сообщения
 * @param <V> тип результата отправки или получения сообщения
 */
public interface SyncTransport<T, V> {

    /**
     * Отправляет запрос
     *
     * @param request сообщение-запрос
     * @return результат отправки запроса
     * @throws SMEVException если произошли ошибки
     */
    V sendRequest(T request)
            throws SMEVException;

    /**
     * Получает ответ
     *
     * @param responseTypeSelector фильтр сообщения
     * @param nodeId               идентификатор узла СМЭВ
     * @return сообщение-ответ
     * @throws SMEVException если произошли ошибки
     */
    T getResponse(QName responseTypeSelector, String nodeId)
            throws SMEVException;


    /**
     * Подтверждает получение сообщения
     *
     * @param targetMessageId идентфикатор сообщения
     * @param accepted        true - сообщение принято к обработке, false - отклонение обработки
     * @throws SMEVException если произошли ошибки
     */
    void ack(String targetMessageId, boolean accepted)
            throws SMEVException;

}
