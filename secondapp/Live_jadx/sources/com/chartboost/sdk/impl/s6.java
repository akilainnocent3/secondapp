package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40847b;

    public s6(int i10, int i11) {
        this.f40846a = i10;
        this.f40847b = i11;
    }

    public final int a() {
        return this.f40847b;
    }

    public final int b() {
        return this.f40846a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6)) {
            return false;
        }
        s6 s6Var = (s6) obj;
        return this.f40846a == s6Var.f40846a && this.f40847b == s6Var.f40847b;
    }

    public int hashCode() {
        return (this.f40846a * 31) + this.f40847b;
    }

    public String toString() {
        return "DisplaySize(width=" + this.f40846a + ", height=" + this.f40847b + gi.j.f86771d;
    }
}
