package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class b34 {
    public static final void a(final Boolean bool, final Function0 function0, final Function1 function1, a aVar, final int i) {
        function1.getClass();
        b bVarI = aVar.i(-509568105);
        int i2 = (bVarI.M(bool) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            final phx phxVarC = mr10.c(new vkx[0], bVarI);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new u24();
                bVarI.r(objY);
            }
            d dVarB = xa80.b(d.a.b, false, (Function1) objY);
            e04 e04Var = new e04(bool);
            boolean zA = ((i2 & 112) == 32) | bVarI.A(phxVarC) | ((i2 & 896) == 256);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new Function1() { // from class: v24
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ghx ghxVar = (ghx) obj;
                        ghxVar.getClass();
                        final Function0 function2 = function0;
                        final phx phxVar = phxVarC;
                        final Function1 function3 = function1;
                        op8 op8Var = new op8(-94924968, new iaj() { // from class: x24
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                a aVar2 = (a) obj4;
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                phx phxVar2 = phxVar;
                                boolean zA2 = aVar2.A(phxVar2);
                                Object objY3 = aVar2.y();
                                if (zA2 || objY3 == a.C0041a.a) {
                                    objY3 = new a34(phxVar2, 0);
                                    aVar2.r(objY3);
                                }
                                g44.a(null, function2, (Function0) objY3, function3, aVar2, 0);
                                return Unit.a;
                            }
                        }, true);
                        o2g o2gVar = o2g.a;
                        o2gVar.getClass();
                        m2g m2gVar = m2g.a;
                        hhx.a(ghxVar, jq40.a(e04.class), o2gVar, m2gVar, null, null, null, null, op8Var);
                        hhx.a(ghxVar, jq40.a(g04.class), o2gVar, m2gVar, null, null, null, null, new op8(-724677937, new iaj() { // from class: y24
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                a aVar2 = (a) obj4;
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                phx phxVar2 = phxVar;
                                boolean zA2 = aVar2.A(phxVar2);
                                Object objY3 = aVar2.y();
                                if (zA2 || objY3 == a.C0041a.a) {
                                    objY3 = new z24(phxVar2, 0);
                                    aVar2.r(objY3);
                                }
                                o14.a(null, (Function0) objY3, aVar2, 0);
                                return Unit.a;
                            }
                        }, true));
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            uix.b(phxVarC, e04Var, dVarB, null, null, null, null, null, null, (Function1) objY2, bVarI, 0, 2040);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(bool, function0, function1, i) { // from class: w24
                public final /* synthetic */ Boolean a;
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function1 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    b34.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
