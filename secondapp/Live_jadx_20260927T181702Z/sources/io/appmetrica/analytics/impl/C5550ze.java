package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ze, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5550ze implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5433um fromModel(@NonNull C5525ye c5525ye) {
        C5433um c5433um = new C5433um();
        c5433um.f98421a = c5525ye.f98672a;
        c5433um.f98422b = c5525ye.f98673b;
        return c5433um;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        C5433um c5433um = (C5433um) obj;
        return new C5525ye(c5433um.f98421a, c5433um.f98422b);
    }

    @NonNull
    public final C5525ye a(@NonNull C5433um c5433um) {
        return new C5525ye(c5433um.f98421a, c5433um.f98422b);
    }
}
