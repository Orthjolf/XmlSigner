package com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.attachment;

import java.util.Arrays;


/**
 * Базовый класс для файлов-вложений к сообщениям СМЭВ
 */
public abstract class SMEVAttachment {

    /**
     * MIME-тип вложения
     */
    protected String mimeType;

    /**
     * Цифровая подпись вложения
     */
    protected byte[] signaturePKCS7;

    /**
     * Создает новое вложение
     *
     * @param mimeType       MIME-тип
     * @param signaturePKCS7 цифровая подпись
     */
    protected SMEVAttachment(String mimeType, byte[] signaturePKCS7) {
        this.mimeType = mimeType;
        this.signaturePKCS7 = signaturePKCS7;
    }

    /**
     * Возвращает MIME-тип вложения
     *
     * @return MIME-тип вложения
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Возвращает цифровую подпись
     *
     * @return цифровую подпись
     */
    public byte[] getSignaturePKCS7() {
        return Arrays.copyOf(signaturePKCS7, signaturePKCS7.length);
    }
}
