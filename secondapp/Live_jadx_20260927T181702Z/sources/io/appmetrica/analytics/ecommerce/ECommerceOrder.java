package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import fw.b;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class ECommerceOrder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f95388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f95389c;

    public ECommerceOrder(@NonNull String str, @NonNull List<ECommerceCartItem> list) {
        this.f95387a = str;
        this.f95388b = list;
    }

    @NonNull
    public List<ECommerceCartItem> getCartItems() {
        return this.f95388b;
    }

    @NonNull
    public String getIdentifier() {
        return this.f95387a;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.f95389c;
    }

    public ECommerceOrder setPayload(@Nullable Map<String, String> map) {
        this.f95389c = map;
        return this;
    }

    public String toString() {
        return "ECommerceOrder{identifier='" + this.f95387a + "', cartItems=" + this.f95388b + ", payload=" + this.f95389c + b.f85383j;
    }
}
