package com.integriks.smev.nwxRewrite.client.src.clientApi.services.transaction;

/**
 * Сервис транзакций
 */
public interface TransactionService {

    /**
     * Получает код транзакции по указанным параметрам
     *
     * @param frguServiceCode                 код ФРГУ информационной системы
     * @param frguInteractionPartisipantCode  код ФРГУ услуги либо признака функции
     * @param frguServiceDescription          расширенные сведения об услуге либо функции
     * @param frguServiceRecipientDescription расширенные сведения о получателе услуги либо функции
     * @return код транзакции
     */
    String getTransactionCode(String frguServiceCode, String frguInteractionPartisipantCode, String frguServiceDescription, String frguServiceRecipientDescription);
}
