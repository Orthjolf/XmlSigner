package com.integriks.smev.nwxRewrite.client.src.clientApi.services.template;

import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVException;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.attachment.MTOMAttachment;

public interface MTOMAttachmentTemplate2 extends MTOMAttachmentTemplate
{
    /**
     * Формирует вложение на основе указанного массива байт
     *
     * @param name
     *            имя вложение
     * @param mimeType TODO
     * @param data
     *            данные вложения
     * @return вложение
     * @throws SMEVException
     *             в случае ошибки
     */
    MTOMAttachment createAttachment(String name, String mimeType, byte[] data) throws SMEVException;
}
