package com.integriks.smev.nwxRewrite.client.src.clientApi.services.poll;

import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVException;

/**
 * Синхронный адаптер отправки сообщений
 *
 * @param <SMEVSyncMessage> синхронное сообщение СМЭВ
 * @param <SMEVMeta>        метаданные сообщения
 */
public interface SyncAdapter<SMEVSyncMessage extends SyncMessage, SMEVMeta extends SyncMeta> {

    /**
     * Отправляет сообщение в СМЭВ
     *
     * @param request отправляемое сообщение
     * @return отправленное сообщение
     * @throws SMEVException при возникновении ошибок
     */
    SMEVSyncMessage sendRequestSync(SMEVSyncMessage request, SyncCallback<SMEVSyncMessage> callback) throws SMEVException;

    /**
     * Подтверждает получение сообщения
     *
     * @param messageId идентификатор сообщения
     * @throws SMEVException при возникновении ошибок
     */
    void ack(String messageId) throws SMEVException;


    enum Event {
        SUCCESS,
        FAILURE
    }
}
