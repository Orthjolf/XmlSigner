package com.integriks.smev.nwxRewrite.client.src.factory.loaders;


import com.integriks.smev.nwxRewrite.client.src.clientApi.services.transaction.TransactionService;
import com.integriks.smev.nwxRewrite.client.src.clientApi.services.transaction.configuration.TxConfiguration;

/**
 * The interface Transaction loader.
 */
public interface TransactionLoader {
    /**
     * Gets transaction service.
     *
     * @param <T>    the type parameter
     * @param config the config
     * @return the transaction service
     */
    <T extends TxConfiguration> TransactionService getTransactionService(T config);
}
