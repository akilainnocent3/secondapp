package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qe, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5326qe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f98196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f98197d;

    public C5326qe(ECommerceOrder eCommerceOrder) {
        this(UUID.randomUUID().toString(), eCommerceOrder.getIdentifier(), a(eCommerceOrder.getCartItems()), CollectionUtils.mapCopyOfNullableMap(eCommerceOrder.getPayload()));
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C5190l3((ECommerceCartItem) it.next()));
        }
        return arrayList;
    }

    public final String toString() {
        return "OrderWrapper{uuid='" + this.f98194a + "', identifier='" + this.f98195b + "', cartItems=" + this.f98196c + ", payload=" + this.f98197d + fw.b.f85383j;
    }

    public C5326qe(String str, String str2, ArrayList arrayList, Map map) {
        this.f98194a = str;
        this.f98195b = str2;
        this.f98196c = arrayList;
        this.f98197d = map;
    }
}
