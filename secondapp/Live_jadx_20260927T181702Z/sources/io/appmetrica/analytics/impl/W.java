package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class W implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5534yn f96636a;

    public W(@NonNull C5534yn c5534yn) {
        this.f96636a = c5534yn;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S5 fromModel(@NonNull V v10) {
        S5 s10 = new S5();
        C5509xn c5509xn = v10.f96592a;
        if (c5509xn != null) {
            s10.f96442a = this.f96636a.fromModel(c5509xn);
        }
        s10.f96443b = new C4935b6[v10.f96593b.size()];
        Iterator it = v10.f96593b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            s10.f96443b[i10] = this.f96636a.fromModel((C5509xn) it.next());
            i10++;
        }
        String str = v10.f96594c;
        if (str != null) {
            s10.f96444c = str;
        }
        return s10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final V a(@NonNull S5 s10) {
        throw new UnsupportedOperationException();
    }
}
