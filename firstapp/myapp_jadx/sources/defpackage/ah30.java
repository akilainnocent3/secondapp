package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ah30 {
    public static final void a(final dh30 dh30Var, a aVar, int i) {
        dh30Var.getClass();
        b bVarI = aVar.i(1611441870);
        int i2 = (bVarI.A(dh30Var) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            o0z.a(null, null, null, null, null, pp8.b(-356591107, new Function2() { // from class: zg30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        dh30 dh30Var2 = dh30Var;
                        if (dh30Var2 instanceof dh30.c) {
                            aVar2.N(913331428);
                            xg30.a(null, ((dh30.c) dh30Var2).a, aVar2, 64);
                            aVar2.H();
                        } else {
                            if (!Intrinsics.g(dh30Var2, dh30.a.a) && !Intrinsics.g(dh30Var2, dh30.b.a)) {
                                throw rg.a(913330293, aVar2);
                            }
                            aVar2.N(-1751428509);
                            aVar2.H();
                        }
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 196608);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new rig(dh30Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final jh30 jh30Var, a aVar, final int i) {
        jh30Var.getClass();
        b bVarI = aVar.i(1434605275);
        int i2 = (bVarI.A(jh30Var) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            a((dh30) wyh.c(jh30Var.b, bVarI, 0, 7).getValue(), bVarI, 8);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: yg30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    ah30.b(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
