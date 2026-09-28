package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class fm8 extends yl8 {
    public final yl8 a;
    public final qm70 b;

    public static final class a implements mm8, pse, Runnable {
        public final mm8 a;
        public final qm70 b;
        public pse c;
        public volatile boolean d;

        public a(mm8 mm8Var, qm70 qm70Var) {
            this.a = mm8Var;
            this.b = qm70Var;
        }

        @Override // defpackage.pse
        public final void dispose() {
            this.d = true;
            this.b.c(this);
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.d;
        }

        @Override // defpackage.mm8
        public final void onComplete() {
            if (this.d) {
                return;
            }
            this.a.onComplete();
        }

        @Override // defpackage.mm8
        public final void onError(Throwable th) {
            if (this.d) {
                o760.b(th);
            } else {
                this.a.onError(th);
            }
        }

        @Override // defpackage.mm8
        public final void onSubscribe(pse pseVar) {
            if (xse.e(this.c, pseVar)) {
                this.c = pseVar;
                this.a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.c.dispose();
            this.c = xse.a;
        }
    }

    public fm8(yl8 yl8Var, qm70 qm70Var) {
        this.a = yl8Var;
        this.b = qm70Var;
    }

    @Override // defpackage.yl8
    public final void e(mm8 mm8Var) {
        this.a.b(new a(mm8Var, this.b));
    }
}
