package com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.data.response;

import org.w3c.dom.Element;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.enums.BusinessStatus;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.business.parsers.ParseContentVisitor;

import java.util.LinkedList;
import java.util.List;

/**
 * Содержимое сообщения-ответа, отклоняющего обработку запроса
 */
public class RejectResponseContent extends AbstractResponseContent {

    private final List<Reject> rejects = new LinkedList<>();

    /**
     * Конструктов
     *
     * @param businessProcessMetadata бизнес-метаданные, заданные пользователем
     */
    public RejectResponseContent(List<Element> businessProcessMetadata) {
        super(BusinessStatus.REJECT, businessProcessMetadata);
    }

    public void add(RejectCode statusCode, String statusDescription) {
        rejects.add(new Reject(statusCode, statusDescription));
    }

    public List<Reject> getRejects() {
        return rejects;
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

    /**
     * Список причин отклонения
     */
    public enum RejectCode {

        /**
         * Доступ запрещен
         */
        ACCESS_DENIED,

        /**
         * Нет данных
         */
        NO_DATA,

        /**
         * Неизвестное описание запроса
         */
        UNKNOWN_REQUEST_DESCRIPTION,
        /**
         * Общая ошибка
         */
        FAILURE;

        /**
        /**
         * Возвращает причину отклонения по ее текстовому представлению
         *
         * @param v текстовое представление
         * @return причина отклонения
         */
        public static RejectCode fromValue(String v) {
            return valueOf(v);
        }

        /**
         * Причина в виде строки
         *
         * @return строковое представление причины отклонения
         */
        public String value() {
            return name();
        }

    }

    public static final class Reject {
        /**
         * Код причины отклонения
         */
        private final RejectCode statusCode;

        /**
         * Описание причины отклонения
         */
        private final String statusDescription;

        private Reject(RejectCode statusCode, String statusDescription) {
            this.statusCode = statusCode;
            this.statusDescription = statusDescription;
        }

        /**
         * Возвращает код причины отклонения
         *
         * @return код причины отклонения
         */
        public RejectCode getStatusCode() {
            return statusCode;
        }

        /**
         * Возвращает описание причины отклонения
         *
         * @return описание причины отклонения
         */
        public String getStatusDescription() {
            return statusDescription;
        }
    }
}