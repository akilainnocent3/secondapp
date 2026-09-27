package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import fw.b;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class ECommercePrice {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ECommerceAmount f95390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f95391b;

    public ECommercePrice(@NonNull ECommerceAmount eCommerceAmount) {
        this.f95390a = eCommerceAmount;
    }

    @NonNull
    public ECommerceAmount getFiat() {
        return this.f95390a;
    }

    @Nullable
    public List<ECommerceAmount> getInternalComponents() {
        return this.f95391b;
    }

    public ECommercePrice setInternalComponents(@Nullable List<ECommerceAmount> list) {
        this.f95391b = list;
        return this;
    }

    public String toString() {
        return "ECommercePrice{fiat=" + this.f95390a + ", internalComponents=" + this.f95391b + b.f85383j;
    }
}
