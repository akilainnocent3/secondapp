package com.yandex.varioqub.appmetricaadapter.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class e {
    public static d a() {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("io.appmetrica.analytics.AppMetrica", false, j.class.getClassLoader());
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            return new c();
        }
        try {
            cls2 = Class.forName("com.yandex.metrica.YandexMetrica", false, j.class.getClassLoader());
        } catch (Throwable unused2) {
        }
        return cls2 != null ? new i() : new f();
    }
}
