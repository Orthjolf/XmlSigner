package com.integriks.smev.nwxRewrite.client.src.clientApi.services.validation;

import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVProcessingException;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVRuntimeException;


/**
 * Сервис валидации
 *
 * @param <T> тип валидируемого объека
 */
public interface Validator<T> {

    /**
     * Проверяет указанный объект на валидность
     *
     * @param element объект для проверки
     * @throws SMEVRuntimeException    в случае ошибки при конвертации объектов либо других ошибок
     * @throws SMEVProcessingException если указанный объек невалиден
     */
    void validate(T element) throws SMEVRuntimeException, SMEVProcessingException;
}
