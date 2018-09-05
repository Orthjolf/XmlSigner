
package com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.attachment;

import java.util.UUID;

import javax.activation.DataSource;

public class LargeUpAttachment extends UpAttachment
{
    public LargeUpAttachment(String mimeType, byte[] signaturePKCS7, UUID uuid, DataSource ds, byte[] checkSum) {
        super(mimeType, signaturePKCS7, uuid, ds, checkSum);
    }
}
