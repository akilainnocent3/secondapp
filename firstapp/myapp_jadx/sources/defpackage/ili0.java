package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ili0 {
    public static final void a(final jli0 jli0Var, final boolean z, final Function1 function1, final Function0 function0, d dVar, a aVar, final int i) {
        final d dVar2;
        function1.getClass();
        function0.getClass();
        b bVarI = aVar.i(-280316378);
        int i2 = (bVarI.A(jli0Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function0) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            d.a aVar2 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(j.i(j.g(aVar2, 1.0f), 40.0f), c68.a(R.color.background_type2_primary, bVarI), zk40.a);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new eli0();
                bVarI.r(objY);
            }
            d dVarB2 = xa80.b(dVarB, false, (Function1) objY);
            d160 d160VarA = b160.a(kw0.g, ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            dli0.b(yy.a(bVarI, dVarC, yka.a.d, 1.0f, true), jli0Var, function1, bVarI, ((i3 << 3) & 112) | 64 | (i3 & 896));
            d dVarJ = h.j(aVar2, 0.0f, 0.0f, 8.0f, 0.0f, 11);
            boolean z2 = (i3 & 7168) == 2048;
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new Function0() { // from class: fli0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function0.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            ju1.b(pp8.b(-10905326, new gaj() { // from class: gli0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar4 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((m75) obj).getClass();
                    if (!aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        aVar4.G();
                    } else if (z) {
                        aVar4.N(1536988583);
                        ju1.a(null, c68.a(R.color.brand_primary, aVar4), 0L, aVar4, 0, 13);
                        aVar4.H();
                    } else {
                        aVar4.N(1537089488);
                        aVar4.H();
                    }
                    return Unit.a;
                }
            }, bVarI), g3w.h(g3w.f(dVarJ, true, (Function0) objY2), "virtual_lobby_gift_icon_container"), g0a.a, bVarI, 390, 0);
            bVarI.X(true);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: hli0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ili0.a(jli0Var, z, function1, function0, dVar2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
