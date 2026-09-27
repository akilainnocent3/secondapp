package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f39083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f39084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f39085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f39086h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f39087i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f39088j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f39089k;

    public h6(int i10, int i11, int i12, int i13, float f10, String str, int i14, String deviceType, String str2, String str3, boolean z10) {
        kotlin.jvm.internal.m0.p(deviceType, "deviceType");
        this.f39079a = i10;
        this.f39080b = i11;
        this.f39081c = i12;
        this.f39082d = i13;
        this.f39083e = f10;
        this.f39084f = str;
        this.f39085g = i14;
        this.f39086h = deviceType;
        this.f39087i = str2;
        this.f39088j = str3;
        this.f39089k = z10;
    }

    public final int a() {
        return this.f39080b;
    }

    public final String b() {
        return this.f39086h;
    }

    public final int c() {
        return this.f39079a;
    }

    public final String d() {
        return this.f39084f;
    }

    public final int e() {
        return this.f39082d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6)) {
            return false;
        }
        h6 h6Var = (h6) obj;
        return this.f39079a == h6Var.f39079a && this.f39080b == h6Var.f39080b && this.f39081c == h6Var.f39081c && this.f39082d == h6Var.f39082d && Float.compare(this.f39083e, h6Var.f39083e) == 0 && kotlin.jvm.internal.m0.g(this.f39084f, h6Var.f39084f) && this.f39085g == h6Var.f39085g && kotlin.jvm.internal.m0.g(this.f39086h, h6Var.f39086h) && kotlin.jvm.internal.m0.g(this.f39087i, h6Var.f39087i) && kotlin.jvm.internal.m0.g(this.f39088j, h6Var.f39088j) && this.f39089k == h6Var.f39089k;
    }

    public final int f() {
        return this.f39085g;
    }

    public final String g() {
        return this.f39087i;
    }

    public final float h() {
        return this.f39083e;
    }

    public int hashCode() {
        int iFloatToIntBits = ((((((((this.f39079a * 31) + this.f39080b) * 31) + this.f39081c) * 31) + this.f39082d) * 31) + Float.floatToIntBits(this.f39083e)) * 31;
        String str = this.f39084f;
        int iHashCode = (((((iFloatToIntBits + (str == null ? 0 : str.hashCode())) * 31) + this.f39085g) * 31) + this.f39086h.hashCode()) * 31;
        String str2 = this.f39087i;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f39088j;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + g8.a.a(this.f39089k);
    }

    public final String i() {
        return this.f39088j;
    }

    public final int j() {
        return this.f39081c;
    }

    public final boolean k() {
        return this.f39089k;
    }

    public String toString() {
        return "DeviceBodyFields(deviceWidth=" + this.f39079a + ", deviceHeight=" + this.f39080b + ", width=" + this.f39081c + ", height=" + this.f39082d + ", scale=" + this.f39083e + ", dpi=" + this.f39084f + ", ortbDeviceType=" + this.f39085g + ", deviceType=" + this.f39086h + ", packageName=" + this.f39087i + ", versionName=" + this.f39088j + ", isPortrait=" + this.f39089k + gi.j.f86771d;
    }

    public /* synthetic */ h6(int i10, int i11, int i12, int i13, float f10, String str, int i14, String str2, String str3, String str4, boolean z10, int i15, kotlin.jvm.internal.x xVar) {
        this((i15 & 1) != 0 ? 0 : i10, (i15 & 2) != 0 ? 0 : i11, (i15 & 4) != 0 ? 0 : i12, (i15 & 8) != 0 ? 0 : i13, (i15 & 16) != 0 ? 0.0f : f10, (i15 & 32) != 0 ? "" : str, (i15 & 64) != 0 ? l6.f39855a : i14, (i15 & 128) != 0 ? "phone" : str2, (i15 & 256) != 0 ? null : str3, (i15 & 512) != 0 ? null : str4, (i15 & 1024) != 0 ? true : z10);
    }
}
