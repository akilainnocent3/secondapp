package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class k9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f39736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f39737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ch f39739d;

    public k9(Integer num, Integer num2, String str, ch chVar) {
        this.f39736a = num;
        this.f39737b = num2;
        this.f39738c = str;
        this.f39739d = chVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9)) {
            return false;
        }
        k9 k9Var = (k9) obj;
        return kotlin.jvm.internal.m0.g(this.f39736a, k9Var.f39736a) && kotlin.jvm.internal.m0.g(this.f39737b, k9Var.f39737b) && kotlin.jvm.internal.m0.g(this.f39738c, k9Var.f39738c) && kotlin.jvm.internal.m0.g(this.f39739d, k9Var.f39739d);
    }

    public int hashCode() {
        Integer num = this.f39736a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f39737b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f39738c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ch chVar = this.f39739d;
        return iHashCode3 + (chVar != null ? chVar.hashCode() : 0);
    }

    public String toString() {
        return "IconClickFallbackImage(width=" + this.f39736a + ", height=" + this.f39737b + ", altText=" + this.f39738c + ", staticResource=" + this.f39739d + gi.j.f86771d;
    }
}
