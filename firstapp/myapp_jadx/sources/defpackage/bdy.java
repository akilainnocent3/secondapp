package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class bdy<T> extends j4<T, T> {
    public final ib b;

    public static final class a<T> extends l92<T> implements kfy<T> {
        public final kfy<? super T> a;
        public final ib b;
        public pse c;
        public gb30<T> d;
        public boolean e;

        public a(kfy<? super T> kfyVar, ib ibVar) {
            this.a = kfyVar;
            this.b = ibVar;
        }

        public final void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.b.run();
                } catch (Throwable th) {
                    qtg.a(th);
                    o760.b(th);
                }
            }
        }

        @Override // defpackage.mb30
        public final int b(int i) {
            gb30<T> gb30Var = this.d;
            if (gb30Var == null || (i & 4) != 0) {
                return 0;
            }
            int iB = gb30Var.b(i);
            if (iB != 0) {
                this.e = iB == 1;
            }
            return iB;
        }

        @Override // defpackage.lk90
        public final void clear() {
            this.d.clear();
        }

        @Override // defpackage.pse
        public final void dispose() {
            this.c.dispose();
            a();
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.c.isDisposed();
        }

        @Override // defpackage.lk90
        public final boolean isEmpty() {
            return this.d.isEmpty();
        }

        @Override // defpackage.kfy
        public final void onComplete() {
            this.a.onComplete();
            a();
        }

        @Override // defpackage.kfy
        public final void onError(Throwable th) {
            this.a.onError(th);
            a();
        }

        @Override // defpackage.kfy
        public final void onNext(T t) {
            this.a.onNext(t);
        }

        @Override // defpackage.kfy
        public final void onSubscribe(pse pseVar) {
            if (xse.e(this.c, pseVar)) {
                this.c = pseVar;
                if (pseVar instanceof gb30) {
                    this.d = (gb30) pseVar;
                }
                this.a.onSubscribe(this);
            }
        }

        @Override // defpackage.lk90
        public final T poll() {
            T tPoll = this.d.poll();
            if (tPoll == null && this.e) {
                a();
            }
            return tPoll;
        }
    }

    public bdy(ucy ucyVar, ib ibVar) {
        super(ucyVar);
        this.b = ibVar;
    }

    @Override // defpackage.ucy
    public final void g(kfy<? super T> kfyVar) {
        this.a.a(new a(kfyVar, this.b));
    }
}
