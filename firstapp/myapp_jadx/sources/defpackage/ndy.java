package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class ndy<T> extends j4<T, T> {
    @Override // defpackage.ucy
    public final void g(kfy<? super T> kfyVar) {
        this.a.a(new a(kfyVar));
    }

    public static final class a<T> implements kfy<T>, pse {
        public final kfy<? super T> a;
        public pse b;

        public a(kfy<? super T> kfyVar) {
            this.a = kfyVar;
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
            this.a.onComplete();
        }

        @Override // defpackage.kfy
        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // defpackage.kfy
        public final void onSubscribe(pse pseVar) {
            this.b = pseVar;
            this.a.onSubscribe(this);
        }

        @Override // defpackage.kfy
        public final void onNext(T t) {
        }
    }
}
