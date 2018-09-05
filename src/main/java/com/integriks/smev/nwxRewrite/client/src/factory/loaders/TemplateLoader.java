package com.integriks.smev.nwxRewrite.client.src.factory.loaders;


import com.integriks.smev.nwxRewrite.client.src.clientApi.services.identification.IdentityService;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.messaging.ExceptionMapper;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.messaging.MessageMapper;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.signature.PostValidationCallback;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.signature.Signer;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.template.LargeAttachmentTemplate;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.template.MTOMAttachmentTemplate;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.template.Template;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.template.WSTemplate;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.template.configuration.*;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport.GeoMessageTransport;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport.LargeAttachmentTransport;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport.MessageTransport;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport.configuration.LargeAttachmentTransportConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.validation.Validator;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVRuntimeException;

/**
 * The interface Template loader.
 */
public interface TemplateLoader {
    <T extends WSTemplateConfiguration> WSTemplate getWsTemplate(Signer signer,
                                                                 Validator validator,
                                                                 MessageMapper mapper,
                                                                 MessageTransport transport,
                                                                 ExceptionMapper manager,
                                                                 LargeAttachmentTransport atransport,
                                                                 T config) throws SMEVRuntimeException;

    <T extends WSTemplateConfiguration> WSTemplate getWsTemplate(Signer signer,
                                                                 Validator validator,
                                                                 MessageMapper mapper,
                                                                 MessageTransport transport,
                                                                 ExceptionMapper manager,
                                                                 LargeAttachmentTransport atransport,
                                                                 T config,
                                                                 PostValidationCallback postValidationCallback)
            throws SMEVRuntimeException;

    <T extends GeoTemplateConfiguration> WSTemplate getWsTemplate(Signer signer,
                                                                  Validator validator,
                                                                  MessageMapper mapper,
                                                                  GeoMessageTransport transport,
                                                                  ExceptionMapper manager,
                                                                  LargeAttachmentTransport atransport,
                                                                  T config) throws SMEVRuntimeException;

    <T extends GeoTemplateConfiguration> WSTemplate getWsTemplate(Signer signer,
                                                                  Validator validator,
                                                                  MessageMapper mapper,
                                                                  GeoMessageTransport transport,
                                                                  ExceptionMapper manager,
                                                                  LargeAttachmentTransport atransport,
                                                                  T config,
                                                                  PostValidationCallback postValidationCallback)
            throws SMEVRuntimeException;

    /**
     * Gets large attachments template.
     *
     * @param <T>    the type parameter
     * @param config the config
     * @return the large attachments template
     * @throws SMEVRuntimeException the smev runtime exception
     */
    <T extends LargeAttachmentTemplateConfiguration> LargeAttachmentTemplate getLargeAttachmentsTemplate(T config) throws SMEVRuntimeException;

    /**
     * Gets ws template.
     *
     * @param <T>    the type parameter
     * @param config the config
     * @return the ws template
     * @throws SMEVRuntimeException the smev runtime exception
     */
    <T extends WSTemplateConfiguration> WSTemplate getWsTemplate(T config) throws SMEVRuntimeException;

    <T extends LargeAttachmentTemplateConfiguration> LargeAttachmentTemplate getLargeAttachmentsTemplate(Signer signer, IdentityService identificationService, LargeAttachmentTransport largeAttachmentTransport);

    /**
     * Gets large attachment transport template.
     *
     * @param <T>    the type parameter
     * @param config the config
     * @return the large attachment transport template
     * @throws SMEVRuntimeException the smev runtime exception
     */
    <T extends LargeAttachmentTransportConfiguration> LargeAttachmentTransport getLargeAttachmentTransportTemplate(T config) throws SMEVRuntimeException;

    /**
     * Gets mtom template.
     *
     * @param <T>    the type parameter
     * @param config the config
     * @return the mtom template
     * @throws SMEVRuntimeException the smev runtime exception
     */
    <T extends MTOMAttachmentTemplateConfiguration> MTOMAttachmentTemplate getMTOMTemplate(T config) throws SMEVRuntimeException;

    <T extends MTOMAttachmentTemplateConfiguration> MTOMAttachmentTemplate getMTOMTemplate(Signer signer, IdentityService identificationService);

    /**
     * Gets template.
     *
     * @param <T>    the type parameter
     * @param config the config
     * @return the template
     * @throws SMEVRuntimeException the smev runtime exception
     */
    <T extends TemplateConfiguration> Template getTemplate(T config) throws SMEVRuntimeException;

    <T extends GeoTemplateConfiguration> Template getTemplate(T config) throws SMEVRuntimeException;
}
