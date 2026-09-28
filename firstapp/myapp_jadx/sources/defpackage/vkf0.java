package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vkf0 {
    public final ukf0 a;
    public urr b = null;
    public urr c;

    public vkf0(urr urrVar, ukf0 ukf0Var) {
        this.a = ukf0Var;
        this.c = urrVar;
    }

    public final long a(long j) {
        lk40 lk40VarP;
        urr urrVar = this.b;
        lk40 lk40Var = lk40.e;
        if (urrVar != null) {
            if (urrVar.e()) {
                urr urrVar2 = this.c;
                lk40VarP = urrVar2 != null ? urrVar2.P(urrVar, true) : null;
            } else {
                lk40VarP = lk40Var;
            }
            if (lk40VarP != null) {
                lk40Var = lk40VarP;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = lk40Var.a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = lk40Var.c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = lk40Var.b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = lk40Var.d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.g(d(j));
    }

    public final boolean c(long j) {
        long jD = d(a(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        ukf0 ukf0Var = this.a;
        int iE = ukf0Var.b.e(fIntBitsToFloat);
        int i = (int) (jD >> 32);
        return Float.intBitsToFloat(i) >= ukf0Var.g(iE) && Float.intBitsToFloat(i) <= ukf0Var.h(iE);
    }

    public final long d(long j) {
        urr urrVar;
        urr urrVar2 = this.b;
        if (urrVar2 != null) {
            if (!urrVar2.e()) {
                urrVar2 = null;
            }
            if (urrVar2 != null && (urrVar = this.c) != null) {
                urr urrVar3 = urrVar.e() ? urrVar : null;
                if (urrVar3 != null) {
                    return urrVar2.M(urrVar3, j);
                }
            }
        }
        return j;
    }

    public final long e(long j) {
        urr urrVar;
        urr urrVar2 = this.b;
        if (urrVar2 != null) {
            if (!urrVar2.e()) {
                urrVar2 = null;
            }
            if (urrVar2 != null && (urrVar = this.c) != null) {
                urr urrVar3 = urrVar.e() ? urrVar : null;
                if (urrVar3 != null) {
                    return urrVar3.M(urrVar2, j);
                }
            }
        }
        return j;
    }
}
