package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.mo;
import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class ECommerceAmount {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BigDecimal f95381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f95382b;

    public ECommerceAmount(long j10, @NonNull String str) {
        this(mo.a(j10), str);
    }

    @NonNull
    public BigDecimal getAmount() {
        return this.f95381a;
    }

    @NonNull
    public String getUnit() {
        return this.f95382b;
    }

    @NonNull
    public String toString() {
        return "ECommerceAmount{amount=" + this.f95381a + ", unit='" + this.f95382b + "'}";
    }

    public ECommerceAmount(double d10, @NonNull String str) {
        this(new BigDecimal(mo.a(d10)), str);
    }

    public ECommerceAmount(@NonNull BigDecimal bigDecimal, @NonNull String str) {
        this.f95381a = bigDecimal;
        this.f95382b = str;
    }
}
