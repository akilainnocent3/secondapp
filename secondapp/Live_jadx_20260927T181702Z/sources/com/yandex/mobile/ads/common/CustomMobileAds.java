package com.yandex.mobile.ads.common;

import dr.w2;
import k.j0;
import yads.cw2;
import yads.dw2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@j0
final class CustomMobileAds {
    public static void setVideoPoolSize(int i10) {
        Object obj = dw2.f148384j;
        dw2 dw2VarA = cw2.a();
        Integer numValueOf = Integer.valueOf(i10);
        synchronized (obj) {
            dw2VarA.f148393h = numValueOf;
            w2 w2Var = w2.f79517a;
        }
    }
}
