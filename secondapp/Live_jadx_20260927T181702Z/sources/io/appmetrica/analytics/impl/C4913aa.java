package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.aa, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4913aa {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4913aa f96935c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f96936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f96937b = new HashMap();

    public C4913aa(Context context) {
        this.f96936a = context;
    }

    public static final C4913aa a(Context context) {
        if (f96935c == null) {
            synchronized (kotlin.jvm.internal.m1.d(C4913aa.class)) {
                try {
                    if (f96935c == null) {
                        f96935c = new C4913aa(context);
                    }
                    dr.w2 w2Var = dr.w2.f79517a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        C4913aa c4913aa = f96935c;
        if (c4913aa != null) {
            return c4913aa;
        }
        kotlin.jvm.internal.m0.S("INSTANCE");
        return null;
    }

    public final synchronized C5520y9 b(String str) {
        Object c5520y9;
        try {
            HashMap map = this.f96937b;
            c5520y9 = map.get(str);
            if (c5520y9 == null) {
                c5520y9 = new C5520y9(this.f96936a, str);
                map.put(str, c5520y9);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (C5520y9) c5520y9;
    }

    public final synchronized void a(String str) {
        this.f96937b.remove(str);
    }
}
