package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4902a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f96902a;

    public C4902a(Context context) {
        this.f96902a = context;
    }

    public final byte[] a() {
        try {
            return AbstractC5103hj.a(new StringBuilder(this.f96902a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    public final byte[] b() {
        try {
            return AbstractC5103hj.a(this.f96902a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
