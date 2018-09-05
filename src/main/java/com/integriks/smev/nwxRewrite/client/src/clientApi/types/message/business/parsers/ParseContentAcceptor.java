package com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.parsers;


/**
 * Базовый интерфейс для содержимого сообщений
 */
public interface ParseContentAcceptor {

    /**
     * Вызывается системой для заполнения метаданных
     *
     * @param parseContentVisitor заполнитель метаданных
     */
    void accept(ParseContentVisitor parseContentVisitor);
}
