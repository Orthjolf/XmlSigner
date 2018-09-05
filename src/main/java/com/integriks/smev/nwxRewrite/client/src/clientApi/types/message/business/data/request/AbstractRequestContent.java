package com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.data.request;

import org.w3c.dom.Element;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.data.BusinessContent;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.enums.BusinessStatus;

import java.util.List;

/**
 * Базовый класс для содержимого сообщений-запросов
 */
public abstract class AbstractRequestContent extends BusinessContent {

    /**
     * Конструктор
     *
     * @param status                  статус
     * @param businessProcessMetadata бизнес-метаданные, заданные пользователем
     */
    protected AbstractRequestContent(BusinessStatus status, List<Element> businessProcessMetadata) {
        super(status, businessProcessMetadata);
    }
}
