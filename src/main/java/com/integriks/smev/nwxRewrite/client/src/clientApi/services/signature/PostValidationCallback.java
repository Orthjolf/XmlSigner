package com.integriks.smev.nwxRewrite.client.src.clientApi.services.signature;

import org.w3c.dom.Element;

import java.security.cert.X509Certificate;

public interface PostValidationCallback {
    void validate(X509Certificate certificate, Element signature, Element content);
}
