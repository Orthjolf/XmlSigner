package com.integriks.smev.nwxRewrite.client.src.clientApi.services.poll;

import java.util.concurrent.TimeUnit;


/**
 * Конфигурация синхронного адаптера
 */
public interface SyncAdapterConfig {

    /**
     * Устанавливает интервал проверки получения ответа
     *
     * @param checkInterval     величина интервала
     * @param checkIntervalUnit единица измерения интервала
     * @return текущий объект
     */
    SyncAdapterConfig setCheckInterval(long checkInterval, TimeUnit checkIntervalUnit);

    /**
     * Устанавливает максимальное время ожидания получения ответа
     *
     * @param maxTimeout     величина периода ожидания
     * @param maxTimeoutUnit единица измерения
     * @return текущий объект
     */
    SyncAdapterConfig setMaxTimeout(long maxTimeout, TimeUnit maxTimeoutUnit);

    /**
     * Устанавливает количество потоков, используемых для отправки
     *
     * @param threads количество потоков отправки
     * @return текущий объект
     */
    SyncAdapterConfig setRequestThreads(int threads);

    /**
     * Устанавливает количество потоков опроса
     *
     * @param threads количество потоков опроса
     * @return текущий объект
     */
    SyncAdapterConfig setPollThreads(int threads);

    /**
     * Возвращает интервал проверки получения ответа
     *
     * @return интервал проверки получения ответа
     */
    long getCheckInterval();

    /**
     * Возвращает единицу измерения интервала проверки
     *
     * @return единицу измерения интервала проверки
     */
    TimeUnit getCheckIntervalUnit();

    /**
     * Возвращает максимальное время ожидания получения ответа
     *
     * @return максимальное время ожидания получения ответа
     */
    long getMaxTimeout();

    /**
     * Возвращает единицу измерения максимального времени ожидания ответа
     *
     * @return единицу измерения максимального времени ожидания ответа
     */
    TimeUnit getMaxTimeoutUnit();

    /**
     * Возвращает количество потоков отправки
     *
     * @return количество потоков отправки
     */
    int getRequestThreads();

    /**
     * Возвращает количество потоков опроса
     *
     * @return количество потоков опроса
     */
    int getPollThreads();
}
