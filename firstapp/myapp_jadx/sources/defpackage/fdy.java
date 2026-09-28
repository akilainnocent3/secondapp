package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class fdy<T> extends ldv<T> implements zaj<T> {
    public final ucy a;

    public static final class a<T> implements kfy<T>, pse {
        public final mdv.a a;
        public pse b;
        public long c;
        public boolean d;

        public a(mdv.a aVar) {
            this.a = aVar;
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
            xse xseVar = xse.a;
            mdv.a aVar = this.a;
            aVar.b = xseVar;
            aVar.a.onComplete();
        }

        @Override // defpackage.kfy
        public final void onError(Throwable th) {
            if (this.d) {
                o760.b(th);
                return;
            }
            this.d = true;
            xse xseVar = xse.a;
            mdv.a aVar = this.a;
            aVar.b = xseVar;
            aVar.a.onError(th);
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
            xse xseVar = xse.a;
            mdv.a aVar = this.a;
            aVar.b = xseVar;
            aVar.a.onComplete();
        }

        @Override // defpackage.kfy
        public final void onSubscribe(pse pseVar) {
            if (xse.e(this.b, pseVar)) {
                this.b = pseVar;
                mdv.a aVar = this.a;
                if (xse.e(aVar.b, this)) {
                    aVar.b = this;
                    aVar.a.onSubscribe(aVar);
                }
            }
        }
    }

    public fdy(ucy ucyVar) {
        this.a = ucyVar;
    }

    @Override // defpackage.zaj
    public final ucy<T> a() {
        return new edy(this.a);
    }
}
