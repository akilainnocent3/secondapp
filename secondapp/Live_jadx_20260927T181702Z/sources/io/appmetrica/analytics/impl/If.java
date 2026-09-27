package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class If {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f95938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f95939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Af f95940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Af f95941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f95942g;

    public If(ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new Af(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() != null ? new Af(eCommerceProduct.getOriginalPrice()) : null, CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getPromocodes()));
    }

    public final String toString() {
        return "ProductWrapper{sku='" + this.f95936a + "', name='" + this.f95937b + "', categoriesPath=" + this.f95938c + ", payload=" + this.f95939d + ", actualPrice=" + this.f95940e + ", originalPrice=" + this.f95941f + ", promocodes=" + this.f95942g + fw.b.f85383j;
    }

    public If(String str, String str2, List list, Map map, Af af2, Af af3, List list2) {
        this.f95936a = str;
        this.f95937b = str2;
        this.f95938c = list;
        this.f95939d = map;
        this.f95940e = af2;
        this.f95941f = af3;
        this.f95942g = list2;
    }
}
