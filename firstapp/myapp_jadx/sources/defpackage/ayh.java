package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class ayh {
    static {
        int i = p2h.a;
        fah0 fah0Var = fah0.a;
        int i2 = n2h.a;
    }

    public static final void a(final Function0 function0, final d dVar, qx80 qx80Var, final long j, long j2, pxh pxhVar, final op8 op8Var, a aVar, final int i, final int i2) {
        Function0 function1;
        int i3;
        final qx80 qx80VarB;
        final long jB;
        final pxh pxhVar2;
        b bVarI = aVar.i(748201188);
        if ((i & 6) == 0) {
            function1 = function0;
            i3 = (bVarI.A(function1) ? 4 : 2) | i;
        } else {
            function1 = function0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.M(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                qx80VarB = qx80Var;
                int i4 = bVarI.M(qx80VarB) ? 256 : 128;
                i3 |= i4;
            } else {
                qx80VarB = qx80Var;
            }
            i3 |= i4;
        } else {
            qx80VarB = qx80Var;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.e(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                jB = j2;
                int i5 = bVarI.e(jB) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
                i3 |= i5;
            } else {
                jB = j2;
            }
            i3 |= i5;
        } else {
            jB = j2;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                pxhVar2 = pxhVar;
                int i6 = bVarI.M(pxhVar2) ? 131072 : 65536;
                i3 |= i6;
            } else {
                pxhVar2 = pxhVar;
            }
            i3 |= i6;
        } else {
            pxhVar2 = pxhVar;
        }
        int i7 = i3 | 1572864;
        if ((12582912 & i) == 0) {
            i7 |= bVarI.A(op8Var) ? 8388608 : 4194304;
        }
        if (bVarI.q(i7 & 1, (4793491 & i7) != 4793490)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                if ((i2 & 4) != 0) {
                    qx80VarB = xy80.b(b6h.a, bVarI);
                    i7 &= -897;
                }
                if ((i2 & 16) != 0) {
                    jB = g68.b(j, bVarI);
                    i7 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i7 &= -458753;
                    pxhVar2 = new pxh(d6h.a, d6h.d, d6h.b, d6h.c);
                }
            } else {
                bVarI.G();
                if ((i2 & 4) != 0) {
                    i7 &= -897;
                }
                if ((i2 & 16) != 0) {
                    i7 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i7 &= -458753;
                }
            }
            pxh pxhVar3 = pxhVar2;
            long j3 = jB;
            bVarI.Y();
            int i8 = i7 << 9;
            qx80 qx80Var2 = qx80VarB;
            b(function1, gah0.a(o2h.a, bVarI), b6h.b, dVar, qx80Var2, j, j3, pxhVar3, op8Var, bVarI, (i8 & 1879048192) | (i7 & 14) | 3456 | (57344 & i8) | (458752 & i8) | (3670016 & i8) | (29360128 & i8) | (234881024 & i8), (i7 >> 21) & 14);
            qx80VarB = qx80Var2;
            jB = j3;
            pxhVar2 = pxhVar3;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: vxh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ayh.a(function0, dVar, qx80VarB, j, jB, pxhVar2, op8Var, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final Function0 function0, final imf0 imf0Var, final float f, final d dVar, final qx80 qx80Var, final long j, final long j2, final pxh pxhVar, final op8 op8Var, a aVar, final int i, final int i2) {
        int i3;
        qx80 qx80Var2;
        op8 op8Var2;
        int i4;
        b bVar;
        b bVarI = aVar.i(121669932);
        if ((i & 6) == 0) {
            i3 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.M(imf0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.c(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.c(56.0f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bVarI.M(dVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            qx80Var2 = qx80Var;
            i3 |= bVarI.M(qx80Var2) ? 131072 : 65536;
        } else {
            qx80Var2 = qx80Var;
        }
        if ((1572864 & i) == 0) {
            i3 |= bVarI.e(j) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= bVarI.e(j2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= bVarI.M(pxhVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= bVarI.M(null) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            op8Var2 = op8Var;
            i4 = i2 | (bVarI.A(op8Var2) ? 4 : 2);
        } else {
            op8Var2 = op8Var;
            i4 = i2;
        }
        int i5 = i3;
        boolean z = true;
        if (bVarI.q(i5 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            bVarI.A0();
            if ((i & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            bVarI.N(-282833393);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = rzk.a(bVarI);
            }
            psw pswVar = (psw) objY;
            bVarI.X(false);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new wxh(0);
                bVarI.r(objY2);
            }
            d dVarB = xa80.b(dVar, false, (Function1) objY2);
            float f2 = pxhVar.a;
            int i6 = i5 >> 21;
            int i7 = i6 & 112;
            boolean zM = bVarI.M(pswVar);
            Object objY3 = bVarI.y();
            if (zM || objY3 == c0042a) {
                objY3 = new sxh(pxhVar.a, pxhVar.b, pxhVar.d, pxhVar.c);
                bVarI.r(objY3);
            }
            sxh sxhVar = (sxh) objY3;
            boolean zA = bVarI.A(sxhVar);
            if (((i7 ^ 48) <= 32 || !bVarI.M(pxhVar)) && (i6 & 48) != 32) {
                z = false;
            }
            boolean z2 = zA | z;
            Object objY4 = bVarI.y();
            if (z2 || objY4 == c0042a) {
                objY4 = new mxh(sxhVar, pxhVar, null);
                bVarI.r(objY4);
            }
            xvf.e(bVarI, pxhVar, (Function2) objY4);
            boolean zM2 = bVarI.M(pswVar) | bVarI.A(sxhVar);
            Object objY5 = bVarI.y();
            if (zM2 || objY5 == c0042a) {
                objY5 = new oxh(pswVar, sxhVar, null);
                bVarI.r(objY5);
            }
            xvf.e(bVarI, pswVar, (Function2) objY5);
            int i8 = i5 >> 6;
            bVar = bVarI;
            ihe0.c(function0, dVarB, false, qx80Var2, j, j2, f2, ((g7f) ((x5a0) sxhVar.e.c.b).getValue()).a, null, pswVar, pp8.b(-1779603465, new zxh(j2, imf0Var, f, op8Var2), bVarI), bVar, (i5 & 14) | (i8 & 7168) | (57344 & i8) | (i8 & 458752), 260);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: xxh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    ayh.b(function0, imf0Var, f, dVar, qx80Var, j, j2, pxhVar, op8Var, (a) obj, iA, iA2);
                    return Unit.a;
                }
            };
        }
    }
}
