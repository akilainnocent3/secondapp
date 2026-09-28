package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class v2i<T> extends e3<T, T> {
    public final taj.e c;
    public final taj.f d;
    public final o87 e;

    public static final class a<T> implements n3i<T>, bee0 {
        public final zde0<? super T> a;
        public final pya<? super bee0> b;
        public final rjt c;
        public final ib d;
        public bee0 e;

        public a(zde0 zde0Var, taj.e eVar, taj.f fVar, o87 o87Var) {
            this.a = zde0Var;
            this.b = eVar;
            this.d = o87Var;
            this.c = fVar;
        }

        @Override // defpackage.zde0
        public final void a(bee0 bee0Var) {
            zde0<? super T> zde0Var = this.a;
            try {
                this.b.accept(bee0Var);
                if (gee0.f(this.e, bee0Var)) {
                    this.e = bee0Var;
                    zde0Var.a(this);
                }
            } catch (Throwable th) {
                qtg.a(th);
                bee0Var.cancel();
                this.e = gee0.a;
                zde0Var.a(y3g.a);
                zde0Var.onError(th);
            }
        }

        @Override // defpackage.bee0
        public final void cancel() {
            bee0 bee0Var = this.e;
            gee0 gee0Var = gee0.a;
            if (bee0Var != gee0Var) {
                this.e = gee0Var;
                try {
                    this.d.run();
                } catch (Throwable th) {
                    qtg.a(th);
                    o760.b(th);
                }
                bee0Var.cancel();
            }
        }

        @Override // defpackage.zde0
        public final void onComplete() {
            if (this.e != gee0.a) {
                this.a.onComplete();
            }
        }

        @Override // defpackage.zde0
        public final void onError(Throwable th) {
            if (this.e != gee0.a) {
                this.a.onError(th);
            } else {
                o760.b(th);
            }
        }

        @Override // defpackage.zde0
        public final void onNext(T t) {
            this.a.onNext(t);
        }

        @Override // defpackage.bee0
        public final void request(long j) {
            try {
                this.c.getClass();
            } catch (Throwable th) {
                qtg.a(th);
                o760.b(th);
            }
            this.e.request(j);
        }
    }

    public v2i(z2i z2iVar, o87 o87Var) {
        super(z2iVar);
        this.c = taj.d;
        this.d = taj.f;
        this.e = o87Var;
    }

    @Override // defpackage.r2i
    public final void i(zde0<? super T> zde0Var) {
        this.b.h(new a(zde0Var, this.c, this.d, this.e));
    }
}
