package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public final class n6g implements z6g, c7g.a {
    public static final boolean h = Log.isLoggable("Engine", 2);
    public final q9p a;
    public final b7g b;
    public final u4u c;
    public final b d;
    public final mh50 e;
    public final a f;
    public final ic g;

    public static class a {
        public final c a;
        public final v7h.c b = v7h.a(150, new C0890a());
        public int c;

        /* JADX INFO: renamed from: n6g$a$a, reason: collision with other inner class name */
        public class C0890a implements v7h.b<u4d<?>> {
            public C0890a() {
            }

            @Override // v7h.b
            public final u4d<?> a() {
                a aVar = a.this;
                return new u4d<>(aVar.a, aVar.b);
            }
        }

        public a(c cVar) {
            this.a = cVar;
        }
    }

    public static class b {
        public final yzk a;
        public final yzk b;
        public final yzk c;
        public final yzk d;
        public final n6g e;
        public final n6g f;
        public final v7h.c g = v7h.a(150, new a());

        public class a implements v7h.b<y6g<?>> {
            public a() {
            }

            @Override // v7h.b
            public final y6g<?> a() {
                b bVar = b.this;
                return new y6g<>(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f, bVar.g);
            }
        }

        public b(yzk yzkVar, yzk yzkVar2, yzk yzkVar3, yzk yzkVar4, n6g n6gVar, n6g n6gVar2) {
            this.a = yzkVar;
            this.b = yzkVar2;
            this.c = yzkVar3;
            this.d = yzkVar4;
            this.e = n6gVar;
            this.f = n6gVar2;
        }
    }

    public static class c implements u4d.c {
        public final fre.a a;
        public volatile fre b;

        public c(fre.a aVar) {
            this.a = aVar;
        }

        public final fre a() {
            if (this.b == null) {
                synchronized (this) {
                    try {
                        if (this.b == null) {
                            this.b = this.a.build();
                        }
                        if (this.b == null) {
                            this.b = new gre();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.b;
        }
    }

    public class d {
        public final y6g<?> a;
        public final pv90 b;

        public d(pv90 pv90Var, y6g y6gVar) {
            this.b = pv90Var;
            this.a = y6gVar;
        }
    }

    public n6g(u4u u4uVar, fre.a aVar, yzk yzkVar, yzk yzkVar2, yzk yzkVar3, yzk yzkVar4) throws Throwable {
        this.c = u4uVar;
        c cVar = new c(aVar);
        ic icVar = new ic();
        this.g = icVar;
        synchronized (this) {
            try {
                synchronized (icVar) {
                    try {
                        try {
                            icVar.d = this;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                this.b = new b7g();
                this.a = new q9p();
                this.d = new b(yzkVar, yzkVar2, yzkVar3, yzkVar4, this, this);
                this.f = new a(cVar);
                this.e = new mh50();
                u4uVar.d = this;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public static void d(String str, long j, a7g a7gVar) {
        StringBuilder sbB = mq0.b(str, " in ");
        sbB.append(agt.a(j));
        sbB.append("ms, key: ");
        sbB.append(a7gVar);
        Log.v("Engine", sbB.toString());
    }

    public static void f(qg50 qg50Var) {
        if (qg50Var instanceof c7g) {
            ((c7g) qg50Var).e();
        } else {
            hb5.a("Cannot release anything but an EngineResource");
        }
    }

    @Override // c7g.a
    public final void a(nlp nlpVar, c7g<?> c7gVar) {
        ic icVar = this.g;
        synchronized (icVar) {
            ic.a aVar = (ic.a) icVar.b.remove(nlpVar);
            if (aVar != null) {
                aVar.c = null;
                aVar.clear();
            }
        }
        if (c7gVar.a) {
            this.c.d(nlpVar, c7gVar);
        } else {
            this.e.a(c7gVar, false);
        }
    }

    public final d b(wzk wzkVar, Object obj, nlp nlpVar, int i, int i2, Class cls, Class cls2, lw20 lw20Var, hre hreVar, fs5 fs5Var, boolean z, boolean z2, s2z s2zVar, boolean z3, boolean z4, pv90 pv90Var, Executor executor) {
        long jElapsedRealtimeNanos;
        if (h) {
            int i3 = agt.b;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.b.getClass();
        a7g a7gVar = new a7g(obj, nlpVar, i, i2, fs5Var, cls, cls2, s2zVar);
        synchronized (this) {
            try {
                c7g<?> c7gVarC = c(a7gVar, z3, jElapsedRealtimeNanos);
                if (c7gVarC == null) {
                    return g(wzkVar, obj, nlpVar, i, i2, cls, cls2, lw20Var, hreVar, fs5Var, z, z2, s2zVar, z3, z4, pv90Var, executor, a7gVar, jElapsedRealtimeNanos);
                }
                pv90Var.l(c7gVarC, cqc.e, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final c7g<?> c(a7g a7gVar, boolean z, long j) {
        c7g<?> c7gVar;
        Object obj;
        n6g n6gVar;
        a7g a7gVar2;
        c7g<?> c7gVar2;
        if (z) {
            ic icVar = this.g;
            synchronized (icVar) {
                ic.a aVar = (ic.a) icVar.b.get(a7gVar);
                if (aVar == null) {
                    c7gVar = null;
                } else {
                    c7gVar = aVar.get();
                    if (c7gVar == null) {
                        icVar.b(aVar);
                    }
                }
            }
            if (c7gVar != null) {
                c7gVar.b();
            }
            if (c7gVar != null) {
                if (h) {
                    d("Loaded resource from active resources", j, a7gVar);
                }
                return c7gVar;
            }
            u4u u4uVar = this.c;
            synchronized (u4uVar) {
                r4u.a aVar2 = (r4u.a) u4uVar.a.remove(a7gVar);
                if (aVar2 == null) {
                    obj = null;
                } else {
                    u4uVar.c -= (long) aVar2.b;
                    obj = aVar2.a;
                }
            }
            qg50 qg50Var = (qg50) obj;
            if (qg50Var == null) {
                n6gVar = this;
                a7gVar2 = a7gVar;
                c7gVar2 = null;
            } else if (qg50Var instanceof c7g) {
                c7gVar2 = (c7g) qg50Var;
                n6gVar = this;
                a7gVar2 = a7gVar;
            } else {
                n6gVar = this;
                a7gVar2 = a7gVar;
                c7gVar2 = new c7g<>(qg50Var, true, true, a7gVar2, n6gVar);
            }
            if (c7gVar2 != null) {
                c7gVar2.b();
                n6gVar.g.a(a7gVar2, c7gVar2);
            }
            if (c7gVar2 != null) {
                if (h) {
                    d("Loaded resource from cache", j, a7gVar2);
                }
                return c7gVar2;
            }
        }
        return null;
    }

    public final synchronized void e(y6g<?> y6gVar, nlp nlpVar, c7g<?> c7gVar) {
        if (c7gVar != null) {
            try {
                if (c7gVar.a) {
                    this.g.a(nlpVar, c7gVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        q9p q9pVar = this.a;
        q9pVar.getClass();
        y6gVar.getClass();
        HashMap map = q9pVar.a;
        if (y6gVar == map.get(nlpVar)) {
            map.remove(nlpVar);
        }
    }

    public final d g(wzk wzkVar, Object obj, nlp nlpVar, int i, int i2, Class cls, Class cls2, lw20 lw20Var, hre hreVar, Map map, boolean z, boolean z2, s2z s2zVar, boolean z3, boolean z4, pv90 pv90Var, Executor executor, a7g a7gVar, long j) {
        Executor executor2;
        y6g y6gVar = (y6g) this.a.a.get(a7gVar);
        if (y6gVar != null) {
            y6gVar.a(pv90Var, executor);
            if (h) {
                d("Added to existing load", j, a7gVar);
            }
            return new d(pv90Var, y6gVar);
        }
        y6g y6gVar2 = (y6g) this.d.g.b();
        synchronized (y6gVar2) {
            y6gVar2.z = a7gVar;
            y6gVar2.A = z3;
            y6gVar2.B = z4;
        }
        a aVar = this.f;
        u4d<R> u4dVar = (u4d) aVar.b.b();
        int i3 = aVar.c;
        aVar.c = i3 + 1;
        s4d<R> s4dVar = u4dVar.a;
        u4d.c cVar = u4dVar.d;
        s4dVar.c = wzkVar;
        s4dVar.d = obj;
        s4dVar.n = nlpVar;
        s4dVar.e = i;
        s4dVar.f = i2;
        s4dVar.p = hreVar;
        s4dVar.g = cls;
        s4dVar.h = cVar;
        s4dVar.k = cls2;
        s4dVar.o = lw20Var;
        s4dVar.i = s2zVar;
        s4dVar.j = map;
        s4dVar.q = z;
        s4dVar.r = z2;
        u4dVar.v = wzkVar;
        u4dVar.w = nlpVar;
        u4dVar.y = lw20Var;
        u4dVar.z = a7gVar;
        u4dVar.A = i;
        u4dVar.B = i2;
        u4dVar.C = hreVar;
        u4dVar.D = s2zVar;
        u4dVar.E = y6gVar2;
        u4dVar.F = i3;
        u4dVar.H = u4d.e.a;
        u4dVar.J = obj;
        u4dVar.K = wzkVar.g;
        u4dVar.L = (Supplier) s2zVar.c(u4d.W);
        q9p q9pVar = this.a;
        q9pVar.getClass();
        q9pVar.a.put(a7gVar, y6gVar2);
        y6gVar2.a(pv90Var, executor);
        synchronized (y6gVar2) {
            y6gVar2.I = u4dVar;
            u4d.f fVarI = u4dVar.i(u4d.f.a);
            if (fVarI == u4d.f.b || fVarI == u4d.f.c) {
                executor2 = y6gVar2.i;
            } else {
                executor2 = y6gVar2.B ? y6gVar2.w : y6gVar2.v;
            }
            executor2.execute(u4dVar);
        }
        if (h) {
            d("Started new load", j, a7gVar);
        }
        return new d(pv90Var, y6gVar2);
    }
}
