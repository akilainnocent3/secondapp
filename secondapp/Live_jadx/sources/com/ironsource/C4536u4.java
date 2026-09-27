package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.u4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4536u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final String f64251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final String f64252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    private final String f64253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    private final String f64254d;

    public C4536u4() {
        this(null, null, null, null, 15, null);
    }

    @oy.l
    public final String a() {
        return this.f64251a;
    }

    @oy.l
    public final String b() {
        return this.f64252b;
    }

    @oy.l
    public final String c() {
        return this.f64253c;
    }

    @oy.l
    public final String d() {
        return this.f64254d;
    }

    @oy.l
    public final String e() {
        return this.f64254d;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4536u4)) {
            return false;
        }
        C4536u4 c4536u4 = (C4536u4) obj;
        return kotlin.jvm.internal.m0.g(this.f64251a, c4536u4.f64251a) && kotlin.jvm.internal.m0.g(this.f64252b, c4536u4.f64252b) && kotlin.jvm.internal.m0.g(this.f64253c, c4536u4.f64253c) && kotlin.jvm.internal.m0.g(this.f64254d, c4536u4.f64254d);
    }

    @oy.l
    public final String f() {
        return this.f64253c;
    }

    @oy.l
    public final String g() {
        return this.f64251a;
    }

    @oy.l
    public final String h() {
        return this.f64252b;
    }

    public int hashCode() {
        return (((((this.f64251a.hashCode() * 31) + this.f64252b.hashCode()) * 31) + this.f64253c.hashCode()) * 31) + this.f64254d.hashCode();
    }

    @oy.l
    public String toString() {
        return "CustomAdapterSettings(customNetworkAdapterName=" + this.f64251a + ", customRewardedVideoAdapterName=" + this.f64252b + ", customInterstitialAdapterName=" + this.f64253c + ", customBannerAdapterName=" + this.f64254d + gi.j.f86771d;
    }

    public C4536u4(@oy.l String customNetworkAdapterName, @oy.l String customRewardedVideoAdapterName, @oy.l String customInterstitialAdapterName, @oy.l String customBannerAdapterName) {
        kotlin.jvm.internal.m0.p(customNetworkAdapterName, "customNetworkAdapterName");
        kotlin.jvm.internal.m0.p(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        kotlin.jvm.internal.m0.p(customInterstitialAdapterName, "customInterstitialAdapterName");
        kotlin.jvm.internal.m0.p(customBannerAdapterName, "customBannerAdapterName");
        this.f64251a = customNetworkAdapterName;
        this.f64252b = customRewardedVideoAdapterName;
        this.f64253c = customInterstitialAdapterName;
        this.f64254d = customBannerAdapterName;
    }

    @oy.l
    public final C4536u4 a(@oy.l String customNetworkAdapterName, @oy.l String customRewardedVideoAdapterName, @oy.l String customInterstitialAdapterName, @oy.l String customBannerAdapterName) {
        kotlin.jvm.internal.m0.p(customNetworkAdapterName, "customNetworkAdapterName");
        kotlin.jvm.internal.m0.p(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        kotlin.jvm.internal.m0.p(customInterstitialAdapterName, "customInterstitialAdapterName");
        kotlin.jvm.internal.m0.p(customBannerAdapterName, "customBannerAdapterName");
        return new C4536u4(customNetworkAdapterName, customRewardedVideoAdapterName, customInterstitialAdapterName, customBannerAdapterName);
    }

    public static /* synthetic */ C4536u4 a(C4536u4 c4536u4, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c4536u4.f64251a;
        }
        if ((i10 & 2) != 0) {
            str2 = c4536u4.f64252b;
        }
        if ((i10 & 4) != 0) {
            str3 = c4536u4.f64253c;
        }
        if ((i10 & 8) != 0) {
            str4 = c4536u4.f64254d;
        }
        return c4536u4.a(str, str2, str3, str4);
    }

    public /* synthetic */ C4536u4(String str, String str2, String str3, String str4, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
    }
}
