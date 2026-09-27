package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Element;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class al {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final al f38201a = new al();

    public final zk a(Element element) {
        kotlin.jvm.internal.m0.p(element, "element");
        ml mlVar = ml.f40060a;
        return new zk(mlVar.b(element, "id"), mlVar.f(element, "Viewable"), mlVar.f(element, "NotViewable"), mlVar.f(element, "ViewUndetermined"));
    }

    public final List b(Element parentElement) {
        zk zkVarA;
        kotlin.jvm.internal.m0.p(parentElement, "parentElement");
        List listD = ml.f40060a.d(parentElement, "ViewableImpression");
        ArrayList arrayList = new ArrayList();
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            try {
                zkVarA = f38201a.a((Element) it.next());
            } catch (Exception e10) {
                sb.b("Failed to parse ViewableImpression element: " + e10.getMessage(), e10);
                zkVarA = null;
            }
            if (zkVarA != null) {
                arrayList.add(zkVarA);
            }
        }
        return arrayList;
    }
}
