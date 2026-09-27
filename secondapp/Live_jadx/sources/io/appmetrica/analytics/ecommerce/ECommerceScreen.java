package io.appmetrica.analytics.ecommerce;

import androidx.annotation.Nullable;
import fw.b;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class ECommerceScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f95402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f95403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f95404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f95405d;

    @Nullable
    public List<String> getCategoriesPath() {
        return this.f95403b;
    }

    @Nullable
    public String getName() {
        return this.f95402a;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.f95405d;
    }

    @Nullable
    public String getSearchQuery() {
        return this.f95404c;
    }

    public ECommerceScreen setCategoriesPath(@Nullable List<String> list) {
        this.f95403b = list;
        return this;
    }

    public ECommerceScreen setName(@Nullable String str) {
        this.f95402a = str;
        return this;
    }

    public ECommerceScreen setPayload(@Nullable Map<String, String> map) {
        this.f95405d = map;
        return this;
    }

    public ECommerceScreen setSearchQuery(@Nullable String str) {
        this.f95404c = str;
        return this;
    }

    public String toString() {
        return "ECommerceScreen{name='" + this.f95402a + "', categoriesPath=" + this.f95403b + ", searchQuery='" + this.f95404c + "', payload=" + this.f95405d + b.f85383j;
    }
}
