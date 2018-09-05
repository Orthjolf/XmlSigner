package com.integriks.smev.nwxRewrite.client.src.clientApi.services.template;

import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVRuntimeException;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.processing.SMEVSignatureException;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.attachment.MTOMAttachment;

import java.io.File;
import java.util.List;


/**
 * Шаблон для работы с вложенными файлами MTOM
 */
public interface MTOMAttachmentTemplate extends AttachmentTemplate {

    /**
     * Формирует список вложений на основе указанного списка файлов
     *
     * @param files список вкладываемых файлов
     * @return список вложений
     * @throws SMEVSignatureException если возникли ошибки при подписывании файлов
     * @throws SMEVRuntimeException   в случае других ошибок
     */
    List<MTOMAttachment> createAttachments(List<File> files) throws SMEVSignatureException, SMEVRuntimeException;

    /**
     * Формирует список вложений на основе указанного списка файлов с подписями
     *
     * @param files              список вкладываемых файлов
     * @param personalSignatures цифровые подписи указанных файлов
     * @return список вложений
     */
    List<MTOMAttachment> createAttachments(List<File> files, List<byte[]> personalSignatures);
}
