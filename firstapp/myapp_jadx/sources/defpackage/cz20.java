package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class cz20<T> implements bz20<T>, ytw<T> {
    public final /* synthetic */ ytw<T> a;
    public final CoroutineContext b;

    public cz20(ytw<T> ytwVar, CoroutineContext coroutineContext) {
        this.a = ytwVar;
        this.b = coroutineContext;
    }

    @Override // defpackage.v5b
    public final CoroutineContext getCoroutineContext() {
        return this.b;
    }

    @Override // defpackage.twd0
    public final T getValue() {
        return this.a.getValue();
    }

    @Override // defpackage.ytw
    public final void setValue(T t) {
        this.a.setValue(t);
    }
}
