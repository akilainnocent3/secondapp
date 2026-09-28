package defpackage;

import android.util.Pair;
import androidx.media3.exoplayer.b;
import androidx.media3.exoplayer.i;
import androidx.media3.exoplayer.l;

/* JADX INFO: loaded from: classes.dex */
public final class akv {
    public final zjv a;
    public final Object b;
    public final rs60[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public bkv g;
    public boolean h;
    public final boolean[] i;
    public final l[] j;
    public final tjg0 k;
    public final i l;
    public akv m;
    public ljg0 n;
    public ujg0 o;
    public long p;

    public akv(l[] lVarArr, long j, tjg0 tjg0Var, tf tfVar, i iVar, bkv bkvVar, ujg0 ujg0Var) {
        this.j = lVarArr;
        this.p = j;
        this.k = tjg0Var;
        this.l = iVar;
        ekv.b bVar = bkvVar.a;
        Object obj = bVar.a;
        this.b = obj;
        this.g = bkvVar;
        this.n = ljg0.d;
        this.o = ujg0Var;
        this.c = new rs60[lVarArr.length];
        this.i = new boolean[lVarArr.length];
        long j2 = bkvVar.b;
        long j3 = bkvVar.d;
        boolean z = bkvVar.f;
        iVar.getClass();
        int i = t2.d;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        ekv.b bVarA = bVar.a(pair.second);
        i.c cVar = (i.c) iVar.d.get(obj2);
        cVar.getClass();
        iVar.g.add(cVar);
        i.b bVar2 = iVar.f.get(cVar);
        if (bVar2 != null) {
            bVar2.a.h(bVar2.b);
        }
        cVar.c.add(bVarA);
        zjv zjvVarD = cVar.a.c(bVarA, tfVar, j2);
        iVar.c.put(zjvVarD, cVar);
        iVar.c();
        this.a = j3 != -9223372036854775807L ? new qs7(zjvVarD, !z, 0L, j3) : zjvVarD;
    }

    public final long a(ujg0 ujg0Var, long j, boolean z, boolean[] zArr) {
        boolean[] zArr2;
        l[] lVarArr;
        boolean[] zArr3;
        rs60[] rs60VarArr;
        oyg[] oygVarArr = ujg0Var.c;
        int i = 0;
        while (true) {
            int i2 = ujg0Var.a;
            zArr2 = this.i;
            boolean z2 = true;
            if (i >= i2) {
                break;
            }
            if (z || !ujg0Var.a(this.o, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i3 = 0;
        while (true) {
            lVarArr = this.j;
            int length = lVarArr.length;
            zArr3 = zArr2;
            rs60VarArr = this.c;
            if (i3 >= length) {
                break;
            }
            if (((b) lVarArr[i3]).b == -2) {
                rs60VarArr[i3] = null;
            }
            i3++;
            zArr2 = zArr3;
        }
        b();
        this.o = ujg0Var;
        c();
        long jC = this.a.c(oygVarArr, zArr3, rs60VarArr, zArr, j);
        for (int i4 = 0; i4 < lVarArr.length; i4++) {
            if (((b) lVarArr[i4]).b == -2 && this.o.b(i4)) {
                rs60VarArr[i4] = new c3g();
            }
        }
        this.f = false;
        for (int i5 = 0; i5 < rs60VarArr.length; i5++) {
            if (rs60VarArr[i5] != null) {
                ly0.f(ujg0Var.b(i5));
                if (((b) lVarArr[i5]).b != -2) {
                    this.f = true;
                }
            } else {
                ly0.f(oygVarArr[i5] == null);
            }
        }
        return jC;
    }

    public final void b() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            ujg0 ujg0Var = this.o;
            if (i >= ujg0Var.a) {
                return;
            }
            boolean zB = ujg0Var.b(i);
            oyg oygVar = this.o.c[i];
            if (zB && oygVar != null) {
                oygVar.a();
            }
            i++;
        }
    }

    public final void c() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            ujg0 ujg0Var = this.o;
            if (i >= ujg0Var.a) {
                return;
            }
            boolean zB = ujg0Var.b(i);
            oyg oygVar = this.o.c[i];
            if (zB && oygVar != null) {
                oygVar.o();
            }
            i++;
        }
    }

    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long jS = this.f ? this.a.s() : Long.MIN_VALUE;
        return jS == Long.MIN_VALUE ? this.g.e : jS;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    public final void f(float f, qxf0 qxf0Var, boolean z) {
        this.e = true;
        this.n = this.a.q();
        ujg0 ujg0VarJ = j(f, qxf0Var, z);
        bkv bkvVar = this.g;
        long jMax = bkvVar.b;
        long j = bkvVar.e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jA = a(ujg0VarJ, jMax, false, new boolean[this.j.length]);
        long j2 = this.p;
        bkv bkvVar2 = this.g;
        this.p = (bkvVar2.b - jA) + j2;
        this.g = bkvVar2.b(jA);
    }

    public final boolean g() {
        if (this.e) {
            return !this.f || this.a.s() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.e) {
            return g() || d() - this.g.b >= -9223372036854775807L;
        }
        return false;
    }

    public final void i() {
        b();
        zjv zjvVar = this.a;
        try {
            boolean z = zjvVar instanceof qs7;
            i iVar = this.l;
            if (z) {
                iVar.f(((qs7) zjvVar).a);
            } else {
                iVar.f(zjvVar);
            }
        } catch (RuntimeException e) {
            cft.d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final ujg0 j(float f, qxf0 qxf0Var, boolean z) {
        oyg[] oygVarArr;
        ljg0 ljg0Var = this.n;
        ekv.b bVar = this.g.a;
        tjg0 tjg0Var = this.k;
        l[] lVarArr = this.j;
        ujg0 ujg0VarE = tjg0Var.e(lVarArr, ljg0Var, bVar, qxf0Var);
        int i = 0;
        while (true) {
            int i2 = ujg0VarE.a;
            oygVarArr = ujg0VarE.c;
            if (i >= i2) {
                break;
            }
            boolean z2 = true;
            if (ujg0VarE.b(i)) {
                if (oygVarArr[i] == null && ((b) lVarArr[i]).b != -2) {
                    z2 = false;
                }
                ly0.f(z2);
            } else {
                ly0.f(oygVarArr[i] == null);
            }
            i++;
        }
        for (oyg oygVar : oygVarArr) {
            if (oygVar != null) {
                oygVar.h(f);
                oygVar.n(z);
            }
        }
        return ujg0VarE;
    }

    public final void k() {
        zjv zjvVar = this.a;
        if (zjvVar instanceof qs7) {
            long j = this.g.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            qs7 qs7Var = (qs7) zjvVar;
            qs7Var.e = 0L;
            qs7Var.f = j;
        }
    }
}
