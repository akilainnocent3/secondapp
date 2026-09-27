package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import fw.b;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class ECommerceProduct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f95393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f95394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f95395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ECommercePrice f95396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ECommercePrice f95397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f95398g;

    public ECommerceProduct(@NonNull String str) {
        this.f95392a = str;
    }

    @Nullable
    public ECommercePrice getActualPrice() {
        return this.f95396e;
    }

    @Nullable
    public List<String> getCategoriesPath() {
        return this.f95394c;
    }

    @Nullable
    public String getName() {
        return this.f95393b;
    }

    @Nullable
    public ECommercePrice getOriginalPrice() {
        return this.f95397f;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.f95395d;
    }

    @Nullable
    public List<String> getPromocodes() {
        return this.f95398g;
    }

    @NonNull
    public String getSku() {
        return this.f95392a;
    }

    @NonNull
    public ECommerceProduct setActualPrice(@Nullable ECommercePrice eCommercePrice) {
        this.f95396e = eCommercePrice;
        return this;
    }

    @NonNull
    public ECommerceProduct setCategoriesPath(@Nullable List<String> list) {
        this.f95394c = list;
        return this;
    }

    @NonNull
    public ECommerceProduct setName(@Nullable String str) {
        this.f95393b = str;
        return this;
    }

    @NonNull
    public ECommerceProduct setOriginalPrice(@Nullable ECommercePrice eCommercePrice) {
        this.f95397f = eCommercePrice;
        return this;
    }

    @NonNull
    public ECommerceProduct setPayload(@Nullable Map<String, String> map) {
        this.f95395d = map;
        return this;
    }

    @NonNull
    public ECommerceProduct setPromocodes(@Nullable List<String> list) {
        this.f95398g = list;
        return this;
    }

    public String toString() {
        return "ECommerceProduct{sku='" + this.f95392a + "', name='" + this.f95393b + "', categoriesPath=" + this.f95394c + ", payload=" + this.f95395d + ", actualPrice=" + this.f95396e + ", originalPrice=" + this.f95397f + ", promocodes=" + this.f95398g + b.f85383j;
    }
}
