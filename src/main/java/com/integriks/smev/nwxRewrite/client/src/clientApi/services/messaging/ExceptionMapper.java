package com.integriks.smev.nwxRewrite.client.src.clientApi.services.messaging;

import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVProcessingException;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVRuntimeException;


/**
 * Сервис конвертации внутренних исключений и ошибок СМЭВ в исключения клиентского API
 *
 * @param <T> тип ошибки СМЭВ
 */
public interface ExceptionMapper<T> {

    /**
     * Конвертирует указанное исключение в исключение клиентского API
     *
     * @param exception внутреннее исключение
     * @return сконвертированное исключение
     * @throws SMEVRuntimeException в случае неизвестного внутреннего исключения
     */
    SMEVProcessingException convert(Throwable exception) throws SMEVRuntimeException;

    /**
     * Конвертирует указанную ошибку смэв в исключение клиентского API
     *
     * @param fault произошедшая ошибка СМЭВ
     * @return сконвертированное исключение
     */
    SMEVProcessingException convert(T fault);

}
