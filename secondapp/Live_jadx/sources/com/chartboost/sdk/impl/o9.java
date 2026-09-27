package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class o9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mi f40280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f40283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f40284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f40285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f40286g;

    public o9(mi trackingState, String str, String str2, String str3, String str4, Integer num, String str5) {
        kotlin.jvm.internal.m0.p(trackingState, "trackingState");
        this.f40280a = trackingState;
        this.f40281b = str;
        this.f40282c = str2;
        this.f40283d = str3;
        this.f40284e = str4;
        this.f40285f = num;
        this.f40286g = str5;
    }

    public final String a() {
        return this.f40283d;
    }

    public final String b() {
        return this.f40281b;
    }

    public final String c() {
        return this.f40286g;
    }

    public final String d() {
        return this.f40284e;
    }

    public final Integer e() {
        return this.f40285f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9)) {
            return false;
        }
        o9 o9Var = (o9) obj;
        return this.f40280a == o9Var.f40280a && kotlin.jvm.internal.m0.g(this.f40281b, o9Var.f40281b) && kotlin.jvm.internal.m0.g(this.f40282c, o9Var.f40282c) && kotlin.jvm.internal.m0.g(this.f40283d, o9Var.f40283d) && kotlin.jvm.internal.m0.g(this.f40284e, o9Var.f40284e) && kotlin.jvm.internal.m0.g(this.f40285f, o9Var.f40285f) && kotlin.jvm.internal.m0.g(this.f40286g, o9Var.f40286g);
    }

    public final mi f() {
        return this.f40280a;
    }

    public final String g() {
        return this.f40282c;
    }

    public int hashCode() {
        int iHashCode = this.f40280a.hashCode() * 31;
        String str = this.f40281b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f40282c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f40283d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f40284e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f40285f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.f40286g;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "IdentityBodyFields(trackingState=" + this.f40280a + ", identifiers=" + this.f40281b + ", uuid=" + this.f40282c + ", gaid=" + this.f40283d + ", setId=" + this.f40284e + ", setIdScope=" + this.f40285f + ", instanceId=" + this.f40286g + gi.j.f86771d;
    }

    public /* synthetic */ o9(mi miVar, String str, String str2, String str3, String str4, Integer num, String str5, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? mi.TRACKING_UNKNOWN : miVar, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : num, (i10 & 64) != 0 ? null : str5);
    }
}
