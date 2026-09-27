package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Hb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f59201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f59202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f59203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f59204d;

    public Hb(@oy.l JSONObject applicationLogger) {
        kotlin.jvm.internal.m0.p(applicationLogger, "applicationLogger");
        this.f59201a = applicationLogger.optInt(Ib.f59279a, 3);
        this.f59202b = applicationLogger.optInt(Ib.f59280b, 3);
        this.f59203c = applicationLogger.optInt("console", 3);
        this.f59204d = applicationLogger.optBoolean(Ib.f59282d, false);
    }

    public final int a() {
        return this.f59203c;
    }

    public final int b() {
        return this.f59202b;
    }

    public final int c() {
        return this.f59201a;
    }

    public final boolean d() {
        return this.f59204d;
    }
}
