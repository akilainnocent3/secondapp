package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class m3i<T> extends e3<T, T> {
    public final qm70 c;
    public final boolean d;

    public static final class a<T> extends AtomicReference<Thread> implements n3i<T>, bee0, Runnable {
        public final zde0<? super T> a;
        public final qm70.c b;
        public final AtomicReference<bee0> c = new AtomicReference<>();
        public final AtomicLong d = new AtomicLong();
        public final boolean e;
        public m830<T> f;

        /* JADX INFO: renamed from: m3i$a$a, reason: collision with other inner class name */
        public static final class RunnableC0856a implements Runnable {
            public final bee0 a;
            public final long b;

            public RunnableC0856a(long j, bee0 bee0Var) {
                this.a = bee0Var;
                this.b = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.request(this.b);
            }
        }

        public a(zde0<? super T> zde0Var, qm70.c cVar, m830<T> m830Var, boolean z) {
            this.a = zde0Var;
            this.b = cVar;
            this.f = m830Var;
            this.e = !z;
        }

        @Override // defpackage.zde0
        public final void a(bee0 bee0Var) {
            if (gee0.d(this.c, bee0Var)) {
                long andSet = this.d.getAndSet(0L);
                if (andSet != 0) {
                    b(andSet, bee0Var);
                }
            }
        }

        public final void b(long j, bee0 bee0Var) {
            if (this.e || Thread.currentThread() == get()) {
                bee0Var.request(j);
            } else {
                this.b.b(new RunnableC0856a(j, bee0Var));
            }
        }

        @Override // defpackage.bee0
        public final void cancel() {
            gee0.a(this.c);
            this.b.dispose();
        }

        @Override // defpackage.zde0
        public final void onComplete() {
            this.a.onComplete();
            this.b.dispose();
        }

        @Override // defpackage.zde0
        public final void onError(Throwable th) {
            this.a.onError(th);
            this.b.dispose();
        }

        @Override // defpackage.zde0
        public final void onNext(T t) {
            this.a.onNext(t);
        }

        @Override // defpackage.bee0
        public final void request(long j) {
            if (gee0.e(j)) {
                AtomicReference<bee0> atomicReference = this.c;
                bee0 bee0Var = atomicReference.get();
                if (bee0Var != null) {
                    b(j, bee0Var);
                    return;
                }
                AtomicLong atomicLong = this.d;
                ot1.a(atomicLong, j);
                bee0 bee0Var2 = atomicReference.get();
                if (bee0Var2 != null) {
                    long andSet = atomicLong.getAndSet(0L);
                    if (andSet != 0) {
                        b(andSet, bee0Var2);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            lazySet(Thread.currentThread());
            m830<T> m830Var = this.f;
            this.f = null;
            m830Var.c(this);
        }
    }

    public m3i(r2i r2iVar, qm70 qm70Var) {
        super(r2iVar);
        this.c = qm70Var;
        this.d = true;
    }

    @Override // defpackage.r2i
    public final void i(zde0<? super T> zde0Var) {
        qm70.c cVarB = this.c.b();
        a aVar = new a(zde0Var, cVarB, this.b, this.d);
        zde0Var.a(aVar);
        cVarB.b(aVar);
    }
}
