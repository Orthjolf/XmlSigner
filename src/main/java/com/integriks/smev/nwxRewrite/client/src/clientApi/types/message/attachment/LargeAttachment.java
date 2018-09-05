package com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.attachment;

import java.net.URI;
import java.util.UUID;


/**
 * Большое вложение, пересылаемое отдельно от сообщения
 */
public class LargeAttachment extends SMEVAttachment {

    /**
     * Идентификатор вложения
     */
    protected UUID uuid;

    /**
     * URI исходного файла
     */
    protected URI contentRef;

    /**
     * Контрольная сумма, для проверки целостности файла
     */
    protected byte[] checkSum;

    /**
     * Дополнительная информация, используемая транспортом при отсылке файла
     */
    protected TransportDetails transportDetails;

    /**
     * Создает вложение на основе указанных данных
     *
     * @param mimeType       MIME-тип отсылаемого файла
     * @param signaturePKCS7 цифровая подпись
     * @param uuid           идентификатор вложения
     * @param contentRef     URI исходного файла
     * @param checkSum       контрольная сумма
     */
    public LargeAttachment(String mimeType, byte[] signaturePKCS7, UUID uuid, URI contentRef, byte[] checkSum) {
        this(mimeType, signaturePKCS7, uuid, contentRef, checkSum, null);
    }

    /**
     * Создает вложение на основе указанных данных
     *
     * @param mimeType         MIME-тип отсылаемого файла
     * @param signaturePKCS7   цифровая подпись
     * @param uuid             идентификатор вложения
     * @param contentRef       URI исходного файла
     * @param checkSum         контрольная сумма
     * @param transportDetails дополнительная информация, используемая транспортом при отсылке файла
     */
    public LargeAttachment(String mimeType, byte[] signaturePKCS7, UUID uuid, URI contentRef, byte[] checkSum, TransportDetails transportDetails) {
        super(mimeType, signaturePKCS7);
        this.uuid = uuid;
        this.contentRef = contentRef;
        this.checkSum = checkSum;
        this.transportDetails = transportDetails;
    }

    /**
     * Возвращает идентификатор вложения
     *
     * @return идентификатор вложения
     */
    public UUID getUuid() {
        return uuid;
    }

    /**
     * Возвращает URI исходного файла
     *
     * @return URI исходного файла
     */
    public URI getContentRef() {
        return contentRef;
    }

    /**
     * Возвращает контрольную сумму
     *
     * @return контрольную сумму
     */
    public byte[] getCheckSum() {
        return checkSum;
    }

    /**
     * Возвращает дополнительную информацию, используемую транспортом при отсылке файла
     *
     * @return дополнительную информацию для сервиса-транспорта
     */
    public TransportDetails getTransportDetails() {
        return transportDetails;
    }

    /**
     * Дополнительная информация для транспортного сервиса
     */
    public static class TransportDetails {

        /**
         * Имя пользователя (логин)
         */
        protected String userName;

        /**
         * Пароль пользователя
         */
        protected String password;

        /**
         * Создает объект на основе указанных данных
         *
         * @param userName имя пользователя
         * @param password пароль
         */
        public TransportDetails(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }

        /**
         * Возвращает имя пользователя
         *
         * @return имя пользователя
         */
        public String getUserName() {
            return userName;
        }

        /**
         * Возвращает пароль
         *
         * @return пароль
         */
        public String getPassword() {
            return password;
        }
    }

}
