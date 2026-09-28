package defpackage;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.sporty.android.permission.location.KN.qUnCRF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public final class u4d<R> implements dpc.a, Runnable, Comparable<u4d<?>>, v7h.d {
    public static final h2z<Supplier<Integer>> W = new h2z<>("glide_thread_priority_override", null, h2z.e);
    public int A;
    public int B;
    public hre C;
    public s2z D;
    public y6g E;
    public int F;
    public f G;
    public e H;
    public long I;
    public Object J;
    public zzk K;
    public Supplier<Integer> L;
    public Thread M;
    public nlp N;
    public nlp O;
    public Object P;
    public cqc Q;
    public cpc<?> R;
    public volatile dpc S;
    public volatile boolean T;
    public volatile boolean U;
    public boolean V;
    public final c d;
    public final b220<u4d<?>> e;
    public wzk v;
    public nlp w;
    public lw20 y;
    public a7g z;
    public final s4d<R> a = new s4d<>();
    public final ArrayList b = new ArrayList();
    public final vxd0.a c = new vxd0.a();
    public final b<?> f = new b<>();
    public final d i = new d();

    public final class a<Z> {
        public final cqc a;

        public a(cqc cqcVar) {
            this.a = cqcVar;
        }
    }

    public static class b<Z> {
        public nlp a;
        public zg50<Z> b;
        public bft<Z> c;
    }

    public interface c {
    }

    public static class d {
        public boolean a;
        public boolean b;
        public boolean c;

        public final boolean a() {
            return (this.c || this.b) && this.a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class e {
        public static final e a;
        public static final e b;
        public static final e c;
        public static final /* synthetic */ e[] d;

        static {
            e eVar = new e("INITIALIZE", 0);
            a = eVar;
            e eVar2 = new e("SWITCH_TO_SOURCE_SERVICE", 1);
            b = eVar2;
            e eVar3 = new e("DECODE_DATA", 2);
            c = eVar3;
            d = new e[]{eVar, eVar2, eVar3};
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class f {
        public static final f a;
        public static final f b;
        public static final f c;
        public static final f d;
        public static final f e;
        public static final f f;
        public static final /* synthetic */ f[] i;

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) i.clone();
        }

        static {
            f fVar = new f("INITIALIZE", 0);
            a = fVar;
            f fVar2 = new f("RESOURCE_CACHE", 1);
            b = fVar2;
            f fVar3 = new f("DATA_CACHE", 2);
            c = fVar3;
            f fVar4 = new f(qUnCRF.ZBMUWJxd, 3);
            d = fVar4;
            f fVar5 = new f("ENCODE", 4);
            e = fVar5;
            f fVar6 = new f("FINISHED", 5);
            f = fVar6;
            i = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
        }
    }

    public u4d(n6g.c cVar, v7h.c cVar2) {
        this.d = cVar;
        this.e = cVar2;
    }

    @Override // dpc.a
    public final void a(nlp nlpVar, Exception exc, cpc<?> cpcVar, cqc cqcVar) {
        cpcVar.b();
        xzk xzkVar = new xzk("Fetching data failed", Collections.singletonList(exc));
        Class<?> clsA = cpcVar.a();
        xzkVar.b = nlpVar;
        xzkVar.c = cqcVar;
        xzkVar.d = clsA;
        this.b.add(xzkVar);
        if (Thread.currentThread() != this.M) {
            m(e.b);
        } else {
            o();
        }
    }

    @Override // v7h.d
    public final vxd0.a b() {
        return this.c;
    }

    @Override // dpc.a
    public final void c(nlp nlpVar, Object obj, cpc<?> cpcVar, cqc cqcVar, nlp nlpVar2) {
        this.N = nlpVar;
        this.P = obj;
        this.R = cpcVar;
        this.Q = cqcVar;
        this.O = nlpVar2;
        this.V = nlpVar != this.a.a().get(0);
        if (Thread.currentThread() != this.M) {
            m(e.c);
        } else {
            f();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(u4d<?> u4dVar) {
        u4d<?> u4dVar2 = u4dVar;
        int iOrdinal = this.y.ordinal() - u4dVar2.y.ordinal();
        return iOrdinal == 0 ? this.F - u4dVar2.F : iOrdinal;
    }

    public final <Data> qg50<R> d(cpc<?> cpcVar, Data data, cqc cqcVar) {
        if (data == null) {
            cpcVar.b();
            return null;
        }
        try {
            int i = agt.b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            qg50<R> qg50VarE = e(data, cqcVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                j(jElapsedRealtimeNanos, "Decoded result " + qg50VarE, null);
            }
            return qg50VarE;
        } finally {
            cpcVar.b();
        }
    }

    public final <Data> qg50<R> e(Data data, cqc cqcVar) {
        Class<?> cls = data.getClass();
        s4d<R> s4dVar = this.a;
        fxs<Data, ?, R> fxsVarC = s4dVar.c(cls);
        s2z s2zVar = this.D;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = cqcVar == cqc.d || s4dVar.r;
            h2z<Boolean> h2zVar = c7f.i;
            Boolean bool = (Boolean) s2zVar.c(h2zVar);
            if (bool == null || (bool.booleanValue() && !z)) {
                s2zVar = new s2z();
                fs5 fs5Var = this.D.b;
                fs5 fs5Var2 = s2zVar.b;
                fs5Var2.h(fs5Var);
                fs5Var2.put(h2zVar, Boolean.valueOf(z));
            }
        }
        s2z s2zVar2 = s2zVar;
        com.bumptech.glide.load.data.a aVarG = this.v.a().g(data);
        try {
            return fxsVarC.a(this.A, this.B, new a(cqcVar), s2zVar2, aVarG);
        } finally {
            aVarG.b();
        }
    }

    public final void f() {
        bft bftVarD;
        boolean zA;
        Supplier<Integer> supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            j(this.I, "Retrieved data", "data: " + this.P + ", cache key: " + this.N + ", fetcher: " + this.R);
        }
        bft bftVar = null;
        if (this.K.a.containsKey(vzk.d.class) && (supplier = this.L) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), this.L.get().intValue());
            } catch (IllegalArgumentException | SecurityException e2) {
                this.L = null;
                if (Log.isLoggable("DecodeJob", 2)) {
                    Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e2);
                }
            }
        }
        try {
            bftVarD = d(this.R, this.P, this.Q);
        } catch (xzk e3) {
            nlp nlpVar = this.O;
            cqc cqcVar = this.Q;
            e3.b = nlpVar;
            e3.c = cqcVar;
            e3.d = null;
            this.b.add(e3);
            bftVarD = null;
        }
        if (bftVarD == null) {
            o();
            return;
        }
        cqc cqcVar2 = this.Q;
        boolean z = this.V;
        if (bftVarD instanceof thn) {
            ((thn) bftVarD).b();
        }
        if (this.f.c != null) {
            bftVar = (bft) bft.e.b();
            bftVar.d = false;
            bftVar.c = true;
            bftVar.b = bftVarD;
            bftVarD = bftVar;
        }
        if (this.K.a.containsKey(vzk.d.class)) {
            n();
        }
        q();
        y6g<?> y6gVar = this.E;
        synchronized (y6gVar) {
            y6gVar.C = bftVarD;
            y6gVar.D = cqcVar2;
            y6gVar.K = z;
        }
        synchronized (y6gVar) {
            try {
                y6gVar.b.a();
                if (y6gVar.J) {
                    y6gVar.C.c();
                    y6gVar.g();
                } else {
                    if (y6gVar.a.a.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (y6gVar.E) {
                        throw new IllegalStateException("Already have resource");
                    }
                    y6g.c cVar = y6gVar.e;
                    qg50<?> qg50Var = y6gVar.C;
                    boolean z2 = y6gVar.A;
                    a7g a7gVar = y6gVar.z;
                    c7g.a aVar = y6gVar.c;
                    cVar.getClass();
                    y6gVar.H = new c7g<>(qg50Var, z2, true, a7gVar, aVar);
                    y6gVar.E = true;
                    y6g.e eVar = y6gVar.a;
                    eVar.getClass();
                    ArrayList arrayList = new ArrayList(eVar.a);
                    y6gVar.e(arrayList.size() + 1);
                    ((n6g) y6gVar.f).e(y6gVar, y6gVar.z, y6gVar.H);
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        y6g.d dVar = (y6g.d) obj;
                        dVar.b.execute(new y6g.b(dVar.a));
                    }
                    y6gVar.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.G = f.e;
        try {
            b<?> bVar = this.f;
            if (bVar.c != null) {
                try {
                    ((n6g.c) this.d).a().a(bVar.a, new poc(bVar.b, bVar.c, this.D));
                    bVar.c.e();
                } catch (Throwable th2) {
                    bVar.c.e();
                    throw th2;
                }
            }
            if (bftVar != null) {
                bftVar.e();
            }
            d dVar2 = this.i;
            synchronized (dVar2) {
                dVar2.b = true;
                zA = dVar2.a();
            }
            if (zA) {
                l();
            }
        } catch (Throwable th3) {
            if (bftVar == null) {
                throw th3;
            }
            bftVar.e();
            throw th3;
        }
    }

    public final dpc h() {
        int iOrdinal = this.G.ordinal();
        s4d<R> s4dVar = this.a;
        if (iOrdinal == 1) {
            return new tg50(s4dVar, this);
        }
        if (iOrdinal == 2) {
            return new noc(s4dVar.a(), s4dVar, this);
        }
        if (iOrdinal == 3) {
            return new cqa0(s4dVar, this);
        }
        if (iOrdinal == 5) {
            return null;
        }
        uj5.a(this.G, "Unrecognized stage: ");
        return null;
    }

    public final f i(f fVar) {
        int iOrdinal = fVar.ordinal();
        if (iOrdinal == 0) {
            boolean zB = this.C.b();
            f fVar2 = f.b;
            return zB ? fVar2 : i(fVar2);
        }
        if (iOrdinal == 1) {
            boolean zA = this.C.a();
            f fVar3 = f.c;
            return zA ? fVar3 : i(fVar3);
        }
        if (iOrdinal == 2) {
            return f.d;
        }
        if (iOrdinal == 3 || iOrdinal == 5) {
            return f.f;
        }
        z9l.a(fVar, "Unrecognized stage: ");
        return null;
    }

    public final void j(long j, String str, String str2) {
        StringBuilder sbB = mq0.b(str, " in ");
        sbB.append(agt.a(j));
        sbB.append(", load key: ");
        sbB.append(this.z);
        sbB.append(str2 != null ? ", ".concat(str2) : "");
        sbB.append(", thread: ");
        sbB.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbB.toString());
    }

    public final void k() {
        boolean zA;
        if (this.K.a.containsKey(vzk.d.class)) {
            n();
        }
        q();
        xzk xzkVar = new xzk("Failed to load resource", new ArrayList(this.b));
        y6g<?> y6gVar = this.E;
        synchronized (y6gVar) {
            y6gVar.F = xzkVar;
        }
        synchronized (y6gVar) {
            try {
                y6gVar.b.a();
                if (y6gVar.J) {
                    y6gVar.g();
                } else {
                    if (y6gVar.a.a.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (y6gVar.G) {
                        throw new IllegalStateException("Already failed once");
                    }
                    y6gVar.G = true;
                    a7g a7gVar = y6gVar.z;
                    y6g.e eVar = y6gVar.a;
                    eVar.getClass();
                    ArrayList arrayList = new ArrayList(eVar.a);
                    y6gVar.e(arrayList.size() + 1);
                    ((n6g) y6gVar.f).e(y6gVar, a7gVar, null);
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        y6g.d dVar = (y6g.d) obj;
                        dVar.b.execute(new y6g.a(dVar.a));
                    }
                    y6gVar.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d dVar2 = this.i;
        synchronized (dVar2) {
            dVar2.c = true;
            zA = dVar2.a();
        }
        if (zA) {
            l();
        }
    }

    public final void l() {
        d dVar = this.i;
        synchronized (dVar) {
            dVar.b = false;
            dVar.a = false;
            dVar.c = false;
        }
        b<?> bVar = this.f;
        bVar.a = null;
        bVar.b = null;
        bVar.c = null;
        s4d<R> s4dVar = this.a;
        s4dVar.c = null;
        s4dVar.d = null;
        s4dVar.n = null;
        s4dVar.g = null;
        s4dVar.k = null;
        s4dVar.i = null;
        s4dVar.o = null;
        s4dVar.j = null;
        s4dVar.p = null;
        s4dVar.a.clear();
        s4dVar.l = false;
        s4dVar.b.clear();
        s4dVar.m = false;
        this.T = false;
        this.v = null;
        this.w = null;
        this.D = null;
        this.y = null;
        this.z = null;
        this.E = null;
        this.G = null;
        this.S = null;
        this.M = null;
        this.N = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.I = 0L;
        this.U = false;
        this.J = null;
        this.b.clear();
        this.e.a(this);
    }

    public final void m(e eVar) {
        this.H = eVar;
        y6g y6gVar = this.E;
        (y6gVar.B ? y6gVar.w : y6gVar.v).execute(this);
    }

    public final void n() {
        if (!this.K.a.containsKey(vzk.d.class)) {
            ib5.a("OverrideGlideThreadPriority experiment is not enabled.");
            return;
        }
        Supplier<Integer> supplier = this.L;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e2) {
            this.L = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e2);
            }
        }
    }

    public final void o() {
        this.M = Thread.currentThread();
        int i = agt.b;
        this.I = SystemClock.elapsedRealtimeNanos();
        boolean zB = false;
        while (!this.U && this.S != null && !(zB = this.S.b())) {
            this.G = i(this.G);
            this.S = h();
            if (this.G == f.d) {
                m(e.b);
                return;
            }
        }
        if ((this.G == f.f || this.U) && !zB) {
            k();
        }
    }

    public final void p() {
        int iOrdinal = this.H.ordinal();
        if (iOrdinal == 0) {
            this.G = i(f.a);
            this.S = h();
            o();
        } else if (iOrdinal == 1) {
            o();
        } else if (iOrdinal == 2) {
            f();
        } else {
            uj5.a(this.H, "Unrecognized run reason: ");
        }
    }

    public final void q() {
        this.c.a();
        if (this.T) {
            rzk.b("Already notified", this.b.isEmpty() ? null : (Throwable) rh6.a(1, this.b));
        } else {
            this.T = true;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        cpc<?> cpcVar = this.R;
        try {
            try {
                try {
                    if (this.U) {
                        k();
                        if (cpcVar != null) {
                            cpcVar.b();
                            return;
                        }
                        return;
                    }
                    p();
                    if (cpcVar != null) {
                        cpcVar.b();
                    }
                } catch (Throwable th) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.U + ", stage: " + this.G, th);
                    }
                    if (this.G != f.e) {
                        this.b.add(th);
                        k();
                    }
                    if (!this.U) {
                        throw th;
                    }
                    throw th;
                }
            } catch (iv5 e2) {
                throw e2;
            }
        } catch (Throwable th2) {
            if (cpcVar != null) {
                cpcVar.b();
            }
            throw th2;
        }
    }
}
