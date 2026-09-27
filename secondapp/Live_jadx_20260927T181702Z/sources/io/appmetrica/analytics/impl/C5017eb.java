package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.eb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5017eb {
    public static final B9 a(C5017eb c5017eb, K9 k10, JSONObject jSONObject) {
        int i10;
        c5017eb.getClass();
        B9 b10 = new B9();
        switch (k10) {
            case UNKNOWN:
                i10 = 0;
                break;
            case APPSFLYER:
                i10 = 1;
                break;
            case ADJUST:
                i10 = 2;
                break;
            case KOCHAVA:
                i10 = 3;
                break;
            case TENJIN:
                i10 = 4;
                break;
            case AIRBRIDGE:
                i10 = 5;
                break;
            case SINGULAR:
                i10 = 6;
                break;
            default:
                throw new dr.o0();
        }
        b10.f95604a = i10;
        b10.f95605b = jSONObject.toString().getBytes(cv.g.f77202b);
        return b10;
    }
}
