package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class oqf0 {
    public static final void a(final pqf0 pqf0Var, a aVar, final int i) {
        int i2;
        b bVar;
        b bVarI = aVar.i(-781447898);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(pqf0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            long jA = c68.a(pqf0Var.k, bVarI);
            d dVarE = g3w.e(j.g(d.a.b, 1.0f), pqf0Var.h, null, 2);
            qyd0 qyd0Var = ejb0.a;
            d dVarI = h.i(dVarE, ((cjb0) bVarI.O(qyd0Var)).e, 18.0f, ((cjb0) bVarI.O(qyd0Var)).e, ((cjb0) bVarI.O(qyd0Var)).e);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarI);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.d(cb40.a(R.string.gift__lucky_wheel_tickets, new Object[0], bVarI), null, jA, null, 0L, null, t9i.E, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).i, bVarI, 1572864, 0, 131002);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: nqf0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    oqf0.a(pqf0Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(yik yikVar, Function0 function0, d dVar, a aVar, int i) {
        int i2;
        d dVar2;
        b bVarI = aVar.i(851459302);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(yikVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            long jA = c68.a(yikVar.b, bVarI);
            long jA2 = c68.a(yikVar.c, bVarI);
            String strA = vch0.a(yikVar.a, bVarI);
            alb0 alb0Var = sya.e;
            ak5 ak5VarA = sya.a(jA, jA2, jA, jA2, bVarI, 24576, 0);
            boolean z = yikVar.d;
            int i4 = ((i3 >> 6) & 14) | ((i3 << 24) & 1879048192);
            dVar2 = d.a.b;
            xya.a(dVar2, z, strA, null, alb0Var, ak5VarA, null, null, null, function0, bVarI, i4, 456);
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new kru(yikVar, function0, dVar2, i);
        }
    }

    public static final void c(final pqf0 pqf0Var, final Function1 function1, final d dVar, a aVar, final int i) {
        function1.getClass();
        b bVarI = aVar.i(744608273);
        int i2 = (bVarI.M(pqf0Var) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16) | 384;
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            d dVarH = h.h(j.g(aVar2, 1.0f), 0.0f, 8.0f, 1);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            boolean z = (i2 & 112) == 32;
            int i3 = i2 & 14;
            boolean z2 = z | (i3 == 4);
            Object objY = bVarI.y();
            if (z2 || objY == a.C0041a.a) {
                objY = new Function0() { // from class: kqf0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(pqf0Var.m);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            d(pqf0Var, (Function0) objY, bVarI, i3);
            a(pqf0Var, bVarI, i3);
            bVarI.X(true);
            dVar = aVar2;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, dVar, i) { // from class: lqf0
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ d c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    oqf0.c(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(pqf0 pqf0Var, Function0<Unit> function0, a aVar, final int i) {
        int i2;
        final pqf0 pqf0Var2;
        final Function0<Unit> function1;
        b bVar;
        j58 j58Var;
        yka.a.C1350a c1350a;
        yka.a.C1350a c1350a2;
        boolean z;
        b bVarI = aVar.i(-1890626200);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.M(pqf0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            Integer num = pqf0Var.g;
            if (num == null) {
                bVarI.N(556125280);
                bVarI.X(false);
                j58Var = null;
            } else {
                bVarI.N(556125281);
                long jA = c68.a(num.intValue(), bVarI);
                bVarI.X(false);
                j58Var = new j58(jA);
            }
            long jA2 = c68.a(pqf0Var.i, bVarI);
            d.a aVar2 = d.a.b;
            d dVarE = g3w.e(j.g(aVar2, 1.0f), pqf0Var.f, j58Var, 0);
            qyd0 qyd0Var = ejb0.a;
            d dVarJ = h.j(h.h(dVarE, ((cjb0) bVarI.O(qyd0Var)).e, 0.0f, 2), 0.0f, ((cjb0) bVarI.O(qyd0Var)).e, 0.0f, ((cjb0) bVarI.O(qyd0Var)).f, 5);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a3 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a3);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            kw0.j jVar = kw0.a;
            n54.b bVar3 = ht.a.j;
            d160 d160VarA = b160.a(jVar, bVar3, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a3);
            }
            LayoutWeightElement layoutWeightElementA = yy.a(bVarI, dVarC2, cVar, 1.0f, true);
            n54.a aVar4 = ht.a.m;
            kw0.k kVar = kw0.c;
            i78 i78VarA = g78.a(kVar, aVar4, bVarI, 0);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, layoutWeightElementA);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                c1350a = c1350a3;
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            } else {
                c1350a = c1350a3;
            }
            hlh0.a(bVarI, dVarC3, cVar);
            yka.a.C1350a c1350a4 = c1350a;
            lkf0.d(vch0.a(pqf0Var.b, bVarI), null, jA2, null, mla.m(12.0f, bVarI), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 0, 0, 262122);
            ty0.a(bVarI, j.i(aVar2, 4.0f));
            d160 d160VarA2 = b160.a(jVar, bVar3, bVarI, 48);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                c1350a2 = c1350a4;
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a2);
            } else {
                c1350a2 = c1350a4;
            }
            hlh0.a(bVarI, dVarC4, cVar);
            yka.a.C1350a c1350a5 = c1350a2;
            lkf0.d(cb40.a(R.string.lucky_wheel__lucky_wheel_abbr, new Object[0], bVarI), null, jA2, null, mla.m(12.0f, bVarI), null, t9i.E, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 1572864, 0, 262058);
            ty0.a(bVarI, j.w(aVar2, 8.0f));
            lkf0.d(vch0.a(pqf0Var.c, bVarI), null, jA2, null, mla.m(20.0f, bVarI), null, t9i.G, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 1572864, 0, 262058);
            bVar = bVarI;
            bVar.X(true);
            bVar.X(true);
            i78 i78VarA2 = g78.a(kVar, ht.a.o, bVar, 48);
            int iHashCode5 = Long.hashCode(bVar.T);
            ne00 ne00VarS5 = bVar.S();
            d dVarC5 = c.c(bVar, aVar2);
            bVar.D();
            if (bVar.S) {
                bVar.F(aVar3);
            } else {
                bVar.p();
            }
            hlh0.a(bVar, i78VarA2, bVar2);
            hlh0.a(bVar, ne00VarS5, dVar);
            if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode5))) {
                n30.a(iHashCode5, bVar, iHashCode5, c1350a5);
            }
            hlh0.a(bVar, dVarC5, cVar);
            pqf0Var2 = pqf0Var;
            b(pqf0Var2.e, function0, null, bVar, i3 & 112);
            ty0.a(bVar, j.i(aVar2, 8.0f));
            UiText uiText = pqf0Var2.d;
            if (uiText == null) {
                bVar.N(-914967879);
                bVar.X(false);
                z = true;
                function1 = function0;
            } else {
                bVar.N(-914967878);
                z = true;
                function1 = function0;
                lkf0.d(vch0.a(uiText, bVar), null, jA2, null, mla.m(12.0f, bVar), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar, 0, 0, 262122);
                bVar = bVar;
                Unit unit = Unit.a;
                bVar.X(false);
            }
            f30.a(bVar, z, z, z);
        } else {
            pqf0Var2 = pqf0Var;
            function1 = function0;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: mqf0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    oqf0.d(pqf0Var2, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
