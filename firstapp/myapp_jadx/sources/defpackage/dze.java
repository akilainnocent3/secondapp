package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class dze implements xr<Object> {
    public final d3c a;
    public final amv b;

    public static final class a extends zr<Object> {
        public eze c;
        public eze d;
        public double e;
        public double f;
        public int g;
        public final amv h;

        public a(d3c d3cVar, amv amvVar) {
            super(d3cVar, true);
            this.e = Double.MAX_VALUE;
            this.f = -1.0d;
            this.g = 20;
            if (amvVar == amv.a) {
                Comparator<e21<?>> comparator = vw0.c;
                ConcurrentHashMap concurrentHashMap = h2g.a;
                List list = Collections.EMPTY_LIST;
            }
            this.h = amvVar;
        }

        @Override // defpackage.zr
        public final synchronized void a(double d) {
            eze ezeVar;
            try {
                if (Double.isFinite(d)) {
                    this.e = Math.min(this.e, d);
                    this.f = Math.max(this.f, d);
                    int iCompare = Double.compare(d, 0.0d);
                    if (iCompare == 0) {
                        return;
                    }
                    if (iCompare > 0) {
                        ezeVar = this.c;
                        if (ezeVar == null) {
                            ezeVar = new eze(this.g, this.h);
                            this.c = ezeVar;
                        }
                    } else {
                        ezeVar = this.d;
                        if (ezeVar == null) {
                            ezeVar = new eze(this.g, this.h);
                            this.d = ezeVar;
                        }
                    }
                    if (!ezeVar.b(d)) {
                        long jA = ezeVar.d.a(d);
                        long jMin = Math.min(jA, ezeVar.b.c);
                        long jMax = Math.max(jA, ezeVar.b.b);
                        int i = 0;
                        while ((jMax - jMin) + 1 > ((uf) ezeVar.b.e).b()) {
                            jMin >>= 1;
                            jMax >>= 1;
                            i++;
                        }
                        eze ezeVar2 = this.c;
                        if (ezeVar2 != null) {
                            ezeVar2.a(i);
                            this.g = this.c.c;
                        }
                        eze ezeVar3 = this.d;
                        if (ezeVar3 != null) {
                            ezeVar3.a(i);
                            this.g = this.d.c;
                        }
                        ezeVar.b(d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // defpackage.zr
        public final void c(long j, m21 m21Var, m0b m0bVar) {
            double d = j;
            kze kzeVar = this.a;
            if (kzeVar == null) {
                zkh.a("This aggregator does not support double values.");
            } else {
                kzeVar.b(d, m21Var, m0bVar);
                a(d);
            }
        }
    }

    public dze(d3c d3cVar, amv amvVar) {
        this.a = d3cVar;
        this.b = amvVar;
    }

    @Override // defpackage.xr
    public final zr<Object> b() {
        return new a(this.a, this.b);
    }
}
