
package com.integriks.smev.nwxRewrite.client.src.serverApi.autogenerated;

import javax.xml.ws.WebFault;
import com.integriks.smev.nwxRewrite.client.src.serverApi.autogenerated.types.basic.Void;


/**
 * 
 *                     Идентификатор (UUID), присвоенный сообщению отправителем, содержит старый timestamp.
 *                     Возможно в следующих случаях:
 *                     a) в системе отправителя неверно установлено время.
 *                     Действия клиента: установить в операционной системе реальное время.
 *                     b) в результате очень плохого качества связи, сообщение пытаются отправить в течение двух суток или более.
 *                     Действия клиента: сгенерировать новый UUID, присвоить его сообщению, отправить сообщение.
 *                 
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.0
 * 
 */
@WebFault(name = "StaleMessageId", targetNamespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1")
public class StaleMessageIdException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private Void faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public StaleMessageIdException(String message, Void faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public StaleMessageIdException(String message, Void faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.integriks.smev.nwxRewrite.client.src.serverApi.autogenerated.types.basic.Void
     */
    public Void getFaultInfo() {
        return faultInfo;
    }

}