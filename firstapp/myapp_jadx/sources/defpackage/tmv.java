package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class tmv {
    public static final void a(final d dVar, final cuw cuwVar, final ytw ytwVar, final zp70 zp70Var, final qx80 qx80Var, final long j, final float f, final op8 op8Var, a aVar, final int i) {
        float f2;
        b bVarI = aVar.i(848986741);
        int i2 = i | (bVarI.M(dVar) ? 4 : 2) | (bVarI.M(cuwVar) ? 32 : 16) | (bVarI.M(zp70Var) ? 2048 : 1024) | (bVarI.M(qx80Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.e(j) ? 131072 : 65536) | (bVarI.c(0.0f) ? 1048576 : 524288) | (bVarI.c(f) ? 8388608 : 4194304) | (bVarI.M(null) ? 67108864 : 33554432) | (bVarI.A(op8Var) ? 536870912 : 268435456);
        if (bVarI.q(i2 & 1, (i2 & 306783379) != 306783378)) {
            dtg0 dtg0VarE = vtg0.e(cuwVar, "DropDownMenu", bVarI, (((i2 >> 3) & 14) | 48) & WebSocketProtocol.PAYLOAD_SHORT, 0);
            goh gohVarB = a6w.b(z5w.b, bVarI);
            goh gohVarB2 = a6w.b(z5w.d, bVarI);
            g0h0 g0h0Var = gjs.b;
            o oVar = dtg0VarE.a;
            ytw ytwVar2 = dtg0VarE.d;
            boolean zBooleanValue = ((Boolean) oVar.V()).booleanValue();
            bVarI.N(143964305);
            float f3 = zBooleanValue ? 1.0f : 0.8f;
            bVarI.X(false);
            Float fValueOf = Float.valueOf(f3);
            x5a0 x5a0Var = (x5a0) ytwVar2;
            boolean zBooleanValue2 = ((Boolean) x5a0Var.getValue()).booleanValue();
            bVarI.N(143964305);
            float f4 = zBooleanValue2 ? 1.0f : 0.8f;
            bVarI.X(false);
            Float fValueOf2 = Float.valueOf(f4);
            dtg0VarE.f();
            bVarI.N(-745957716);
            bVarI.X(false);
            final dtg0.d dVarD = vtg0.d(dtg0VarE, fValueOf, fValueOf2, gohVarB, g0h0Var, bVarI, 0);
            boolean zBooleanValue3 = ((Boolean) dtg0VarE.a.V()).booleanValue();
            bVarI.N(892761509);
            float f5 = zBooleanValue3 ? 1.0f : 0.0f;
            bVarI.X(false);
            Float fValueOf3 = Float.valueOf(f5);
            boolean zBooleanValue4 = ((Boolean) x5a0Var.getValue()).booleanValue();
            bVarI.N(892761509);
            float f6 = zBooleanValue4 ? 1.0f : 0.0f;
            bVarI.X(false);
            Float fValueOf4 = Float.valueOf(f6);
            dtg0VarE.f();
            bVarI.N(2839488);
            bVarI.X(false);
            final dtg0.d dVarD2 = vtg0.d(dtg0VarE, fValueOf3, fValueOf4, gohVarB2, g0h0Var, bVarI, 0);
            final boolean zBooleanValue5 = ((Boolean) bVarI.O(hnn.a)).booleanValue();
            boolean zB = bVarI.b(zBooleanValue5) | bVarI.M(dVarD) | ((i2 & 112) == 32) | bVarI.M(dVarD2);
            Object objY = bVarI.y();
            if (zB || objY == a.C0041a.a) {
                f2 = 0.0f;
                Function1 function1 = new Function1() { // from class: lmv
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        float fFloatValue;
                        ytw ytwVar3 = cuwVar.c;
                        a7l a7lVar = (a7l) obj;
                        boolean z = zBooleanValue5;
                        twd0 twd0Var = dVarD;
                        float fFloatValue2 = 0.8f;
                        float fFloatValue3 = 1.0f;
                        if (z) {
                            fFloatValue = ((Boolean) ((x5a0) ytwVar3).getValue()).booleanValue() ? 1.0f : 0.8f;
                        } else {
                            fFloatValue = ((Number) twd0Var.getValue()).floatValue();
                        }
                        a7lVar.k(fFloatValue);
                        if (!z) {
                            fFloatValue2 = ((Number) twd0Var.getValue()).floatValue();
                        } else if (((Boolean) ((x5a0) ytwVar3).getValue()).booleanValue()) {
                            fFloatValue2 = 1.0f;
                        }
                        a7lVar.v(fFloatValue2);
                        if (!z) {
                            fFloatValue3 = ((Number) dVarD2.getValue()).floatValue();
                        } else if (!((Boolean) ((x5a0) ytwVar3).getValue()).booleanValue()) {
                            fFloatValue3 = 0.0f;
                        }
                        a7lVar.b(fFloatValue3);
                        a7lVar.z0(((jsg0) ytwVar.getValue()).a);
                        return Unit.a;
                    }
                };
                bVarI.r(function1);
                objY = function1;
            } else {
                f2 = 0.0f;
            }
            int i3 = i2 >> 9;
            int i4 = i2 >> 6;
            ihe0.a(androidx.compose.ui.graphics.a.a(d.a.b, (Function1) objY), qx80Var, j, 0L, f2, f, null, pp8.b(-1463404422, new omv(dVar, zp70Var, op8Var), bVarI), bVarI, (i3 & 896) | (i3 & 112) | 12582912 | (57344 & i4) | (458752 & i4) | (i4 & 3670016), 8);
            bVarI = bVarI;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(cuwVar, ytwVar, zp70Var, qx80Var, j, f, op8Var, i) { // from class: mmv
                public final /* synthetic */ cuw b;
                public final /* synthetic */ ytw c;
                public final /* synthetic */ zp70 d;
                public final /* synthetic */ qx80 e;
                public final /* synthetic */ long f;
                public final /* synthetic */ float i;
                public final /* synthetic */ op8 v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(385);
                    tmv.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final op8 op8Var, final Function0 function0, final d dVar, final Function2 function2, final Function2 function3, final boolean z, final hmv hmvVar, final tmz tmzVar, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(-1325192924);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(op8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(dVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.b(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.M(hmvVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bVarI.M(tmzVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= bVarI.M(null) ? 67108864 : 33554432;
        }
        if (bVarI.q(i2 & 1, (38347923 & i2) != 38347922)) {
            d dVarE = h.e(j.v(j.g(androidx.compose.foundation.d.b(dVar, null, ut50.b(0.0f, 6, 0L, true), z, null, function0, 24), 1.0f), 112.0f, 48.0f, 280.0f, 8), tmzVar);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int I = bVarI.I();
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I))) {
                n30.a(I, bVarI, I, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.a(((eah0) bVarI.O(gah0.a)).m, pp8.b(865999929, new smv(function2, hmvVar, z, function3, op8Var), bVarI), bVarI, 48);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: nmv
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    tmv.b(op8Var, function0, dVar, function2, function3, z, hmvVar, tmzVar, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
