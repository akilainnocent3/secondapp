package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class z3f0 {
    public static final void a(d dVar, final uf00 uf00Var, final p9f0 p9f0Var, final Function1 function1, a aVar, final int i) {
        b bVar;
        final d dVar2;
        uf00Var.getClass();
        p9f0Var.getClass();
        function1.getClass();
        b bVarI = aVar.i(-1011627405);
        int i2 = i | 6 | (bVarI.A(uf00Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(p9f0Var) : bVarI.A(p9f0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            final int iIndexOf = uf00Var.indexOf(p9f0Var);
            d.a aVar2 = d.a.b;
            bVar = bVarI;
            j3f0.e(iIndexOf, j.g(aVar2, 1.0f), null, ((lib0) bVarI.O(oib0.a)).i0, 0L, 8.0f, pp8.b(-1925284784, new gaj() { // from class: u3f0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    k1f0 k1f0Var = (k1f0) obj;
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    k1f0Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= (iIntValue & 8) == 0 ? aVar3.M(k1f0Var) : aVar3.A(k1f0Var) ? 4 : 2;
                    }
                    if (aVar3.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        i2f0.a.c(k1f0Var.a(iIndexOf, false), 2.0f, ((lib0) aVar3.O(oib0.a)).D, aVar3, 3120, 0);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), lw9.a, 0.0f, pp8.b(-624418265, new Function2() { // from class: v3f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar3 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        int i3 = 0;
                        for (Object obj3 : uf00Var) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                kotlin.collections.b.q();
                                throw null;
                            }
                            final p9f0 p9f0Var2 = (p9f0) obj3;
                            final boolean z = i3 == iIndexOf;
                            final Function1 function2 = function1;
                            boolean zM = aVar3.M(function2) | aVar3.A(p9f0Var2);
                            Object objY = aVar3.y();
                            if (zM || objY == a.C0041a.a) {
                                objY = new Function0() { // from class: x3f0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function2.invoke(p9f0Var2);
                                        return Unit.a;
                                    }
                                };
                                aVar3.r(objY);
                            }
                            w1f0.b(z, (Function0) objY, null, false, pp8.b(-1958645805, new Function2() { // from class: y3f0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    imf0 imf0Var;
                                    a aVar4 = (a) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        String strA = cb40.a(p9f0Var2.a, new Object[0], aVar4);
                                        if (z) {
                                            aVar4.N(-1062938378);
                                            imf0Var = ((ijb0) aVar4.O(kjb0.a)).m;
                                        } else {
                                            aVar4.N(-1062937738);
                                            imf0Var = ((ijb0) aVar4.O(kjb0.a)).o;
                                        }
                                        aVar4.H();
                                        lkf0.d(strA, null, ((lib0) aVar4.O(oib0.a)).a, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, imf0Var, aVar4, 0, 24960, 110586);
                                    } else {
                                        aVar4.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar3), 0L, 0L, aVar3, 24576, 492);
                            i3 = i4;
                        }
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 819658752, 276);
            dVar2 = aVar2;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: w3f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    z3f0.a(dVar2, uf00Var, p9f0Var, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
