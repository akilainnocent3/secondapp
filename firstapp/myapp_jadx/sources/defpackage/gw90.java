package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class gw90<T> extends ucy<T> {
    public final dw90<? extends T> a;

    public static final class a<T> extends tjd<T> implements zu90<T> {
        public pse c;

        @Override // defpackage.tjd, defpackage.pse
        public final void dispose() {
            super.dispose();
            this.c.dispose();
        }

        @Override // defpackage.zu90
        public final void onError(Throwable th) {
            if ((get() & 54) != 0) {
                o760.b(th);
            } else {
                lazySet(2);
                this.a.onError(th);
            }
        }

        @Override // defpackage.zu90
        public final void onSubscribe(pse pseVar) {
            if (xse.e(this.c, pseVar)) {
                this.c = pseVar;
                this.a.onSubscribe(this);
            }
        }
    }

    public gw90(ct90 ct90Var) {
        this.a = ct90Var;
    }

    @Override // defpackage.ucy
    public final void g(kfy<? super T> kfyVar) {
        this.a.a(new a(kfyVar));
    }
}
