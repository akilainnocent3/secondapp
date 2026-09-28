package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class q3i<T> extends r2i<T> {
    public final m830<? extends T> b;
    public final m830<Boolean> c;
    public final boolean d;
    public final int e;

    public static final class a<T> extends AtomicInteger implements zde0<T>, bee0 {
        public final zde0<? super T> a;
        public final lkd0 d;
        public volatile boolean i;
        public volatile boolean v;
        public volatile boolean w;
        public final a<T>.C0999a e = new C0999a();
        public final AtomicLong c = new AtomicLong();
        public final z11 f = new z11();
        public final AtomicReference<bee0> b = new AtomicReference<>();

        /* JADX INFO: renamed from: q3i$a$a, reason: collision with other inner class name */
        public final class C0999a extends AtomicReference<bee0> implements n3i<Boolean> {
            public C0999a() {
            }

            @Override // defpackage.zde0
            public final void a(bee0 bee0Var) {
                if (gee0.d(this, bee0Var)) {
                    bee0Var.request(Long.MAX_VALUE);
                }
            }

            @Override // defpackage.zde0
            public final void onComplete() {
                a.this.onError(new IllegalStateException("The valve source completed unexpectedly."));
            }

            @Override // defpackage.zde0
            public final void onError(Throwable th) {
                a.this.onError(th);
            }

            @Override // defpackage.zde0
            public final void onNext(Object obj) {
                a aVar = a.this;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                aVar.v = zBooleanValue;
                if (zBooleanValue) {
                    aVar.b();
                }
            }
        }

        public a(zde0<? super T> zde0Var, int i, boolean z) {
            this.a = zde0Var;
            this.d = new lkd0(i);
            this.v = z;
        }

        @Override // defpackage.zde0
        public final void a(bee0 bee0Var) {
            gee0.c(this.b, this.c, bee0Var);
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            lkd0 lkd0Var = this.d;
            zde0<? super T> zde0Var = this.a;
            z11 z11Var = this.f;
            int iAddAndGet = 1;
            while (!this.w) {
                if (z11Var.get() != null) {
                    Throwable thB = otg.b(z11Var);
                    lkd0Var.clear();
                    gee0.a(this.b);
                    gee0.a(this.e);
                    zde0Var.onError(thB);
                    return;
                }
                if (this.v) {
                    boolean z = this.i;
                    a03 a03Var = (Object) lkd0Var.poll();
                    boolean z2 = a03Var == null;
                    if (z && z2) {
                        gee0.a(this.e);
                        zde0Var.onComplete();
                        return;
                    } else if (!z2) {
                        zde0Var.onNext(a03Var);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            lkd0Var.clear();
        }

        @Override // defpackage.bee0
        public final void cancel() {
            this.w = true;
            gee0.a(this.b);
            gee0.a(this.e);
        }

        @Override // defpackage.zde0
        public final void onComplete() {
            this.i = true;
            b();
        }

        @Override // defpackage.zde0
        public final void onError(Throwable th) {
            z11 z11Var = this.f;
            z11Var.getClass();
            if (otg.a(z11Var, th)) {
                b();
            } else {
                o760.b(th);
            }
        }

        @Override // defpackage.zde0
        public final void onNext(T t) {
            this.d.offer(t);
            b();
        }

        @Override // defpackage.bee0
        public final void request(long j) {
            gee0.b(this.b, this.c, j);
        }
    }

    public q3i(r2i r2iVar, m830 m830Var, boolean z, int i) {
        this.b = r2iVar;
        this.c = m830Var;
        this.d = z;
        this.e = i;
    }

    @Override // defpackage.r2i
    public final void i(zde0<? super T> zde0Var) {
        a aVar = new a(zde0Var, this.e, this.d);
        zde0Var.a(aVar);
        this.c.c(aVar.e);
        this.b.c(aVar);
    }

    public final q3i l(r2i r2iVar) {
        return new q3i(r2iVar, this.c, this.d, this.e);
    }
}
