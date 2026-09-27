package com.chartboost.sdk.impl;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ml f40060a = new ml();

    public final List a(Element element, String tagName) {
        kotlin.jvm.internal.m0.p(element, "<this>");
        kotlin.jvm.internal.m0.p(tagName, "tagName");
        ArrayList arrayList = new ArrayList();
        NodeList elementsByTagName = element.getElementsByTagName(tagName);
        int length = elementsByTagName.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            Node nodeItem = elementsByTagName.item(i10);
            if (nodeItem instanceof Element) {
                arrayList.add(nodeItem);
            }
        }
        return arrayList;
    }

    public final String b(Element element, String name) {
        kotlin.jvm.internal.m0.p(element, "<this>");
        kotlin.jvm.internal.m0.p(name, "name");
        if (!element.hasAttribute(name)) {
            return null;
        }
        String attribute = element.getAttribute(name);
        kotlin.jvm.internal.m0.o(attribute, "getAttribute(...)");
        String string = cv.p0.b6(attribute).toString();
        if (string.length() > 0) {
            return string;
        }
        return null;
    }

    public final Element c(Element element, String tagName) {
        kotlin.jvm.internal.m0.p(element, "<this>");
        kotlin.jvm.internal.m0.p(tagName, "tagName");
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem instanceof Element) {
                Element element2 = (Element) nodeItem;
                if (kotlin.jvm.internal.m0.g(element2.getNodeName(), tagName)) {
                    return element2;
                }
            }
        }
        return null;
    }

    public final List d(Element element, String tagName) {
        kotlin.jvm.internal.m0.p(element, "<this>");
        kotlin.jvm.internal.m0.p(tagName, "tagName");
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            Node nodeItem = childNodes.item(i10);
            if ((nodeItem instanceof Element) && kotlin.jvm.internal.m0.g(((Element) nodeItem).getNodeName(), tagName)) {
                arrayList.add(nodeItem);
            }
        }
        return arrayList;
    }

    public final String e(Element element, String tagName) {
        String string;
        kotlin.jvm.internal.m0.p(element, "<this>");
        kotlin.jvm.internal.m0.p(tagName, "tagName");
        NodeList elementsByTagName = element.getElementsByTagName(tagName);
        int length = elementsByTagName.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            Node nodeItem = elementsByTagName.item(i10);
            if (kotlin.jvm.internal.m0.g(nodeItem.getParentNode(), element) && (nodeItem instanceof Element)) {
                Element element2 = (Element) nodeItem;
                if (kotlin.jvm.internal.m0.g(element2.getNodeName(), tagName)) {
                    String textContent = element2.getTextContent();
                    if (textContent == null || (string = cv.p0.b6(textContent).toString()) == null || string.length() <= 0) {
                        return null;
                    }
                    return string;
                }
            }
        }
        return null;
    }

    public final List f(Element element, String tagName) {
        String textContent;
        String string;
        kotlin.jvm.internal.m0.p(element, "<this>");
        kotlin.jvm.internal.m0.p(tagName, "tagName");
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem instanceof Element) {
                Element element2 = (Element) nodeItem;
                if (kotlin.jvm.internal.m0.g(element2.getNodeName(), tagName) && (textContent = element2.getTextContent()) != null && (string = cv.p0.b6(textContent).toString()) != null) {
                    if (string.length() <= 0) {
                        string = null;
                    }
                    if (string != null) {
                        arrayList.add(string);
                    }
                }
            }
        }
        return arrayList;
    }

    public final Object a(String xmlString) {
        kotlin.jvm.internal.m0.p(xmlString, "xmlString");
        try {
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setNamespaceAware(true);
            documentBuilderFactoryNewInstance.setValidating(false);
            Document document = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(new InputSource(new StringReader(xmlString)));
            document.getDocumentElement().normalize();
            dr.i1.a aVar = dr.i1.f79460c;
            return dr.i1.b(document);
        } catch (Exception e10) {
            sb.b("Error parsing XML string.", e10);
            dr.i1.a aVar2 = dr.i1.f79460c;
            return dr.i1.b(dr.j1.a(new ib("Error parsing VAST XML: " + e10.getMessage(), null, 2, null)));
        }
    }
}
