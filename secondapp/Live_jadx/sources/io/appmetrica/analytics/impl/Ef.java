package io.appmetrica.analytics.impl;

import android.annotation.SuppressLint;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@DoNotInline
public final class Ef implements Df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private volatile String f95771a;

    @SuppressLint({"PrivateApi"})
    private final String b() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("getProcessName", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    @Override // io.appmetrica.analytics.impl.Df
    @oy.m
    public String a() {
        if (this.f95771a != null) {
            return this.f95771a;
        }
        synchronized (this) {
            try {
                if (this.f95771a == null) {
                    this.f95771a = b();
                }
                dr.w2 w2Var = dr.w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f95771a;
    }
}
