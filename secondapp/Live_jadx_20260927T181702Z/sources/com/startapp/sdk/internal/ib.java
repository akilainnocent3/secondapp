package com.startapp.sdk.internal;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ib {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile i7 f74985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f74986c;

    public ib(i7 i7Var) {
        this.f74985b = i7Var;
        this.f74984a = i7Var.toString();
    }

    public final Object a() {
        Object objA;
        Object obj = this.f74986c;
        if (obj != null) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.f74986c;
                if (objA == null) {
                    i7 i7Var = this.f74985b;
                    this.f74985b = null;
                    if (i7Var == null) {
                        throw new IllegalStateException("3, " + this.f74984a);
                    }
                    try {
                        objA = i7Var.a();
                        if (objA == null) {
                            throw new IllegalStateException("2, " + this.f74984a);
                        }
                        this.f74986c = objA;
                    } catch (Error e10) {
                        e = e10;
                        Log.println(7, "StartAppSDK", Log.getStackTraceString(e));
                        e.addSuppressed(new Exception(this.f74984a));
                        throw e;
                    } catch (RuntimeException e11) {
                        e = e11;
                        Log.println(7, "StartAppSDK", Log.getStackTraceString(e));
                        e.addSuppressed(new Exception(this.f74984a));
                        throw e;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return objA;
    }
}
