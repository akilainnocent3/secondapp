package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class xu90<T, R> extends ct90<R> {
    public final ct90 a;
    public final faj<? super T, ? extends R> b;

    public static final class a<T, R> implements zu90<T> {
        public final zu90<? super R> a;
        public final faj<? super T, ? extends R> b;

        public a(zu90<? super R> zu90Var, faj<? super T, ? extends R> fajVar) {
            this.a = zu90Var;
            this.b = fajVar;
        }

        @Override // defpackage.zu90
        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // defpackage.zu90
        public final void onSubscribe(pse pseVar) {
            this.a.onSubscribe(pseVar);
        }

        @Override // defpackage.zu90
        public final void onSuccess(T t) {
            try {
                R rApply = this.b.apply(t);
                yby.b(rApply, "The mapper function returned a null value.");
                this.a.onSuccess(rApply);
            } catch (Throwable th) {
                qtg.a(th);
                onError(th);
            }
        }
    }

    public xu90(ct90 ct90Var, faj fajVar) {
        this.a = ct90Var;
        this.b = fajVar;
    }

    @Override // defpackage.ct90
    public final void c(zu90<? super R> zu90Var) {
        this.a.a(new a(zu90Var, this.b));
    }
}
