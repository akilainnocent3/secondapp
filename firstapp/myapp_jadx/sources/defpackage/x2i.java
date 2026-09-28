package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class x2i<T> extends r2i<T> {
    public final ucy<T> b;

    public x2i(ucy<T> ucyVar) {
        this.b = ucyVar;
    }

    @Override // defpackage.r2i
    public final void i(zde0<? super T> zde0Var) {
        this.b.a(new a(zde0Var));
    }

    public static final class a<T> implements kfy<T>, bee0 {
        public final zde0<? super T> a;
        public pse b;

        public a(zde0<? super T> zde0Var) {
            this.a = zde0Var;
        }

        @Override // defpackage.bee0
        public final void cancel() {
            this.b.dispose();
        }

        @Override // defpackage.kfy
        public final void onComplete() {
            this.a.onComplete();
        }

        @Override // defpackage.kfy
        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // defpackage.kfy
        public final void onNext(T t) {
            this.a.onNext(t);
        }

        @Override // defpackage.kfy
        public final void onSubscribe(pse pseVar) {
            this.b = pseVar;
            this.a.a(this);
        }

        @Override // defpackage.bee0
        public final void request(long j) {
        }
    }
}
