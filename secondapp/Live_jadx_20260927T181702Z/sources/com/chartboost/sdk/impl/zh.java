package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zh implements yh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f41760a;

    public zh(AtomicReference sdkConfiguration) {
        kotlin.jvm.internal.m0.p(sdkConfiguration, "sdkConfiguration");
        this.f41760a = sdkConfiguration;
    }

    @Override // com.chartboost.sdk.impl.yh
    public List a(k7.b eventType) {
        kotlin.jvm.internal.m0.p(eventType, "eventType");
        mg mgVar = (mg) this.f41760a.get();
        List listB = mgVar != null ? mgVar.b() : null;
        List listJ = (listB == null || listB.isEmpty()) ? fr.h0.J() : a(listB, eventType);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
            if (!cv.p0.O3(((vh) obj).d())) {
                arrayList.add(obj);
            }
        }
        return (arrayList.isEmpty() && eventType == k7.b.INITIALIZATION) ? fr.g0.l(n7.f40115a.a()) : arrayList;
    }

    public final List a(List list, k7.b bVar) {
        ArrayList<k7> arrayList = new ArrayList();
        for (Object obj : list) {
            if (cv.k0.c2(((k7) obj).d(), bVar.b(), true)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(fr.i0.d0(arrayList, 10));
        for (k7 k7Var : arrayList) {
            String strE = k7Var.e();
            String strC = k7Var.c();
            String strA = k7Var.a();
            if (strA == null || strA.length() <= 0) {
                strA = null;
            }
            arrayList2.add(new vh(strE, strC, strA, k7Var.b()));
        }
        return arrayList2;
    }
}
