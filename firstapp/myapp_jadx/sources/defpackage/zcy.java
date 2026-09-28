package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class zcy<T> extends ucy<T> {
    public final cx4 a;

    public zcy(cx4 cx4Var) {
        this.a = cx4Var;
    }

    @Override // defpackage.ucy
    public final void g(kfy<? super T> kfyVar) {
        try {
            ((dey) this.a.call()).a(kfyVar);
        } catch (Throwable th) {
            qtg.a(th);
            kfyVar.onSubscribe(f2g.a);
            kfyVar.onError(th);
        }
    }
}
