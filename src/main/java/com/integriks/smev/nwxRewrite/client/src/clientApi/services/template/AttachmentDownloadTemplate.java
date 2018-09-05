package com.integriks.smev.nwxRewrite.client.src.clientApi.services.template;

import com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport.LargeAttachmentTransport;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.SMEVMessage;

public interface AttachmentDownloadTemplate
{
    void download(SMEVMessage message, LargeAttachmentTransport largeAttachmentTransport);
}
