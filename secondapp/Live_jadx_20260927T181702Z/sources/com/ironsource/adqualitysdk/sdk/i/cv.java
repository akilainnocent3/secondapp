package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class cv extends cz {
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Field m1745(List<Object> list) {
        return hu.m2304().m2307().m2253((Class) cz.m1806(list, 0, Class.class), (String) cz.m1806(list, 1, String.class));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Field m1747(List<Object> list) {
        if (!(list.get(0) instanceof Class)) {
            Object objM1806 = cz.m1806(list, 0, Object.class);
            return hu.m2304().m2307().m2255(objM1806.getClass(), (Class) cz.m1806(list, 1, Class.class));
        }
        Class cls = (Class) cz.m1806(list, 0, Class.class);
        if (list.get(1) instanceof Class) {
            return hu.m2304().m2307().m2255(cls, (Class) cz.m1806(list, 1, Class.class));
        }
        return hu.m2304().m2307().m2254(cls, (ho) cz.m1806(list, 1, ho.class));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static List<Field> m1748(List<Object> list) {
        if (!(list.get(0) instanceof Class)) {
            Object objM1806 = cz.m1806(list, 0, Object.class);
            boolean zBooleanValue = list.size() > 1 ? ((Boolean) cz.m1806(list, 1, Boolean.class)).booleanValue() : false;
            hu.m2304().m2307();
            Field[] fieldArrM2250 = hq.m2250(objM1806.getClass(), zBooleanValue, -1, null);
            if (fieldArrM2250 != null) {
                return Arrays.asList(fieldArrM2250);
            }
        } else if (list.size() > 1) {
            return hu.m2304().m2307().m2256((Class) cz.m1806(list, 0, Class.class), (ho) cz.m1806(list, 1, ho.class));
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Field m1749(List<Object> list) {
        return hu.m2304().m2307().m2254((Class) cz.m1806(list, 0, Class.class), (ho) cz.m1806(list, 1, ho.class));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static ho.a m1746() {
        hu.m2304().m2307();
        return hq.m2251();
    }
}
