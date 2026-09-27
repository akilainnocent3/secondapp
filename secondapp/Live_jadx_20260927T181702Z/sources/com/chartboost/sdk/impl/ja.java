package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class ja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x2 f39583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CBError.Impression f39584b;

    public ja(x2 x2Var, CBError.Impression impression) {
        this.f39583a = x2Var;
        this.f39584b = impression;
    }

    public final CBError.Impression a() {
        return this.f39584b;
    }

    public final x2 b() {
        return this.f39583a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja)) {
            return false;
        }
        ja jaVar = (ja) obj;
        return kotlin.jvm.internal.m0.g(this.f39583a, jaVar.f39583a) && this.f39584b == jaVar.f39584b;
    }

    public int hashCode() {
        x2 x2Var = this.f39583a;
        int iHashCode = (x2Var == null ? 0 : x2Var.hashCode()) * 31;
        CBError.Impression impression = this.f39584b;
        return iHashCode + (impression != null ? impression.hashCode() : 0);
    }

    public String toString() {
        return "ImpressionHolder(impression=" + this.f39583a + ", error=" + this.f39584b + gi.j.f86771d;
    }
}
