package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
public final class gm8 extends yl8 {
    public final yl8 a;
    public final ib b;

    public static final class a extends AtomicInteger implements mm8, pse {
        public final mm8 a;
        public final ib b;
        public pse c;

        public a(mm8 mm8Var, ib ibVar) {
            this.a = mm8Var;
            this.b = ibVar;
        }

        public final void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.b.run();
                } catch (Throwable th) {
                    qtg.a(th);
                    o760.b(th);
                }
            }
        }

        @Override // defpackage.pse
        public final void dispose() {
            this.c.dispose();
            a();
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.c.isDisposed();
        }

        @Override // defpackage.mm8
        public final void onComplete() {
            this.a.onComplete();
            a();
        }

        @Override // defpackage.mm8
        public final void onError(Throwable th) {
            this.a.onError(th);
            a();
        }

        @Override // defpackage.mm8
        public final void onSubscribe(pse pseVar) {
            if (xse.e(this.c, pseVar)) {
                this.c = pseVar;
                this.a.onSubscribe(this);
            }
        }
    }

    public gm8(yl8 yl8Var, ib ibVar) {
        this.a = yl8Var;
        this.b = ibVar;
    }

    @Override // defpackage.yl8
    public final void e(mm8 mm8Var) {
        this.a.b(new a(mm8Var, this.b));
    }
}
