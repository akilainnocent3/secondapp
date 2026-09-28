package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public final class ldy<T> extends ucy<T> implements Callable<T> {
    public final ax4 a;

    public ldy(ax4 ax4Var) {
        this.a = ax4Var;
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        this.a.call();
        return (T) Boolean.TRUE;
    }

    @Override // defpackage.ucy
    public final void g(kfy<? super T> kfyVar) {
        tjd tjdVar = new tjd(kfyVar);
        kfyVar.onSubscribe(tjdVar);
        if (tjdVar.isDisposed()) {
            return;
        }
        try {
            this.a.call();
            tjdVar.a(Boolean.TRUE);
        } catch (Throwable th) {
            qtg.a(th);
            if (tjdVar.isDisposed()) {
                o760.b(th);
            } else {
                kfyVar.onError(th);
            }
        }
    }
}
