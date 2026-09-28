package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class lu90<T, R> extends ct90<R> {
    public final ct90 a;
    public final faj<? super T, ? extends dw90<? extends R>> b;

    public static final class a<T, R> extends AtomicReference<pse> implements zu90<T>, pse {
        public final zu90<? super R> a;
        public final faj<? super T, ? extends dw90<? extends R>> b;

        /* JADX INFO: renamed from: lu90$a$a, reason: collision with other inner class name */
        public static final class C0837a<R> implements zu90<R> {
            public final a a;
            public final zu90<? super R> b;

            public C0837a(a aVar, zu90 zu90Var) {
                this.a = aVar;
                this.b = zu90Var;
            }

            @Override // defpackage.zu90
            public final void onError(Throwable th) {
                this.b.onError(th);
            }

            @Override // defpackage.zu90
            public final void onSubscribe(pse pseVar) {
                xse.c(this.a, pseVar);
            }

            @Override // defpackage.zu90
            public final void onSuccess(R r) {
                this.b.onSuccess(r);
            }
        }

        public a(zu90<? super R> zu90Var, faj<? super T, ? extends dw90<? extends R>> fajVar) {
            this.a = zu90Var;
            this.b = fajVar;
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
            this.a.onError(th);
        }

        @Override // defpackage.zu90
        public final void onSubscribe(pse pseVar) {
            if (xse.d(this, pseVar)) {
                this.a.onSubscribe(this);
            }
        }

        @Override // defpackage.zu90
        public final void onSuccess(T t) {
            zu90<? super R> zu90Var = this.a;
            try {
                dw90<? extends R> dw90VarApply = this.b.apply(t);
                yby.b(dw90VarApply, "The single returned by the mapper is null");
                dw90<? extends R> dw90Var = dw90VarApply;
                if (isDisposed()) {
                    return;
                }
                dw90Var.a(new C0837a(this, zu90Var));
            } catch (Throwable th) {
                qtg.a(th);
                zu90Var.onError(th);
            }
        }
    }

    public lu90(ct90 ct90Var, faj fajVar) {
        this.b = fajVar;
        this.a = ct90Var;
    }

    @Override // defpackage.ct90
    public final void c(zu90<? super R> zu90Var) {
        this.a.a(new a(zu90Var, this.b));
    }
}
