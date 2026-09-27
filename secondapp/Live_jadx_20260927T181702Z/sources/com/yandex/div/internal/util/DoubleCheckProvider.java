package com.yandex.div.internal.util;

import com.yandex.div.core.annotations.InternalApi;
import cr.c;
import dr.i0;
import dr.k0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@InternalApi
public final class DoubleCheckProvider<T> implements c<T> {

    @l
    private final i0 value$delegate;

    public DoubleCheckProvider(@l ds.a<? extends T> aVar) {
        this.value$delegate = k0.b(aVar);
    }

    private final T getValue() {
        return (T) this.value$delegate.getValue();
    }

    @Override // cr.c, am.d
    public T get() {
        return getValue();
    }
}
