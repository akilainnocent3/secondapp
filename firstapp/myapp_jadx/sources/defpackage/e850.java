package defpackage;

import androidx.media3.common.a;
import androidx.media3.exoplayer.k;

/* JADX INFO: loaded from: classes.dex */
public final class e850 {
    public final k a;
    public final int b;
    public final k c;
    public int d = 0;
    public boolean e = false;
    public boolean f = false;

    public e850(k kVar, k kVar2, int i) {
        this.a = kVar;
        this.b = i;
        this.c = kVar2;
    }

    public static boolean g(k kVar) {
        return kVar.getState() != 0;
    }

    public static void k(k kVar, long j) {
        kVar.j();
        if (kVar instanceof zlf0) {
            zlf0 zlf0Var = (zlf0) kVar;
            ly0.f(zlf0Var.C);
            zlf0Var.Z = j;
        }
    }

    public final void a(k kVar, zdd zddVar) {
        ly0.f(this.a == kVar || this.c == kVar);
        if (g(kVar)) {
            if (kVar == zddVar.c) {
                zddVar.d = null;
                zddVar.c = null;
                zddVar.e = true;
            }
            if (kVar.getState() == 2) {
                kVar.stop();
            }
            kVar.a();
        }
    }

    public final int b() {
        boolean zG = g(this.a);
        k kVar = this.c;
        return (zG ? 1 : 0) + ((kVar == null || !g(kVar)) ? 0 : 1);
    }

    public final k c(akv akvVar) {
        if (akvVar == null) {
            return null;
        }
        rs60[] rs60VarArr = akvVar.c;
        int i = this.b;
        if (rs60VarArr[i] == null) {
            return null;
        }
        k kVar = this.a;
        if (kVar.z() == rs60VarArr[i]) {
            return kVar;
        }
        k kVar2 = this.c;
        if (kVar2 == null || kVar2.z() != rs60VarArr[i]) {
            return null;
        }
        return kVar2;
    }

    public final boolean d(akv akvVar, k kVar) {
        if (kVar == null) {
            return true;
        }
        rs60[] rs60VarArr = akvVar.c;
        int i = this.b;
        rs60 rs60Var = rs60VarArr[i];
        if (kVar.z() == null) {
            return true;
        }
        if (kVar.z() == rs60Var) {
            if (rs60Var == null || kVar.f()) {
                return true;
            }
            akv akvVar2 = akvVar.m;
            if (akvVar.g.g && akvVar2 != null && akvVar2.e && ((kVar instanceof zlf0) || (kVar instanceof dpv) || kVar.A() >= akvVar2.e())) {
                return true;
            }
        }
        akv akvVar3 = akvVar.m;
        return akvVar3 != null && akvVar3.c[i] == kVar.z();
    }

    public final boolean e() {
        int i = this.d;
        return i == 2 || i == 4 || i == 3;
    }

    public final boolean f() {
        int i = this.d;
        if (i == 0 || i == 2 || i == 4) {
            return g(this.a);
        }
        k kVar = this.c;
        kVar.getClass();
        return kVar.getState() != 0;
    }

    public final void h(boolean z) {
        if (z) {
            if (this.e) {
                this.a.reset();
                this.e = false;
                return;
            }
            return;
        }
        if (this.f) {
            k kVar = this.c;
            kVar.getClass();
            kVar.reset();
            this.f = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int i(k kVar, akv akvVar, ujg0 ujg0Var, zdd zddVar) {
        k kVar2;
        int i;
        if (kVar == null || kVar.getState() == 0 || (kVar == (kVar2 = this.a) && ((i = this.d) == 2 || i == 4))) {
            return 1;
        }
        if (kVar == this.c && this.d == 3) {
            return 1;
        }
        rs60 rs60VarZ = kVar.z();
        rs60[] rs60VarArr = akvVar.c;
        int i2 = this.b;
        Object[] objArr = rs60VarZ != rs60VarArr[i2];
        boolean zB = ujg0Var.b(i2);
        if (!zB || objArr != false) {
            if (!kVar.p()) {
                oyg oygVar = ujg0Var.c[i2];
                int length = oygVar != null ? oygVar.length() : 0;
                a[] aVarArr = new a[length];
                for (int i3 = 0; i3 < length; i3++) {
                    oygVar.getClass();
                    aVarArr[i3] = oygVar.e(i3);
                }
                rs60 rs60Var = akvVar.c[i2];
                rs60Var.getClass();
                kVar.y(aVarArr, rs60Var, akvVar.e(), akvVar.p, akvVar.g.a);
                return 3;
            }
            if (!kVar.b()) {
                return 0;
            }
            a(kVar, zddVar);
            if (!zB || e()) {
                h(kVar == kVar2);
                return 1;
            }
        }
        return 1;
    }

    public final void j() {
        if (!g(this.a)) {
            h(true);
        }
        k kVar = this.c;
        if (kVar == null || kVar.getState() != 0) {
            return;
        }
        h(false);
    }

    public final void l() {
        k kVar = this.a;
        if (kVar.getState() == 1 && this.d != 4) {
            kVar.start();
            return;
        }
        k kVar2 = this.c;
        if (kVar2 == null || kVar2.getState() != 1 || this.d == 3) {
            return;
        }
        kVar2.start();
    }
}
