package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4968cd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f97113b;

    public C4968cd(String str, boolean z10) {
        this.f97112a = str;
        this.f97113b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4968cd)) {
            return false;
        }
        C4968cd c4968cd = (C4968cd) obj;
        return kotlin.jvm.internal.m0.g(this.f97112a, c4968cd.f97112a) && this.f97113b == c4968cd.f97113b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f97112a.hashCode() * 31;
        boolean z10 = this.f97113b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final String toString() {
        return "ModuleStatus(moduleName=" + this.f97112a + ", loaded=" + this.f97113b + ')';
    }
}
