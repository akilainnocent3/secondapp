package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes8.dex */
public final class z2i<T> extends e3<T, T> {
    public final long c;

    public static final class a<T> extends AtomicLong implements n3i<T>, bee0 {
        public final zde0<? super T> a;
        public long b;
        public bee0 c;

        public a(zde0<? super T> zde0Var, long j) {
            this.a = zde0Var;
            this.b = j;
            lazySet(j);
        }

        @Override // defpackage.zde0
        public final void a(bee0 bee0Var) {
            if (gee0.f(this.c, bee0Var)) {
                long j = this.b;
                zde0<? super T> zde0Var = this.a;
                if (j != 0) {
                    this.c = bee0Var;
                    zde0Var.a(this);
                } else {
                    bee0Var.cancel();
                    zde0Var.a(y3g.a);
                    zde0Var.onComplete();
                }
            }
        }

        @Override // defpackage.bee0
        public final void cancel() {
            this.c.cancel();
        }

        @Override // defpackage.zde0
        public final void onComplete() {
            if (this.b > 0) {
                this.b = 0L;
                this.a.onComplete();
            }
        }

        @Override // defpackage.zde0
        public final void onError(Throwable th) {
            if (this.b <= 0) {
                o760.b(th);
            } else {
                this.b = 0L;
                this.a.onError(th);
            }
        }

        @Override // defpackage.zde0
        public final void onNext(T t) {
            long j = this.b;
            if (j > 0) {
                long j2 = j - 1;
                this.b = j2;
                zde0<? super T> zde0Var = this.a;
                zde0Var.onNext(t);
                if (j2 == 0) {
                    this.c.cancel();
                    zde0Var.onComplete();
                }
            }
        }

        @Override // defpackage.bee0
        public final void request(long j) {
            long j2;
            long j3;
            if (gee0.e(j)) {
                do {
                    j2 = get();
                    if (j2 == 0) {
                        return;
                    } else {
                        j3 = j2 <= j ? j2 : j;
                    }
                } while (!compareAndSet(j2, j2 - j3));
                this.c.request(j3);
            }
        }
    }

    public z2i(r2i<T> r2iVar, long j) {
        super(r2iVar);
        this.c = j;
    }

    @Override // defpackage.r2i
    public final void i(zde0<? super T> zde0Var) {
        this.b.h(new a(zde0Var, this.c));
    }
}
