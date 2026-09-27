package io.appmetrica.analytics.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Ac {
    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    public static final B9 a(Ac ac2, K9 k10, Map map) {
        int i10;
        Object value;
        ac2.getClass();
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
        Bc.f95612b.getClass();
        Set<Map.Entry> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ms.u.u(fr.m1.j(fr.i0.d0(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Object key = entry.getKey();
            if (entry.getValue() instanceof Number) {
                Object value2 = entry.getValue();
                if (value2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Number");
                }
                double dDoubleValue = ((Number) value2).doubleValue();
                if (Double.isInfinite(dDoubleValue) || Double.isNaN(dDoubleValue)) {
                    value = null;
                } else {
                    value = entry.getValue();
                }
            } else {
                value = entry.getValue();
            }
            dr.z0 z0VarA = dr.v1.a(key, value);
            linkedHashMap.put(z0VarA.j(), z0VarA.k());
        }
        String string = new JSONObject(linkedHashMap).toString();
        if (string != null) {
            b10.f95605b = string.getBytes(cv.g.f77202b);
        }
        return b10;
    }
}
