package com.startapp.sdk.internal;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class hh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f74952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f74953b = new HashMap();

    public static synchronized Object a(int i10, Class cls) {
        try {
        } catch (RuntimeException e10) {
            d9.a(e10);
            return null;
        }
        return cls.cast(f74953b.remove(Integer.valueOf(i10)));
    }
}
