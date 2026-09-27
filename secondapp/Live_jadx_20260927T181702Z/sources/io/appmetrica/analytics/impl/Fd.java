package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Fd implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final Ed f95823a = new Ed();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f95824b = fr.n1.W(dr.v1.a(NativeCrashSource.UNKNOWN, 0), dr.v1.a(NativeCrashSource.CRASHPAD, 3));

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W5 fromModel(@oy.l Ld ld2) {
        W5 w10 = new W5();
        w10.f96665f = 1;
        V5 v10 = new V5();
        v10.f96599a = ld2.f96105a;
        Z5 z10 = new Z5();
        Integer num = (Integer) f95824b.get(ld2.f96106b.f95934a);
        if (num != null) {
            z10.f96860a = num.intValue();
        }
        String str = ld2.f96106b.f95935b;
        if (str == null) {
            str = "";
        }
        z10.f96861b = str;
        v10.f96600b = z10;
        w10.f96666g = v10;
        return w10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @oy.l
    public final Ld a(@oy.l W5 w10) {
        throw new UnsupportedOperationException();
    }
}
