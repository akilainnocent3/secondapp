package com.chartboost.sdk.impl;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f39734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39735c;

    public k8(String name, Map attributes, String str) {
        kotlin.jvm.internal.m0.p(name, "name");
        kotlin.jvm.internal.m0.p(attributes, "attributes");
        this.f39733a = name;
        this.f39734b = attributes;
        this.f39735c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8)) {
            return false;
        }
        k8 k8Var = (k8) obj;
        return kotlin.jvm.internal.m0.g(this.f39733a, k8Var.f39733a) && kotlin.jvm.internal.m0.g(this.f39734b, k8Var.f39734b) && kotlin.jvm.internal.m0.g(this.f39735c, k8Var.f39735c);
    }

    public int hashCode() {
        int iHashCode = ((this.f39733a.hashCode() * 31) + this.f39734b.hashCode()) * 31;
        String str = this.f39735c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ExtensionChild(name=" + this.f39733a + ", attributes=" + this.f39734b + ", content=" + this.f39735c + gi.j.f86771d;
    }
}
