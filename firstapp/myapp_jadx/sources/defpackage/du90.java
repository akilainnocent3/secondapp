package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class du90<T> extends ct90<T> {
    public final au90 a;
    public final rdn b;

    public static final class a<T> extends AtomicReference<ib> implements zu90<T>, pse {
        public final zu90<? super T> a;
        public pse b;

        public a(zu90 zu90Var, rdn rdnVar) {
            this.a = zu90Var;
            lazySet(rdnVar);
        }

        @Override // defpackage.pse
        public final void dispose() {
            ib andSet = getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.run();
                } catch (Throwable th) {
                    qtg.a(th);
                    o760.b(th);
                }
                this.b.dispose();
            }
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.b.isDisposed();
        }

        @Override // defpackage.zu90
        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // defpackage.zu90
        public final void onSubscribe(pse pseVar) {
            if (xse.e(this.b, pseVar)) {
                this.b = pseVar;
                this.a.onSubscribe(this);
            }
        }

        @Override // defpackage.zu90
        public final void onSuccess(T t) {
            this.a.onSuccess(t);
        }
    }

    public du90(au90 au90Var, rdn rdnVar) {
        this.a = au90Var;
        this.b = rdnVar;
    }

    @Override // defpackage.ct90
    public final void c(zu90<? super T> zu90Var) {
        this.a.a(new a(zu90Var, this.b));
    }
}
