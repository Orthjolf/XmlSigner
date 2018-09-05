package com.integriks.smev.controller;

import com.integriks.smev.signUtils.SmevSigner;
import org.apache.commons.text.StringEscapeUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;


@RestController
public class SignController {

    /**
     * Метод для подписания входящих xml запросов в формате https://rm.mfc.ru/issues/9938
     *
     * @param xml - входящий запрос в формате https://rm.mfc.ru/issues/9938
     * @return подписанный запрос в формате https://rm.mfc.ru/issues/9938
     * @throws Exception
     */
    @RequestMapping(value = "/signSoap", method = RequestMethod.POST /*, consumes = "text/xml;charset=UTF-8", produces ="text/xml;charset=UTF-8"*/)
    public ResponseEntity<String> signSoap(@RequestBody String xml) throws Exception {
        final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setIgnoringElementContentWhitespace(true);

        final DocumentBuilder builder = factory.newDocumentBuilder();
        final InputSource source = new InputSource(new StringReader(xml));

        final Document document = builder.parse(source);

        final String body = document.getElementsByTagName("a:SOAP").item(0).getTextContent();
        final String unescapedXml = StringEscapeUtils.unescapeXml(body);

        final SmevSigner signer = new SmevSigner();
        final String result = signer.SignMessage(unescapedXml);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
