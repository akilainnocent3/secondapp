package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class qv90<T> extends ct90<T> {
    public final ct90 a;
    public final ld6 b;

    public static final class a<T> extends AtomicReference<pse> implements zu90<T>, pse {
        public final zu90<? super T> a;
        public final faj<? super Throwable, ? extends dw90<? extends T>> b;

        public a(zu90 zu90Var, ld6 ld6Var) {
            this.a = zu90Var;
            this.b = ld6Var;
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
            zu90<? super T> zu90Var = this.a;
            try {
                dw90<? extends T> dw90VarApply = this.b.apply(th);
                yby.b(dw90VarApply, "The nextFunction returned a null SingleSource.");
                dw90VarApply.a(new jn50(this, zu90Var));
            } catch (Throwable th2) {
                qtg.a(th2);
                zu90Var.onError(new gma(th, th2));
            }
        }

        @Override // defpackage.zu90
        public final void onSubscribe(pse pseVar) {
            if (xse.d(this, pseVar)) {
                this.a.onSubscribe(this);
            }
        }

        @Override // defpackage.zu90
        public final void onSuccess(T t) {
            this.a.onSuccess(t);
        }
    }

    public qv90(ct90 ct90Var, ld6 ld6Var) {
        this.a = ct90Var;
        this.b = ld6Var;
    }

    @Override // defpackage.ct90
    public final void c(zu90<? super T> zu90Var) {
        this.a.a(new a(zu90Var, this.b));
    }
}
