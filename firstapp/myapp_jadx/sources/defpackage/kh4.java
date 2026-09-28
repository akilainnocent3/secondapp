package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class kh4<T> extends ucy<T> {
    public final ucy<bi50<T>> a;

    public static class a<R> implements kfy<bi50<R>> {
        public final kfy<? super R> a;
        public boolean b;

        public a(kfy<? super R> kfyVar) {
            this.a = kfyVar;
        }

        @Override // defpackage.kfy
        public final void onComplete() {
            if (this.b) {
                return;
            }
            this.a.onComplete();
        }

        @Override // defpackage.kfy
        public final void onError(Throwable th) {
            if (!this.b) {
                this.a.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            o760.b(assertionError);
        }

        @Override // defpackage.kfy
        public final void onNext(Object obj) {
            bi50 bi50Var = (bi50) obj;
            boolean isSuccessful = bi50Var.a.getIsSuccessful();
            kfy<? super R> kfyVar = this.a;
            if (isSuccessful) {
                kfyVar.onNext(bi50Var.b);
                return;
            }
            this.b = true;
            uom uomVar = new uom(bi50Var);
            try {
                kfyVar.onError(uomVar);
            } catch (Throwable th) {
                qtg.a(th);
                o760.b(new gma(uomVar, th));
            }
        }

        @Override // defpackage.kfy
        public final void onSubscribe(pse pseVar) {
            this.a.onSubscribe(pseVar);
        }
    }

    public kh4(ucy<bi50<T>> ucyVar) {
        this.a = ucyVar;
    }

    @Override // defpackage.ucy
    public final void g(kfy<? super T> kfyVar) {
        this.a.a(new a(kfyVar));
    }
}
