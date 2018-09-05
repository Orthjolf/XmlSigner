package com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.system.processing;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Матаданные сообщения-запроса
 */
public class RequestInformation extends ProcessingInformation {

    /**
     * True - тестовое сообщение, иначе - false
     */
    private boolean testMessage;

    /**
     * Дата и время до которого необходимо обработать сообщение
     */
    private XMLGregorianCalendar eol;

    /**
     * Конструктор
     *
     * @param eol    дата и время до которого необходимо обработать сообщение
     * @param nodeId удентификатор узла СМЭВ
     */
    public RequestInformation(XMLGregorianCalendar eol, String nodeId) {
        this(eol, nodeId, false);
    }

    /**
     * Конструктор
     *
     * @param eol         дата и время до которого необходимо обработать сообщение
     * @param nodeId      удентификатор узла СМЭВ
     * @param testMessage флаг тестового сообщения
     */
    public RequestInformation(XMLGregorianCalendar eol, String nodeId, boolean testMessage) {
        super(nodeId, Type.REQUEST);
        this.eol = eol;
        this.testMessage = testMessage;
    }

    /**
     * Возвращает дату и время до которого необходимо обработать сообщение
     *
     * @return дату и время до которого необходимо обработать сообщение
     */
    public XMLGregorianCalendar getEol() {
        return eol;
    }


    /**
     * True - тестовое сообщение, иначе - false
     *
     * @return тестовое-ли сообщение
     */
    public boolean isTestMessage() {
        return testMessage;
    }

}
