package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class lze implements xr<jsw> {
    public final double[] a;
    public final amv b;
    public final List<Double> c;
    public final d3c d;

    public static final class a extends zr<jsw> {
        public final List<Double> c;
        public final double[] d;
        public final Object e;
        public double f;
        public double g;
        public final long[] h;

        public a(List list, double[] dArr, d3c d3cVar, amv amvVar) {
            super(d3cVar, true);
            this.e = new Object();
            this.c = list;
            this.d = dArr;
            int length = dArr.length + 1;
            this.h = new long[length];
            this.f = Double.MAX_VALUE;
            this.g = -1.0d;
            if (amvVar == amv.a) {
                new jsw(length);
            }
        }

        @Override // defpackage.zr
        public final void a(double d) {
            int iA = e0h.a(d, this.d);
            synchronized (this.e) {
                this.f = Math.min(this.f, d);
                this.g = Math.max(this.g, d);
                long[] jArr = this.h;
                jArr[iA] = jArr[iA] + 1;
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

    public lze(double[] dArr, d3c d3cVar, amv amvVar) {
        this.a = dArr;
        this.b = amvVar;
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        this.c = Collections.unmodifiableList(arrayList);
        this.d = d3cVar;
    }

    @Override // defpackage.xr
    public final zr<jsw> b() {
        return new a(this.c, this.a, this.d, this.b);
    }
}
