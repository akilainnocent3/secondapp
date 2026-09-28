package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes8.dex */
public final class cey<T> extends ct90<T> {
    public final ucy a;

    public static final class a<T> implements kfy<T>, pse {
        public final zu90<? super T> a;
        public pse b;
        public T c;
        public boolean d;

        public a(zu90 zu90Var) {
            this.a = zu90Var;
        }

        @Override // defpackage.pse
        public final void dispose() {
            this.b.dispose();
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.b.isDisposed();
        }

        @Override // defpackage.kfy
        public final void onComplete() {
            if (this.d) {
                return;
            }
            this.d = true;
            T t = this.c;
            this.c = null;
            if (t == null) {
                t = null;
            }
            zu90<? super T> zu90Var = this.a;
            if (t != null) {
                zu90Var.onSuccess(t);
            } else {
                zu90Var.onError(new NoSuchElementException());
            }
        }

        @Override // defpackage.kfy
        public final void onError(Throwable th) {
            if (this.d) {
                o760.b(th);
            } else {
                this.d = true;
                this.a.onError(th);
            }
        }

        @Override // defpackage.kfy
        public final void onNext(T t) {
            if (this.d) {
                return;
            }
            if (this.c == null) {
                this.c = t;
                return;
            }
            this.d = true;
            this.b.dispose();
            this.a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // defpackage.kfy
        public final void onSubscribe(pse pseVar) {
            if (xse.e(this.b, pseVar)) {
                this.b = pseVar;
                this.a.onSubscribe(this);
            }
        }
    }

    public cey(ucy ucyVar) {
        this.a = ucyVar;
    }

    @Override // defpackage.ct90
    public final void c(zu90<? super T> zu90Var) {
        this.a.a(new a(zu90Var));
    }
}
