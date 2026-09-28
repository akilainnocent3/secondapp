package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class hdl {
    public static final int a(zjw zjwVar, long j, z6i0 z6i0Var) {
        float fI = z6i0Var != null ? z6i0Var.i() : 0.0f;
        int i = (int) (4294967295L & j);
        int iE = zjwVar.e(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < zjwVar.f(iE) - fI || Float.intBitsToFloat(i) > zjwVar.b(iE) + fI) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-fI) || Float.intBitsToFloat(i2) > zjwVar.d + fI) {
            return -1;
        }
        return iE;
    }

    public static final int b(n6s n6sVar, long j, z6i0 z6i0Var) {
        long jO;
        int iA;
        vkf0 vkf0VarD = n6sVar.d();
        if (vkf0VarD != null) {
            zjw zjwVar = vkf0VarD.a.b;
            urr urrVarC = n6sVar.c();
            if (urrVarC != null && (iA = a(zjwVar, (jO = urrVarC.o(j)), z6i0Var)) != -1) {
                return zjwVar.g(gly.b(0.0f, (zjwVar.b(iA) + zjwVar.f(iA)) / 2.0f, 1, jO));
            }
        }
        return -1;
    }

    public static final long c(n6s n6sVar, lk40 lk40Var, int i) {
        vkf0 vkf0VarD = n6sVar.d();
        zjw zjwVar = vkf0VarD != null ? vkf0VarD.a.b : null;
        urr urrVarC = n6sVar.c();
        return (zjwVar == null || urrVarC == null) ? ulf0.b : zjwVar.h(lk40Var.j(urrVarC.o(0L)), i, ojf0.a.b);
    }

    public static final long d(n6s n6sVar, lk40 lk40Var, lk40 lk40Var2, int i) {
        long jC = c(n6sVar, lk40Var, i);
        if (ulf0.c(jC)) {
            return ulf0.b;
        }
        long jC2 = c(n6sVar, lk40Var2, i);
        if (ulf0.c(jC2)) {
            return ulf0.b;
        }
        int i2 = (int) (jC >> 32);
        int i3 = (int) (jC2 & 4294967295L);
        return vlf0.a(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final boolean e(ukf0 ukf0Var, int i) {
        zjw zjwVar = ukf0Var.b;
        int iD = zjwVar.d(i);
        return i == ukf0Var.i(iD) || i == zjwVar.c(iD, false) ? ukf0Var.j(i) != ukf0Var.a(i) : ukf0Var.a(i) != ukf0Var.a(i - 1);
    }

    public static final boolean f(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean g(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final boolean h(int i) {
        int type;
        return (!g(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    public static final long i(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }
}
