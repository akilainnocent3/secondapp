package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.me, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5226me implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(@oy.m Boolean bool) {
        int i10;
        if (bool == null) {
            i10 = -1;
        } else if (kotlin.jvm.internal.m0.g(bool, Boolean.TRUE)) {
            i10 = 1;
        } else {
            if (!kotlin.jvm.internal.m0.g(bool, Boolean.FALSE)) {
                throw new dr.o0();
            }
            i10 = 0;
        }
        return Integer.valueOf(i10);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object toModel(Object obj) {
        return a(((Number) obj).intValue());
    }

    @oy.m
    public final Boolean a(int i10) {
        if (i10 == -1) {
            return null;
        }
        if (i10 == 0) {
            return Boolean.FALSE;
        }
        if (i10 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }
}
