package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class o670 {
    public static final void a(final u670 u670Var, final Function0<Unit> function0, final Function0<Unit> function1, final Function1<? super String, Unit> function2, a aVar, final int i) {
        int i2;
        Unit unit;
        u670Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        b bVarI = aVar.i(-282428486);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(u670Var) : bVarI.A(u670Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function2) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            d670 d670Var = u670Var.b;
            if (d670Var instanceof d670.b) {
                bVarI.N(-830824059);
                x570.a(0, bVarI);
                bVarI.X(false);
            } else if (d670Var instanceof d670.a) {
                bVarI.N(-830819997);
                boolean z = ((i2 & 14) == 4 || ((i2 & 8) != 0 && bVarI.A(u670Var))) | ((i2 & 7168) == 2048);
                Object objY = bVarI.y();
                if (z || objY == a.C0041a.a) {
                    objY = new ua2(1, function2, u670Var);
                    bVarI.r(objY);
                }
                v570.a((Function0) objY, bVarI, 0);
                bVarI.X(false);
            } else {
                if (!(d670Var instanceof d670.c)) {
                    throw igf0.a(bVarI, -830827433, false);
                }
                bVarI.N(14578582);
                c670 c670Var = ((d670.c) d670Var).a;
                if (c670Var == null) {
                    bVarI.N(14597367);
                    bVarI.X(false);
                    unit = null;
                } else {
                    bVarI.N(14597368);
                    z570.a(c670Var, function0, function1, bVarI, (i2 & 896) | (i2 & 112) | 8);
                    bVarI.X(false);
                    unit = Unit.a;
                }
                if (unit == null) {
                    bVarI.N(-830804509);
                    t570.a(0, bVarI);
                } else {
                    bVarI.N(-830813716);
                }
                bVarI.X(false);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: n670
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    o670.a(u670Var, function0, function1, function2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
