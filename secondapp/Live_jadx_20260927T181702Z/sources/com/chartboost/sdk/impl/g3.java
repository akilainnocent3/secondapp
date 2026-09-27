package com.chartboost.sdk.impl;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38964a;

    public g3(Context context) {
        kotlin.jvm.internal.m0.p(context, "context");
        this.f38964a = context;
    }

    public final int a() {
        return g5.f(this.f38964a);
    }

    public final String b() {
        return g5.g(this.f38964a).b();
    }

    public final f5 c() {
        f5 f5Var;
        Context context = this.f38964a;
        if (!g5.d(context)) {
            f5Var = f5.CONNECTION_ERROR;
        } else if (g5.e(context)) {
            f5Var = f5.CONNECTION_WIFI;
        } else {
            f5Var = g5.c(context) ? f5.CONNECTION_MOBILE : f5.CONNECTION_UNKNOWN;
        }
        sb.a("NETWORK TYPE: " + f5Var, (Throwable) null, 2, (Object) null);
        return f5Var;
    }

    public final boolean d() {
        return c() == f5.CONNECTION_MOBILE;
    }

    public final boolean e() {
        return g5.d(this.f38964a);
    }

    public final sd f() {
        return g5.g(this.f38964a);
    }
}
