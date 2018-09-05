package com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.system.enums;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Статус сообщения в СМЭВ
 */
public enum SMEVStatus {

    /**
     * Добавлено в очередь
     */
    QUEUED,

    /**
     * Получение подтверждено
     */
    ACCEPTED,

    /**
     * Отклонено
     */
    REJECTED,

    /**
     * В обработке
     */
    PROCESSING,

    /**
     * Доставлено
     */
    DELIVERED,

    /**
     * Статус неизвестен
     */
    UNKNOWN;

    /**
     * Сопоставление статуса и его строкового представления
     */
    public static Map<String, SMEVStatus> mapping;


    static {
        Map<String, SMEVStatus> mapping = new HashMap<>();

        mapping.put("requestIsQueued", QUEUED);

        mapping.put("responseIsAcceptedBySmev", ACCEPTED);
        mapping.put("requestIsAcceptedBySmev", ACCEPTED);

        mapping.put("cancelled", REJECTED);
        mapping.put("doesNotExist", REJECTED);
        mapping.put("requestIsRejectedBySmev", REJECTED);

        mapping.put("underProcessing", PROCESSING);

        mapping.put("responseIsDelivered", DELIVERED);

        SMEVStatus.mapping = Collections.unmodifiableMap(mapping);
    }
}
