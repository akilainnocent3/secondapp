package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Im implements ProtobufConverter {
    @NonNull
    public final C5483wm a(@NonNull Hm hm2) {
        C5483wm c5483wm = new C5483wm();
        c5483wm.f98545a = hm2.f95915a;
        return c5483wm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object fromModel(@NonNull Object obj) {
        C5483wm c5483wm = new C5483wm();
        c5483wm.f98545a = ((Hm) obj).f95915a;
        return c5483wm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        return new Hm(((C5483wm) obj).f98545a);
    }

    @NonNull
    public final Hm a(@NonNull C5483wm c5483wm) {
        return new Hm(c5483wm.f98545a);
    }
}
