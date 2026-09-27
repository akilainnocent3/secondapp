package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dj, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5000dj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f97206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f97207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f97208d;

    public C5000dj(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), eCommerceScreen.getSearchQuery(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceScreen.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceScreen.getPayload()));
    }

    public final String toString() {
        return "ScreenWrapper{name='" + this.f97205a + "', categoriesPath=" + this.f97206b + ", searchQuery='" + this.f97207c + "', payload=" + this.f97208d + fw.b.f85383j;
    }

    public C5000dj(String str, String str2, List list, Map map) {
        this.f97205a = str;
        this.f97206b = list;
        this.f97207c = str2;
        this.f97208d = map;
    }
}
