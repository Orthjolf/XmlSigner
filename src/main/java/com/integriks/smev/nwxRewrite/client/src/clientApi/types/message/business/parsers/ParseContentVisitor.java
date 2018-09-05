package com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.parsers;

import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.data.*;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.data.request.CancelRequestContent;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.data.request.RequestContent;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.data.response.RejectResponseContent;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.data.response.ResponseContent;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.data.response.StatusResponseContent;

/**
 * Заполнитель метаданных на основе содержимого сообщений
 */
public interface ParseContentVisitor {

    /**
     * Получает метаданные на основе содержимого ответа
     *
     * @param visitor содержимое ответа
     */
    void visit(ResponseContent visitor);

    /**
     * Получает метаданные на основе содержимого ответа-статуса
     *
     * @param visitor содержимое сообщения
     */
    void visit(StatusResponseContent visitor);

    /**
     * Получает метаданные на основе содержимого ответа-отклонения обработки
     *
     * @param visitor содержимое сообщения
     */
    void visit(RejectResponseContent visitor);

    /**
     * Получает метаданные на основе бизнес содержимого
     *
     * @param businessContent the содержимое сообщения
     */
    void visit(BusinessContent businessContent);

    /**
     * Получает метаданные на основе содержимого запроса
     *
     * @param businessMetadata содержимое сообщения
     */
    void visit(RequestContent businessMetadata);

    /**
     * Получает метаданные на основе содержимого запроса на отмену
     *
     * @param businessMetadata содержимое сообщения
     */
    void visit(CancelRequestContent businessMetadata);
}
