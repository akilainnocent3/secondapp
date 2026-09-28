package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class ew90<T> extends ct90<T> {
    public final ct90 a;
    public final qm70 b;

    public static final class a<T> extends AtomicReference<pse> implements zu90<T>, pse, Runnable {
        public final zu90<? super T> a;
        public final md80 b = new md80();
        public final dw90<? extends T> c;

        public a(zu90 zu90Var, ct90 ct90Var) {
            this.a = zu90Var;
            this.c = ct90Var;
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

        @Override // defpackage.zu90
        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // defpackage.zu90
        public final void onSubscribe(pse pseVar) {
            xse.d(this, pseVar);
        }

        @Override // defpackage.zu90
        public final void onSuccess(T t) {
            this.a.onSuccess(t);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.c.a(this);
        }
    }

    public ew90(ct90 ct90Var, qm70 qm70Var) {
        this.a = ct90Var;
        this.b = qm70Var;
    }

    @Override // defpackage.ct90
    public final void c(zu90<? super T> zu90Var) {
        a aVar = new a(zu90Var, this.a);
        zu90Var.onSubscribe(aVar);
        xse.c(aVar.b, this.b.c(aVar));
    }
}
