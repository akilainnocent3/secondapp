package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class s2i<T, U extends Collection<? super T>> extends e3<T, U> {
    public final long c;
    public final long d;
    public final TimeUnit e;
    public final qm70 f;
    public final Callable<U> i;
    public final int v;

    public static final class a<T, U extends Collection<? super T>> extends hb30<T, U, U> implements bee0, Runnable, pse {
        public U A;
        public pse B;
        public bee0 C;
        public long D;
        public long E;
        public final Callable<U> i;
        public final long v;
        public final TimeUnit w;
        public final int y;
        public final qm70.c z;

        public a(je80 je80Var, Callable callable, long j, TimeUnit timeUnit, int i, qm70.c cVar) {
            super(je80Var, new r8w());
            this.i = callable;
            this.v = j;
            this.w = timeUnit;
            this.y = i;
            this.z = cVar;
        }

        @Override // defpackage.zde0
        public final void a(bee0 bee0Var) {
            je80 je80Var = this.c;
            if (gee0.f(this.C, bee0Var)) {
                this.C = bee0Var;
                try {
                    U uCall = this.i.call();
                    yby.b(uCall, "The supplied buffer is null");
                    this.A = uCall;
                    je80Var.a(this);
                    long j = this.v;
                    this.B = this.z.c(this, j, j, this.w);
                    bee0Var.request(Long.MAX_VALUE);
                } catch (Throwable th) {
                    qtg.a(th);
                    this.z.dispose();
                    bee0Var.cancel();
                    je80Var.a(y3g.a);
                    je80Var.onError(th);
                }
            }
        }

        @Override // defpackage.bee0
        public final void cancel() {
            if (this.e) {
                return;
            }
            this.e = true;
            dispose();
        }

        @Override // defpackage.pse
        public final void dispose() {
            synchronized (this) {
                this.A = null;
            }
            this.C.cancel();
            this.z.dispose();
        }

        @Override // defpackage.hb30
        public final void e(je80 je80Var, Object obj) {
            je80Var.onNext((Collection) obj);
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.z.isDisposed();
        }

        @Override // defpackage.zde0
        public final void onComplete() {
            U u;
            synchronized (this) {
                u = this.A;
                this.A = null;
            }
            if (u != null) {
                this.d.offer(u);
                this.f = true;
                if (f()) {
                    k1l.a(this.d, this.c, this, this);
                }
                this.z.dispose();
            }
        }

        @Override // defpackage.zde0
        public final void onError(Throwable th) {
            synchronized (this) {
                this.A = null;
            }
            this.c.onError(th);
            this.z.dispose();
        }

        @Override // defpackage.zde0
        public final void onNext(T t) {
            synchronized (this) {
                try {
                    U u = this.A;
                    if (u == null) {
                        return;
                    }
                    u.add(t);
                    if (u.size() < this.y) {
                        return;
                    }
                    this.A = null;
                    this.D++;
                    g(u, this);
                    try {
                        U uCall = this.i.call();
                        yby.b(uCall, "The supplied buffer is null");
                        U u2 = uCall;
                        synchronized (this) {
                            this.A = u2;
                            this.E++;
                        }
                    } catch (Throwable th) {
                        qtg.a(th);
                        cancel();
                        this.c.onError(th);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // defpackage.bee0
        public final void request(long j) {
            if (gee0.e(j)) {
                ot1.a(this.b, j);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                U uCall = this.i.call();
                yby.b(uCall, "The supplied buffer is null");
                U u = uCall;
                synchronized (this) {
                    U u2 = this.A;
                    if (u2 != null && this.D == this.E) {
                        this.A = u;
                        g(u2, this);
                    }
                }
            } catch (Throwable th) {
                qtg.a(th);
                cancel();
                this.c.onError(th);
            }
        }
    }

    public static final class b<T, U extends Collection<? super T>> extends hb30<T, U, U> implements bee0, Runnable, pse {
        public U A;
        public final AtomicReference<pse> B;
        public final Callable<U> i;
        public final long v;
        public final TimeUnit w;
        public final qm70 y;
        public bee0 z;

        public b(je80 je80Var, Callable callable, long j, TimeUnit timeUnit, qm70 qm70Var) {
            super(je80Var, new r8w());
            this.B = new AtomicReference<>();
            this.i = callable;
            this.v = j;
            this.w = timeUnit;
            this.y = qm70Var;
        }

        @Override // defpackage.zde0
        public final void a(bee0 bee0Var) {
            if (gee0.f(this.z, bee0Var)) {
                this.z = bee0Var;
                try {
                    U uCall = this.i.call();
                    yby.b(uCall, "The supplied buffer is null");
                    this.A = uCall;
                    this.c.a(this);
                    if (this.e) {
                        return;
                    }
                    bee0Var.request(Long.MAX_VALUE);
                    qm70 qm70Var = this.y;
                    long j = this.v;
                    pse pseVarE = qm70Var.e(this, j, j, this.w);
                    AtomicReference<pse> atomicReference = this.B;
                    while (!atomicReference.compareAndSet(null, pseVarE)) {
                        if (atomicReference.get() != null) {
                            pseVarE.dispose();
                            return;
                        }
                    }
                } catch (Throwable th) {
                    qtg.a(th);
                    cancel();
                    je80 je80Var = this.c;
                    je80Var.a(y3g.a);
                    je80Var.onError(th);
                }
            }
        }

        @Override // defpackage.bee0
        public final void cancel() {
            this.e = true;
            this.z.cancel();
            xse.a(this.B);
        }

        @Override // defpackage.pse
        public final void dispose() {
            cancel();
        }

        @Override // defpackage.hb30
        public final void e(je80 je80Var, Object obj) {
            this.c.onNext((Collection) obj);
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.B.get() == xse.a;
        }

        @Override // defpackage.zde0
        public final void onComplete() {
            xse.a(this.B);
            synchronized (this) {
                try {
                    U u = this.A;
                    if (u == null) {
                        return;
                    }
                    this.A = null;
                    this.d.offer(u);
                    this.f = true;
                    if (f()) {
                        k1l.a(this.d, this.c, null, this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // defpackage.zde0
        public final void onError(Throwable th) {
            xse.a(this.B);
            synchronized (this) {
                this.A = null;
            }
            this.c.onError(th);
        }

        @Override // defpackage.zde0
        public final void onNext(T t) {
            synchronized (this) {
                try {
                    U u = this.A;
                    if (u != null) {
                        u.add(t);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // defpackage.bee0
        public final void request(long j) {
            if (gee0.e(j)) {
                ot1.a(this.b, j);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                U uCall = this.i.call();
                yby.b(uCall, "The supplied buffer is null");
                U u = uCall;
                synchronized (this) {
                    try {
                        U u2 = this.A;
                        if (u2 == null) {
                            return;
                        }
                        this.A = u;
                        je80 je80Var = this.c;
                        r8w r8wVar = this.d;
                        AtomicInteger atomicInteger = this.a;
                        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
                            long j = this.b.get();
                            if (j == 0) {
                                cancel();
                                je80Var.onError(new sqv("Could not emit buffer due to lack of requests"));
                                return;
                            } else {
                                e(je80Var, u2);
                                if (j != Long.MAX_VALUE) {
                                    this.b.addAndGet(-1L);
                                }
                                if (this.a.addAndGet(-1) == 0) {
                                    return;
                                }
                            }
                        } else {
                            r8wVar.offer(u2);
                            if (!f()) {
                                return;
                            }
                        }
                        k1l.a(r8wVar, je80Var, this, this);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                qtg.a(th2);
                cancel();
                this.c.onError(th2);
            }
        }
    }

    public static final class c<T, U extends Collection<? super T>> extends hb30<T, U, U> implements bee0, Runnable {
        public final LinkedList A;
        public bee0 B;
        public final Callable<U> i;
        public final long v;
        public final long w;
        public final TimeUnit y;
        public final qm70.c z;

        public final class a implements Runnable {
            public final U a;

            public a(U u) {
                this.a = u;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (c.this) {
                    c.this.A.remove(this.a);
                }
                c cVar = c.this;
                cVar.g(this.a, cVar.z);
            }
        }

        public c(je80 je80Var, Callable callable, long j, long j2, TimeUnit timeUnit, qm70.c cVar) {
            super(je80Var, new r8w());
            this.i = callable;
            this.v = j;
            this.w = j2;
            this.y = timeUnit;
            this.z = cVar;
            this.A = new LinkedList();
        }

        @Override // defpackage.zde0
        public final void a(bee0 bee0Var) {
            qm70.c cVar = this.z;
            je80 je80Var = this.c;
            if (gee0.f(this.B, bee0Var)) {
                this.B = bee0Var;
                try {
                    U uCall = this.i.call();
                    yby.b(uCall, "The supplied buffer is null");
                    U u = uCall;
                    this.A.add(u);
                    je80Var.a(this);
                    bee0Var.request(Long.MAX_VALUE);
                    long j = this.w;
                    this.z.c(this, j, j, this.y);
                    cVar.a(new a(u), this.v, this.y);
                } catch (Throwable th) {
                    qtg.a(th);
                    cVar.dispose();
                    bee0Var.cancel();
                    je80Var.a(y3g.a);
                    je80Var.onError(th);
                }
            }
        }

        @Override // defpackage.bee0
        public final void cancel() {
            this.e = true;
            this.B.cancel();
            this.z.dispose();
            synchronized (this) {
                this.A.clear();
            }
        }

        @Override // defpackage.hb30
        public final void e(je80 je80Var, Object obj) {
            je80Var.onNext((Collection) obj);
        }

        @Override // defpackage.zde0
        public final void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.A);
                this.A.clear();
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                this.d.offer((Collection) obj);
            }
            this.f = true;
            if (f()) {
                k1l.a(this.d, this.c, this.z, this);
            }
        }

        @Override // defpackage.zde0
        public final void onError(Throwable th) {
            this.f = true;
            this.z.dispose();
            synchronized (this) {
                this.A.clear();
            }
            this.c.onError(th);
        }

        @Override // defpackage.zde0
        public final void onNext(T t) {
            synchronized (this) {
                try {
                    Iterator it = this.A.iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).add(t);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // defpackage.bee0
        public final void request(long j) {
            if (gee0.e(j)) {
                ot1.a(this.b, j);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.e) {
                return;
            }
            try {
                U uCall = this.i.call();
                yby.b(uCall, "The supplied buffer is null");
                U u = uCall;
                synchronized (this) {
                    try {
                        if (this.e) {
                            return;
                        }
                        this.A.add(u);
                        this.z.a(new a(u), this.v, this.y);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                qtg.a(th2);
                cancel();
                this.c.onError(th2);
            }
        }
    }

    public s2i(r2i r2iVar, long j, long j2, qm70 qm70Var) {
        super(r2iVar);
        this.c = j;
        this.d = j2;
        this.e = TimeUnit.MILLISECONDS;
        this.f = qm70Var;
        this.i = nx0.a;
        this.v = 25;
    }

    @Override // defpackage.r2i
    public final void i(zde0<? super U> zde0Var) {
        long j = this.d;
        long j2 = this.c;
        r2i<T> r2iVar = this.b;
        if (j2 == j && this.v == Integer.MAX_VALUE) {
            r2iVar.h(new b(new je80(zde0Var), this.i, j2, this.e, this.f));
            return;
        }
        qm70.c cVarB = this.f.b();
        long j3 = this.c;
        long j4 = this.d;
        if (j3 != j4) {
            r2iVar.h(new c(new je80(zde0Var), this.i, j3, j4, this.e, cVarB));
            return;
        }
        r2iVar.h(new a(new je80(zde0Var), this.i, j3, this.e, this.v, cVarB));
    }
}
