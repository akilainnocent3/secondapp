package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import fw.b;
import io.appmetrica.analytics.impl.mo;
import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class ECommerceCartItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ECommerceProduct f95383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BigDecimal f95384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ECommercePrice f95385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ECommerceReferrer f95386d;

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, long j10) {
        this(eCommerceProduct, eCommercePrice, mo.a(j10));
    }

    @NonNull
    public ECommerceProduct getProduct() {
        return this.f95383a;
    }

    @NonNull
    public BigDecimal getQuantity() {
        return this.f95384b;
    }

    @Nullable
    public ECommerceReferrer getReferrer() {
        return this.f95386d;
    }

    @NonNull
    public ECommercePrice getRevenue() {
        return this.f95385c;
    }

    @NonNull
    public ECommerceCartItem setReferrer(@Nullable ECommerceReferrer eCommerceReferrer) {
        this.f95386d = eCommerceReferrer;
        return this;
    }

    public String toString() {
        return "ECommerceCartItem{product=" + this.f95383a + ", quantity=" + this.f95384b + ", revenue=" + this.f95385c + ", referrer=" + this.f95386d + b.f85383j;
    }

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, double d10) {
        this(eCommerceProduct, eCommercePrice, new BigDecimal(mo.a(d10)));
    }

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, @NonNull BigDecimal bigDecimal) {
        this.f95383a = eCommerceProduct;
        this.f95384b = bigDecimal;
        this.f95385c = eCommercePrice;
    }
}
