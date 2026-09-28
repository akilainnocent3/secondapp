package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p7e0 {
    public static final void a(d dVar, final float f, final Function0<Unit> function0, a aVar, final int i, final int i2) {
        d dVar2;
        int i3;
        final d dVar3;
        function0.getClass();
        b bVarI = aVar.i(1401627414);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            i3 = (bVarI.M(dVar2) ? 4 : 2) | i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.c(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.A(function0) ? 256 : 128;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            d dVar4 = i4 != 0 ? aVar2 : dVar2;
            d dVarG = j.g(dVar4, 1.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            d dVarA = dw.a(androidx.compose.foundation.layout.d.a.f(aVar2), f);
            q04[] q04VarArr = q04.b;
            mw90.a("https://s.sporty.net/cms/daily_streak_main_lobby_top_nav_bar_3x_789f62e450.png", "Streak Header", dVarA, null, null, d0b.a.a, null, bVarI, 1572912, 1976);
            op8 op8VarB = pp8.b(1629076483, new lfa(2, function0), bVarI);
            float f2 = d1g0.a;
            c1g0 c1g0VarC = d1g0.c(j58.l, 0L, 0L, 0L, 0L, 0L, bVarI, 62);
            bVarI = bVarI;
            vp0.a(mv9.a, null, op8VarB, null, 0.0f, null, c1g0VarC, bVarI, 390, 186);
            bVarI.X(true);
            dVar3 = dVar4;
        } else {
            bVarI.G();
            dVar3 = dVar2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: o7e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p7e0.a(dVar3, f, function0, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
