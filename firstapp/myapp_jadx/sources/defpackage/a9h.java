package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class a9h {
    public static final void a(final d dVar, final boolean z, final float f, final mz1 mz1Var, String str, final op8 op8Var, a aVar, final int i, final int i2) {
        int i3;
        final String str2;
        mz1Var.getClass();
        b bVarI = aVar.i(1271704899);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.b(false) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.b(false) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.b(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bVarI.b(z) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= bVarI.c(f) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= bVarI.A(mz1Var) ? 1048576 : 524288;
        }
        int i4 = i2 & 128;
        if (i4 != 0) {
            i3 |= 12582912;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 12582912) == 0) {
                i3 |= bVarI.M(str2) ? 8388608 : 4194304;
            }
        }
        if ((i & 100663296) == 0) {
            i3 |= bVarI.A(op8Var) ? 67108864 : 33554432;
        }
        if (bVarI.q(i3 & 1, (i3 & 38347923) != 38347922)) {
            String str3 = i4 != 0 ? "1" : str2;
            aiv aivVarC = g75.c(ht.a.a, false);
            str2 = str3;
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            Object objValueOf = Integer.valueOf(((i3 >> 21) & 112) | 6);
            androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
            op8Var.invoke(dVar2, bVarI, objValueOf);
            d dVarF = dVar2.f(d.a.b);
            boolean zA = ((i3 & 57344) == 16384) | ((458752 & i3) == 131072) | bVarI.A(mz1Var) | ((29360128 & i3) == 8388608) | ((i3 & 112) == 32) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objY = bVarI.y();
            if (zA || objY == a.C0041a.a) {
                objY = new Function1() { // from class: y8h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        tcf tcfVar = (tcf) obj;
                        tcfVar.getClass();
                        float fC1 = tcfVar.C1(f);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                        mz1 mz1Var2 = mz1Var;
                        long jC = j58.c(0.7f, mz1Var2.Q());
                        if (Intrinsics.g(str2, "2")) {
                            jC = mz1Var2.Q();
                        }
                        if (z) {
                            List listK = kotlin.collections.b.k(new j58(j58.l), new j58(jC), new j58(mz1Var2.Q()));
                            float f2 = (fIntBitsToFloat - fC1) - 4.0f;
                            tcf.V1(tcfVar, ya5.a.a(f2, fIntBitsToFloat + 4.0f, 8, listK), (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fC1 + 8.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), 0.0f, null, null, 3, 56);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            rxo.b(dVarF, (Function1) objY, bVarI, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        final String str4 = str2;
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: z8h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a9h.a(dVar, z, f, mz1Var, str4, op8Var, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
