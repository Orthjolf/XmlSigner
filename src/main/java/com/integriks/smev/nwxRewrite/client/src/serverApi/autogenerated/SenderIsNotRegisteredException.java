
package com.integriks.smev.nwxRewrite.client.src.serverApi.autogenerated;

import javax.xml.ws.WebFault;
import com.integriks.smev.nwxRewrite.client.src.serverApi.autogenerated.types.basic.Void;


/**
 * 
 *                     Отправитель сообщения не зарегистрирован в СМЭВ.
 *                     Возможная причина - смена X-400 имени при получении нового сертификата.
 *                     Остальные возможные причины - неправильная настройка СМЭВ.
 *                 
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.0
 * 
 */
@WebFault(name = "SenderIsNotRegistered", targetNamespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1")
public class SenderIsNotRegisteredException
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
    public SenderIsNotRegisteredException(String message, Void faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public SenderIsNotRegisteredException(String message, Void faultInfo, Throwable cause) {
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
