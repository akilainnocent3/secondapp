package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Element;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class qi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qi f40641a = new qi();

    public final pi a(Element element) {
        String string;
        kotlin.jvm.internal.m0.p(element, "element");
        String strB = ml.f40060a.b(element, "idRegistry");
        String textContent = element.getTextContent();
        if (textContent == null || (string = cv.p0.b6(textContent).toString()) == null || string.length() <= 0) {
            string = null;
        }
        return new pi(strB, string);
    }

    public final List b(Element parentElement) {
        pi piVarA;
        kotlin.jvm.internal.m0.p(parentElement, "parentElement");
        List listD = ml.f40060a.d(parentElement, "UniversalAdId");
        ArrayList arrayList = new ArrayList();
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            try {
                piVarA = f40641a.a((Element) it.next());
            } catch (Exception e10) {
                sb.b("Failed to parse UniversalAdId element: " + e10.getMessage(), e10);
                piVarA = null;
            }
            if (piVarA != null) {
                arrayList.add(piVarA);
            }
        }
        return arrayList;
    }
}
