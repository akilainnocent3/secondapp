package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class au90<T> extends ct90<T> {
    public final bv90<T> a;

    public static final class a<T> extends AtomicReference<pse> implements hu90<T>, pse {
        public final zu90<? super T> a;

        public a(zu90<? super T> zu90Var) {
            this.a = zu90Var;
        }

        public final boolean a(Throwable th) {
            pse andSet;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            pse pseVar = get();
            xse xseVar = xse.a;
            if (pseVar == xseVar || (andSet = getAndSet(xseVar)) == xseVar) {
                return false;
            }
            try {
                this.a.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // defpackage.pse
        public final void dispose() {
            xse.a(this);
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return xse.b(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return lx5.a(a.class.getSimpleName(), "{", super.toString(), "}");
        }
    }

    public au90(bv90<T> bv90Var) {
        this.a = bv90Var;
    }

    @Override // defpackage.ct90
    public final void c(zu90<? super T> zu90Var) {
        a aVar = new a(zu90Var);
        zu90Var.onSubscribe(aVar);
        try {
            this.a.a(aVar);
        } catch (Throwable th) {
            qtg.a(th);
            if (aVar.a(th)) {
                return;
            }
            o760.b(th);
        }
    }
}
