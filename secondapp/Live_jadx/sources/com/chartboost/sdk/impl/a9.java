package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class a9 implements nj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38176a;

    public a9(String str) {
        this.f38176a = str;
    }

    public final String a() {
        return this.f38176a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a9) && kotlin.jvm.internal.m0.g(this.f38176a, ((a9) obj).f38176a);
    }

    public int hashCode() {
        String str = this.f38176a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "HtmlResource(html=" + this.f38176a + gi.j.f86771d;
    }
}
