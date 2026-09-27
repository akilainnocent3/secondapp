package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceReferrer;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5527yg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5000dj f98678c;

    public C5527yg(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C5000dj(eCommerceReferrer.getScreen()));
    }

    public final String toString() {
        return "ReferrerWrapper{type='" + this.f98676a + "', identifier='" + this.f98677b + "', screen=" + this.f98678c + fw.b.f85383j;
    }

    public C5527yg(String str, String str2, C5000dj c5000dj) {
        this.f98676a = str;
        this.f98677b = str2;
        this.f98678c = c5000dj;
    }
}
