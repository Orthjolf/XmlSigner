package com.integriks.smev.nwxRewrite.client.src.clientApi.services.template;

import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVException;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVRuntimeException;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.attachment.LargeAttachment;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.attachment.SMEVAttachment;

import java.io.File;
import java.util.List;


/**
 * Шаблон для работы с большими файлами
 */
public interface LargeAttachmentTemplate extends AttachmentTemplate {

    /**
     * Формирует список больших вложений на основе указанного списка файлов
     *
     * @param files список вкладываемых файлов
     * @return список вложений
     * @throws SMEVException в случае ошибки
     */
    List<LargeAttachment> createAttachments(List<File> files) throws SMEVException;

    /**
     * Формирует список вложений на основе указанного списка файлов с контрольными суммами
     *
     * @param files     список вкладываемых файлов
     * @param checkSums их контрольные суммы
     * @return список вложений
     * @throws SMEVException в случае ошибки
     */
    List<LargeAttachment> createAttachments(List<File> files, List<byte[]> checkSums) throws SMEVException;

    /**
     * Формирует список вложений на основе указанного списка файлов с контрольными суммами и подписями
     *
     * @param files              список вкладываемых файлов
     * @param checkSums          их контрольные суммы
     * @param personalSignatures цифровые подписи указанных файлов
     * @return список вложений
     * @throws SMEVException the smev exception в случае ошибки
     */
    List<LargeAttachment> createAttachments(List<File> files, List<byte[]> checkSums, List<byte[]> personalSignatures) throws SMEVException;

    /**
     * Отправляет вложения
     *
     * @param attachments список вложений
     * @throws SMEVRuntimeException в случае ошибки отправления
     */
    void sendLargeAttachments(List<SMEVAttachment> attachments) throws SMEVRuntimeException;
}
