package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class vu5<T> extends ucy<bi50<T>> {
    public final su5<T> a;

    public static final class a implements pse {
        public final su5<?> a;
        public volatile boolean b;

        public a(su5<?> su5Var) {
            this.a = su5Var;
        }

        @Override // defpackage.pse
        public final void dispose() {
            this.b = true;
            this.a.cancel();
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.b;
        }
    }

    public vu5(su5<T> su5Var) {
        this.a = su5Var;
    }

    @Override // defpackage.ucy
    public final void g(kfy<? super bi50<T>> kfyVar) {
        su5<T> su5VarClone = this.a.clone();
        a aVar = new a(su5VarClone);
        kfyVar.onSubscribe(aVar);
        if (aVar.b) {
            return;
        }
        boolean z = false;
        try {
            bi50<T> bi50VarExecute = su5VarClone.execute();
            if (!aVar.b) {
                kfyVar.onNext(bi50VarExecute);
            }
            if (aVar.b) {
                return;
            }
            try {
                kfyVar.onComplete();
            } catch (Throwable th) {
                th = th;
                z = true;
                qtg.a(th);
                if (z) {
                    o760.b(th);
                    return;
                }
                if (aVar.b) {
                    return;
                }
                try {
                    kfyVar.onError(th);
                } catch (Throwable th2) {
                    qtg.a(th2);
                    o760.b(new gma(th, th2));
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
