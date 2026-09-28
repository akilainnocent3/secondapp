package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class eey<T> extends j4<T, T> {
    public final qm70 b;

    public static final class a<T> extends AtomicReference<pse> implements kfy<T>, pse {
        public final kfy<? super T> a;
        public final AtomicReference<pse> b = new AtomicReference<>();

        public a(kfy<? super T> kfyVar) {
            this.a = kfyVar;
        }

        @Override // defpackage.pse
        public final void dispose() {
            xse.a(this.b);
            xse.a(this);
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return xse.b(get());
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
            xse.d(this.b, pseVar);
        }
    }

    public final class b implements Runnable {
        public final a<T> a;

        public b(a<T> aVar) {
            this.a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            eey.this.a.a(this.a);
        }
    }

    public eey(ucy ucyVar, qm70 qm70Var) {
        super(ucyVar);
        this.b = qm70Var;
    }

    @Override // defpackage.ucy
    public final void g(kfy<? super T> kfyVar) {
        a aVar = new a(kfyVar);
        kfyVar.onSubscribe(aVar);
        xse.d(aVar, this.b.c(new b(aVar)));
    }
}
