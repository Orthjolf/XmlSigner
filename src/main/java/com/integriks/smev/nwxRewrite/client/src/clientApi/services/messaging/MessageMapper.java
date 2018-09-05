package com.integriks.smev.nwxRewrite.client.src.clientApi.services.messaging;

import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVException;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.SMEVMessage;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.system.processing.QueryInformation;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.system.SMEVContext;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.system.SMEVMetadata;

import java.util.Map;


/**
 * Сервис конвертации сообщений клиентского API во внутренние представления, используемые при общении со СМЭВ
 *
 * @param <Void>                               the type parameter
 * @param <AckRequest>                         the type parameter
 * @param <GetStatusResponse>                  the type parameter
 * @param <GetStatusRequest>                   the type parameter
 * @param <GetIncomingQueueStatisticsResponse> the type parameter
 * @param <GetIncomingQueueStatisticsRequest>  the type parameter
 * @param <GetResponseResponse>                the type parameter
 * @param <GetResponseRequest>                 the type parameter
 * @param <SendResponseResponse>               the type parameter
 * @param <SendResponseRequest>                the type parameter
 * @param <GetRequestResponse>                 the type parameter
 * @param <GetRequestRequest>                  the type parameter
 * @param <SendRequestResponse>                the type parameter
 * @param <SendRequestRequest>                 the type parameter
 */
public interface MessageMapper<Void, AckRequest, GetStatusResponse, GetStatusRequest, GetIncomingQueueStatisticsResponse,
        GetIncomingQueueStatisticsRequest, GetResponseResponse, GetResponseRequest, SendResponseResponse, SendResponseRequest,
        GetRequestResponse, GetRequestRequest, SendRequestResponse, SendRequestRequest> {

    /**
     * Convert ack response smev context.
     *
     * @param ackResponse the ack response
     * @return the smev context
     */
    SMEVContext convertAckResponse(Void ackResponse);

    /**
     * Create ack request ack request.
     *
     * @param messageId the message id
     * @param accepted  the accepted
     * @return the ack request
     */
    AckRequest createAckRequest(String messageId, boolean accepted);

    /**
     * Convert status response smev message.
     *
     * @param getStatusResponse the get status response
     * @return the smev message
     */
    SMEVMessage convertStatusResponse(GetStatusResponse getStatusResponse);

    /**
     * Create get status request get status request.
     *
     * @return the get status request
     */
    GetStatusRequest createGetStatusRequest();

    /**
     *
     * @param timestamp
     * @return
     */
    GetStatusRequest createGetStatusRequest(String timestamp) throws Exception;

    /**
     * Convert statistics response map.
     *
     * @param getIncomingQueueStatisticsResponse the get incoming queue statistics response
     * @return the map
     */
    Map<String, Long> convertStatisticsResponse(GetIncomingQueueStatisticsResponse getIncomingQueueStatisticsResponse);

    /**
     * Create get incoming queue statistics request get incoming queue statistics request.
     *
     * @param nodeId the node id
     * @return the get incoming queue statistics request
     */
    GetIncomingQueueStatisticsRequest createGetIncomingQueueStatisticsRequest(String nodeId);

    /**
     * https://rm.mfc.ru/issues/10780
     * danilov
     * @param nodeId the node id
     * @param stamp ?
     * @return the get incoming queue statistics request
     */
    GetIncomingQueueStatisticsRequest createGetIncomingQueueStatisticsRequest(String nodeId, String stamp) throws Exception;

    /**
     * Convert get response response smev message.
     *
     * @param getResponseResponse the get response response
     * @return the smev message
     * @throws SMEVException the smev exception
     */
    SMEVMessage convertGetResponseResponse(GetResponseResponse getResponseResponse) throws SMEVException;

    /**
     * Create get response request get response request.
     *
     * @param query the query
     * @return the get response request
     */
    GetResponseRequest createGetResponseRequest(QueryInformation query);

    /**
     */
    GetResponseRequest createGetResponseRequest(QueryInformation query, String timestamp) throws Exception;

    /**
     * Convert send response response smev metadata.
     *
     * @param sendResponseResponse the send response response
     * @return the smev metadata
     */
    SMEVMetadata convertSendResponseResponse(SendResponseResponse sendResponseResponse);

    /**
     * Create send response request send response request.
     *
     * @param smevMessage the smev message
     * @return the send response request
     */
    SendResponseRequest createSendResponseRequest(SMEVMessage smevMessage);

    /**
     * Convert get request response smev message.
     *
     * @param getRequestResponse the get request response
     * @return the smev message
     * @throws SMEVException the smev exception
     */
    SMEVMessage convertGetRequestResponse(GetRequestResponse getRequestResponse) throws SMEVException;

    /**
     * Create get request request get request request.
     *
     * @param query the query
     * @return the get request request
     */
    GetRequestRequest createGetRequestRequest(QueryInformation query);

    /**
     * https://rm.mfc.ru/issues/12564
     * danilov
     */
    GetRequestRequest createGetRequestRequest(QueryInformation query, String timestamp) throws Exception;

    /**
     * Convert send request response smev metadata.
     *
     * @param sendRequestResponse the send request response
     * @return the smev metadata
     */
    SMEVMetadata convertSendRequestResponse(SendRequestResponse sendRequestResponse);

    /**
     * Create send request request send request request.
     *
     * @param smevMessage the smev message
     * @return the send request request
     */
    SendRequestRequest createSendRequestRequest(SMEVMessage smevMessage);
}
