
package com.integriks.smev.nwxRewrite.client.src.serverApi.autogenerated;

import javax.xml.ws.WebFault;
import com.integriks.smev.nwxRewrite.client.src.serverApi.autogenerated.types.fault.SignatureVerificationFault;


/**
 * 
 *                     ЭП-ОВ не прошла проверку.
 *                     Действия клиента: см. описание {urn://x-artefacts-smev-gov-ru/smev-core/client-interaction/types/1.0}SignatureVerificationFault.
 *                 
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.0
 * 
 */
@WebFault(name = "SignatureVerificationFault", targetNamespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1")
public class SignatureVerificationFaultException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private SignatureVerificationFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public SignatureVerificationFaultException(String message, SignatureVerificationFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public SignatureVerificationFaultException(String message, SignatureVerificationFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.integriks.smev.nwxRewrite.client.src.serverApi.autogenerated.types.fault.SignatureVerificationFault
     */
    public SignatureVerificationFault getFaultInfo() {
        return faultInfo;
    }

}
