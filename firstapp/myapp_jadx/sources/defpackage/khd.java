package defpackage;

import defpackage.jsw;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final class khd<T extends jsw> implements tpe0 {
    public static final Logger j = Logger.getLogger(khd.class.getName());
    public final qj1 c;
    public final xr<T> d;
    public final bjb0 f;
    public final int g;
    public final ConcurrentLinkedQueue<zr<T>> h;
    public volatile boolean i;
    public final opf0 b = new opf0(j);
    public volatile a<T> e = new a<>();

    public static class a<T extends jsw> {
        public final AtomicInteger b = new AtomicInteger(0);
        public final ConcurrentHashMap<m21, zr<T>> a = new ConcurrentHashMap<>();
    }

    public khd(mw40 mw40Var, qj1 qj1Var, xr xrVar, bjb0 bjb0Var, int i, boolean z) {
        new ArrayList();
        new ConcurrentHashMap();
        this.h = new ConcurrentLinkedQueue<>();
        this.c = qj1Var;
        opv opvVar = mw40Var.b;
        qj1Var.f.getClass();
        opvVar.a();
        this.d = xrVar;
        this.f = bjb0Var;
        this.g = i - 1;
        mw40Var.b.getClass();
        this.i = z;
    }

    @Override // defpackage.x7k0
    public final void a(double d, m21 m21Var, m0b m0bVar) {
        a<T> aVar;
        if (this.i) {
            if (Double.isNaN(d)) {
                this.b.a(Level.FINE, "Instrument " + this.c.f.c + " has recorded measurement Not-a-Number (NaN) value with attributes " + m21Var + ". Dropping measurement.", null);
                return;
            }
            while (true) {
                aVar = this.e;
                if (aVar.b.addAndGet(2) % 2 == 0) {
                    try {
                        break;
                    } catch (Throwable th) {
                        aVar.b.addAndGet(-2);
                        throw th;
                    }
                }
                aVar.b.addAndGet(-2);
            }
            zr<T> zrVarD = d(aVar.a, m21Var, m0bVar);
            kze kzeVar = zrVarD.a;
            if (kzeVar == null) {
                throw new UnsupportedOperationException("This aggregator does not support double values.");
            }
            kzeVar.b(d, m21Var, m0bVar);
            zrVarD.a(d);
            aVar.b.addAndGet(-2);
        }
    }

    @Override // defpackage.x7k0
    public final void b(long j2, m21 m21Var, m0b m0bVar) {
        if (!this.i) {
            return;
        }
        while (true) {
            a<T> aVar = this.e;
            if (aVar.b.addAndGet(2) % 2 == 0) {
                try {
                    d(aVar.a, m21Var, m0bVar).c(j2, m21Var, m0bVar);
                    return;
                } finally {
                    aVar.b.addAndGet(-2);
                }
            }
            aVar.b.addAndGet(-2);
        }
    }

    @Override // defpackage.ppv
    public final npv c() {
        return this.c;
    }

    public final zr<T> d(ConcurrentHashMap<m21, zr<T>> concurrentHashMap, m21 m21Var, m0b m0bVar) {
        Objects.requireNonNull(m21Var, "attributes");
        m21 m21VarE0 = this.f.e0(m21Var);
        zr<T> zrVar = concurrentHashMap.get(m21VarE0);
        if (zrVar != null) {
            return zrVar;
        }
        int size = concurrentHashMap.size();
        int i = this.g;
        if (size >= i) {
            this.b.a(Level.WARNING, ijg0.a(i, this.c.f.c, " has exceeded the maximum allowed cardinality (", ").", new StringBuilder("Instrument ")), null);
            m21VarE0 = ppv.a;
            zr<T> zrVar2 = concurrentHashMap.get(m21VarE0);
            if (zrVar2 != null) {
                return zrVar2;
            }
        }
        zr<T> zrVarPoll = this.h.poll();
        if (zrVarPoll == null) {
            zrVarPoll = this.d.b();
        }
        zr<T> zrVarPutIfAbsent = concurrentHashMap.putIfAbsent(m21VarE0, zrVarPoll);
        return zrVarPutIfAbsent != null ? zrVarPutIfAbsent : zrVarPoll;
    }
}
