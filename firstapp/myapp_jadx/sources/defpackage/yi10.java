package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class yi10 {
    public static final void a(d dVar, op8 op8Var, a aVar, int i) {
        int i2;
        d dVar2;
        op8 op8Var2;
        b bVarI = aVar.i(790527681);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(op8Var) ? 32 : 16;
        }
        int i3 = 0;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.a(null, epx.a);
                bVarI.r(objY);
            }
            final ytw ytwVar = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new Function0() { // from class: ti10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        urr urrVar = (urr) ytwVar.getValue();
                        if (urrVar != null) {
                            return urrVar;
                        }
                        zkn.d("Required value was null.");
                        fkd.a();
                        return null;
                    }
                };
                bVarI.r(objY2);
            }
            Function0 function0 = (Function0) objY2;
            x420 x420Var = vhd.a;
            ka2 ka2VarB = sa2.b(6, ky8.b, bVarI);
            dVar2 = dVar;
            op8Var2 = op8Var;
            hna.b(new j730[]{ref0.b.a(ic0.c(function0, bVarI, 2)), ref0.a.a(ka2VarB)}, pp8.b(1070596993, new xi10(dVar2, ytwVar, op8Var2, ka2VarB, function0), bVarI), bVarI, 56);
        } else {
            dVar2 = dVar;
            op8Var2 = op8Var;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new ui10(dVar2, op8Var2, i, i3);
        }
    }

    public static final void b(final d dVar, final op8 op8Var, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(155925518);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(op8Var) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            boolean z = bVarI.O(ref0.a) != null;
            boolean z2 = bVarI.O(ref0.b) != null;
            if (z && z2) {
                bVarI.N(-1977156178);
                aiv aivVarC = g75.c(ht.a.a, true);
                int iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVar);
                yka.k.getClass();
                tsr.a aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
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
                op8Var.invoke(bVarI, Integer.valueOf((i2 >> 3) & 14));
                bVarI.X(true);
                bVarI.X(false);
            } else if (z) {
                bVarI.N(-1976965962);
                ic0.a(dVar, op8Var, bVarI, i2 & WebSocketProtocol.PAYLOAD_SHORT);
                bVarI.X(false);
            } else if (z2) {
                bVarI.N(-1976815178);
                vhd.d(dVar, op8Var, bVarI, i2 & WebSocketProtocol.PAYLOAD_SHORT);
                bVarI.X(false);
            } else {
                bVarI.N(-1976684761);
                a(dVar, op8Var, bVarI, i2 & WebSocketProtocol.PAYLOAD_SHORT);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: vi10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    yi10.b(dVar, op8Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
