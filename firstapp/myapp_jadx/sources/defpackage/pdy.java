package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class pdy<T> extends ucy<T> implements jy60<T> {
    public final T a;

    public pdy(T t) {
        this.a = t;
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        return this.a;
    }

    @Override // defpackage.ucy
    public final void g(kfy<? super T> kfyVar) {
        zdy.a aVar = new zdy.a(kfyVar, this.a);
        kfyVar.onSubscribe(aVar);
        aVar.run();
    }
}
