package com.chartboost.sdk.impl;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class fi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f38960e;

    public fi(String str, String str2, int i10, String str3, Map extras) {
        kotlin.jvm.internal.m0.p(extras, "extras");
        this.f38956a = str;
        this.f38957b = str2;
        this.f38958c = i10;
        this.f38959d = str3;
        this.f38960e = extras;
    }

    public final fi a(String str, String str2, int i10, String str3, Map extras) {
        kotlin.jvm.internal.m0.p(extras, "extras");
        return new fi(str, str2, i10, str3, extras);
    }

    public final Map b() {
        return this.f38960e;
    }

    public final int c() {
        return this.f38958c;
    }

    public final String d() {
        return this.f38959d;
    }

    public final String e() {
        return this.f38957b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi)) {
            return false;
        }
        fi fiVar = (fi) obj;
        return kotlin.jvm.internal.m0.g(this.f38956a, fiVar.f38956a) && kotlin.jvm.internal.m0.g(this.f38957b, fiVar.f38957b) && this.f38958c == fiVar.f38958c && kotlin.jvm.internal.m0.g(this.f38959d, fiVar.f38959d) && kotlin.jvm.internal.m0.g(this.f38960e, fiVar.f38960e);
    }

    public int hashCode() {
        String str = this.f38956a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f38957b;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f38958c) * 31;
        String str3 = this.f38959d;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f38960e.hashCode();
    }

    public String toString() {
        return "TrackingEvent(event=" + this.f38956a + ", url=" + this.f38957b + ", level=" + this.f38958c + ", offset=" + this.f38959d + ", extras=" + this.f38960e + gi.j.f86771d;
    }

    public static /* synthetic */ fi a(fi fiVar, String str, String str2, int i10, String str3, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fiVar.f38956a;
        }
        if ((i11 & 2) != 0) {
            str2 = fiVar.f38957b;
        }
        if ((i11 & 4) != 0) {
            i10 = fiVar.f38958c;
        }
        if ((i11 & 8) != 0) {
            str3 = fiVar.f38959d;
        }
        if ((i11 & 16) != 0) {
            map = fiVar.f38960e;
        }
        Map map2 = map;
        int i12 = i10;
        return fiVar.a(str, str2, i12, str3, map2);
    }

    public final String a() {
        return this.f38956a;
    }

    public /* synthetic */ fi(String str, String str2, int i10, String str3, Map map, int i11, kotlin.jvm.internal.x xVar) {
        this(str, str2, i10, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? fr.n1.z() : map);
    }
}
