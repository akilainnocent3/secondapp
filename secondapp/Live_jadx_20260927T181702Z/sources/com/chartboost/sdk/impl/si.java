package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class si {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i4 f40906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f40907c;

    public si(String url, i4 clickPreference, boolean z10) {
        kotlin.jvm.internal.m0.p(url, "url");
        kotlin.jvm.internal.m0.p(clickPreference, "clickPreference");
        this.f40905a = url;
        this.f40906b = clickPreference;
        this.f40907c = z10;
    }

    public final si a(String url, i4 clickPreference, boolean z10) {
        kotlin.jvm.internal.m0.p(url, "url");
        kotlin.jvm.internal.m0.p(clickPreference, "clickPreference");
        return new si(url, clickPreference, z10);
    }

    public final String b() {
        return this.f40905a;
    }

    public final boolean c() {
        return this.f40907c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si)) {
            return false;
        }
        si siVar = (si) obj;
        return kotlin.jvm.internal.m0.g(this.f40905a, siVar.f40905a) && this.f40906b == siVar.f40906b && this.f40907c == siVar.f40907c;
    }

    public int hashCode() {
        return (((this.f40905a.hashCode() * 31) + this.f40906b.hashCode()) * 31) + g8.a.a(this.f40907c);
    }

    public String toString() {
        return "UrlArgs(url=" + this.f40905a + ", clickPreference=" + this.f40906b + ", userGesture=" + this.f40907c + gi.j.f86771d;
    }

    public static /* synthetic */ si a(si siVar, String str, i4 i4Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = siVar.f40905a;
        }
        if ((i10 & 2) != 0) {
            i4Var = siVar.f40906b;
        }
        if ((i10 & 4) != 0) {
            z10 = siVar.f40907c;
        }
        return siVar.a(str, i4Var, z10);
    }

    public final i4 a() {
        return this.f40906b;
    }
}
