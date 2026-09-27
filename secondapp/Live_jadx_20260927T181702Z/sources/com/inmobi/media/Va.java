package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.InlineParams;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f55677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f55679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f55680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InlineParams f55681e;

    public Va(boolean z10, String landingScheme, boolean z11, boolean z12, InlineParams inlineParams) {
        kotlin.jvm.internal.m0.p(landingScheme, "landingScheme");
        this.f55677a = z10;
        this.f55678b = landingScheme;
        this.f55679c = z11;
        this.f55680d = z12;
        this.f55681e = inlineParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Va)) {
            return false;
        }
        Va va2 = (Va) obj;
        return this.f55677a == va2.f55677a && kotlin.jvm.internal.m0.g(this.f55678b, va2.f55678b) && this.f55679c == va2.f55679c && this.f55680d == va2.f55680d && kotlin.jvm.internal.m0.g(this.f55681e, va2.f55681e);
    }

    public final int hashCode() {
        int iA = (g8.a.a(this.f55680d) + ((g8.a.a(this.f55679c) + ((this.f55678b.hashCode() + (g8.a.a(this.f55677a) * 31)) * 31)) * 31)) * 31;
        InlineParams inlineParams = this.f55681e;
        return iA + (inlineParams == null ? 0 : inlineParams.hashCode());
    }

    public final String toString() {
        return "LandingPageState(isInAppBrowser=" + this.f55677a + ", landingScheme=" + this.f55678b + ", isCCTEnabled=" + this.f55679c + ", isPartialTabsEnabled=" + this.f55680d + ", inlineParams=" + this.f55681e + gi.j.f86771d;
    }

    public /* synthetic */ Va(boolean z10, String str, boolean z11, int i10) {
        this(z10, (i10 & 2) != 0 ? "DEFAULT" : str, z11, false, null);
    }
}
