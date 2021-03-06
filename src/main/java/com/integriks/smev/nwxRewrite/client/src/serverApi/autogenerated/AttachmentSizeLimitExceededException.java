
package com.integriks.smev.nwxRewrite.client.src.serverApi.autogenerated;

import javax.xml.ws.WebFault;
import com.integriks.smev.nwxRewrite.client.src.serverApi.autogenerated.types.fault.AttachmentSizeLimitExceeded;


/**
 * 
 *                     Суммарный размер вложений превысил предел, установленный правилами СМЭВ.
 *                 
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.0
 * 
 */
@WebFault(name = "AttachmentSizeLimitExceeded", targetNamespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1")
public class AttachmentSizeLimitExceededException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private AttachmentSizeLimitExceeded faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public AttachmentSizeLimitExceededException(String message, AttachmentSizeLimitExceeded faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public AttachmentSizeLimitExceededException(String message, AttachmentSizeLimitExceeded faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.integriks.smev.nwxRewrite.client.src.serverApi.autogenerated.types.fault.AttachmentSizeLimitExceeded
     */
    public AttachmentSizeLimitExceeded getFaultInfo() {
        return faultInfo;
    }

}
