package com.yandex.div.core.widget;

import java.util.ConcurrentModificationException;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
final class Resettable<T> {

    @l
    private final ds.a<T> initializer;

    @m
    private T value;

    /* JADX WARN: Multi-variable type inference failed */
    public Resettable(@l ds.a<? extends T> aVar) {
        this.initializer = aVar;
    }

    public final T get() {
        if (this.value == null) {
            this.value = this.initializer.invoke();
        }
        T t10 = this.value;
        if (t10 != null) {
            return t10;
        }
        throw new ConcurrentModificationException("Set to null by another thread");
    }

    public final boolean getInitialized() {
        return this.value != null;
    }

    public final void reset() {
        this.value = null;
    }
}
