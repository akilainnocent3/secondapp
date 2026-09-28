package defpackage;

import androidx.compose.foundation.h;
import androidx.compose.foundation.lazy.layout.g;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class bvr {
    public static final void a(final d dVar, final zvr zvrVar, final ovr ovrVar, final tmz tmzVar, final svh svhVar, final boolean z, final sfz sfzVar, final kw0.l lVar, final kw0.e eVar, final Function1 function1, a aVar, final int i, final int i2) {
        int i3;
        int i4;
        final zvr zvrVar2;
        b bVar;
        boolean z2;
        boolean z3;
        lhp lhpVar;
        boolean z4;
        d dVarA;
        b bVarI = aVar.i(708740370);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.M(zvrVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? bVarI.M(ovrVar) : bVarI.A(ovrVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.M(tmzVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bVarI.b(false) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= bVarI.b(true) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= bVarI.M(svhVar) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= bVarI.b(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= bVarI.M(sfzVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= bVarI.M(lVar) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (bVarI.M(eVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            bVarI.A0();
            if ((i & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            int i5 = i3 >> 3;
            int i6 = i5 & 14;
            int i7 = i6 | (i4 & 112);
            ytw ytwVarC = m.c(function1, bVarI);
            boolean z5 = (((i7 & 14) ^ 6) > 4 && bVarI.M(zvrVar)) || (i7 & 6) == 4;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z5 || objY == c0042a) {
                f9 f9Var = new f9(ytwVarC, 1);
                t6a0<qwo> t6a0Var = a6a0.a;
                gq40 gq40Var = gq40.b;
                final mae maeVar = new mae(f9Var, gq40Var);
                objY = new sur(new mae(new Function0() { // from class: rur
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        mur murVar = (mur) maeVar.getValue();
                        zvr zvrVar3 = zvrVar;
                        return new qur(zvrVar3, murVar, new g((IntRange) zvrVar3.d.e.getValue(), murVar));
                    }
                }, gq40Var), twd0.class, "value", "getValue()Ljava/lang/Object;", 0);
                bVarI.r(objY);
            }
            lhp lhpVar2 = (lhp) objY;
            int i8 = i6 | ((i3 >> 9) & 112);
            int i9 = i3;
            boolean z6 = ((((i8 & 14) ^ 6) > 4 && bVarI.M(zvrVar)) || (i8 & 6) == 4) | ((((i8 & 112) ^ 48) > 32 && bVarI.b(false)) || (i8 & 48) == 32);
            Object objY2 = bVarI.y();
            if (z6 || objY2 == c0042a) {
                objY2 = new t0s(zvrVar);
                bVarI.r(objY2);
            }
            t0s t0sVar = (t0s) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = xvf.i(e.a, bVarI);
                bVarI.r(objY3);
            }
            v5b v5bVar = (v5b) objY3;
            t6l t6lVar = (t6l) bVarI.O(kna.g);
            l0e0.a.C0800a c0800a = !((Boolean) bVarI.O(kna.v)).booleanValue() ? l0e0.a.a : null;
            int i10 = (i9 & 524272) | ((i4 << 18) & 3670016) | ((i9 >> 6) & 29360128);
            boolean zM = ((((458752 & i10) ^ 196608) > 131072 && bVarI.b(true)) || (i10 & 196608) == 131072) | ((((i10 & 112) ^ 48) > 32 && bVarI.M(zvrVar)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && bVarI.M(ovrVar)) || (i10 & 384) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && bVarI.M(tmzVar)) || (i10 & 3072) == 2048) | ((((57344 & i10) ^ 24576) > 16384 && bVarI.b(false)) || (i10 & 24576) == 16384) | ((((i10 & 3670016) ^ 1572864) > 1048576 && bVarI.M(eVar)) || (i10 & 1572864) == 1048576) | ((((i10 & 29360128) ^ 12582912) > 8388608 && bVarI.M(lVar)) || (i10 & 12582912) == 8388608) | bVarI.M(t6lVar);
            Object objY4 = bVarI.y();
            if (zM || objY4 == c0042a) {
                z2 = false;
                z3 = true;
                objY4 = new avr(zvrVar, tmzVar, lhpVar2, ovrVar, lVar, eVar, v5bVar, t6lVar, c0800a);
                lhpVar = lhpVar2;
                bVarI.r(objY4);
            } else {
                lhpVar = lhpVar2;
                z2 = false;
                z3 = true;
            }
            nxr nxrVar = (nxr) objY4;
            i3z i3zVar = i3z.a;
            if (z) {
                bVarI.N(27343139);
                boolean z7 = (((i6 ^ 6) <= 4 || !bVarI.M(zvrVar)) && (i5 & 6) != 4) ? z2 : z3;
                Object objY5 = bVarI.y();
                if (z7 || objY5 == c0042a) {
                    objY5 = new fur(r3);
                    bVarI.r(objY5);
                }
                z4 = false;
                dVarA = androidx.compose.foundation.lazy.layout.a.a((fur) objY5, r3.n, false, i3zVar);
                bVarI.X(z2);
            } else {
                z4 = false;
                bVarI.N(27639344);
                bVarI.X(z2);
                dVarA = d.a.b;
            }
            boolean z8 = z4;
            d dVarA2 = h.a(androidx.compose.foundation.lazy.layout.e.a(dVar.n(r3.k).n(r3.l), lhpVar, t0sVar, i3zVar, z, z8).n(dVarA).n(r3.m.k), r3, i3zVar, z, z8, svhVar, r3.f, false, sfzVar, null);
            zvrVar2 = r3;
            bVar = bVarI;
            mxr.a(lhpVar, dVarA2, zvrVar2.o, nxrVar, bVar, 0);
        } else {
            zvrVar2 = zvrVar;
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: wur
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bvr.a(dVar, zvrVar2, ovrVar, tmzVar, svhVar, z, sfzVar, lVar, eVar, function1, (a) obj, qj40.a(i | 1), qj40.a(i2));
                    return Unit.a;
                }
            };
        }
    }
}
