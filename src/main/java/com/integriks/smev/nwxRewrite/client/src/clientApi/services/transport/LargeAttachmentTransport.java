package com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport;

import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVException;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVRuntimeException;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.attachment.LargeAttachment;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Сервис транспорта больших файлов-вложений
 */
public interface LargeAttachmentTransport {

    /**
     * Загружает вложение из СМЭВ в указанный выходной поток
     *
     * @param attachment описание вложения
     * @param output     куда записать содержимое файла-вложения
     * @return true в случае успешной заказчки, иначе - false
     * @throws IOException   в случае ошибки ввода-вывода
     * @throws SMEVException в случае других ошибок
     */
    boolean download(LargeAttachment attachment, OutputStream output) throws IOException, SMEVException;

    /**
     * Загружает указанное вложение в СМЭВ
     *
     * @param attachment описание вложения
     * @throws SMEVRuntimeException в случае ошибок
     */
    void upload(LargeAttachment attachment) throws SMEVRuntimeException;

    /**
     * Отменяет текущую операцию загрузки
     */
    void cancel();
}
