package com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.system.processing;


/**
 * Фильтр запрашиваемых сообщений
 */
public class QueryInformation extends ProcessingInformation {

    /**
     * Пространство имен (первая часть фильтра запросов)
     */
    private String namespaceURI;

    /**
     * Имя корневого элемента (вторая часть фильтра запросов)
     */
    private String rootElementLocalName;

    /**
     * Конструктор
     *
     * @param nodeId               идентификатор узла СМЭВ
     * @param namespaceURI         пространство имен (первая часть фильтра запросов)
     * @param rootElementLocalName имя корневого элемента (вторая часть фильтра запросов)
     * @param type                 тип сообщения
     */
    public QueryInformation(String nodeId, String namespaceURI, String rootElementLocalName, Type type) {
        super(nodeId, type);
        this.namespaceURI = namespaceURI;
        this.rootElementLocalName = rootElementLocalName;
    }


    /**
     * Возвращает пространство имен
     *
     * @return пространство имен
     */
    public String getNamespaceURI() {
        return namespaceURI;
    }

    /**
     * Возвращает имя корневого элемента
     *
     * @return имя корневого элемента
     */
    public String getRootElementLocalName() {
        return rootElementLocalName;
    }

}
