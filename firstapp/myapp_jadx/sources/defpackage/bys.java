package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class bys {
    public static final void a(Function0 function0, a aVar, final int i) {
        int i2;
        final Function0 function1;
        function0.getClass();
        b bVarI = aVar.i(-1151350494);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            function1 = function0;
            u60.a(function1, new yle(false, false, 3), xb9.a, bVarI, (i2 & 14) | 432, 0);
        } else {
            function1 = function0;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: yxs
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    bys.a(function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final lz50 b(float f, float f2, float f3, float f4, float f5, float f6) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        return new lz50(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final lz50 c(lk40 lk40Var, long j, long j2, long j3, long j4) {
        return new lz50(lk40Var.a, lk40Var.b, lk40Var.c, lk40Var.d, j, j2, j3, j4);
    }

    public static final lz50 d(float f, float f2, float f3, float f4, long j) {
        return b(f, f2, f3, f4, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final lz50 e(lk40 lk40Var, long j) {
        return b(lk40Var.a, lk40Var.b, lk40Var.c, lk40Var.d, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final boolean f(lz50 lz50Var) {
        long j = lz50Var.e;
        return (j >>> 32) == (4294967295L & j) && j == lz50Var.f && j == lz50Var.g && j == lz50Var.h;
    }
}
