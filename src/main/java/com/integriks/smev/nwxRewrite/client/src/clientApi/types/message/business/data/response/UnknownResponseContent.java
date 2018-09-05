package com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.data.response;

import org.w3c.dom.Element;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.enums.BusinessStatus;

import java.util.List;


/**
 * Содержимое сообщение-ответа неизвестного типа
 */
public class UnknownResponseContent extends ResponseContent {

    /**
     * Конструктор
     *
     * @param businessProcessMetadata бизнес-метаданные, заданные пользователем
     */
    public UnknownResponseContent(List<Element> businessProcessMetadata) {
        super(BusinessStatus.UNKNOWN, businessProcessMetadata);
    }
}
