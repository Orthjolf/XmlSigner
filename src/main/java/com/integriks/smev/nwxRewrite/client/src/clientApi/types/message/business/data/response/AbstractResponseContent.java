package com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.data.response;

import org.w3c.dom.Element;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.data.BusinessContent;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.enums.BusinessStatus;

import java.util.List;

/**
 * Базовый класс для содержимого сообщений-ответов
 */
public abstract class AbstractResponseContent extends BusinessContent {

    /**
     * Конструктов
     *
     * @param status                  статус (тип) содержимого
     * @param businessProcessMetadata бизнес-метаданные, заданные пользователем
     */
    protected AbstractResponseContent(BusinessStatus status, List<Element> businessProcessMetadata) {
        super(status, businessProcessMetadata);
    }
}
