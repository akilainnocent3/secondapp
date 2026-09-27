package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f38724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f38726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z6 f38727e;

    public e5(String str, boolean z10, String webViewVersion, boolean z11, z6 nrpWaterfallEndpoints) {
        kotlin.jvm.internal.m0.p(webViewVersion, "webViewVersion");
        kotlin.jvm.internal.m0.p(nrpWaterfallEndpoints, "nrpWaterfallEndpoints");
        this.f38723a = str;
        this.f38724b = z10;
        this.f38725c = webViewVersion;
        this.f38726d = z11;
        this.f38727e = nrpWaterfallEndpoints;
    }

    public final String a() {
        return this.f38723a;
    }

    public final boolean b() {
        return this.f38726d;
    }

    public final z6 c() {
        return this.f38727e;
    }

    public final boolean d() {
        return this.f38724b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5)) {
            return false;
        }
        e5 e5Var = (e5) obj;
        return kotlin.jvm.internal.m0.g(this.f38723a, e5Var.f38723a) && this.f38724b == e5Var.f38724b && kotlin.jvm.internal.m0.g(this.f38725c, e5Var.f38725c) && this.f38726d == e5Var.f38726d && kotlin.jvm.internal.m0.g(this.f38727e, e5Var.f38727e);
    }

    public int hashCode() {
        String str = this.f38723a;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + g8.a.a(this.f38724b)) * 31) + this.f38725c.hashCode()) * 31) + g8.a.a(this.f38726d)) * 31) + this.f38727e.hashCode();
    }

    public String toString() {
        return "ConfigurationBodyFields(configVariant=" + this.f38723a + ", webViewEnabled=" + this.f38724b + ", webViewVersion=" + this.f38725c + ", nrpWaterfallEnabled=" + this.f38726d + ", nrpWaterfallEndpoints=" + this.f38727e + gi.j.f86771d;
    }
}
