package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class bv30 {
    public static final void a(final boolean z, final Function0 function0, final d dVar, final boolean z2, final wu30 wu30Var, a aVar, final int i, final int i2) {
        int i3;
        long j;
        final twd0 twd0VarC;
        d dVar2;
        int i4;
        d dVarA;
        b bVarI = aVar.i(408580840);
        if ((i & 6) == 0) {
            i3 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.M(dVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.b(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bVarI.M(wu30Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= bVarI.M(null) ? 131072 : 65536;
        }
        if (bVarI.q(i3 & 1, (74899 & i3) != 74898)) {
            bVarI.A0();
            if ((i & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            final twd0 twd0VarA = xe0.a(z ? 6.0f : 0.0f, a6w.b(z5w.b, bVarI), null, bVarI, 0, 12);
            if (z2 && z) {
                j = wu30Var.a;
            } else if (!z2 || z) {
                j = (z2 || !z) ? wu30Var.d : wu30Var.c;
            } else {
                j = wu30Var.b;
            }
            if (z2) {
                bVarI.N(1194696477);
                twd0VarC = hw90.a(j, a6w.b(z5w.c, bVarI), null, bVarI, 0, 12);
                bVarI = bVarI;
                bVarI.X(false);
            } else {
                bVarI.N(1194874138);
                twd0VarC = m.c(new j58(j), bVarI);
                bVarI.X(false);
            }
            d.a aVar2 = d.a.b;
            if (function0 != null) {
                dVar2 = aVar2;
                i4 = 2;
                dVarA = androidx.compose.foundation.selection.a.a(dVar2, z, null, ut50.b(cv30.b / 2.0f, 4, 0L, false), z2, new su50(3), function0);
            } else {
                dVar2 = aVar2;
                i4 = 2;
                dVarA = dVar2;
            }
            if (function0 != null) {
                mjm mjmVar = zxo.a;
                dVar2 = MinimumInteractiveModifier.b;
            }
            d dVarN = j.n(h.f(j.C(dVar.n(dVar2).n(dVarA), ht.a.e, i4), 2.0f), cv30.a);
            boolean zM = bVarI.M(twd0VarC) | bVarI.M(twd0VarA);
            Object objY = bVarI.y();
            if (zM || objY == a.C0041a.a) {
                objY = new Function1() { // from class: yu30
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        tcf tcfVar = (tcf) obj;
                        float fC1 = tcfVar.C1(2.0f);
                        twd0 twd0Var = twd0VarC;
                        float f = fC1 / 2.0f;
                        tcf.n0(tcfVar, ((j58) twd0Var.getValue()).a, tcfVar.C1(cv30.a / 2.0f) - f, 0L, 0.0f, new yae0(fC1, 0.0f, 0, 0, null, 30), 108);
                        twd0 twd0Var2 = twd0VarA;
                        if (Float.compare(((g7f) twd0Var2.getValue()).a, 0.0f) > 0) {
                            tcf.n0(tcfVar, ((j58) twd0Var.getValue()).a, tcfVar.C1(((g7f) twd0Var2.getValue()).a) - f, 0L, 0.0f, rlh.a, 108);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            rxo.b(dVarN, (Function1) objY, bVarI, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: zu30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bv30.a(z, function0, dVar, z2, wu30Var, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
