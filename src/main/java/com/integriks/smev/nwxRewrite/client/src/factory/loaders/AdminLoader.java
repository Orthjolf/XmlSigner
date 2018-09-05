package com.integriks.smev.nwxRewrite.client.src.factory.loaders;


import com.integriks.smev.nwxRewrite.client.src.clientApi.services.admin.AdminService;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.admin.configuration.AdminServiceConfiguration;

public interface AdminLoader {
    <T extends AdminServiceConfiguration> AdminService getAdmin(T config);
}
