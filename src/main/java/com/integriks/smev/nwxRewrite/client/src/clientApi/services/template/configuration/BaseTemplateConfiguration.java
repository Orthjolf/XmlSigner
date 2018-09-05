package com.integriks.smev.nwxRewrite.client.src.clientApi.services.template.configuration;

import com.integriks.smev.nwxRewrite.client.src.clientApi.services.identification.configuration.IdentityServiceConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.messaging.configuration.MessageGenerationConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.signature.configuration.SignerConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport.configuration.LargeAttachmentTransportConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.validation.configuration.ValidatorConfiguration;

public interface BaseTemplateConfiguration {

    /**
     * Возвращает конфигурацию сервиса идентификации
     *
     * @return конфигурацию сервиса идентификации
     */
    IdentityServiceConfiguration getIdentityConfig();

    /**
     * Возвращает конфигурацию сервиса электронной подписи
     *
     * @return конфигурацию сервиса электронной подписи
     */
    SignerConfiguration getSignerConfig();

    /**
     * Возвращает конфигурацию сервиса валидации
     *
     * @return конфигурацию сервиса валидации
     */
    ValidatorConfiguration getValidatorConfig();

    /**
     * Возвращает конфигурацию конвертора сообщений
     *
     * @return конфигурацию конвертора сообщений
     */
    MessageGenerationConfiguration getMessageGenerationConfig();

    /**
     * Возвращает конфигурацию шаблона для работы с большими файлами
     *
     * @return конфигурацию шаблона для работы с большими файлами
     */
    LargeAttachmentTransportConfiguration getLargeAttachmentTransportConfig();

    /**
     * Логировать-ли исходящие объекты
     *
     * @return логировать-ли исходящие объекты
     */
    boolean getLoggingOutput();

    /**
     * Валидировать-ли исходящие объекты
     *
     * @return валидировать-ли исходящие объекты
     */
    boolean getValidateOutput();

    /**
     * Валидировать-ли входящие объекты
     *
     * @return валидировать-ли входящие объекты
     */
    boolean getValidateInput();

    /**
     * Логировать-ли входящие объекты
     *
     * @return логировать-ли входящие объекты
     */
    boolean getLoggingInput();

    /**
     * Валидировать-ли подписи СМЭВ
     *
     * @return валидировать-ли подписи СМЭВ
     */
    boolean getValidateSMEVSignature();

    /**
     * Возвращает путь к директории, в которой необходимо сохранять вложения из входящих сообщений
     *
     * @return директория для загрузки вложений
     */
    String getLocalStorage();
}
