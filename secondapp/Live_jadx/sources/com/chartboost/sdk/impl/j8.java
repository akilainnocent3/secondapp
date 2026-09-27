package com.chartboost.sdk.impl;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class j8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f39566c;

    public j8(String str, String str2, List children) {
        kotlin.jvm.internal.m0.p(children, "children");
        this.f39564a = str;
        this.f39565b = str2;
        this.f39566c = children;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8)) {
            return false;
        }
        j8 j8Var = (j8) obj;
        return kotlin.jvm.internal.m0.g(this.f39564a, j8Var.f39564a) && kotlin.jvm.internal.m0.g(this.f39565b, j8Var.f39565b) && kotlin.jvm.internal.m0.g(this.f39566c, j8Var.f39566c);
    }

    public int hashCode() {
        String str = this.f39564a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f39565b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f39566c.hashCode();
    }

    public String toString() {
        return "Extension(type=" + this.f39564a + ", content=" + this.f39565b + ", children=" + this.f39566c + gi.j.f86771d;
    }
}
