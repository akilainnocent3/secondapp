package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hv90 extends qxf0 {
    public static final Object o = new Object();
    public final long b;
    public final long c;
    public final long d = -9223372036854775807L;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final Object l;
    public final njv m;
    public final njv.d n;

    static {
        njv.a.C0902a c0902a = new njv.a.C0902a();
        new njv.c.a();
        List list = Collections.EMPTY_LIST;
        pcn.b bVar = pcn.b;
        c150 c150Var = c150.e;
        njv.d.a aVar = new njv.d.a();
        njv.f fVar = njv.f.a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new njv.e(uri, null, null, list, c150Var, -9223372036854775807L);
        }
        new njv.b(c0902a);
        new njv.d(aVar);
        qjv qjvVar = qjv.B;
    }

    public hv90(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, r5h r5hVar, njv njvVar, njv.d dVar) {
        this.b = j;
        this.c = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = j6;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = r5hVar;
        njvVar.getClass();
        this.m = njvVar;
        this.n = dVar;
    }

    @Override // defpackage.qxf0
    public final int b(Object obj) {
        return o != obj ? -1 : 0;
    }

    @Override // defpackage.qxf0
    public final qxf0.b f(int i, qxf0.b bVar, boolean z) {
        ly0.c(i, 1);
        Object obj = z ? o : null;
        long j = -this.g;
        bVar.getClass();
        bVar.h(null, obj, 0, this.e, j, kf.c, false);
        return bVar;
    }

    @Override // defpackage.qxf0
    public final int h() {
        return 1;
    }

    @Override // defpackage.qxf0
    public final Object l(int i) {
        ly0.c(i, 1);
        return o;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c A[PHI: r1
      0x002c: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v5 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.qxf0
    public final qxf0.c m(int i, qxf0.c cVar, long j) {
        long j2;
        ly0.c(i, 1);
        long j3 = this.h;
        boolean z = this.j;
        if (!z || this.k || j == 0) {
            j2 = j3;
        } else {
            long j4 = this.f;
            if (j4 != -9223372036854775807L) {
                j3 += j;
                if (j3 <= j4) {
                    j2 = j3;
                }
            }
            j2 = -9223372036854775807L;
        }
        Object obj = qxf0.c.p;
        cVar.b(this.m, this.l, this.b, this.c, this.d, this.i, z, this.n, j2, this.f, this.g);
        return cVar;
    }

    @Override // defpackage.qxf0
    public final int o() {
        return 1;
    }
}
