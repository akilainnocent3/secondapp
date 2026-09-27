package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f96851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96852b;

    public Z(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public final String toString() {
        return "AmountWrapper{amount=" + this.f96851a + ", unit='" + this.f96852b + "'}";
    }

    public Z(BigDecimal bigDecimal, String str) {
        this.f96851a = bigDecimal;
        this.f96852b = str;
    }
}
