package com.integriks.smev.nwxRewrite.client.src.clientApi.types.message.transport;

public final class GeoMessage<With> {
    public final String idTransport;
    public final With content;

    public GeoMessage(String idTransport, With content) {
        this.idTransport = idTransport;
        this.content = content;
    }

    public GeoMessage(With content) {
        this.idTransport = null;
        this.content = content;
    }
}
