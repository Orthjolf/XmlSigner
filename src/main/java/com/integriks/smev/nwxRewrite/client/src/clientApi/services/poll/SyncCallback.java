package com.integriks.smev.nwxRewrite.client.src.clientApi.services.poll;

public interface SyncCallback<Response> {

    void event(SyncAdapter.Event event);

    void received(Response message);

    Response getResponse();
}
