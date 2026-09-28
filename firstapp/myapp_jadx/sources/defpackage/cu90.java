package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class cu90<T> extends ct90<T> {
    public final ct90 a;
    public final ib b;

    public static final class a<T> implements zu90<T>, pse {
        public final zu90<? super T> a;
        public final ib b;
        public pse c;

        public a(zu90<? super T> zu90Var, ib ibVar) {
            this.a = zu90Var;
            this.b = ibVar;
        }

        @Override // defpackage.pse
        public final void dispose() {
            this.c.dispose();
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.c.isDisposed();
        }

        @Override // defpackage.zu90
        public final void onError(Throwable th) {
            this.a.onError(th);
            try {
                this.b.run();
            } catch (Throwable th2) {
                qtg.a(th2);
                o760.b(th2);
            }
        }

        @Override // defpackage.zu90
        public final void onSubscribe(pse pseVar) {
            if (xse.e(this.c, pseVar)) {
                this.c = pseVar;
                this.a.onSubscribe(this);
            }
        }

        @Override // defpackage.zu90
        public final void onSuccess(T t) {
            this.a.onSuccess(t);
            try {
                this.b.run();
            } catch (Throwable th) {
                qtg.a(th);
                o760.b(th);
            }
        }
    }

    public cu90(ct90 ct90Var, ib ibVar) {
        this.a = ct90Var;
        this.b = ibVar;
    }

    @Override // defpackage.ct90
    public final void c(zu90<? super T> zu90Var) {
        this.a.a(new a(zu90Var, this.b));
    }
}
