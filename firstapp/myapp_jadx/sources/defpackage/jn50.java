package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class jn50<T> implements zu90<T> {
    public final qv90.a a;
    public final zu90<? super T> b;

    public jn50(qv90.a aVar, zu90 zu90Var) {
        this.a = aVar;
        this.b = zu90Var;
    }

    @Override // defpackage.zu90
    public final void onError(Throwable th) {
        this.b.onError(th);
    }

    @Override // defpackage.zu90
    public final void onSubscribe(pse pseVar) {
        xse.c(this.a, pseVar);
    }

    @Override // defpackage.zu90
    public final void onSuccess(T t) {
        this.b.onSuccess(t);
    }
}
