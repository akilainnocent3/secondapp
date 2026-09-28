package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class tm8 extends yl8 {
    public final yl8 a;
    public final qm70 b;

    public static final class a extends AtomicReference<pse> implements mm8, pse, Runnable {
        public final mm8 a;
        public final md80 b = new md80();
        public final sm8 c;

        public a(mm8 mm8Var, yl8 yl8Var) {
            this.a = mm8Var;
            this.c = yl8Var;
        }

        @Override // defpackage.pse
        public final void dispose() {
            xse.a(this);
            xse.a(this.b);
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return xse.b(get());
        }

        @Override // defpackage.mm8
        public final void onComplete() {
            this.a.onComplete();
        }

        @Override // defpackage.mm8
        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // defpackage.mm8
        public final void onSubscribe(pse pseVar) {
            xse.d(this, pseVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.c.b(this);
        }
    }

    public tm8(yl8 yl8Var, qm70 qm70Var) {
        this.a = yl8Var;
        this.b = qm70Var;
    }

    @Override // defpackage.yl8
    public final void e(mm8 mm8Var) {
        a aVar = new a(mm8Var, this.a);
        mm8Var.onSubscribe(aVar);
        xse.c(aVar.b, this.b.c(aVar));
    }
}
