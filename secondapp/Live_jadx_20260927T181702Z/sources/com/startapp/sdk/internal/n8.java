package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.TimeoutConfig;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class n8 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q8 f75243f = new q8(new byte[0], ba.d1.f20912b, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o8 f75244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q8 f75246c = f75243f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TimeoutConfig f75247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g7 f75248e;

    public n8(o8 o8Var, String str) {
        this.f75244a = o8Var;
        this.f75245b = str;
    }

    public final r8 a() {
        o8 o8Var = this.f75244a;
        try {
            return o8Var.a(this);
        } catch (Throwable th2) {
            if (!o8Var.a(1)) {
                return null;
            }
            d9.a(th2);
            return null;
        }
    }

    public final r8 b() {
        o8 o8Var = this.f75244a;
        try {
            return o8Var.b(this);
        } catch (Throwable th2) {
            if (!o8Var.a(4)) {
                return null;
            }
            d9.a(th2);
            return null;
        }
    }
}
