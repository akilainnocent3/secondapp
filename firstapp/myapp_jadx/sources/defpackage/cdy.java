package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class cdy<T> extends j4<T, T> {
    public final pya<? super T> b;
    public final taj.e c;
    public final taj.d d;
    public final taj.d e;

    public static final class a<T> implements kfy<T>, pse {
        public final kfy<? super T> a;
        public final pya<? super T> b;
        public final pya<? super Throwable> c;
        public final ib d;
        public final ib e;
        public pse f;
        public boolean i;

        public a(kfy kfyVar, pya pyaVar, taj.e eVar, taj.d dVar, taj.d dVar2) {
            this.a = kfyVar;
            this.b = pyaVar;
            this.c = eVar;
            this.d = dVar;
            this.e = dVar2;
        }

        @Override // defpackage.pse
        public final void dispose() {
            this.f.dispose();
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.f.isDisposed();
        }

        @Override // defpackage.kfy
        public final void onComplete() {
            if (this.i) {
                return;
            }
            try {
                this.d.run();
                this.i = true;
                this.a.onComplete();
                try {
                    this.e.run();
                } catch (Throwable th) {
                    qtg.a(th);
                    o760.b(th);
                }
            } catch (Throwable th2) {
                qtg.a(th2);
                onError(th2);
            }
        }

        @Override // defpackage.kfy
        public final void onError(Throwable th) {
            if (this.i) {
                o760.b(th);
                return;
            }
            this.i = true;
            try {
                this.c.accept(th);
            } catch (Throwable th2) {
                qtg.a(th2);
                th = new gma(th, th2);
            }
            this.a.onError(th);
            try {
                this.e.run();
            } catch (Throwable th3) {
                qtg.a(th3);
                o760.b(th3);
            }
        }

        @Override // defpackage.kfy
        public final void onNext(T t) {
            if (this.i) {
                return;
            }
            try {
                this.b.accept(t);
                this.a.onNext(t);
            } catch (Throwable th) {
                qtg.a(th);
                this.f.dispose();
                onError(th);
            }
        }

        @Override // defpackage.kfy
        public final void onSubscribe(pse pseVar) {
            if (xse.e(this.f, pseVar)) {
                this.f = pseVar;
                this.a.onSubscribe(this);
            }
        }
    }

    public cdy(ucy ucyVar, pya pyaVar) {
        super(ucyVar);
        this.b = pyaVar;
        this.c = taj.d;
        taj.d dVar = taj.c;
        this.d = dVar;
        this.e = dVar;
    }

    @Override // defpackage.ucy
    public final void g(kfy<? super T> kfyVar) {
        this.a.a(new a(kfyVar, this.b, this.c, this.d, this.e));
    }
}
