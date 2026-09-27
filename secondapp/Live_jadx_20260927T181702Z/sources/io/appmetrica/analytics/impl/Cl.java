package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ListConverter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Cl implements ListConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dl f95704a = new Dl();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4909a6[] fromModel(@NonNull List<El> list) {
        C4909a6[] c4909a6Arr = new C4909a6[list.size()];
        Iterator<El> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            c4909a6Arr[i10] = this.f95704a.fromModel(it.next());
            i10++;
        }
        return c4909a6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final List<El> a(C4909a6[] c4909a6Arr) {
        throw new UnsupportedOperationException();
    }
}
