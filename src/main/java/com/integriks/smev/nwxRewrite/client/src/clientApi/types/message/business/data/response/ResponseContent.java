package com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.data.response;

import org.w3c.dom.Element;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.attachment.SMEVAttachment;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.enums.BusinessStatus;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.parsers.ParseContentVisitor;

import java.util.List;

/**
 * Содержимое сообщения-ответа
 */
public class ResponseContent extends AbstractResponseContent {

    /**
     * Данные, отправленные пользователем
     */
    private Element content;

    /**
     * Персональная цифровая подпись пользователя
     */
    private Element personalSignature;

    /**
     * Список файлов-вложений
     */
    private List<SMEVAttachment> attachments;

    /**
     * Конструктор
     *
     * @param content                 данные пользователя
     * @param personalSignature       персональная подпись
     * @param attachments             список вложений
     * @param businessProcessMetadata бизнес-метаданные, заданные пользователем
     */
    public ResponseContent(Element content, Element personalSignature, List<SMEVAttachment> attachments, List<Element> businessProcessMetadata) {
        super(BusinessStatus.RESPONSE, businessProcessMetadata);
        this.attachments = attachments;
        this.content = content;
        this.personalSignature = personalSignature;
    }

    /**
     * Конструктор
     *
     * @param status                  статус содержимого
     * @param businessProcessMetadata бизнес-метаданные, заданные пользователем
     */
    protected ResponseContent(BusinessStatus status, List<Element> businessProcessMetadata) {
        super(status, businessProcessMetadata);
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

    /**
     * Возвращает данные, отправленные пользователем
     *
     * @return данные, отправленные пользователем
     */
    @Override
    public Element getContent() {
        return content;
    }

    /**
     * Возвращает персональную цифровую подпись
     *
     * @return персональную цифровую подпись
     */
    @Override
    public Element getPersonalSignature() {
        return personalSignature;
    }

    /**
     * Возвращает список вложений
     *
     * @return список вложений
     */
    @Override
    public List<SMEVAttachment> getAttachments() {
        return attachments;
    }
}
