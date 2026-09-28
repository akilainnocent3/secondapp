package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class y6g<R> implements v7h.d {
    public static final c L = new c();
    public boolean A;
    public boolean B;
    public qg50<?> C;
    public cqc D;
    public boolean E;
    public xzk F;
    public boolean G;
    public c7g<?> H;
    public u4d<R> I;
    public volatile boolean J;
    public boolean K;
    public final e a;
    public final vxd0.a b;
    public final c7g.a c;
    public final b220<y6g<?>> d;
    public final c e;
    public final z6g f;
    public final yzk i;
    public final yzk v;
    public final yzk w;
    public final AtomicInteger y;
    public a7g z;

    public class a implements Runnable {
        public final pv90 a;

        public a(pv90 pv90Var) {
            this.a = pv90Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            pv90 pv90Var = this.a;
            pv90Var.b.a();
            synchronized (pv90Var.c) {
                synchronized (y6g.this) {
                    try {
                        if (y6g.this.a.a.contains(new d(this.a, fug.b))) {
                            y6g y6gVar = y6g.this;
                            pv90 pv90Var2 = this.a;
                            y6gVar.getClass();
                            try {
                                pv90Var2.j(y6gVar.F, 5);
                            } catch (Throwable th) {
                                throw new iv5(th);
                            }
                        }
                        y6g.this.d();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public class b implements Runnable {
        public final pv90 a;

        public b(pv90 pv90Var) {
            this.a = pv90Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            pv90 pv90Var = this.a;
            pv90Var.b.a();
            synchronized (pv90Var.c) {
                synchronized (y6g.this) {
                    try {
                        if (y6g.this.a.a.contains(new d(this.a, fug.b))) {
                            y6g.this.H.b();
                            y6g y6gVar = y6g.this;
                            pv90 pv90Var2 = this.a;
                            y6gVar.getClass();
                            try {
                                pv90Var2.l(y6gVar.H, y6gVar.D, y6gVar.K);
                                y6g.this.h(this.a);
                            } catch (Throwable th) {
                                throw new iv5(th);
                            }
                        }
                        y6g.this.d();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public static class c {
    }

    public static final class d {
        public final pv90 a;
        public final Executor b;

        public d(pv90 pv90Var, Executor executor) {
            this.a = pv90Var;
            this.b = executor;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final class e implements Iterable<d> {
        public final ArrayList a;

        public e(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // java.lang.Iterable
        public final Iterator<d> iterator() {
            return this.a.iterator();
        }
    }

    public y6g() {
        throw null;
    }

    public y6g(yzk yzkVar, yzk yzkVar2, yzk yzkVar3, yzk yzkVar4, n6g n6gVar, n6g n6gVar2, v7h.c cVar) {
        this.a = new e(new ArrayList(2));
        this.b = new vxd0.a();
        this.y = new AtomicInteger();
        this.i = yzkVar;
        this.v = yzkVar2;
        this.w = yzkVar4;
        this.f = n6gVar;
        this.c = n6gVar2;
        this.d = cVar;
        this.e = L;
    }

    public final synchronized void a(pv90 pv90Var, Executor executor) {
        try {
            this.b.a();
            this.a.a.add(new d(pv90Var, executor));
            if (this.E) {
                e(1);
                executor.execute(new b(pv90Var));
            } else if (this.G) {
                e(1);
                executor.execute(new a(pv90Var));
            } else {
                gm20.a("Cannot add callbacks to a cancelled EngineJob", !this.J);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // v7h.d
    public final vxd0.a b() {
        return this.b;
    }

    public final void c() {
        if (f()) {
            return;
        }
        this.J = true;
        u4d<R> u4dVar = this.I;
        u4dVar.U = true;
        dpc dpcVar = u4dVar.S;
        if (dpcVar != null) {
            dpcVar.cancel();
        }
        z6g z6gVar = this.f;
        a7g a7gVar = this.z;
        n6g n6gVar = (n6g) z6gVar;
        synchronized (n6gVar) {
            q9p q9pVar = n6gVar.a;
            q9pVar.getClass();
            HashMap map = q9pVar.a;
            if (this == map.get(a7gVar)) {
                map.remove(a7gVar);
            }
        }
    }

    public final void d() {
        c7g<?> c7gVar;
        synchronized (this) {
            try {
                this.b.a();
                gm20.a("Not yet complete!", f());
                int iDecrementAndGet = this.y.decrementAndGet();
                gm20.a("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    c7gVar = this.H;
                    g();
                } else {
                    c7gVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c7gVar != null) {
            c7gVar.e();
        }
    }

    public final synchronized void e(int i) {
        c7g<?> c7gVar;
        gm20.a("Not yet complete!", f());
        if (this.y.getAndAdd(i) == 0 && (c7gVar = this.H) != null) {
            c7gVar.b();
        }
    }

    public final boolean f() {
        return this.G || this.E || this.J;
    }

    public final synchronized void g() {
        boolean zA;
        if (this.z == null) {
            throw new IllegalArgumentException();
        }
        this.a.a.clear();
        this.z = null;
        this.H = null;
        this.C = null;
        this.G = false;
        this.J = false;
        this.E = false;
        this.K = false;
        u4d<R> u4dVar = this.I;
        u4d.d dVar = u4dVar.i;
        synchronized (dVar) {
            dVar.a = true;
            zA = dVar.a();
        }
        if (zA) {
            u4dVar.l();
        }
        this.I = null;
        this.F = null;
        this.D = null;
        this.d.a(this);
    }

    public final synchronized void h(pv90 pv90Var) {
        try {
            this.b.a();
            this.a.a.remove(new d(pv90Var, fug.b));
            if (this.a.a.isEmpty()) {
                c();
                if (this.E || this.G) {
                    if (this.y.get() == 0) {
                        g();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
