package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class edy<T> extends j4<T, T> {

    public static final class a<T> implements kfy<T>, pse {
        public final kfy<? super T> a;
        public pse b;
        public long c;
        public boolean d;

        public a(kfy kfyVar) {
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
            if (this.d) {
                return;
            }
            this.d = true;
            this.a.onComplete();
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
            long j = this.c;
            if (j != 0) {
                this.c = j + 1;
                return;
            }
            this.d = true;
            this.b.dispose();
            kfy<? super T> kfyVar = this.a;
            kfyVar.onNext(t);
            kfyVar.onComplete();
        }

        @Override // defpackage.kfy
        public final void onSubscribe(pse pseVar) {
            if (xse.e(this.b, pseVar)) {
                this.b = pseVar;
                this.a.onSubscribe(this);
            }
        }
    }

    @Override // defpackage.ucy
    public final void g(kfy<? super T> kfyVar) {
        this.a.a(new a(kfyVar));
    }
}
