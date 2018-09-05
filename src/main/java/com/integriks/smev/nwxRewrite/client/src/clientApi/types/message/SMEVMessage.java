package com.integriks.smev.nwxRewrite.client.src.clientApi.types.message;

import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.data.BusinessContent;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.system.SMEVMetadata;

/**
 * Сообщение (входящее/исходящее) СМЭВ
 */
public class SMEVMessage {

    /**
     * Метаданные сообщения
     */
    private final SMEVMetadata SMEVMetadata;

    /**
     * Содержимое сообщения
     */
    private final BusinessContent data;

    /**
     * Создает сообщение СМЭВ на основе указанных данных
     *
     * @param SMEVMetadata метаданные
     * @param data         содержимое
     */
    public SMEVMessage(SMEVMetadata SMEVMetadata, BusinessContent data) {
        this.SMEVMetadata = SMEVMetadata;
        this.data = data;
    }

    /**
     * Возвращает метаданные сообщения
     *
     * @return метаданные сообщения
     */
    public SMEVMetadata getSMEVMetadata() {
        return SMEVMetadata;
    }

    /**
     * Возвращает содержимое сообщения
     *
     * @return содержимое сообщения
     */
    public BusinessContent getData() {
        return data;
    }
}
