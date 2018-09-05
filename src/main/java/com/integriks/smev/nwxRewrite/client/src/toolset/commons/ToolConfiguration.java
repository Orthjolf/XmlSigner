package com.integriks.smev.nwxRewrite.client.src.toolset.commons;

import com.integriks.smev.nwxRewrite.client.src.clientApi.services.admin.configuration.AdminServiceConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.identification.configuration.IdentityServiceConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.messaging.configuration.MessageGenerationConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.signature.configuration.SignerConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.template.configuration.GeoTemplateConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.template.configuration.TemplateConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.transaction.configuration.TxConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport.configuration.GeoMessageTransportConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport.configuration.LargeAttachmentTransportConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport.configuration.MessageTransportConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport.configuration.TransportEndpointConfiguration;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.validation.configuration.ValidatorConfiguration;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Вспомогательный класс для загрузки конфигурации сервисов
 * Потоконебезопасный
 */
public final class ToolConfiguration {

    /**
     * Настройки из файла по-умолчанию
     */
    private static ToolConfiguration DEFAULT_INSTANCE;

    /**
     * Загруженные настройки
     */
    private Properties properties;

    /**
     * Конфигурация сервиса транзакций
     */
    private TxConfiguration txConfiguration;

    /**
     * Конфигурация крипто-сервиса
     */
    private SignerConfiguration signerConfiguration;

    /**
     * Конфигурация шаблона
     */
    private TemplateConfiguration templateConfiguration;

    private GeoTemplateConfiguration geoTemplateConfiguration;

    /**
     * Конфигурация транспорта сообщений
     */
    private MessageTransportConfiguration transportConfiguration;

    private GeoMessageTransportConfiguration geoTransportConfiguration;

    private AdminServiceConfiguration adminServiceConfiguration;

    /**
     * Конфигурация сервиса передачи больших файлов
     */
    private LargeAttachmentTransportConfiguration largeAttachmentTransportConfiguration;

    /**
     * Возвращает конфигурацию, загруженную из файла по умолчанию
     *
     * @return конфигурацию по умолчанию
     */
    public static ToolConfiguration getDefault() {
        if (DEFAULT_INSTANCE == null) {
            InputStream inputStream = null;
            try {
                inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("/config.properties");
                if (inputStream == null) {
                    throw new IllegalArgumentException("Не удается открыть файл настроек");
                }
                DEFAULT_INSTANCE = new ToolConfiguration(inputStream);
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception ex) {
                        //ignore
                    }
                }
            }
        }
        return DEFAULT_INSTANCE;
    }

    /**
     * Загружает настройки из указанного потока
     *
     * @param inputStream входной поток с настройками
     */
    private ToolConfiguration(InputStream inputStream) {
        try {
            properties = new Properties();
            properties.load(inputStream);
        } catch (IOException ex) {
            properties = null;
            throw new IllegalArgumentException("Не удалось считать настройки из указанного потока", ex);
        }
    }

    public GeoTemplateConfiguration getGeoTemplateConfiguration() {
        if (geoTemplateConfiguration == null) {
            final boolean logOutput = getBoolean("template.log.output");
            final boolean logInput = getBoolean("template.log.input");
            final boolean validateOutput = getBoolean("template.validate.output");
            final boolean validateInput = getBoolean("template.validate.input");
            final boolean validateSmevSignature = getBoolean("template.validate.smev.signature");
            final String localStorage = properties.getProperty("template.local.storage");

            final String list = getString("transport.list");
            if (list == null) {
                return null;
            }
            geoTemplateConfiguration = new GeoTemplateConfiguration() {
                @Override
                public GeoMessageTransportConfiguration getGeoMessageTransportConfiguration() {
                    return ToolConfiguration.this.getGeoMessageTransportConfiguration();
                }

                @Override
                public IdentityServiceConfiguration getIdentityConfig() {
                    return ToolConfiguration.this.getIdentityConfiguration();
                }

                @Override
                public SignerConfiguration getSignerConfig() {
                    return ToolConfiguration.this.getSignerConfiguration();
                }

                @Override
                public ValidatorConfiguration getValidatorConfig() {
                    return ToolConfiguration.this.getValidatorConfiguration();
                }

                @Override
                public MessageGenerationConfiguration getMessageGenerationConfig() {
                    return ToolConfiguration.this.getMessageGenerationConfiguration();
                }

                @Override
                public LargeAttachmentTransportConfiguration getLargeAttachmentTransportConfig() {
                    return ToolConfiguration.this.getLargeAttachmentTransportConfiguration();
                }

                @Override
                public boolean getLoggingOutput() {
                    return logOutput;
                }

                @Override
                public boolean getValidateOutput() {
                    return validateOutput;
                }

                @Override
                public boolean getValidateInput() {
                    return validateInput;
                }

                @Override
                public boolean getLoggingInput() {
                    return logInput;
                }

                @Override
                public boolean getValidateSMEVSignature() {
                    return validateSmevSignature;
                }

                @Override
                public String getLocalStorage() {
                    return localStorage;
                }
            };
        }
        return geoTemplateConfiguration;
    }

    /**
     * Возвращает конфигурацию шаблона взаимодействия со СМЭВ
     *
     * @return настройки шаблона
     */
    public TemplateConfiguration getTemplateConfiguration() {
        if (templateConfiguration == null) {
            final boolean logOutput = getBoolean("template.log.output");
            final boolean logInput = getBoolean("template.log.input");
            final boolean validateOutput = getBoolean("template.validate.output");
            final boolean validateInput = getBoolean("template.validate.input");
            final boolean validateSmevSignature = getBoolean("template.validate.smev.signature");
            final String localStorage = properties.getProperty("template.local.storage");
            templateConfiguration = new TemplateConfiguration() {
                @Override
                public IdentityServiceConfiguration getIdentityConfig() {
                    return ToolConfiguration.this.getIdentityConfiguration();
                }

                @Override
                public SignerConfiguration getSignerConfig() {
                    return ToolConfiguration.this.getSignerConfiguration();
                }

                @Override
                public ValidatorConfiguration getValidatorConfig() {
                    return ToolConfiguration.this.getValidatorConfiguration();
                }

                @Override
                public MessageGenerationConfiguration getMessageGenerationConfig() {
                    return ToolConfiguration.this.getMessageGenerationConfiguration();
                }

                @Override
                public LargeAttachmentTransportConfiguration getLargeAttachmentTransportConfig() {
                    return ToolConfiguration.this.getLargeAttachmentTransportConfiguration();
                }

                @Override
                public boolean getLoggingOutput() {
                    return logOutput;
                }

                @Override
                public boolean getValidateOutput() {
                    return validateOutput;
                }

                @Override
                public boolean getValidateInput() {
                    return validateInput;
                }

                @Override
                public boolean getLoggingInput() {
                    return logInput;
                }

                @Override
                public boolean getValidateSMEVSignature() {
                    return validateSmevSignature;
                }

                @Override
                public String getLocalStorage() {
                    return localStorage;
                }

                @Override
                public MessageTransportConfiguration getMessageTransportConfiguration() {
                    return ToolConfiguration.this.getMessageTransportConfiguration();
                }
            };
        }
        return templateConfiguration;
    }

    private MessageTransportConfiguration getMessageTransportConfiguration() {
        if (transportConfiguration == null) {
            final String url = getString("transport.url");
            final int timeout = getInt("transport.timeout", "", 1000);
            transportConfiguration = new TransportConfigurationImpl(url, timeout);
        }
        return transportConfiguration;
    }

    private GeoMessageTransportConfiguration getGeoMessageTransportConfiguration() {
        if (geoTransportConfiguration == null) {
            final String list = getString("transport.list");
            if (list == null || list.isEmpty()) {
                throw new RuntimeException("Список транспортов не должен быть пустым");
            }
            final GeoTransportConfigurationImpl impl = new GeoTransportConfigurationImpl();
            this.geoTransportConfiguration = impl;
            final String[] ids = list.split(",");
            for (String id : ids) {
                id = id.trim();
                final String url = getString("transport." + id + ".url");
                final Integer timeout = getInt("transport." + id + ".timeout", "", 1000);
                final Integer retries = getInt("transport." + id + ".retries", "", 1);
                impl.list.add(new TransportEndpointConfigurationImpl(id, url, timeout, retries));
            }
        }
        return geoTransportConfiguration;
    }

    /**
     * Возвращает конфигурацию транспорта больших файлов-вложений
     *
     * @return настройки сервиса передачи больших файлов
     */
    public LargeAttachmentTransportConfiguration getLargeAttachmentTransportConfiguration() {
        if (largeAttachmentTransportConfiguration == null) {
            final String address = getString("large.attachment.transport.address");
            final String login = getString("large.attachment.transport.login");
            final String password = getString("large.attachment.transport.password");
            final int retries = getInt("large.attachment.transport.retries", "Колличество попыток передачи больших файлов", 3);
            final int timeout = getInt("large.attachment.transport.timeout", "Таймаут передачи больших файлов", 3000);
            largeAttachmentTransportConfiguration = new LargeAttachmentTransportConfiguration() {
                @Override
                public String getAddress() {
                    return address;
                }

                @Override
                public String getLogin() {
                    return login;
                }

                @Override
                public String getPass() {
                    return password;
                }

                @Override
                public int getMaxAttempts() {
                    return retries;
                }

                @Override
                public int getTimeout() {
                    return timeout;
                }
            };
        }
        return largeAttachmentTransportConfiguration;
    }

    /**
     * Возвращает конфигурацию сервиса генерации сообщений
     *
     * @return настройки сервиса
     */
    public MessageGenerationConfiguration getMessageGenerationConfiguration() {
        return null;
    }

    /**
     * Возвращает конфигурацию генератора идентификаторов
     *
     * @return настройки сервиса
     */
    public IdentityServiceConfiguration getIdentityConfiguration() {
        return null;
    }

    /**
     * Возвращает настройки крипто-сервиса
     *
     * @return настройки крипто-сервиса
     */
    public SignerConfiguration getSignerConfiguration() {
        if (signerConfiguration == null) {
            final String providerName = getString("signer.provider");
            final String certificateAlias = getString("signer.certificate.alias");
            final String privateKeyAlias = getString("signer.private.key.alias");
            final String privateKeyPassword = getString("signer.private.key.password");
            final File smevCertificateStore = getFile("signer.smev.certificate.store");
            signerConfiguration = new SignerConfiguration() {
                @Override
                public String getProviderName() {
                    return providerName;
                }

                @Override
                public String getCertificateAlias() {
                    return certificateAlias;
                }

                @Override
                public String getPrivateKeyAlias() {
                    return privateKeyAlias;
                }

                @Override
                public String getPrivateKeyPassword() {
                    return privateKeyPassword;
                }

                @Override
                public File getSMEVFileCertificateStore() {
                    return smevCertificateStore;
                }
            };
        }
        return signerConfiguration;
    }

    public AdminServiceConfiguration getAdminServiceConfiguration() {
        if (adminServiceConfiguration == null) {
            final String url = getString("adminservice.url");
            final int timeout = getInt("adminservice.timeout", "", 1000);
            adminServiceConfiguration = new AdminServiceConfiguration() {
                @Override
                public String getUrl() {
                    return url;
                }

                @Override
                public int getTimeout() {
                    return timeout;
                }

                @Override
                public IdentityServiceConfiguration getIdentityConfig() {
                    return new IdentityServiceConfigurationStub();
                }

                @Override
                public SignerConfiguration getSignerConfig() {
                    return getSignerConfiguration();
                }
            };
        }
        return adminServiceConfiguration;
    }

    /**
     * Gets validator configuration.
     *
     * @return the validator configuration
     */
    public ValidatorConfiguration getValidatorConfiguration() {
        return null;
    }

    private File getFile(String code) {
        String str = properties.getProperty(code);
        if (str == null) {
            return null;
        }
        return new File(str);
    }

    private String getString(String code) {
        String result = properties.getProperty(code);
        if (result == null) {
            throw new IllegalStateException("Не указан параметр конфигурации: " + code);
        }
        return result;
    }

    private Integer getInt(String code, String description, Integer defaultValue) {
        String str = properties.getProperty(code);
        if (str == null) {
            return defaultValue;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException ex) {
            throw new IllegalStateException("Неверен параметр конфигурации: " + description, ex);
        }
    }

    private URL getUrl(String code, String description) {
        try {
            return new URL(properties.getProperty(code));
        } catch (MalformedURLException ex) {
            throw new IllegalStateException("Неверен параметр конфигурации: " + description, ex);
        }
    }

    private boolean getBoolean(String code) {
        return "1".equals(properties.getProperty(code));
    }

    private static final class IdentityServiceConfigurationStub
            implements IdentityServiceConfiguration {
    }

    private static final class TransportConfigurationImpl implements MessageTransportConfiguration {
        private final String url;
        private final int timeout;

        private TransportConfigurationImpl(String url, int timeout) {
            this.url = url;
            this.timeout = timeout;
        }

        @Override
        public String getUrl() {
            return url;
        }

        @Override
        public int getTimeout() {
            return timeout;
        }
    }

    private static final class GeoTransportConfigurationImpl implements GeoMessageTransportConfiguration {
        private final List<TransportEndpointConfiguration> list = new ArrayList<>();

        @Override
        public List<TransportEndpointConfiguration> getEndpointConfigurations() {
            return list;
        }
    }

    private static final class TransportEndpointConfigurationImpl implements TransportEndpointConfiguration {

        private final String id;
        private final String url;
        private final int timeout;
        private final int retries;

        private TransportEndpointConfigurationImpl(String id, String url, int timeout, int retries) {
            this.id = id;
            this.url = url;
            this.timeout = timeout;
            this.retries = retries;
        }

        @Override
        public int getRetries() {
            return retries;
        }

        @Override
        public String getId() {
            return id;
        }

        @Override
        public String getUrl() {
            return url;
        }

        @Override
        public int getTimeout() {
            return timeout;
        }
    }
}
