package com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.data;

import org.w3c.dom.Element;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.attachment.SMEVAttachment;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.enums.BusinessStatus;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.parsers.ParseContentAcceptor;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.parsers.ParseContentVisitor;

import java.util.List;

/**
 * Базовый класс для содержимого сообщений СМЭВ
 */
public abstract class BusinessContent implements ParseContentAcceptor {

    /**
     * Статус (тип) содержимого
     */
    protected BusinessStatus status = BusinessStatus.UNKNOWN;

    /**
     * Бизнес-метаданные, определенные пользователем
     */
    private List<Element> businessProcessMetadata;

    /**
     * Конструктор
     *
     * @param status                  статус содержимого
     * @param businessProcessMetadata бизнес-метаданные, заданные пользователем
     */
    protected BusinessContent(BusinessStatus status, List<Element> businessProcessMetadata) {
        this.status = status;
        this.businessProcessMetadata = businessProcessMetadata;
    }

    /**
     * Возвращает статус содержимого
     *
     * @return статус содержимого
     */
    public BusinessStatus getStatus() {
        return status;
    }

    /**
     * Возвращает бизнес-метаданные, заданные пользователем
     *
     * @return бизнес-метаданные, заданные пользователем
     */
    public List<Element> getBusinessProcessMetadata() {
        return businessProcessMetadata;
    }

    /**
     * Вызывается системой для заполнения метаданных
     *
     * @param parseContentVisitor заполнитель метаданных
     */
    public void accept(ParseContentVisitor parseContentVisitor) {
        parseContentVisitor.visit(this);
    }

    /**
     * Возвращает содержимое сообщения - xml-элемент, отправленный пользователем
     *
     * @return the content
     */
    public Element getContent() {
        return null;
    }

    /**
     * Возвращает персональную подпись пользователя (если указана)
     *
     * @return персональную подпись пользователя (если указана)
     */
    public Element getPersonalSignature() {
        return null;
    }

    /**
     * Возвращает список вложений
     *
     * @return список вложений
     */
    public List<SMEVAttachment> getAttachments() {
        return null;
    }
}
