package com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.attachment;

import java.util.UUID;

import javax.activation.DataSource;

abstract public class UpAttachment extends SMEVAttachment
{
    /**
     * Идентификатор вложения
     */
    protected UUID uuid;

    /**
     * URI исходного файла
     */
    protected DataSource ds;

    /**
     * Контрольная сумма, для проверки целостности файла
     */
    protected byte[] checkSum;

    public UpAttachment(String mimeType, byte[] signaturePKCS7, UUID uuid, DataSource ds, byte[] checkSum) {
        super(mimeType, signaturePKCS7);
        this.uuid = uuid;
        this.ds = ds;
        this.checkSum = checkSum;
    }

    /**
     * Возвращает идентификатор вложения
     *
     * @return идентификатор вложения
     */
    public UUID getUuid() {
        return uuid;
    }

    public DataSource getDs() {
        return ds;
    }

    /**
     * Возвращает контрольную сумму
     *
     * @return контрольную сумму
     */
    public byte[] getCheckSum() {
        return checkSum;
    }
}
