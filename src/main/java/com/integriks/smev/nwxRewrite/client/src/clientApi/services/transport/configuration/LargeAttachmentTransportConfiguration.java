package com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport.configuration;

import com.integriks.smev.nwxRewrite.client.src.clientApi.configuration.SMEVConfiguration;


/**
 * Конфигурация транспорта больших файлов-вложений
 */
public interface LargeAttachmentTransportConfiguration extends SMEVConfiguration {

    /**
     * Адрес ФТП-сервера
     *
     * @return адрес сервера передачи больших файлов
     */
    String getAddress();

    /**
     * Идентификатор пользователя на ФТП сервере
     *
     * @return имя пользователя на сервере передачи больших файлов
     */
    String getLogin();

    /**
     * Пароль пользователя
     *
     * @return пароль
     */
    String getPass();

    /**
     * Максимальное количество попыток отправки файла
     *
     * @return максимальное количество попыток отправки файла
     */
    int getMaxAttempts();

    /**
     * Таймаут обращения к сервису
     *
     * @return таймаут обращения к сервису
     */
    int getTimeout();
}
