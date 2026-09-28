package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportygames.newcms.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class cpi0 {
    public static final void a(d dVar, a aVar, int i) {
        b bVarI = aVar.i(1257831619);
        if (bVarI.q(i & 1, (i & 3) != 2)) {
            h9n.a(erz.a(2131233726, 0, bVarI), "loading", j.r(p1a.a(dVar, ((Number) kgn.a(kgn.b("Rotation", bVarI, 0), 0.0f, 360.0f, yi0.a(yi0.e(1000, 0, xkf.d, 2), l850.a, 0L, 4), "Rotate", bVarI, 29112, 0).getValue()).floatValue()), 20.0f), null, null, 0.0f, new gf4(r58.d(4279967269L), 5), bVarI, 1572912, 56);
            bVarI = bVarI;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new d7t(dVar, i);
        }
    }

    public static final void b(final d dVar, final dpi0 dpi0Var, final Function0 function0, a aVar, final int i) {
        int i2;
        dVar.getClass();
        dpi0Var.getClass();
        b bVarI = aVar.i(832166271);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dpi0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            umz umzVar = ek5.a;
            ak5 ak5VarA = ek5.c((d68) bVarI.O(g68.a)).a(r58.d(4281326642L), r58.d(4279967269L), r58.d(4281326642L), r58.d(4279967269L));
            nk5.a(function0, oka.a(48, bVarI, dw.a(j.i(dVar, 48.0f), dpi0Var.b() ? 1.0f : 0.6f), "bet_button"), dpi0Var.b(), j060.c(8.0f), ak5VarA, null, null, h.a(3, 0.0f, 0.0f), null, pp8.b(2124112783, new gaj() { // from class: api0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((e160) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        dpi0 dpi0Var2 = dpi0Var;
                        lkf0.b(c.c(dpi0Var2.getText(), new String[0], aVar2), null, 0L, i7f.b(16.0f, aVar2), null, new t9i(700), null, 0L, null, i7f.b(18.75f, aVar2), 0, false, 0, 0, null, null, aVar2, 196608, 0, 130006);
                        if (dpi0Var2.a()) {
                            aVar2.N(1690992093);
                            cpi0.a(h.j(d.a.b, 8.0f, 0.0f, 0.0f, 0.0f, 14), aVar2, 6);
                        } else {
                            aVar2.N(1688595731);
                        }
                        aVar2.H();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 >> 6) & 14) | 817889280, 352);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: bpi0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    cpi0.b(dVar, dpi0Var, function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
