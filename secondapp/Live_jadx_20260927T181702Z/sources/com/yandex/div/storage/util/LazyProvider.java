package com.yandex.div.storage.util;

import cr.c;
import dr.i0;
import dr.k0;
import ds.a;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class LazyProvider<T> implements c<T> {

    @l
    private final i0 value$delegate;

    public LazyProvider(@l a<? extends T> aVar) {
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
