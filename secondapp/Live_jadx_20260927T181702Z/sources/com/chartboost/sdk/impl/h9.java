package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class h9 implements nj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39098a;

    public h9(String str) {
        this.f39098a = str;
    }

    public final String a() {
        return this.f39098a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h9) && kotlin.jvm.internal.m0.g(this.f39098a, ((h9) obj).f39098a);
    }

    public int hashCode() {
        String str = this.f39098a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "IFrameResource(url=" + this.f39098a + gi.j.f86771d;
    }
}
