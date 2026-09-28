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
public final class agg0 {
    public static final void a(d dVar, final qfg0 qfg0Var, final Function1<? super qfg0, Unit> function1, a aVar, final int i, final int i2) {
        d dVar2;
        int i3;
        b bVar;
        final d dVar3;
        qfg0Var.getClass();
        function1.getClass();
        b bVarI = aVar.i(1970162370);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else if ((i & 6) == 0) {
            dVar2 = dVar;
            i3 = (bVarI.M(dVar2) ? 4 : 2) | i;
        } else {
            dVar2 = dVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.d(qfg0Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            dVar3 = i4 != 0 ? d.a.b : dVar2;
            final uag uagVar = qfg0.d;
            int iIndexOf = uagVar.indexOf(qfg0Var);
            final int i5 = iIndexOf >= 0 ? iIndexOf : 0;
            bVar = bVarI;
            j3f0.e(i5, j.g(dVar3, 1.0f), null, ((lib0) bVarI.O(oib0.a)).d1, 0L, 8.0f, pp8.b(410939333, new gaj() { // from class: wfg0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    k1f0 k1f0Var = (k1f0) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    k1f0Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= (iIntValue & 8) == 0 ? aVar2.M(k1f0Var) : aVar2.A(k1f0Var) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        i2f0.a.c(k1f0Var.a(i5, false), 2.0f, ((lib0) aVar2.O(oib0.a)).D, aVar2, 3120, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), iy9.a, 0.0f, pp8.b(1035495054, new Function2() { // from class: xfg0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        q3.b bVar2 = new q3.b();
                        int i6 = 0;
                        while (bVar2.hasNext()) {
                            Object next = bVar2.next();
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                kotlin.collections.b.q();
                                throw null;
                            }
                            final qfg0 qfg0Var2 = (qfg0) next;
                            boolean z = i6 == i5;
                            final Function1 function2 = function1;
                            boolean zM = aVar2.M(function2) | aVar2.d(qfg0Var2.ordinal());
                            Object objY = aVar2.y();
                            if (zM || objY == a.C0041a.a) {
                                objY = new Function0() { // from class: zfg0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function2.invoke(qfg0Var2);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY);
                            }
                            w1f0.b(z, (Function0) objY, null, false, pp8.b(-351642055, new f5r(qfg0Var2, z), aVar2), 0L, 0L, aVar2, 24576, 492);
                            i6 = i7;
                        }
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 819658752, 276);
        } else {
            bVar = bVarI;
            bVar.G();
            dVar3 = dVar2;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: yfg0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    agg0.a(dVar3, qfg0Var, function1, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
