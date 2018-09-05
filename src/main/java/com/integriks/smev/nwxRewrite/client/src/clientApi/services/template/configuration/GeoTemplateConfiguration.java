package com.integriks.smev.nwxRewrite.client.src.clientApi.services.template.configuration;

import com.integriks.smev.nwxRewrite.client.src.clientApi.services.transport.configuration.GeoMessageTransportConfiguration;

public interface GeoTemplateConfiguration  extends BaseTemplateConfiguration {
    GeoMessageTransportConfiguration getGeoMessageTransportConfiguration();
}
