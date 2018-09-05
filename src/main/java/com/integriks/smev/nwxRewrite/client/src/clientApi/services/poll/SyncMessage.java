package com.integriks.smev.nwxRewrite.client.src.clientApi.services.poll;

import org.w3c.dom.Element;

import java.util.Date;


/**
 * Базовый интерфейс для синхронного сообщения
 */
public interface SyncMessage {

    /**
     * Возвращает содержимое сообщения
     *
     * @return содержимое сообщения
     */
    Element getContent();

    /**
     * Возвращает время, до которого необходимо обработать сообщение
     *
     * @return время, до которого необходимо обработать сообщение
     */
    Date getEol();

    /**
     * Возвращает идентификатор сообщения
     *
     * @return идентификатор сообщения
     */
    String getMessageId();

    /**
     * Возвращает идентифкатор узла СМЭВ
     *
     * @return the node id
     */
    String getNodeId();

    /**
     * Возвращает идентификатор сообщения, в ответ на которое отсылается текущее
     *
     * @return идентификатор сообщения, в ответ на которое отсылается текущее
     */
    String getOriginalMessageId();

}
