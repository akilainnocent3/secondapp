package defpackage;

import java.util.List;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
public final class v340<T> implements uwd0<T>, lyh, abj<T> {
    public final /* synthetic */ uwd0<T> a;
    public final c9p b;

    public v340(ztw ztwVar, c9p c9pVar) {
        this.a = ztwVar;
        this.b = c9pVar;
    }

    @Override // defpackage.a390
    public final List<T> c() {
        return this.a.c();
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super T> myhVar, v1b<?> v1bVar) {
        return this.a.collect(myhVar, v1bVar);
    }

    @Override // defpackage.abj
    public final lyh<T> d(CoroutineContext coroutineContext, int i, pb5 pb5Var) {
        return (((i < 0 || i >= 2) && i != -2) || pb5Var != pb5.b) ? d390.c(this, coroutineContext, i, pb5Var) : this;
    }

    @Override // defpackage.uwd0
    public final T getValue() {
        return this.a.getValue();
    }
}
