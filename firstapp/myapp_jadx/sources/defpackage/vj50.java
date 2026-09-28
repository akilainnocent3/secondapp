package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class vj50<T> extends ucy<aj50<T>> {
    public final ucy<bi50<T>> a;

    public static class a<R> implements kfy<bi50<R>> {
        public final kfy<? super aj50<R>> a;

        public a(kfy<? super aj50<R>> kfyVar) {
            this.a = kfyVar;
        }

        @Override // defpackage.kfy
        public final void onComplete() {
            this.a.onComplete();
        }

        @Override // defpackage.kfy
        public final void onError(Throwable th) {
            kfy<? super aj50<R>> kfyVar = this.a;
            try {
                if (th == null) {
                    throw new NullPointerException("error == null");
                }
                kfyVar.onNext(new aj50());
                kfyVar.onComplete();
            } catch (Throwable th2) {
                try {
                    kfyVar.onError(th2);
                } catch (Throwable th3) {
                    qtg.a(th3);
                    o760.b(new gma(th2, th3));
                }
            }
        }

        @Override // defpackage.kfy
        public final void onNext(Object obj) {
            if (((bi50) obj) == null) {
                bmy.a("response == null");
            } else {
                this.a.onNext(new aj50());
            }
        }

        @Override // defpackage.kfy
        public final void onSubscribe(pse pseVar) {
            this.a.onSubscribe(pseVar);
        }
    }

    public vj50(ucy<bi50<T>> ucyVar) {
        this.a = ucyVar;
    }

    @Override // defpackage.ucy
    public final void g(kfy<? super aj50<T>> kfyVar) {
        this.a.a(new a(kfyVar));
    }
}
