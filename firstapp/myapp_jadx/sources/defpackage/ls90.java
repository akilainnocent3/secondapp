package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
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

/* JADX INFO: loaded from: classes5.dex */
public final class ls90 {
    public static final void a(final ts90 ts90Var, final rf3 rf3Var, final sf3 sf3Var, final Function1 function1, a aVar, final int i) {
        boolean z;
        b bVarI = aVar.i(-482379253);
        int i2 = i | (bVarI.A(ts90Var) ? 4 : 2) | (bVarI.A(rf3Var) ? 32 : 16) | (bVarI.A(sf3Var) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            d dVarE = j.e(d.a.b, 1.0f);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new as90();
                bVarI.r(objY);
            }
            d dVarF = g3w.f(dVarE, true, (Function0) objY);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
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
            at90.a(ts90Var.a, rf3Var, bVarI, i2 & 112);
            d dVarB = androidx.compose.foundation.a.b(new LayoutWeightElement(1.0f, true), ((lib0) bVarI.O(oib0.a)).q0, zk40.a);
            int i3 = i2 & 7168;
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 14) == 4 || bVarI.A(ts90Var)) | (i3 == 2048);
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new Function1() { // from class: bs90
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        final ts90 ts90Var2 = ts90Var;
                        szr.h(szrVar, null, new op8(-1541590442, new gaj() { // from class: es90
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                a aVar3 = (a) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                ((gwr) obj2).getClass();
                                if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    qr90.b(ts90Var2.b, aVar3, 0);
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, true), 3);
                        qcn<br90> qcnVar = ts90Var2.c.a;
                        szrVar.d(qcnVar.size(), null, new js90(qcnVar), new op8(802480018, new ks90(qcnVar, function1), true));
                        final sf3 sf3Var2 = sf3Var;
                        szr.h(szrVar, null, new op8(750030477, new gaj() { // from class: fs90
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                a aVar3 = (a) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                ((gwr) obj2).getClass();
                                if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    gr90.a(ts90Var2.d, sf3Var2, aVar3, 0);
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, true), 3);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            aur.a(dVarB, null, null, false, null, null, null, false, null, (Function1) objY2, bVarI, 0, 510);
            bVarI.X(true);
            slo sloVar = ts90Var.e;
            if (sloVar == null) {
                bVarI.N(402399306);
                bVarI.X(false);
            } else {
                bVarI.N(402399307);
                boolean z3 = i3 == 2048;
                Object objY3 = bVarI.y();
                if (z3 || objY3 == c0042a) {
                    z = false;
                    objY3 = new cs90(function1, 0);
                    bVarI.r(objY3);
                } else {
                    z = false;
                }
                Function0 function0 = (Function0) objY3;
                rlo.a(sloVar, function0, function0, function0, bVarI, 0);
                bVarI.X(z);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(rf3Var, sf3Var, function1, i) { // from class: ds90
                public final /* synthetic */ rf3 b;
                public final /* synthetic */ sf3 c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    ls90.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
