package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class yu90<T> extends ct90<T> {
    public final ct90 a;
    public final qm70 b;

    public static final class a<T> extends AtomicReference<pse> implements zu90<T>, pse, Runnable {
        public final zu90<? super T> a;
        public final qm70 b;
        public T c;
        public Throwable d;

        public a(zu90<? super T> zu90Var, qm70 qm70Var) {
            this.a = zu90Var;
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

        @Override // defpackage.zu90
        public final void onError(Throwable th) {
            this.d = th;
            xse.c(this, this.b.c(this));
        }

        @Override // defpackage.zu90
        public final void onSubscribe(pse pseVar) {
            if (xse.d(this, pseVar)) {
                this.a.onSubscribe(this);
            }
        }

        @Override // defpackage.zu90
        public final void onSuccess(T t) {
            this.c = t;
            xse.c(this, this.b.c(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.d;
            zu90<? super T> zu90Var = this.a;
            if (th != null) {
                zu90Var.onError(th);
            } else {
                zu90Var.onSuccess(this.c);
            }
        }
    }

    public yu90(ct90 ct90Var, qm70 qm70Var) {
        this.a = ct90Var;
        this.b = qm70Var;
    }

    @Override // defpackage.ct90
    public final void c(zu90<? super T> zu90Var) {
        this.a.a(new a(zu90Var, this.b));
    }
}
