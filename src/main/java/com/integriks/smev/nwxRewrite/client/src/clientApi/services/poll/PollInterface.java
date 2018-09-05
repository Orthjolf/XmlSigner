package com.integriks.smev.nwxRewrite.client.src.clientApi.services.poll;

import javax.xml.namespace.QName;

/**
 * Базовый интерфейс для объектов, осуществляющих периодический опрос СМЭВ на наличие ответных сообщений
 *
 * @param <T> тип сообщения
 */
public interface PollInterface<T> {

    /**
     * Gets response.
     *
     * @param type   фильтр запроса
     * @param nodeId идентификатор узла СМЭВ
     * @return собщение заданного типа
     * @throws Exception при возникновении ошибок
     */
    T getResponse(QName type, String nodeId) throws Exception;

    /**
     * Возвращает идентификатор сообщения
     *
     * @param response сообщение, идентификатор которого необходимо получить
     * @return идентификатор сообщения
     */
    String getMessageId(T response);

}
