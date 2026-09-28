package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes8.dex */
public final class o3i<T> extends e3<T, T> {
    public final long c;
    public final TimeUnit d;
    public final qm70 e;

    public static final class a<T> extends AtomicLong implements n3i<T>, bee0, Runnable {
        public final je80 a;
        public final long b;
        public final TimeUnit c;
        public final qm70.c d;
        public bee0 e;
        public final md80 f = new md80();
        public volatile boolean i;
        public boolean v;

        public a(je80 je80Var, long j, TimeUnit timeUnit, qm70.c cVar) {
            this.a = je80Var;
            this.b = j;
            this.c = timeUnit;
            this.d = cVar;
        }

        @Override // defpackage.zde0
        public final void a(bee0 bee0Var) {
            if (gee0.f(this.e, bee0Var)) {
                this.e = bee0Var;
                this.a.a(this);
                bee0Var.request(Long.MAX_VALUE);
            }
        }

        @Override // defpackage.bee0
        public final void cancel() {
            this.e.cancel();
            this.d.dispose();
        }

        @Override // defpackage.zde0
        public final void onComplete() {
            if (this.v) {
                return;
            }
            this.v = true;
            this.a.onComplete();
            this.d.dispose();
        }

        @Override // defpackage.zde0
        public final void onError(Throwable th) {
            if (this.v) {
                o760.b(th);
                return;
            }
            this.v = true;
            this.a.onError(th);
            this.d.dispose();
        }

        @Override // defpackage.zde0
        public final void onNext(T t) {
            if (this.v || this.i) {
                return;
            }
            this.i = true;
            if (get() == 0) {
                this.v = true;
                cancel();
                this.a.onError(new sqv("Could not deliver value due to lack of requests"));
            } else {
                this.a.onNext(t);
                ot1.e(this, 1L);
                pse pseVar = this.f.get();
                if (pseVar != null) {
                    pseVar.dispose();
                }
                xse.c(this.f, this.d.a(this, this.b, this.c));
            }
        }

        @Override // defpackage.bee0
        public final void request(long j) {
            if (gee0.e(j)) {
                ot1.a(this, j);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.i = false;
        }
    }

    public o3i(b3i b3iVar, long j, qm70 qm70Var) {
        super(b3iVar);
        this.c = j;
        this.d = TimeUnit.MILLISECONDS;
        this.e = qm70Var;
    }

    @Override // defpackage.r2i
    public final void i(zde0<? super T> zde0Var) {
        this.b.h(new a(new je80(zde0Var), this.c, this.d, this.e.b()));
    }
}
