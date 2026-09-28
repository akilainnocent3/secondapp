package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class p3i<T> extends e3<T, T> {
    public final long c;
    public final TimeUnit d;
    public final qm70 e;

    public static final class a<T> extends AtomicLong implements n3i<T>, bee0, b {
        public final zde0<? super T> a;
        public final long b;
        public final TimeUnit c;
        public final qm70.c d;
        public final md80 e = new md80();
        public final AtomicReference<bee0> f = new AtomicReference<>();
        public final AtomicLong i = new AtomicLong();

        public a(zde0<? super T> zde0Var, long j, TimeUnit timeUnit, qm70.c cVar) {
            this.a = zde0Var;
            this.b = j;
            this.c = timeUnit;
            this.d = cVar;
        }

        @Override // defpackage.zde0
        public final void a(bee0 bee0Var) {
            gee0.c(this.f, this.i, bee0Var);
        }

        @Override // p3i.b
        public final void b(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                gee0.a(this.f);
                otg.a aVar = otg.a;
                StringBuilder sbA = q6a0.a(this.b, "The source did not signal an event for ", " ");
                sbA.append(this.c.toString().toLowerCase());
                sbA.append(" and has been terminated.");
                this.a.onError(new TimeoutException(sbA.toString()));
                this.d.dispose();
            }
        }

        @Override // defpackage.bee0
        public final void cancel() {
            gee0.a(this.f);
            this.d.dispose();
        }

        @Override // defpackage.zde0
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                xse.a(this.e);
                this.a.onComplete();
                this.d.dispose();
            }
        }

        @Override // defpackage.zde0
        public final void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                o760.b(th);
                return;
            }
            xse.a(this.e);
            this.a.onError(th);
            this.d.dispose();
        }

        @Override // defpackage.zde0
        public final void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    md80 md80Var = this.e;
                    md80Var.get().dispose();
                    this.a.onNext(t);
                    xse.c(md80Var, this.d.a(new c(j2, this), this.b, this.c));
                }
            }
        }

        @Override // defpackage.bee0
        public final void request(long j) {
            gee0.b(this.f, this.i, j);
        }
    }

    public interface b {
        void b(long j);
    }

    public static final class c implements Runnable {
        public final b a;
        public final long b;

        public c(long j, b bVar) {
            this.b = j;
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.b(this.b);
        }
    }

    public p3i(r2i r2iVar, qm70 qm70Var) {
        super(r2iVar);
        this.c = 10L;
        this.d = TimeUnit.SECONDS;
        this.e = qm70Var;
    }

    @Override // defpackage.r2i
    public final void i(zde0<? super T> zde0Var) {
        a aVar = new a(zde0Var, this.c, this.d, this.e.b());
        zde0Var.a(aVar);
        xse.c(aVar.e, aVar.d.a(new c(0L, aVar), aVar.b, aVar.c));
        this.b.h(aVar);
    }
}
