package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class nyp {
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    public static final void a(final boolean z, final Function0<Unit> function0, long j, a aVar, final int i, final int i2) {
        final long jC;
        int i3;
        boolean z2;
        e eVarZ;
        Object objY;
        function0.getClass();
        b bVarI = aVar.i(-748404337);
        int i4 = (bVarI.b(z) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                jC = j;
                i4 |= bVarI.e(jC) ? 256 : 128;
            }
            i3 = 1;
            if ((i4 & 147) != 146) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bVarI.q(i4 & 1, z2)) {
                if (i5 != 0) {
                    jC = j58.c(0.75f, j58.b);
                }
                long j2 = jC;
                objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = new lyp();
                    bVarI.r(objY);
                }
                dz90.a(z, false, (Function0) objY, j2, pp8.b(-37047360, new xwf(function0, i3), bVarI), bVarI, (i4 & 14) | 25008 | ((i4 << 3) & 7168), 0);
                jC = j2;
            } else {
                bVarI.G();
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: myp
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        nyp.a(z, function0, jC, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i4 |= 384;
        jC = j;
        i3 = 1;
        if ((i4 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bVarI.q(i4 & 1, z2)) {
            if (i5 != 0) {
                jC = j58.c(0.75f, j58.b);
            }
            long j3 = jC;
            objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new lyp();
                bVarI.r(objY);
            }
            dz90.a(z, false, (Function0) objY, j3, pp8.b(-37047360, new xwf(function0, i3), bVarI), bVarI, (i4 & 14) | 25008 | ((i4 << 3) & 7168), 0);
            jC = j3;
        } else {
            bVarI.G();
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: myp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nyp.a(z, function0, jC, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
