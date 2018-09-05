package com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport;

import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.transport.GeoMessage;

import java.util.Map;

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
public interface GeoMessageTransport<RequestRequest, RequestResponse, ResponseRequest, ResponseResponse, GetRequestRequest, GetRequestResponse,
        GetResponseRequest, GetResponseResponse, StatusRequest, StatusResponse, AckRequest, AckResponse, StatisticsRequest, StatisticsResponse> {

    /**
     * Отправляет сообщение-запрос в СМЭВ
     *
     * @param parameters параметры запроса
     * @return результат отправления запроса
     * @throws Exception в случае любой ошибки
     */
    public GeoMessage<RequestResponse> sendRequest(RequestRequest parameters) throws Exception;

    /**
     * Отправляет сообщение-ответ в СМЭВ
     *
     * @param parameters параметры ответа
     * @return результат отправления ответа
     * @throws Exception в случае любой ошибки
     */
    public GeoMessage<ResponseResponse> sendResponse(ResponseRequest parameters) throws Exception;

    /**
     * Получает сообщение-запрос из СМЭВ
     *
     * @param parameters параметры получаемого запроса
     * @return результат получения запроса
     * @throws Exception в случае любой ошибки
     */
    public GeoMessage<GetRequestResponse> getRequest(GetRequestRequest parameters) throws Exception;

    /**
     * Получает статус
     *
     * @param parameters запрос на получение статуса
     * @return полученный статус
     * @throws Exception в случае любой ошибки
     */
    public GeoMessage<StatusResponse> getStatus(StatusRequest parameters) throws Exception;

    /**
     * Получает сообщение-ответ из СМЭВ
     *
     * @param parameters параметры получаемого ответа
     * @return полученный ответ
     * @throws Exception в случае любой ошибки
     */
    public GeoMessage<GetResponseResponse> getResponse(GetResponseRequest parameters) throws Exception;

    /**
     * Подтверждает получение ответа
     *
     * @param parameters the parameters
     * @return the ack response
     * @throws Exception в случае любой ошибки
     */
    public GeoMessage<AckResponse> ack(GeoMessage<AckRequest> parameters) throws Exception;
}
