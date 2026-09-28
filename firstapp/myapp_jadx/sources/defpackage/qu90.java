package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class qu90<T> extends ct90<T> {
    public final T a;

    public qu90(T t) {
        this.a = t;
    }

    @Override // defpackage.ct90
    public final void c(zu90<? super T> zu90Var) {
        zu90Var.onSubscribe(f2g.a);
        zu90Var.onSuccess(this.a);
    }
}
