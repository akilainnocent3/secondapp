package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class idy<T> extends j4<T, T> {
    public final nm20<? super T> b;

    public static final class a<T> extends j92<T, T> {
        public final nm20<? super T> f;

        public a(kfy<? super T> kfyVar, nm20<? super T> nm20Var) {
            super(kfyVar);
            this.f = nm20Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.kfy
        public final void onNext(T t) {
            int i = this.e;
            kfy<? super R> kfyVar = this.a;
            if (i != 0) {
                kfyVar.onNext(null);
                return;
            }
            try {
                if (this.f.test(t)) {
                    kfyVar.onNext((Object) t);
                }
            } catch (Throwable th) {
                qtg.a(th);
                this.b.dispose();
                onError(th);
            }
        }

        @Override // defpackage.lk90
        public final T poll() {
            T tPoll;
            do {
                tPoll = this.c.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.f.test(tPoll));
            return tPoll;
        }
    }

    public idy(ucy ucyVar, nm20 nm20Var) {
        super(ucyVar);
        this.b = nm20Var;
    }

    @Override // defpackage.ucy
    public final void g(kfy<? super T> kfyVar) {
        this.a.a(new a(kfyVar, this.b));
    }
}
