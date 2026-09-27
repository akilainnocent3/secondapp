package io.appmetrica.analytics.billing.impl;

import java.util.List;
import kotlin.jvm.internal.m0;

/* JADX INFO: renamed from: io.appmetrica.analytics.billing.impl.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4898a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f95023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f95024b;

    public C4898a(List list, boolean z10) {
        this.f95023a = list;
        this.f95024b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4898a)) {
            return false;
        }
        C4898a c4898a = (C4898a) obj;
        return m0.g(this.f95023a, c4898a.f95023a) && this.f95024b == c4898a.f95024b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f95023a.hashCode() * 31;
        boolean z10 = this.f95024b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final String toString() {
        return "AutoInappCollectingInfo(billingInfos=" + this.f95023a + ", firstInappCheckOccurred=" + this.f95024b + ')';
    }
}
