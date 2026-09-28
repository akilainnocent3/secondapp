package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class saf {
    public static final void a(gwr gwrVar, final abf abfVar, final Integer num, d dVar, boolean z, final op8 op8Var, a aVar, final int i) {
        final gwr gwrVar2;
        int i2;
        final d dVar2;
        final boolean z2;
        d dVarB;
        d dVarA;
        abfVar.getClass();
        b bVarI = aVar.i(-1125457324);
        if ((i & 6) == 0) {
            gwrVar2 = gwrVar;
            i2 = (bVarI.M(gwrVar2) ? 4 : 2) | i;
        } else {
            gwrVar2 = gwrVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(abfVar) : bVarI.A(abfVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(num) ? 256 : 128;
        }
        int i3 = i2 | 27648;
        if ((196608 & i) == 0) {
            i3 |= bVarI.A(op8Var) ? 131072 : 65536;
        }
        if (bVarI.q(i3 & 1, (74899 & i3) != 74898)) {
            i3z i3zVar = i3z.a;
            mae maeVarB = a6a0.b(new waf(num, abfVar));
            aq40 aq40Var = new aq40();
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = Float.valueOf(0.0f);
                bVarI.r(objY);
            }
            aq40Var.a = ((Number) objY).floatValue();
            boolean zBooleanValue = ((Boolean) maeVarB.getValue()).booleanValue();
            d.a aVar2 = d.a.b;
            if (zBooleanValue) {
                bVarI.N(-1983950453);
                d dVarA2 = abk0.a(aVar2, 1.0f);
                bVarI.N(767290090);
                boolean z3 = (i3 & 112) == 32 || ((i3 & 64) != 0 && bVarI.A(abfVar));
                Object objY2 = bVarI.y();
                if (z3 || objY2 == c0042a) {
                    objY2 = new Function1() { // from class: oaf
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            a7l a7lVar = (a7l) obj;
                            a7lVar.getClass();
                            a7lVar.f(abfVar.b());
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                d dVarA3 = androidx.compose.ui.graphics.a.a(aVar2, (Function1) objY2);
                bVarI.X(false);
                dVarA = dVarA2.n(dVarA3);
                bVarI.X(false);
            } else {
                bVarI.N(767320220);
                if (num.equals(((x5a0) abfVar.n).getValue())) {
                    bVarI.N(-1983406372);
                    d dVarA4 = abk0.a(aVar2, 1.0f);
                    bVarI.N(767307640);
                    boolean z4 = (i3 & 112) == 32 || ((i3 & 64) != 0 && bVarI.A(abfVar));
                    Object objY3 = bVarI.y();
                    if (z4 || objY3 == c0042a) {
                        objY3 = new lq6(abfVar, 1);
                        bVarI.r(objY3);
                    }
                    d dVarA5 = androidx.compose.ui.graphics.a.a(aVar2, (Function1) objY3);
                    bVarI.X(false);
                    dVarB = dVarA4.n(dVarA5);
                    bVarI.X(false);
                } else {
                    bVarI.N(-1982920664);
                    bVarI.X(false);
                    dVarB = gwr.b(gwrVar2);
                }
                dVarA = v.a(dVarB, new fta(aq40Var));
                bVarI.X(false);
            }
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
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
            naf nafVar = new naf(abfVar, num, new paf(aq40Var));
            Boolean bool = (Boolean) maeVarB.getValue();
            bool.getClass();
            op8Var.d(nafVar, bool, bVarI, Integer.valueOf(((i3 >> 9) & 896) | 8));
            bVarI.X(true);
            boolean zA = ((57344 & i3) == 16384) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && bVarI.A(abfVar))) | bVarI.A(num);
            Object objY4 = bVarI.y();
            if (zA || objY4 == c0042a) {
                objY4 = new raf(abfVar, num, null);
                bVarI.r(objY4);
            }
            xvf.e(bVarI, true, (Function2) objY4);
            z2 = true;
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
            z2 = z;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: qaf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    saf.a(gwrVar2, abfVar, num, dVar2, z2, op8Var, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
