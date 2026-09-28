package androidx.media3.exoplayer;

import android.util.Pair;
import defpackage.akv;
import defpackage.bkv;
import defpackage.cdl;
import defpackage.ekv;
import defpackage.ly0;
import defpackage.lyg;
import defpackage.pcn;
import defpackage.qxf0;
import defpackage.xz;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final xz c;
    public final cdl d;
    public final lyg e;
    public long f;
    public int g;
    public boolean h;
    public ExoPlayer.c i;
    public akv j;
    public akv k;
    public akv l;
    public akv m;
    public akv n;
    public int o;
    public Object p;
    public long q;
    public final qxf0.b a = new qxf0.b();
    public final qxf0.c b = new qxf0.c();
    public ArrayList r = new ArrayList();

    public h(xz xzVar, cdl cdlVar, lyg lygVar, ExoPlayer.c cVar) {
        this.c = xzVar;
        this.d = cdlVar;
        this.e = lygVar;
        this.i = cVar;
    }

    public static ekv.b o(qxf0 qxf0Var, Object obj, long j, long j2, qxf0.c cVar, qxf0.b bVar) {
        qxf0Var.g(obj, bVar);
        qxf0Var.n(bVar.c, cVar);
        qxf0Var.b(obj);
        int i = bVar.g.a;
        if (i != 0) {
            if (i == 1) {
                bVar.f(0);
            }
            bVar.g.getClass();
            bVar.g(0);
        }
        qxf0Var.g(obj, bVar);
        int iC = bVar.c(j);
        return iC == -1 ? new ekv.b(obj, bVar.b(j), j2) : new ekv.b(obj, iC, bVar.e(iC), j2, -1);
    }

    public final akv a() {
        akv akvVar = this.j;
        if (akvVar == null) {
            return null;
        }
        if (akvVar == this.k) {
            this.k = akvVar.m;
        }
        if (akvVar == this.l) {
            this.l = akvVar.m;
        }
        akvVar.i();
        int i = this.o - 1;
        this.o = i;
        if (i == 0) {
            this.m = null;
            akv akvVar2 = this.j;
            this.p = akvVar2.b;
            this.q = akvVar2.g.a.d;
        }
        this.j = this.j.m;
        k();
        return this.j;
    }

    public final void b() {
        if (this.o == 0) {
            return;
        }
        akv akvVar = this.j;
        ly0.g(akvVar);
        this.p = akvVar.b;
        this.q = akvVar.g.a.d;
        while (akvVar != null) {
            akvVar.i();
            akvVar = akvVar.m;
        }
        this.j = null;
        this.m = null;
        this.k = null;
        this.l = null;
        this.o = 0;
        k();
    }

    public final bkv c(qxf0 qxf0Var, akv akvVar, long j) {
        qxf0 qxf0Var2;
        bkv bkvVar;
        Object obj;
        long j2;
        qxf0.c cVar;
        long j3;
        long jQ;
        bkv bkvVar2 = akvVar.g;
        long j4 = (akvVar.p + bkvVar2.e) - j;
        if (!bkvVar2.h) {
            ekv.b bVar = bkvVar2.a;
            Object obj2 = bVar.a;
            int i = bVar.e;
            qxf0.b bVar2 = this.a;
            qxf0Var.g(obj2, bVar2);
            boolean z = bkvVar2.g;
            if (!bVar.b()) {
                if (i != -1) {
                    bVar2.f(i);
                }
                int iE = bVar2.e(i);
                bVar2.g(i);
                if (iE != bVar2.g.a(i).a) {
                    return e(qxf0Var, bVar.a, bVar.e, iE, bkvVar2.e, bVar.d, z);
                }
                qxf0Var.g(obj2, bVar2);
                bVar2.d(i);
                bVar2.g.a(i).getClass();
                return f(qxf0Var, bVar.a, 0L, bkvVar2.e, bVar.d, false);
            }
            int i2 = bVar.b;
            int i3 = bVar2.g.a(i2).a;
            if (i3 != -1) {
                int iA = bVar2.g.a(i2).a(bVar.c);
                if (iA < i3) {
                    return e(qxf0Var, bVar.a, i2, iA, bkvVar2.c, bVar.d, z);
                }
                long jLongValue = bkvVar2.c;
                if (jLongValue == -9223372036854775807L) {
                    Pair<Object, Long> pairJ = qxf0Var.j(this.b, bVar2, bVar2.c, -9223372036854775807L, Math.max(0L, j4));
                    qxf0Var2 = qxf0Var;
                    if (pairJ != null) {
                        jLongValue = ((Long) pairJ.second).longValue();
                    }
                } else {
                    qxf0Var2 = qxf0Var;
                }
                int i4 = bVar.b;
                qxf0Var2.g(obj2, bVar2);
                bVar2.d(i4);
                bVar2.g.a(i4).getClass();
                return f(qxf0Var, bVar.a, Math.max(0L, jLongValue), bkvVar2.c, bVar.d, z);
            }
            return null;
        }
        bkv bkvVar3 = akvVar.g;
        ekv.b bVar3 = bkvVar3.a;
        long j5 = bkvVar3.c;
        int iB = qxf0Var.b(bVar3.a);
        int i5 = this.g;
        boolean z2 = this.h;
        qxf0.b bVar4 = this.a;
        qxf0.c cVar2 = this.b;
        long j6 = 0;
        int iD = qxf0Var.d(iB, bVar4, cVar2, i5, z2);
        if (iD != -1) {
            int i6 = qxf0Var.f(iD, bVar4, true).c;
            Object obj3 = bVar4.b;
            obj3.getClass();
            long j7 = bVar3.d;
            bkvVar = null;
            if (qxf0Var.m(i6, cVar2, 0L).m == iD) {
                Pair<Object, Long> pairJ2 = qxf0Var.j(cVar2, bVar4, i6, -9223372036854775807L, Math.max(0L, j4));
                if (pairJ2 != null) {
                    Object obj4 = pairJ2.first;
                    long jLongValue2 = ((Long) pairJ2.second).longValue();
                    akv akvVar2 = akvVar.m;
                    if (akvVar2 == null || !akvVar2.b.equals(obj4)) {
                        jQ = q(obj4);
                        if (jQ == -1) {
                            jQ = this.f;
                            this.f = 1 + jQ;
                        }
                    } else {
                        jQ = akvVar2.g.a.d;
                    }
                    j6 = -9223372036854775807L;
                    long j8 = jQ;
                    cVar = cVar2;
                    j3 = jLongValue2;
                    obj = obj4;
                    j2 = j8;
                }
            } else {
                obj = obj3;
                j2 = j7;
                cVar = cVar2;
                j3 = 0;
            }
            ekv.b bVarO = o(qxf0Var, obj, j3, j2, cVar, r3);
            long j9 = j3;
            if (j6 != -9223372036854775807L && j5 != -9223372036854775807L) {
                int i7 = qxf0Var.g(bVar3.a, bVar4).g.a;
                bVar4.g.getClass();
                if (i7 > 0) {
                    bVar4.g(0);
                }
            }
            return d(qxf0Var, bVarO, j6, j9);
        }
        bkvVar = null;
        return bkvVar;
    }

    public final bkv d(qxf0 qxf0Var, ekv.b bVar, long j, long j2) {
        qxf0Var.g(bVar.a, this.a);
        boolean zB = bVar.b();
        Object obj = bVar.a;
        return zB ? e(qxf0Var, obj, bVar.b, bVar.c, j, bVar.d, false) : f(qxf0Var, obj, j2, j, bVar.d, false);
    }

    public final bkv e(qxf0 qxf0Var, Object obj, int i, int i2, long j, long j2, boolean z) {
        ekv.b bVar = new ekv.b(obj, i, i2, j2, -1);
        qxf0.b bVar2 = this.a;
        long jA = qxf0Var.g(obj, bVar2).a(i, i2);
        if (i2 == bVar2.e(i)) {
            bVar2.g.getClass();
        }
        bVar2.g(i);
        long jMax = 0;
        if (jA != -9223372036854775807L && 0 >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new bkv(bVar, jMax, j, -9223372036854775807L, jA, z, false, false, false, false);
    }

    public final bkv f(qxf0 qxf0Var, Object obj, long j, long j2, long j3, boolean z) {
        long j4;
        qxf0.b bVar = this.a;
        qxf0Var.g(obj, bVar);
        int iB = bVar.b(j);
        boolean z2 = false;
        if (iB != -1) {
            bVar.g(iB);
        } else if (bVar.g.a > 0) {
            bVar.g(0);
        }
        ekv.b bVar2 = new ekv.b(obj, iB, j3);
        if (!bVar2.b() && iB == -1) {
            z2 = true;
        }
        boolean zI = i(qxf0Var, bVar2);
        boolean zH = h(qxf0Var, bVar2, z2);
        if (iB != -1) {
            bVar.g(iB);
        }
        if (iB != -1) {
            bVar.f(iB);
        }
        if (iB != -1) {
            bVar.d(iB);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        long j5 = (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? bVar.d : j4;
        return new bkv(bVar2, (j5 == -9223372036854775807L || j < j5) ? j : Math.max(0L, j5 - 1), j2, j4, j5, z, false, z2, zI, zH);
    }

    public final bkv g(qxf0 qxf0Var, bkv bkvVar) {
        long j;
        long jA;
        ekv.b bVar = bkvVar.a;
        int i = bVar.e;
        boolean z = !bVar.b() && i == -1;
        int i2 = bVar.b;
        boolean zI = i(qxf0Var, bVar);
        boolean zH = h(qxf0Var, bVar, z);
        Object obj = bVar.a;
        qxf0.b bVar2 = this.a;
        qxf0Var.g(obj, bVar2);
        if (bVar.b() || i == -1) {
            j = -9223372036854775807L;
        } else {
            bVar2.d(i);
            j = 0;
        }
        if (bVar.b()) {
            jA = bVar2.a(i2, bVar.c);
        } else {
            jA = (j == -9223372036854775807L || j == Long.MIN_VALUE) ? bVar2.d : j;
        }
        if (bVar.b()) {
            bVar2.g(i2);
        } else if (i != -1) {
            bVar2.g(i);
        }
        return new bkv(bVar, bkvVar.b, bkvVar.c, j, jA, bkvVar.f, false, z, zI, zH);
    }

    public final boolean h(qxf0 qxf0Var, ekv.b bVar, boolean z) {
        int iB = qxf0Var.b(bVar.a);
        qxf0.b bVar2 = this.a;
        int i = qxf0Var.f(iB, bVar2, false).c;
        qxf0.c cVar = this.b;
        return !qxf0Var.m(i, cVar, 0L).h && qxf0Var.d(iB, bVar2, cVar, this.g, this.h) == -1 && z;
    }

    public final boolean i(qxf0 qxf0Var, ekv.b bVar) {
        boolean z = !bVar.b() && bVar.e == -1;
        Object obj = bVar.a;
        if (z) {
            if (qxf0Var.m(qxf0Var.g(obj, this.a).c, this.b, 0L).n == qxf0Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        akv akvVar = this.n;
        if (akvVar == null || akvVar.h()) {
            this.n = null;
            for (int i = 0; i < this.r.size(); i++) {
                akv akvVar2 = (akv) this.r.get(i);
                if (!akvVar2.h()) {
                    this.n = akvVar2;
                    return;
                }
            }
        }
    }

    public final void k() {
        pcn.b bVar = pcn.b;
        final pcn.a aVar = new pcn.a();
        for (akv akvVar = this.j; akvVar != null; akvVar = akvVar.m) {
            aVar.c(akvVar.g.a);
        }
        akv akvVar2 = this.k;
        final ekv.b bVar2 = akvVar2 == null ? null : akvVar2.g.a;
        this.d.i(new Runnable() { // from class: ckv
            @Override // java.lang.Runnable
            public final void run() {
                this.a.c.x(aVar.g(), bVar2);
            }
        });
    }

    public final void l(long j) {
        akv akvVar = this.m;
        if (akvVar != null) {
            ly0.f(akvVar.m == null);
            if (akvVar.e) {
                akvVar.a.v(j - akvVar.p);
            }
        }
    }

    public final void m(ArrayList arrayList) {
        for (int i = 0; i < this.r.size(); i++) {
            ((akv) this.r.get(i)).i();
        }
        this.r = arrayList;
        this.n = null;
        j();
    }

    public final int n(akv akvVar) {
        ly0.g(akvVar);
        int i = 0;
        if (akvVar != this.m) {
            this.m = akvVar;
            while (true) {
                akvVar = akvVar.m;
                if (akvVar == null) {
                    break;
                }
                akv akvVar2 = this.k;
                if (akvVar == akvVar2) {
                    akvVar2 = this.j;
                    this.k = akvVar2;
                    this.l = akvVar2;
                    i = 3;
                }
                if (akvVar == this.l) {
                    this.l = akvVar2;
                    i |= 2;
                }
                akvVar.i();
                this.o--;
            }
            akv akvVar3 = this.m;
            akvVar3.getClass();
            if (akvVar3.m != null) {
                akvVar3.b();
                akvVar3.m = null;
                akvVar3.c();
            }
            k();
        }
        return i;
    }

    public final ekv.b p(qxf0 qxf0Var, Object obj, long j) {
        long jQ;
        int iB;
        qxf0.b bVar = this.a;
        int i = qxf0Var.g(obj, bVar).c;
        Object obj2 = this.p;
        if (obj2 == null || (iB = qxf0Var.b(obj2)) == -1 || qxf0Var.f(iB, bVar, false).c != i) {
            akv akvVar = this.j;
            while (true) {
                if (akvVar == null) {
                    akv akvVar2 = this.j;
                    while (true) {
                        if (akvVar2 == null) {
                            jQ = q(obj);
                            if (jQ != -1) {
                                break;
                            }
                            jQ = this.f;
                            this.f = 1 + jQ;
                            if (this.j != null) {
                                break;
                            }
                            this.p = obj;
                            this.q = jQ;
                            break;
                        }
                        int iB2 = qxf0Var.b(akvVar2.b);
                        if (iB2 != -1 && qxf0Var.f(iB2, bVar, false).c == i) {
                            jQ = akvVar2.g.a.d;
                            break;
                        }
                        akvVar2 = akvVar2.m;
                    }
                } else {
                    if (akvVar.b.equals(obj)) {
                        jQ = akvVar.g.a.d;
                        break;
                    }
                    akvVar = akvVar.m;
                }
            }
        } else {
            jQ = this.q;
        }
        qxf0Var.g(obj, bVar);
        int i2 = bVar.c;
        qxf0.c cVar = this.b;
        qxf0Var.n(i2, cVar);
        Object obj3 = obj;
        boolean z = false;
        for (int iB3 = qxf0Var.b(obj); iB3 >= cVar.m; iB3--) {
            qxf0Var.f(iB3, bVar, true);
            boolean z2 = bVar.g.a > 0;
            z |= z2;
            if (bVar.c(bVar.d) != -1) {
                obj3 = bVar.b;
                obj3.getClass();
            }
            if (z && (!z2 || bVar.d != 0)) {
                break;
            }
        }
        return o(qxf0Var, obj3, j, jQ, cVar, bVar);
    }

    public final long q(Object obj) {
        for (int i = 0; i < this.r.size(); i++) {
            akv akvVar = (akv) this.r.get(i);
            if (akvVar.b.equals(obj)) {
                return akvVar.g.a.d;
            }
        }
        return -1L;
    }

    public final int r(qxf0 qxf0Var) {
        qxf0 qxf0Var2;
        akv akvVar;
        akv akvVar2 = this.j;
        if (akvVar2 == null) {
            return 0;
        }
        int iB = qxf0Var.b(akvVar2.b);
        while (true) {
            qxf0Var2 = qxf0Var;
            iB = qxf0Var2.d(iB, this.a, this.b, this.g, this.h);
            while (true) {
                akvVar = akvVar2.m;
                if (akvVar == null || akvVar2.g.h) {
                    break;
                }
                akvVar2 = akvVar;
            }
            if (iB == -1 || akvVar == null || qxf0Var2.b(akvVar.b) != iB) {
                break;
            }
            akvVar2 = akvVar;
            qxf0Var = qxf0Var2;
        }
        int iN = n(akvVar2);
        akvVar2.g = g(qxf0Var2, akvVar2.g);
        return iN;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    public final int s(qxf0 qxf0Var, long j, long j2, long j3) {
        bkv bkvVarG;
        boolean z;
        akv akvVar = this.j;
        akv akvVar2 = null;
        while (true) {
            int i = 0;
            if (akvVar == null) {
                return 0;
            }
            bkv bkvVar = akvVar.g;
            if (akvVar2 == null) {
                bkvVarG = g(qxf0Var, bkvVar);
            } else {
                bkv bkvVarC = c(qxf0Var, akvVar2, j);
                if (bkvVarC == null || bkvVar.b != bkvVarC.b || !bkvVar.a.equals(bkvVarC.a)) {
                    return n(akvVar2);
                }
                bkvVarG = bkvVarC;
            }
            long j4 = bkvVarG.e;
            long j5 = bkvVar.c;
            long j6 = bkvVar.e;
            akvVar.g = bkvVarG.a(j5);
            if (j6 != j4) {
                akvVar.k();
                long j7 = j4 == -9223372036854775807L ? Long.MAX_VALUE : j4 + akvVar.p;
                boolean z2 = akvVar == this.k && !akvVar.g.g && (j2 == Long.MIN_VALUE || j2 >= j7);
                boolean z3 = akvVar == this.l && (j3 == Long.MIN_VALUE || j3 >= j7);
                int iN = n(akvVar);
                if (iN != 0) {
                    return iN;
                }
                if (j6 == -9223372036854775807L && bkvVar.d == Long.MIN_VALUE) {
                    long j8 = bkvVarG.d;
                    if (j8 == -9223372036854775807L || j8 == Long.MIN_VALUE) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (z2 && (j6 != -9223372036854775807L || z)) {
                    i = 1;
                }
                return z3 ? i | 2 : i;
            }
            akvVar2 = akvVar;
            akvVar = akvVar.m;
        }
    }
}
