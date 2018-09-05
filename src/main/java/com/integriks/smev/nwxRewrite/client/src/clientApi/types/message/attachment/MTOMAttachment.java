package com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.attachment;

import javax.activation.DataHandler;

/**
 * Вложение, пересылаемое совместно с сообщением
 */
public class MTOMAttachment extends SMEVAttachment
{

    /**
     * Идентификатор вложения
     */
    protected String attachmentId;

    /**
     * Объект доступа к содержимому вложения
     */
    protected DataHandler content;

    /**
     * Создает вложение на основе указанных данных
     *
     * @param mimeType
     *            MIME-тип вложения
     * @param signaturePKCS7
     *            цифровая подпись
     * @param attachmentId
     *            идентификатор вложения
     * @param content
     *            объект доступа к содержимому вложения
     */
    public MTOMAttachment(String mimeType, byte[] signaturePKCS7, String attachmentId, DataHandler content) {
        super(mimeType, signaturePKCS7);
        this.attachmentId = attachmentId;
        this.content = content;
    }

    /**
     * Возвращает идентификатор вложения
     *
     * @return идентификатор вложения
     */
    public String getAttachmentId() {
        return attachmentId;
    }

    /**
     * Возвращает объект доступа к содержимому вложения
     *
     * @return объект доступа к содержимому вложения
     */
    public DataHandler getContent() {
        return content;
    }

}
