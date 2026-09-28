package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class om8 extends yl8 {
    public final yl8 a;
    public final taj.e b = taj.d;
    public final pya<? super Throwable> c;
    public final taj.d d;
    public final taj.d e;
    public final taj.d f;
    public final taj.d g;

    public final class a implements mm8, pse {
        public final mm8 a;
        public pse b;

        public a(mm8 mm8Var) {
            this.a = mm8Var;
        }

        @Override // defpackage.pse
        public final void dispose() {
            try {
                om8.this.g.getClass();
            } catch (Throwable th) {
                qtg.a(th);
                o760.b(th);
            }
            this.b.dispose();
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.b.isDisposed();
        }

        @Override // defpackage.mm8
        public final void onComplete() {
            mm8 mm8Var = this.a;
            om8 om8Var = om8.this;
            if (this.b == xse.a) {
                return;
            }
            try {
                om8Var.d.getClass();
                om8Var.e.getClass();
                mm8Var.onComplete();
                try {
                    om8Var.f.getClass();
                } catch (Throwable th) {
                    qtg.a(th);
                    o760.b(th);
                }
            } catch (Throwable th2) {
                qtg.a(th2);
                mm8Var.onError(th2);
            }
        }

        @Override // defpackage.mm8
        public final void onError(Throwable th) {
            om8 om8Var = om8.this;
            if (this.b == xse.a) {
                o760.b(th);
                return;
            }
            try {
                om8Var.c.accept(th);
                om8Var.e.getClass();
            } catch (Throwable th2) {
                qtg.a(th2);
                th = new gma(th, th2);
            }
            this.a.onError(th);
            try {
                om8Var.f.getClass();
            } catch (Throwable th3) {
                qtg.a(th3);
                o760.b(th3);
            }
        }

        @Override // defpackage.mm8
        public final void onSubscribe(pse pseVar) {
            mm8 mm8Var = this.a;
            try {
                om8.this.b.getClass();
                if (xse.e(this.b, pseVar)) {
                    this.b = pseVar;
                    mm8Var.onSubscribe(this);
                }
            } catch (Throwable th) {
                qtg.a(th);
                pseVar.dispose();
                this.b = xse.a;
                mm8Var.onSubscribe(f2g.a);
                mm8Var.onError(th);
            }
        }
    }

    public om8(yl8 yl8Var, pya pyaVar) {
        this.a = yl8Var;
        this.c = pyaVar;
        taj.d dVar = taj.c;
        this.d = dVar;
        this.e = dVar;
        this.f = dVar;
        this.g = dVar;
    }

    @Override // defpackage.yl8
    public final void e(mm8 mm8Var) {
        this.a.b(new a(mm8Var));
    }
}
