package com.chartboost.sdk.impl;

import java.util.List;
import org.w3c.dom.Element;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class zj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zj f41766a = new zj();

    public final yj a(Element element) {
        kotlin.jvm.internal.m0.p(element, "element");
        ml mlVar = ml.f40060a;
        String strE = mlVar.e(element, "ClickThrough");
        List listF = mlVar.f(element, "ClickTracking");
        if (strE == null && listF.isEmpty()) {
            return null;
        }
        return new yj(strE, listF);
    }
}
