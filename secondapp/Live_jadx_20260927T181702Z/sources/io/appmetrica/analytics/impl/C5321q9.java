package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5321q9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5271o9 fromModel(@NonNull C5296p9 c5296p9) {
        C5271o9 c5271o9 = new C5271o9();
        String str = c5296p9.f98128a;
        if (str != null) {
            c5271o9.f98031a = str.getBytes();
        }
        return c5271o9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5296p9 toModel(@NonNull C5271o9 c5271o9) {
        return new C5296p9(new String(c5271o9.f98031a));
    }
}
