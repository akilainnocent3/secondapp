package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
public final class kr4 {
    public static final void a(final d dVar, final lr4 lr4Var, a aVar, final int i) {
        b bVar;
        b bVarI = aVar.i(-271070725);
        int i2 = (bVarI.M(lr4Var) ? 32 : 16) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            qyd0 qyd0Var = oib0.a;
            final long j = ((lib0) bVarI.O(qyd0Var)).A0;
            final long j2 = ((lib0) bVarI.O(qyd0Var)).x0;
            d dVarA = ls7.a(j.k(j.g(dVar, 1.0f), 17.0f, 0.0f, 2), j060.c(8.5f));
            boolean zE = ((i2 & 112) == 32) | bVarI.e(j) | bVarI.e(j2);
            Object objY = bVarI.y();
            if (zE || objY == a.C0041a.a) {
                Function1 function1 = new Function1() { // from class: ir4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        tcf tcfVar = (tcf) obj;
                        tcfVar.getClass();
                        tcf.m0(tcfVar, j, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                        float fD = f.d(lr4Var.b, 0.0f, 1.0f) * Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                        tcf.d1(tcfVar, j2, 0L, (((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), 0L, null, 0.0f, r.d.DEFAULT_SWIPE_ANIMATION_DURATION);
                        return Unit.a;
                    }
                };
                bVarI.r(function1);
                objY = function1;
            }
            d dVarA2 = androidx.compose.ui.draw.a.a(dVarA, (Function1) objY);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA2);
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
            lkf0.d(lr4Var.a.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), null, ((lib0) bVarI.O(qyd0Var)).i, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).o, bVarI, 0, 0, 131066);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(lr4Var, i) { // from class: jr4
                public final /* synthetic */ lr4 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    kr4.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
