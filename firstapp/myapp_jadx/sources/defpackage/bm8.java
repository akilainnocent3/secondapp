package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public final class bm8 extends yl8 {
    public final Callable<? extends sm8> a;

    public bm8(Callable<? extends sm8> callable) {
        this.a = callable;
    }

    @Override // defpackage.yl8
    public final void e(mm8 mm8Var) {
        try {
            sm8 sm8VarCall = this.a.call();
            yby.b(sm8VarCall, "The completableSupplier returned a null CompletableSource");
            sm8VarCall.b(mm8Var);
        } catch (Throwable th) {
            qtg.a(th);
            mm8Var.onSubscribe(f2g.a);
            mm8Var.onError(th);
        }
    }
}
