package com.integriks.smev.nwxRewrite.client.src.clientApi.services.admin;

import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVProcessingException;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVRuntimeException;

/**
 * Административный сервис
 */
public interface AdminService {

    /**
     *  Метод переключения с основного ГРУ, на резерный
     * @return true - в случае успешного переключения, false - иначе
     * @throws SMEVRuntimeException
     * @throws SMEVProcessingException
     */
    boolean switchNode() throws SMEVRuntimeException, SMEVProcessingException;

    /**
     * Возвращает мнемонику текущего ГРУ
     * @return мнемоника текущего ГРУ
     * @throws SMEVRuntimeException
     * @throws SMEVProcessingException
     */
    String getCurrentNode() throws SMEVRuntimeException, SMEVProcessingException;
}
