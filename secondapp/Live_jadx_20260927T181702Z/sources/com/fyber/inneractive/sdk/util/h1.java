package com.fyber.inneractive.sdk.util;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47869b;

    public h1(int i10, int i11) {
        this.f47868a = i10;
        this.f47869b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h1.class == obj.getClass()) {
            h1 h1Var = (h1) obj;
            if (this.f47868a == h1Var.f47868a && this.f47869b == h1Var.f47869b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f47868a * 31) + this.f47869b;
    }
}
