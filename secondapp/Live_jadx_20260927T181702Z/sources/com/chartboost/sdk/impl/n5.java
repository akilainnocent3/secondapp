package com.chartboost.sdk.impl;

import org.w3c.dom.Element;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class n5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n5 f40111a = new n5();

    public final m5 a(Element element) {
        kotlin.jvm.internal.m0.p(element, "element");
        ml mlVar = ml.f40060a;
        String strB = mlVar.b(element, "type");
        Element elementC = mlVar.c(element, "UniversalAdId");
        return new m5(strB, elementC != null ? qi.f40641a.a(elementC) : null);
    }
}
