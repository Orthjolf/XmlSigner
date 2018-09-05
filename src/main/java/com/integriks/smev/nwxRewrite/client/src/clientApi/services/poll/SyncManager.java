package com.integriks.smev.nwxRewrite.client.src.clientApi.services.poll;


/**
 * Управление синхронным адаптером
 *
 * @param <SMEVSyncMessage> тип сообщения
 * @param <SMEVMeta>        тип метаданных сообщения
 */
public interface SyncManager<SMEVSyncMessage extends SyncMessage, SMEVMeta extends SyncMeta> {

    /**
     * Останавливает адаптер и все потоки, связанные с ним
     */
    void shutdown();

    /**
     * Возвращает синхронный адаптер
     *
     * @return синхронный адаптер
     */
    SyncAdapter<SMEVSyncMessage, SMEVMeta> getSyncAdapter();

}
