package com.chartboost.sdk.impl;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class f7 {
    public final long A;
    public final int B;
    public final int C;
    public final int D;
    public final long E;
    public final long F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f38873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f38874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f38875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f38876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f38877i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f38878j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f38879k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f38880l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f38881m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f38882n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f38883o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f38884p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f38885q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f38886r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f38887s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f38888t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f38889u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f38890v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f38891w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f38892x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f38893y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f38894z;

    public f7(String sessionId, int i10, String appId, String appVersion, String chartboostSdkVersion, boolean z10, String chartboostSdkGdpr, String chartboostSdkCcpa, String chartboostSdkCoppa, String chartboostSdkLgpd, String deviceId, String deviceMake, String deviceModel, String deviceOsVersion, String devicePlatform, String deviceCountry, String deviceLanguage, String deviceTimezone, String deviceConnectionType, String deviceOrientation, int i11, boolean z11, int i12, boolean z12, int i13, long j10, long j11, int i14, int i15, int i16, long j12, long j13) {
        kotlin.jvm.internal.m0.p(sessionId, "sessionId");
        kotlin.jvm.internal.m0.p(appId, "appId");
        kotlin.jvm.internal.m0.p(appVersion, "appVersion");
        kotlin.jvm.internal.m0.p(chartboostSdkVersion, "chartboostSdkVersion");
        kotlin.jvm.internal.m0.p(chartboostSdkGdpr, "chartboostSdkGdpr");
        kotlin.jvm.internal.m0.p(chartboostSdkCcpa, "chartboostSdkCcpa");
        kotlin.jvm.internal.m0.p(chartboostSdkCoppa, "chartboostSdkCoppa");
        kotlin.jvm.internal.m0.p(chartboostSdkLgpd, "chartboostSdkLgpd");
        kotlin.jvm.internal.m0.p(deviceId, "deviceId");
        kotlin.jvm.internal.m0.p(deviceMake, "deviceMake");
        kotlin.jvm.internal.m0.p(deviceModel, "deviceModel");
        kotlin.jvm.internal.m0.p(deviceOsVersion, "deviceOsVersion");
        kotlin.jvm.internal.m0.p(devicePlatform, "devicePlatform");
        kotlin.jvm.internal.m0.p(deviceCountry, "deviceCountry");
        kotlin.jvm.internal.m0.p(deviceLanguage, "deviceLanguage");
        kotlin.jvm.internal.m0.p(deviceTimezone, "deviceTimezone");
        kotlin.jvm.internal.m0.p(deviceConnectionType, "deviceConnectionType");
        kotlin.jvm.internal.m0.p(deviceOrientation, "deviceOrientation");
        this.f38869a = sessionId;
        this.f38870b = i10;
        this.f38871c = appId;
        this.f38872d = appVersion;
        this.f38873e = chartboostSdkVersion;
        this.f38874f = z10;
        this.f38875g = chartboostSdkGdpr;
        this.f38876h = chartboostSdkCcpa;
        this.f38877i = chartboostSdkCoppa;
        this.f38878j = chartboostSdkLgpd;
        this.f38879k = deviceId;
        this.f38880l = deviceMake;
        this.f38881m = deviceModel;
        this.f38882n = deviceOsVersion;
        this.f38883o = devicePlatform;
        this.f38884p = deviceCountry;
        this.f38885q = deviceLanguage;
        this.f38886r = deviceTimezone;
        this.f38887s = deviceConnectionType;
        this.f38888t = deviceOrientation;
        this.f38889u = i11;
        this.f38890v = z11;
        this.f38891w = i12;
        this.f38892x = z12;
        this.f38893y = i13;
        this.f38894z = j10;
        this.A = j11;
        this.B = i14;
        this.C = i15;
        this.D = i16;
        this.E = j12;
        this.F = j13;
    }

    public final long A() {
        return this.E;
    }

    public final String B() {
        return this.f38869a;
    }

    public final int C() {
        return this.D;
    }

    public final int D() {
        return this.B;
    }

    public final int E() {
        return this.C;
    }

    public final String a() {
        return this.f38871c;
    }

    public final boolean b() {
        return this.f38874f;
    }

    public final String c() {
        return this.f38876h;
    }

    public final String d() {
        return this.f38877i;
    }

    public final String e() {
        return this.f38875g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7)) {
            return false;
        }
        f7 f7Var = (f7) obj;
        return kotlin.jvm.internal.m0.g(this.f38869a, f7Var.f38869a) && this.f38870b == f7Var.f38870b && kotlin.jvm.internal.m0.g(this.f38871c, f7Var.f38871c) && kotlin.jvm.internal.m0.g(this.f38872d, f7Var.f38872d) && kotlin.jvm.internal.m0.g(this.f38873e, f7Var.f38873e) && this.f38874f == f7Var.f38874f && kotlin.jvm.internal.m0.g(this.f38875g, f7Var.f38875g) && kotlin.jvm.internal.m0.g(this.f38876h, f7Var.f38876h) && kotlin.jvm.internal.m0.g(this.f38877i, f7Var.f38877i) && kotlin.jvm.internal.m0.g(this.f38878j, f7Var.f38878j) && kotlin.jvm.internal.m0.g(this.f38879k, f7Var.f38879k) && kotlin.jvm.internal.m0.g(this.f38880l, f7Var.f38880l) && kotlin.jvm.internal.m0.g(this.f38881m, f7Var.f38881m) && kotlin.jvm.internal.m0.g(this.f38882n, f7Var.f38882n) && kotlin.jvm.internal.m0.g(this.f38883o, f7Var.f38883o) && kotlin.jvm.internal.m0.g(this.f38884p, f7Var.f38884p) && kotlin.jvm.internal.m0.g(this.f38885q, f7Var.f38885q) && kotlin.jvm.internal.m0.g(this.f38886r, f7Var.f38886r) && kotlin.jvm.internal.m0.g(this.f38887s, f7Var.f38887s) && kotlin.jvm.internal.m0.g(this.f38888t, f7Var.f38888t) && this.f38889u == f7Var.f38889u && this.f38890v == f7Var.f38890v && this.f38891w == f7Var.f38891w && this.f38892x == f7Var.f38892x && this.f38893y == f7Var.f38893y && this.f38894z == f7Var.f38894z && this.A == f7Var.A && this.B == f7Var.B && this.C == f7Var.C && this.D == f7Var.D && this.E == f7Var.E && this.F == f7Var.F;
    }

    public final String f() {
        return this.f38878j;
    }

    public final String g() {
        return this.f38873e;
    }

    public final int h() {
        return this.f38893y;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.f38869a.hashCode() * 31) + this.f38870b) * 31) + this.f38871c.hashCode()) * 31) + this.f38872d.hashCode()) * 31) + this.f38873e.hashCode()) * 31) + g8.a.a(this.f38874f)) * 31) + this.f38875g.hashCode()) * 31) + this.f38876h.hashCode()) * 31) + this.f38877i.hashCode()) * 31) + this.f38878j.hashCode()) * 31) + this.f38879k.hashCode()) * 31) + this.f38880l.hashCode()) * 31) + this.f38881m.hashCode()) * 31) + this.f38882n.hashCode()) * 31) + this.f38883o.hashCode()) * 31) + this.f38884p.hashCode()) * 31) + this.f38885q.hashCode()) * 31) + this.f38886r.hashCode()) * 31) + this.f38887s.hashCode()) * 31) + this.f38888t.hashCode()) * 31) + this.f38889u) * 31) + g8.a.a(this.f38890v)) * 31) + this.f38891w) * 31) + g8.a.a(this.f38892x)) * 31) + this.f38893y) * 31) + f0.p.a(this.f38894z)) * 31) + f0.p.a(this.A)) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + f0.p.a(this.E)) * 31) + f0.p.a(this.F);
    }

    public final int i() {
        return this.f38889u;
    }

    public final boolean j() {
        return this.f38890v;
    }

    public final String k() {
        return this.f38887s;
    }

    public final String l() {
        return this.f38884p;
    }

    public final String m() {
        return this.f38879k;
    }

    public final String n() {
        return this.f38885q;
    }

    public final long o() {
        return this.A;
    }

    public final String p() {
        return this.f38880l;
    }

    public final String q() {
        return this.f38881m;
    }

    public final boolean r() {
        return this.f38892x;
    }

    public final String s() {
        return this.f38888t;
    }

    public final String t() {
        return this.f38882n;
    }

    public String toString() {
        return "EnvironmentData(sessionId=" + this.f38869a + ", sessionCount=" + this.f38870b + ", appId=" + this.f38871c + ", appVersion=" + this.f38872d + ", chartboostSdkVersion=" + this.f38873e + ", chartboostSdkAutocacheEnabled=" + this.f38874f + ", chartboostSdkGdpr=" + this.f38875g + ", chartboostSdkCcpa=" + this.f38876h + ", chartboostSdkCoppa=" + this.f38877i + ", chartboostSdkLgpd=" + this.f38878j + ", deviceId=" + this.f38879k + ", deviceMake=" + this.f38880l + ", deviceModel=" + this.f38881m + ", deviceOsVersion=" + this.f38882n + ", devicePlatform=" + this.f38883o + ", deviceCountry=" + this.f38884p + ", deviceLanguage=" + this.f38885q + ", deviceTimezone=" + this.f38886r + ", deviceConnectionType=" + this.f38887s + ", deviceOrientation=" + this.f38888t + ", deviceBatteryLevel=" + this.f38889u + ", deviceChargingStatus=" + this.f38890v + ", deviceVolume=" + this.f38891w + ", deviceMute=" + this.f38892x + ", deviceAudioOutput=" + this.f38893y + ", deviceStorage=" + this.f38894z + ", deviceLowMemoryWarning=" + this.A + ", sessionImpressionInterstitialCount=" + this.B + ", sessionImpressionRewardedCount=" + this.C + ", sessionImpressionBannerCount=" + this.D + ", sessionDuration=" + this.E + ", deviceUpTime=" + this.F + gi.j.f86771d;
    }

    public final String u() {
        return this.f38883o;
    }

    public final long v() {
        return this.f38894z;
    }

    public final String w() {
        return this.f38886r;
    }

    public final long x() {
        return this.F;
    }

    public final int y() {
        return this.f38891w;
    }

    public final int z() {
        return this.f38870b;
    }

    public /* synthetic */ f7(String str, int i10, String str2, String str3, String str4, boolean z10, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i11, boolean z11, int i12, boolean z12, int i13, long j10, long j11, int i14, int i15, int i16, long j12, long j13, int i17, kotlin.jvm.internal.x xVar) {
        this((i17 & 1) != 0 ? "not available" : str, (i17 & 2) != 0 ? 0 : i10, (i17 & 4) != 0 ? "not available" : str2, (i17 & 8) != 0 ? "not available" : str3, (i17 & 16) != 0 ? "not available" : str4, (i17 & 32) != 0 ? false : z10, (i17 & 64) != 0 ? "not available" : str5, (i17 & 128) != 0 ? "not available" : str6, (i17 & 256) != 0 ? "not available" : str7, (i17 & 512) != 0 ? "not available" : str8, (i17 & 1024) != 0 ? "not available" : str9, (i17 & 2048) != 0 ? "not available" : str10, (i17 & 4096) != 0 ? "not available" : str11, (i17 & 8192) != 0 ? "not available" : str12, (i17 & 16384) != 0 ? "not available" : str13, (i17 & 32768) != 0 ? "not available" : str14, (i17 & 65536) != 0 ? "not available" : str15, (i17 & 131072) != 0 ? "not available" : str16, (i17 & 262144) != 0 ? "not available" : str17, (i17 & 524288) == 0 ? str18 : "not available", (i17 & 1048576) != 0 ? 0 : i11, (i17 & 2097152) != 0 ? false : z11, (i17 & 4194304) != 0 ? 0 : i12, (i17 & 8388608) != 0 ? false : z12, (i17 & 16777216) != 0 ? 0 : i13, (i17 & 33554432) != 0 ? 0L : j10, (i17 & 67108864) != 0 ? 0L : j11, (i17 & 134217728) != 0 ? 0 : i14, (i17 & 268435456) != 0 ? 0 : i15, (i17 & 536870912) != 0 ? 0 : i16, (i17 & 1073741824) == 0 ? j12 : 0L, (i17 & Integer.MIN_VALUE) != 0 ? SystemClock.uptimeMillis() : j13);
    }
}
