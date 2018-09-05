package com.integriks.smev.nwxRewrite.client.src.clientApi.services.template;

import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVException;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.attachment.SMEVAttachment;

import java.io.File;
import java.util.List;

/**
 * Базовый интерфейс для работы со списком вложений
 */
public interface AttachmentTemplate {

    /**
     * Формирует список вложений на основе указанного списка файлов
     *
     * @param files список вкладываемых файлов
     * @return список вложений
     * @throws SMEVException в случае ошибки
     */
    List<? extends SMEVAttachment> createAttachments(List<File> files) throws SMEVException;
}
