package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class lm8 extends yl8 {
    public final yl8 a;
    public final qm70 b;

    public static final class a extends AtomicReference<pse> implements mm8, pse, Runnable {
        public final mm8 a;
        public final qm70 b;
        public Throwable c;

        public a(mm8 mm8Var, qm70 qm70Var) {
            this.a = mm8Var;
            this.b = qm70Var;
        }

        @Override // defpackage.pse
        public final void dispose() {
            xse.a(this);
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return xse.b(get());
        }

        @Override // defpackage.mm8
        public final void onComplete() {
            xse.c(this, this.b.c(this));
        }

        @Override // defpackage.mm8
        public final void onError(Throwable th) {
            this.c = th;
            xse.c(this, this.b.c(this));
        }

        @Override // defpackage.mm8
        public final void onSubscribe(pse pseVar) {
            if (xse.d(this, pseVar)) {
                this.a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.c;
            mm8 mm8Var = this.a;
            if (th == null) {
                mm8Var.onComplete();
            } else {
                this.c = null;
                mm8Var.onError(th);
            }
        }
    }

    public lm8(yl8 yl8Var, qm70 qm70Var) {
        this.a = yl8Var;
        this.b = qm70Var;
    }

    @Override // defpackage.yl8
    public final void e(mm8 mm8Var) {
        this.a.b(new a(mm8Var, this.b));
    }
}
