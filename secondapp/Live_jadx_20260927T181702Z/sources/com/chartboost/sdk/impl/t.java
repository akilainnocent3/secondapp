package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f40930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f40931b;

    public t(Integer num, Integer num2) {
        this.f40930a = num;
        this.f40931b = num2;
    }

    public final Integer a() {
        return this.f40931b;
    }

    public final Integer b() {
        return this.f40930a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.m0.g(this.f40930a, tVar.f40930a) && kotlin.jvm.internal.m0.g(this.f40931b, tVar.f40931b);
    }

    public int hashCode() {
        Integer num = this.f40930a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f40931b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "AdLoadConfig(widthDp=" + this.f40930a + ", heightDp=" + this.f40931b + gi.j.f86771d;
    }

    public /* synthetic */ t(Integer num, Integer num2, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2);
    }
}
