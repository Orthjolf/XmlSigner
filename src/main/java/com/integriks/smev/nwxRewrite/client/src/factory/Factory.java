package com.integriks.smev.nwxRewrite.client.src.factory;

import com.integriks.smev.nwxRewrite.client.src.clientApi.services.admin.AdminService;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.admin.configuration.AdminServiceConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.identification.IdentityService;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.identification.configuration.IdentityServiceConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.messaging.ExceptionMapper;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.messaging.MessageMapper;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.messaging.configuration.MessageGenerationConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.signature.Signer;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.signature.configuration.SignerConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.template.LargeAttachmentTemplate;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.template.MTOMAttachmentTemplate;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.template.Template;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.template.WSTemplate;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.template.configuration.*;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.transaction.TransactionService;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.transaction.configuration.TxConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport.GeoMessageTransport;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport.LargeAttachmentTransport;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport.MessageTransport;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport.configuration.GeoMessageTransportConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport.configuration.LargeAttachmentTransportConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport.configuration.MessageTransportConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.validation.Validator;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.validation.configuration.ValidatorConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.types.exception.SMEVRuntimeException;
import com.integriks.smev.nwxRewrite.client.src.factory.loaders.*;

import java.util.ServiceLoader;

/**
 * The type Factory.
 */
public class Factory {

    /**
     * Gets admin instance.
     *
     * @param config the config
     * @return the admin instance
     * @throws SMEVRuntimeException the smev runtime exception
     */
    public static AdminService getAdminInstance(AdminServiceConfiguration config) throws SMEVRuntimeException {
        ServiceLoader<AdminLoader> loaders = ServiceLoader.load(AdminLoader.class);
        for (AdminLoader loader : loaders) {
            return loader.getAdmin(config);
        }
        throw new SMEVRuntimeException("Unable to load admin implementation");
    }

    /**
     * Gets signer instance.
     *
     * @param config the config
     * @return the signer instance
     * @throws SMEVRuntimeException the smev runtime exception
     */
    public static Signer getSignerInstance(SignerConfiguration config) throws SMEVRuntimeException {
        ServiceLoader<SignerLoader> services = ServiceLoader.load(SignerLoader.class);
        for (SignerLoader loader : services) {
            return loader.getSigner(config);
        }
        throw new SMEVRuntimeException("Unable to load signer implementation");
    }

    /**
     * Gets identity generator instance.
     *
     * @param config the config
     * @return the identity generator instance
     * @throws SMEVRuntimeException the smev runtime exception
     */
    public static IdentityService getIdentityGeneratorInstance(IdentityServiceConfiguration config) throws SMEVRuntimeException {
        ServiceLoader<IdentityLoader> services = ServiceLoader.load(IdentityLoader.class);
        for (IdentityLoader loader : services) {
            return loader.getIdentity(config);
        }
        throw new SMEVRuntimeException("Unable to load identity generator implementation");
    }

    /**
     * Gets validator instance.
     *
     * @param config the config
     * @return the validator instance
     * @throws SMEVRuntimeException the smev runtime exception
     */
    public static Validator getValidatorInstance(ValidatorConfiguration config) throws SMEVRuntimeException {
        ServiceLoader<ValidatorLoader> services = ServiceLoader.load(ValidatorLoader.class);
        for (ValidatorLoader loader : services) {
            return loader.getValidator(config);
        }
        throw new SMEVRuntimeException("Unable to load validator implementation");
    }

    /**
     * Gets message mapper instance.
     *
     * @param config the config
     * @return the message mapper instance
     * @throws SMEVRuntimeException the smev runtime exception
     */
    public static MessageMapper getMessageMapperInstance(MessageGenerationConfiguration config) throws SMEVRuntimeException {
        ServiceLoader<TypesMapperLoader> services = ServiceLoader.load(TypesMapperLoader.class);
        for (TypesMapperLoader loader : services) {
            return loader.getMessageMapper(config);
        }
        throw new SMEVRuntimeException("Unable to load Message mapper implementation");
    }

    /**
     * Gets exception mapper instance.
     *
     * @param config the config
     * @return the exception mapper instance
     * @throws SMEVRuntimeException the smev runtime exception
     */
    public static ExceptionMapper getExceptionMapperInstance(MessageGenerationConfiguration config) throws SMEVRuntimeException {
        ServiceLoader<TypesMapperLoader> services = ServiceLoader.load(TypesMapperLoader.class);
        for (TypesMapperLoader loader : services) {
            return loader.getExceptionMapper(config);
        }
        throw new SMEVRuntimeException("Unable to load Message mapper implementation");
    }

    /**
     * Gets message transport instance.
     *
     * @param config the config
     * @return the message transport instance
     * @throws SMEVRuntimeException the smev runtime exception
     */
    public static MessageTransport getMessageTransportInstance(MessageTransportConfiguration config) throws SMEVRuntimeException {
        ServiceLoader<TransportLoader> services = ServiceLoader.load(TransportLoader.class);
        for (TransportLoader loader : services) {
            return loader.getTransportInstance(config);
        }
        throw new SMEVRuntimeException("Unable to load Message transport implementation");
    }

    public static GeoMessageTransport getMessageTransportInstance(GeoMessageTransportConfiguration config) throws SMEVRuntimeException {
        ServiceLoader<TransportLoader> services = ServiceLoader.load(TransportLoader.class);
        for (TransportLoader loader : services) {
            return loader.getTransportInstance(config);
        }
        throw new SMEVRuntimeException("Unable to load Message transport implementation");
    }

    /**
     * Gets ws template instance.
     *
     * @param config the config
     * @return the ws template instance
     * @throws SMEVRuntimeException the smev runtime exception
     */
    public static WSTemplate getWsTemplateInstance(WSTemplateConfiguration config) throws SMEVRuntimeException {
        ServiceLoader<TemplateLoader> services = ServiceLoader.load(TemplateLoader.class);
        for (TemplateLoader loader : services) {
            return loader.getWsTemplate(config);
        }
        throw new SMEVRuntimeException("Unable to load ws template implementation");
    }

    /**
     * @param signer
     * @param validator
     * @param mapper
     * @param transport
     * @param manager
     * @param atransport
     * @return
     * @throws SMEVRuntimeException
     */
    public static WSTemplate getWsTemplateInstance(Signer signer,
                                                   Validator validator,
                                                   MessageMapper mapper,
                                                   MessageTransport transport,
                                                   ExceptionMapper manager,
                                                   LargeAttachmentTransport atransport,
                                                   WSTemplateConfiguration configuration) throws SMEVRuntimeException {
        ServiceLoader<TemplateLoader> services = ServiceLoader.load(TemplateLoader.class);
        for (TemplateLoader loader : services) {
            return loader.getWsTemplate(signer, validator, mapper, transport, manager, atransport, configuration);
        }
        throw new SMEVRuntimeException("Unable to load ws template implementation");

    }

    public static WSTemplate getWsTemplateInstance(Signer signer,
                                                   Validator validator,
                                                   MessageMapper mapper,
                                                   GeoMessageTransport transport,
                                                   ExceptionMapper manager,
                                                   LargeAttachmentTransport atransport,
                                                   GeoTemplateConfiguration configuration) throws SMEVRuntimeException {
        ServiceLoader<TemplateLoader> services = ServiceLoader.load(TemplateLoader.class);
        for (TemplateLoader loader : services) {
            return loader.getWsTemplate(signer, validator, mapper, transport, manager, atransport, configuration);
        }
        throw new SMEVRuntimeException("Unable to load ws template implementation");

    }
    /**
     * Gets template instance.
     *
     * @param config the config
     * @return the template instance
     * @throws SMEVRuntimeException the smev runtime exception
     */
    public static Template getTemplateInstance(TemplateConfiguration config) throws SMEVRuntimeException {
        ServiceLoader<TemplateLoader> services = ServiceLoader.load(TemplateLoader.class);
        for (TemplateLoader loader : services) {
            return loader.getTemplate(config);
        }
        throw new SMEVRuntimeException("Unable to load ws template implementation");
    }

    public static Template getTemplateInstance(GeoTemplateConfiguration config) throws SMEVRuntimeException {
        ServiceLoader<TemplateLoader> services = ServiceLoader.load(TemplateLoader.class);
        for (TemplateLoader loader : services) {
            return loader.getTemplate(config);
        }
        throw new SMEVRuntimeException("Unable to load ws template implementation");
    }

    /**
     * Gets large attachment template instance.
     *
     * @param config the config
     * @return the large attachment template instance
     * @throws SMEVRuntimeException the smev runtime exception
     */
    public static LargeAttachmentTemplate getLargeAttachmentTemplateInstance(LargeAttachmentTemplateConfiguration config) throws SMEVRuntimeException {
        ServiceLoader<TemplateLoader> services = ServiceLoader.load(TemplateLoader.class);
        for (TemplateLoader loader : services) {
            return loader.getLargeAttachmentsTemplate(config);
        }
        throw new SMEVRuntimeException("Unable to load ws template implementation");
    }

    /**
     * Gets large attachment template instance.
     *
     * @return the large attachment template instance
     * @throws SMEVRuntimeException the smev runtime exception
     */
    public static LargeAttachmentTemplate getLargeAttachmentTemplateInstance(Signer signer, IdentityService identificationService, LargeAttachmentTransport largeAttachmentTransport) throws SMEVRuntimeException {
        ServiceLoader<TemplateLoader> services = ServiceLoader.load(TemplateLoader.class);
        for (TemplateLoader loader : services) {
            return loader.getLargeAttachmentsTemplate(signer, identificationService, largeAttachmentTransport);
        }
        throw new SMEVRuntimeException("Unable to load ws template implementation");
    }

    /**
     * Gets mtom attachment template instance.
     *
     * @param config the config
     * @return the mtom attachment template instance
     * @throws SMEVRuntimeException the smev runtime exception
     */
    public static MTOMAttachmentTemplate getMTOMAttachmentTemplateInstance(MTOMAttachmentTemplateConfiguration config) throws SMEVRuntimeException {
        ServiceLoader<TemplateLoader> services = ServiceLoader.load(TemplateLoader.class);
        for (TemplateLoader loader : services) {
            return loader.getMTOMTemplate(config);
        }
        throw new SMEVRuntimeException("Unable to load ws template implementation");
    }

    /**
     * @param signer
     * @param identificationService
     * @return
     * @throws SMEVRuntimeException
     */
    public static MTOMAttachmentTemplate getMTOMAttachmentTemplateInstance(Signer signer, IdentityService identificationService) throws SMEVRuntimeException {
        ServiceLoader<TemplateLoader> services = ServiceLoader.load(TemplateLoader.class);
        for (TemplateLoader loader : services) {
            return loader.getMTOMTemplate(signer, identificationService);
        }
        throw new SMEVRuntimeException("Unable to load ws template implementation");
    }

    /**
     * Gets large attachment transport instance.
     *
     * @param config the config
     * @return the large attachment transport instance
     * @throws SMEVRuntimeException the smev runtime exception
     */
    public static LargeAttachmentTransport getLargeAttachmentTransportInstance(LargeAttachmentTransportConfiguration config) throws SMEVRuntimeException {
        ServiceLoader<TemplateLoader> services = ServiceLoader.load(TemplateLoader.class);
        for (TemplateLoader loader : services) {
            return loader.getLargeAttachmentTransportTemplate(config);
        }
        throw new SMEVRuntimeException("Unable to load ws template implementation");
    }

    /**
     * Gets transaction service.
     *
     * @param config the config
     * @return the transaction service
     * @throws SMEVRuntimeException the smev runtime exception
     */
    public static TransactionService getTransactionService(TxConfiguration config) throws SMEVRuntimeException {
        ServiceLoader<TransactionLoader> services = ServiceLoader.load(TransactionLoader.class);
        for (TransactionLoader loader : services) {
            return loader.getTransactionService(config);
        }
        throw new SMEVRuntimeException("Unable to load transaction service implementation");
    }
}
