package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class um8<T> extends ucy<T> {
    public final im8 a;

    public um8(im8 im8Var) {
        this.a = im8Var;
    }

    @Override // defpackage.ucy
    public final void g(kfy<? super T> kfyVar) {
        this.a.b(new a(kfyVar));
    }

    public static final class a extends ha2<Void> implements mm8 {
        public final kfy<?> a;
        public pse b;

        public a(kfy<?> kfyVar) {
            this.a = kfyVar;
        }

        @Override // defpackage.mb30
        public final int b(int i) {
            return 2;
        }

        @Override // defpackage.pse
        public final void dispose() {
            this.b.dispose();
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.b.isDisposed();
        }

        @Override // defpackage.lk90
        public final boolean isEmpty() {
            return true;
        }

        @Override // defpackage.mm8
        public final void onComplete() {
            this.a.onComplete();
        }

        @Override // defpackage.mm8
        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // defpackage.mm8
        public final void onSubscribe(pse pseVar) {
            if (xse.e(this.b, pseVar)) {
                this.b = pseVar;
                this.a.onSubscribe(this);
            }
        }

        @Override // defpackage.lk90
        public final Object poll() {
            return null;
        }

        @Override // defpackage.lk90
        public final void clear() {
        }
    }
}
