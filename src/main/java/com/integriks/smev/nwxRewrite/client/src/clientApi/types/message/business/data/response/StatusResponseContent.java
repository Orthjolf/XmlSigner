package com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.data.response;

import org.w3c.dom.Element;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.enums.BusinessStatus;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.parsers.ParseContentVisitor;

import java.util.List;
import java.util.Map;

/**
 * Содержимое сообщения-ответа на запрос о статусе
 */
public class StatusResponseContent extends AbstractResponseContent {

    /**
     * Код статуса
     */
    private int statusCode;

    /**
     * Описание статуса
     */
    private String statusDescription;

    /**
     * Дополнительные параметры
     */
    private Map<String, String> parameters;

    /**
     * Конструктор
     *
     * @param statusCode              код статуса
     * @param statusDescription       описание статуса
     * @param parameters              дополнительные параметры
     * @param businessProcessMetadata бизнес-метаданные, заданные пользователем
     */
    public StatusResponseContent(int statusCode, String statusDescription, Map<String, String> parameters, List<Element> businessProcessMetadata) {
        super(BusinessStatus.STATUS, businessProcessMetadata);
        this.statusCode = statusCode;
        this.parameters = parameters;
        this.statusDescription = statusDescription;
    }

    /**
     * Возвращает код статуса
     *
     * @return код статуса
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * Возвращает описание статуса
     *
     * @return описание статуса
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * Возвращает дополнительные параметры
     *
     * @return дополнительные параметры
     */
    public Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * Вызывается системой для заполнения метаданных
     *
     * @param parseContentVisitor заполнитель метаданных
     */
    @Override
    public void accept(ParseContentVisitor parseContentVisitor) {
        parseContentVisitor.visit(this);
    }
}
