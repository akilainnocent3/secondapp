package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Element;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class m9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m9 f39996a = new m9();

    public final l9 a(Element element) {
        kotlin.jvm.internal.m0.p(element, "element");
        ml mlVar = ml.f40060a;
        String strE = mlVar.e(element, "IconClickThrough");
        List listF = mlVar.f(element, "IconClickTracking");
        ArrayList arrayList = new ArrayList();
        Element elementC = mlVar.c(element, "IconClickFallbackImages");
        if (elementC != null) {
            Iterator it = mlVar.d(elementC, "IconClickFallbackImage").iterator();
            while (it.hasNext()) {
                k9 k9VarB = f39996a.b((Element) it.next());
                if (k9VarB != null) {
                    arrayList.add(k9VarB);
                }
            }
        }
        if (strE == null && listF.isEmpty() && arrayList.isEmpty()) {
            return null;
        }
        return new l9(strE, listF, arrayList);
    }

    public final k9 b(Element element) {
        ml mlVar = ml.f40060a;
        String strB = mlVar.b(element, "width");
        Integer numP1 = strB != null ? cv.j0.p1(strB) : null;
        String strB2 = mlVar.b(element, "height");
        Integer numP2 = strB2 != null ? cv.j0.p1(strB2) : null;
        String strE = mlVar.e(element, "AltText");
        Element elementC = mlVar.c(element, "StaticResource");
        ch chVarA = elementC != null ? dh.f38555a.a(elementC) : null;
        if (chVarA != null) {
            return new k9(numP1, numP2, strE, chVarA);
        }
        return null;
    }
}
