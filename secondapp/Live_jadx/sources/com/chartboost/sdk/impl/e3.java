package com.chartboost.sdk.impl;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f38718b;

    public e3(int i10, byte[] data) {
        kotlin.jvm.internal.m0.p(data, "data");
        this.f38717a = i10;
        this.f38718b = data;
    }

    public final byte[] a() {
        return this.f38718b;
    }

    public final int b() {
        return this.f38717a;
    }

    public final boolean c() {
        int i10 = this.f38717a;
        return i10 >= 200 && i10 < 300;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj;
        return this.f38717a == e3Var.f38717a && kotlin.jvm.internal.m0.g(this.f38718b, e3Var.f38718b);
    }

    public int hashCode() {
        return (this.f38717a * 31) + Arrays.hashCode(this.f38718b);
    }

    public String toString() {
        return "CBNetworkServerResponse(statusCode=" + this.f38717a + ", data=" + Arrays.toString(this.f38718b) + gi.j.f86771d;
    }
}
