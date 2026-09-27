package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Q8 implements ProtobufConverter {
    public static C5445v9 a(P8 p10) {
        C5445v9 c5445v9 = new C5445v9();
        c5445v9.f98461d = new int[p10.f96318b.size()];
        Iterator it = p10.f96318b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            c5445v9.f98461d[i10] = ((Integer) it.next()).intValue();
            i10++;
        }
        c5445v9.f98460c = p10.f96320d;
        c5445v9.f98459b = p10.f96319c;
        c5445v9.f98458a = p10.f96317a;
        return c5445v9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return a((P8) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C5445v9 c5445v9 = (C5445v9) obj;
        return new P8(c5445v9.f98458a, c5445v9.f98459b, c5445v9.f98460c, CollectionUtils.hashSetFromIntArray(c5445v9.f98461d));
    }
}
