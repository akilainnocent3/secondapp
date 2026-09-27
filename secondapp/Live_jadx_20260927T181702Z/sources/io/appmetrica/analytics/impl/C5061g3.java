package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5061g3 implements ProtobufConverter {
    @NonNull
    public final C5309pm a(@NonNull C5009e3 c5009e3) {
        C5309pm c5309pm = new C5309pm();
        c5309pm.f98155a = c5009e3.f97240a;
        return c5309pm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object fromModel(@NonNull Object obj) {
        C5309pm c5309pm = new C5309pm();
        c5309pm.f98155a = ((C5009e3) obj).f97240a;
        return c5309pm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        return new C5009e3(((C5309pm) obj).f98155a);
    }

    @NonNull
    public final C5009e3 a(@NonNull C5309pm c5309pm) {
        return new C5009e3(c5309pm.f98155a);
    }
}
