package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5190l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final If f97784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f97785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Af f97786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5527yg f97787d;

    public C5190l3(ECommerceCartItem eCommerceCartItem) {
        this(new If(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new Af(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new C5527yg(eCommerceCartItem.getReferrer()));
    }

    public final String toString() {
        return "CartItemWrapper{product=" + this.f97784a + ", quantity=" + this.f97785b + ", revenue=" + this.f97786c + ", referrer=" + this.f97787d + fw.b.f85383j;
    }

    public C5190l3(If r10, BigDecimal bigDecimal, Af af2, C5527yg c5527yg) {
        this.f97784a = r10;
        this.f97785b = bigDecimal;
        this.f97786c = af2;
        this.f97787d = c5527yg;
    }
}
