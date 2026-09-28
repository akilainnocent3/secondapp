package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes8.dex */
public final class e3i<T> extends e3<T, T> implements pya<T> {
    public final e3i c;

    public static final class a<T> extends AtomicLong implements n3i<T>, bee0 {
        public final zde0<? super T> a;
        public final pya<? super T> b;
        public bee0 c;
        public boolean d;

        public a(zde0 zde0Var, e3i e3iVar) {
            this.a = zde0Var;
            this.b = e3iVar;
        }

        @Override // defpackage.zde0
        public final void a(bee0 bee0Var) {
            if (gee0.f(this.c, bee0Var)) {
                this.c = bee0Var;
                this.a.a(this);
                bee0Var.request(Long.MAX_VALUE);
            }
        }

        @Override // defpackage.bee0
        public final void cancel() {
            this.c.cancel();
        }

        @Override // defpackage.zde0
        public final void onComplete() {
            if (this.d) {
                return;
            }
            this.d = true;
            this.a.onComplete();
        }

        @Override // defpackage.zde0
        public final void onError(Throwable th) {
            if (this.d) {
                o760.b(th);
            } else {
                this.d = true;
                this.a.onError(th);
            }
        }

        @Override // defpackage.zde0
        public final void onNext(T t) {
            if (this.d) {
                return;
            }
            if (get() != 0) {
                this.a.onNext(t);
                ot1.e(this, 1L);
                return;
            }
            try {
                this.b.accept(t);
            } catch (Throwable th) {
                qtg.a(th);
                cancel();
                onError(th);
            }
        }

        @Override // defpackage.bee0
        public final void request(long j) {
            if (gee0.e(j)) {
                ot1.a(this, j);
            }
        }
    }

    public e3i(x2i x2iVar) {
        super(x2iVar);
        this.c = this;
    }

    @Override // defpackage.r2i
    public final void i(zde0<? super T> zde0Var) {
        this.b.h(new a(zde0Var, this.c));
    }

    @Override // defpackage.pya
    public final void accept(T t) {
    }
}
