package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class fw90<T> extends r2i<T> {
    public final ct90 b;

    public static final class a<T> extends ujd<T> implements zu90<T> {
        public pse c;

        @Override // defpackage.bee0
        public final void cancel() {
            set(4);
            this.b = null;
            this.c.dispose();
        }

        @Override // defpackage.zu90
        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // defpackage.zu90
        public final void onSubscribe(pse pseVar) {
            if (xse.e(this.c, pseVar)) {
                this.c = pseVar;
                this.a.a(this);
            }
        }

        @Override // defpackage.zu90
        public final void onSuccess(T t) {
            int i = get();
            do {
                zde0<? super T> zde0Var = this.a;
                if (i == 8) {
                    this.b = t;
                    lazySet(16);
                    zde0Var.onNext(t);
                    if (get() != 4) {
                        zde0Var.onComplete();
                        return;
                    }
                    return;
                }
                if ((i & (-3)) != 0) {
                    return;
                }
                if (i == 2) {
                    lazySet(3);
                    zde0Var.onNext(t);
                    if (get() != 4) {
                        zde0Var.onComplete();
                        return;
                    }
                    return;
                }
                this.b = t;
                if (compareAndSet(0, 1)) {
                    return;
                } else {
                    i = get();
                }
            } while (i != 4);
            this.b = null;
        }
    }

    public fw90(ct90 ct90Var) {
        this.b = ct90Var;
    }

    @Override // defpackage.r2i
    public final void i(zde0<? super T> zde0Var) {
        this.b.a(new a(zde0Var));
    }
}
