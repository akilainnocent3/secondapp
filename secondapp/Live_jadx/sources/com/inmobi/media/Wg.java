package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Wg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55731a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55732b = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wg)) {
            return false;
        }
        Wg wg2 = (Wg) obj;
        return this.f55731a == wg2.f55731a && this.f55732b == wg2.f55732b;
    }

    public final int hashCode() {
        return this.f55732b + (this.f55731a * 31);
    }

    public final String toString() {
        return "PurchaseData(noOfInAppPurchases=" + this.f55731a + ", noOfSubscriptions=" + this.f55732b + gi.j.f86771d;
    }
}
