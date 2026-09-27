package com.chartboost.sdk.impl;

import org.w3c.dom.Element;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class dh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dh f38555a = new dh();

    public final ch a(Element element) {
        String string;
        kotlin.jvm.internal.m0.p(element, "element");
        String strB = ml.f40060a.b(element, "creativeType");
        String textContent = element.getTextContent();
        if (textContent == null || (string = cv.p0.b6(textContent).toString()) == null || string.length() <= 0) {
            string = null;
        }
        if (string != null) {
            return new ch(strB, string);
        }
        return null;
    }
}
