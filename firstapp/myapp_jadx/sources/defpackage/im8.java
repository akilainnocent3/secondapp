package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class im8 extends yl8 {
    public final ib a;

    public im8(ib ibVar) {
        this.a = ibVar;
    }

    @Override // defpackage.yl8
    public final void e(mm8 mm8Var) {
        y160 y160Var = new y160(taj.b);
        mm8Var.onSubscribe(y160Var);
        try {
            this.a.run();
            if (y160Var.isDisposed()) {
                return;
            }
            mm8Var.onComplete();
        } catch (Throwable th) {
            qtg.a(th);
            if (y160Var.isDisposed()) {
                o760.b(th);
            } else {
                mm8Var.onError(th);
            }
        }
    }
}
