package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
public final class sg30 {
    public static final void a(d dVar, final bh30 bh30Var, final Function1 function1, a aVar, int i) {
        bh30Var.getClass();
        b bVarI = aVar.i(227268461);
        int i2 = i | (bVarI.M(bh30Var) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            boolean z = bh30Var.d;
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z) {
                bVarI.N(1686439671);
                boolean z2 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
                Object objY = bVarI.y();
                if (z2 || objY == c0042a) {
                    objY = new Function0() { // from class: og30
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Function1 function2 = function1;
                            if (function2 != null) {
                                function2.invoke(bh30Var);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                xya.b(dVar, false, null, null, null, 0.0f, null, (Function0) objY, pp8.b(-1816184568, new avu(bh30Var, 1), bVarI), bVarI, 100663302, WebSocketProtocol.PAYLOAD_SHORT);
                bVarI.X(false);
            } else {
                bVarI.N(1686697033);
                boolean z3 = ((i2 & 896) == 256) | ((i2 & 112) == 32);
                Object objY2 = bVarI.y();
                if (z3 || objY2 == c0042a) {
                    objY2 = new Function0() { // from class: pg30
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Function1 function2 = function1;
                            if (function2 != null) {
                                function2.invoke(bh30Var);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                vuc0.a(dVar, false, null, null, (Function0) objY2, null, null, null, null, pp8.b(-1572179118, new gaj() { // from class: qg30
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar2 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((e160) obj).getClass();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            lkf0.d(bh30Var.c, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar2, 0, 0, 262142);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 805306374, 494);
                bVarI = bVarI;
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new dvu(dVar, bh30Var, function1, i, 1);
        }
    }
}
