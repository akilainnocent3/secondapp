package com.yandex.div.internal.util;

import java.lang.ref.WeakReference;
import js.f;
import kotlin.jvm.internal.x;
import ns.o;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
final class WeakRef<T> implements f<Object, T> {

    @m
    private WeakReference<T> weakReference;

    /* JADX WARN: Illegal instructions before constructor call */
    public WeakRef() {
        x xVar = null;
        this(xVar, 1, xVar);
    }

    @Override // js.f, js.e
    @m
    public T getValue(@m Object obj, @l o<?> oVar) {
        WeakReference<T> weakReference = this.weakReference;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // js.f
    public void setValue(@m Object obj, @l o<?> oVar, @m T t10) {
        this.weakReference = t10 != null ? new WeakReference<>(t10) : null;
    }

    public WeakRef(@m T t10) {
        this.weakReference = t10 != null ? new WeakReference<>(t10) : null;
    }

    public /* synthetic */ WeakRef(Object obj, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : obj);
    }
}
