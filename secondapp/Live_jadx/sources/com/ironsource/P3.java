package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class P3 implements X5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final JSONObject f59760a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f59761a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final boolean f59762b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public static final String f59763c = "curlError";

        private a() {
        }
    }

    public P3(@oy.m JSONObject jSONObject) {
        this.f59760a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.X5
    public boolean b() {
        return this.f59760a.optBoolean("enabled", false);
    }

    public final boolean d() {
        return this.f59760a.optBoolean("closeActivity", true);
    }

    public final boolean e() {
        return this.f59760a.optBoolean("reportController", true);
    }
}
