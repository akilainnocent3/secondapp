package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Dl implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4909a6 fromModel(@NonNull El el2) {
        C4909a6 c4909a6 = new C4909a6();
        c4909a6.f96913a = (String) WrapUtils.getOrDefault(el2.f95792a, c4909a6.f96913a);
        c4909a6.f96914b = (String) WrapUtils.getOrDefault(el2.f95793b, c4909a6.f96914b);
        c4909a6.f96915c = ((Integer) WrapUtils.getOrDefault(el2.f95794c, Integer.valueOf(c4909a6.f96915c))).intValue();
        c4909a6.f96918f = ((Integer) WrapUtils.getOrDefault(el2.f95795d, Integer.valueOf(c4909a6.f96918f))).intValue();
        c4909a6.f96916d = (String) WrapUtils.getOrDefault(el2.f95796e, c4909a6.f96916d);
        c4909a6.f96917e = ((Boolean) WrapUtils.getOrDefault(el2.f95797f, Boolean.valueOf(c4909a6.f96917e))).booleanValue();
        return c4909a6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final El a(@NonNull C4909a6 c4909a6) {
        throw new UnsupportedOperationException();
    }
}
