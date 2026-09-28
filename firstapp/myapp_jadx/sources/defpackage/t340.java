package defpackage;

import java.util.List;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
public final class t340<T> implements a390<T>, lyh, abj<T> {
    public final /* synthetic */ a390<T> a;

    public t340(vtw vtwVar, jvd0 jvd0Var) {
        this.a = vtwVar;
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
        return d390.c(this, coroutineContext, i, pb5Var);
    }
}
