package com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport;

/**
 * Сервис транспорта сообщений
 *
 * @param <RequestRequest>      отсылаемый запрос
 * @param <RequestResponse>     результат отсылки запроса
 * @param <ResponseRequest>     отсылаемый ответ
 * @param <ResponseResponse>    результат отсылки ответа
 * @param <GetRequestRequest>   получаемый запрос
 * @param <GetRequestResponse>  результат получения запроса
 * @param <GetResponseRequest>  получаемый ответ
 * @param <GetResponseResponse> результат получения ответа
 * @param <StatusRequest>       запрос статуса
 * @param <StatusResponse>      ответ на запрос статуса
 * @param <AckRequest>          запрос на подтверждение сообщения
 * @param <AckResponse>         результат подтверждения
 * @param <StatisticsRequest>   запрос статистики
 * @param <StatisticsResponse>  ответ на запрос статистики
 */
public interface MessageTransport<RequestRequest, RequestResponse, ResponseRequest, ResponseResponse, GetRequestRequest, GetRequestResponse,
        GetResponseRequest, GetResponseResponse, StatusRequest, StatusResponse, AckRequest, AckResponse, StatisticsRequest, StatisticsResponse> {

    /**
     * Отправляет сообщение-запрос в СМЭВ
     *
     * @param parameters параметры запроса
     * @return результат отправления запроса
     * @throws Exception в случае любой ошибки
     */
    public RequestResponse sendRequest(RequestRequest parameters) throws Exception;

    /**
     * Отправляет сообщение-ответ в СМЭВ
     *
     * @param parameters параметры ответа
     * @return результат отправления ответа
     * @throws Exception в случае любой ошибки
     */
    public ResponseResponse sendResponse(ResponseRequest parameters) throws Exception;

    /**
     * Получает сообщение-запрос из СМЭВ
     *
     * @param parameters параметры получаемого запроса
     * @return результат получения запроса
     * @throws Exception в случае любой ошибки
     */
    public GetRequestResponse getRequest(GetRequestRequest parameters) throws Exception;

    /**
     * Получает статус
     *
     * @param parameters запрос на получение статуса
     * @return полученный статус
     * @throws Exception в случае любой ошибки
     */
    public StatusResponse getStatus(StatusRequest parameters) throws Exception;

    /**
     * Получает сообщение-ответ из СМЭВ
     *
     * @param parameters параметры получаемого ответа
     * @return полученный ответ
     * @throws Exception в случае любой ошибки
     */
    public GetResponseResponse getResponse(GetResponseRequest parameters) throws Exception;

    /**
     * Подтверждает получение ответа
     *
     * @param parameters the parameters
     * @return the ack response
     * @throws Exception в случае любой ошибки
     */
    public AckResponse ack(AckRequest parameters) throws Exception;

    /**
     * Получает статистику по очередям
     *
     * @param parameters запрос на получение статистики
     * @return ответ со статистикой
     * @throws Exception в случае любой ошибки
     */
    public StatisticsResponse getIncomingQueueStatistics(StatisticsRequest parameters) throws Exception;
}
