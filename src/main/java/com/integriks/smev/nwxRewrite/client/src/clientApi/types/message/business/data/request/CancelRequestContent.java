package com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.data.request;

import org.w3c.dom.Element;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.enums.BusinessStatus;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.parsers.ParseContentVisitor;

import java.util.List;

/**
 * Содержимое отклонения запроса
 */
public abstract class CancelRequestContent extends RequestContent {

    /**
     * Конструктор
     *
     * @param businessProcessMetadata бизнес-метаданные, заданные пользователем
     */
    public CancelRequestContent(List<Element> businessProcessMetadata) {
        super(BusinessStatus.CANCEL, businessProcessMetadata);
    }

    /**
     * Вызывается системой для заполнения метаданных
     *
     * @param parseContentVisitor заполнитель метаданных
     */
    @Override
    public void accept(ParseContentVisitor parseContentVisitor) {
        parseContentVisitor.visit(this);
    }
}
