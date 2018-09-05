package com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport;

import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVRuntimeException;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.attachment.LargeUpAttachment;

public interface LargeAttachmentTransport2 extends LargeAttachmentTransport
{
    /**
     * Загружает указанное вложение в СМЭВ
     *
     * @param attachment описание вложения
     * @throws SMEVRuntimeException в случае ошибок
     */
    void upload(LargeUpAttachment attachment) throws SMEVRuntimeException;
}
