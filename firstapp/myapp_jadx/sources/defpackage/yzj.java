package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class yzj {
    public static final void a(final d dVar, final Integer num, final imf0 imf0Var, a aVar, final int i) {
        b bVarI = aVar.i(675937380);
        int i2 = 222390 | i;
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                num = Integer.valueOf(R.string.app_common__no_information);
                imf0Var = ((eah0) bVarI.O(gah0.a)).i;
                dVar = d.a.b;
            } else {
                bVarI.G();
            }
            Integer num2 = num;
            imf0 imf0Var2 = imf0Var;
            bVarI.Y();
            d dVarA = j.A(androidx.compose.foundation.a.b(j.c(j.e(dVar, 1.0f), 1.0f), ((d68) bVarI.O(g68.a)).n, zk40.a), ht.a.k, 2);
            i0b.a(bVarI, -1003410150, 212064437, false);
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = rzj.a(mmdVar, bVarI);
            }
            niv nivVar = (niv) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = pzj.a(bVarI);
            }
            nwa nwaVar = (nwa) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = m.b(Boolean.FALSE);
                bVarI.r(objY3);
            }
            ytw ytwVar = (ytw) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = qzj.a(nwaVar, bVarI);
            }
            twa twaVar = (twa) objY4;
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = m.a(Unit.a, epx.a);
                bVarI.r(objY5);
            }
            ytw ytwVar2 = (ytw) objY5;
            boolean zA = bVarI.A(nivVar) | bVarI.d(257);
            Object objY6 = bVarI.y();
            if (zA || objY6 == c0042a) {
                objY6 = new tzj(ytwVar2, nivVar, twaVar, ytwVar);
                bVarI.r(objY6);
            }
            aiv aivVar = (aiv) objY6;
            Object objY7 = bVarI.y();
            if (objY7 == c0042a) {
                objY7 = new uzj(ytwVar, twaVar);
                bVarI.r(objY7);
            }
            Function0 function0 = (Function0) objY7;
            boolean zA2 = bVarI.A(nivVar);
            Object objY8 = bVarI.y();
            if (zA2 || objY8 == c0042a) {
                objY8 = new vzj(nivVar);
                bVarI.r(objY8);
            }
            lsr.a(xa80.b(dVarA, false, (Function1) objY8), pp8.b(1200550679, new xzj(ytwVar2, nwaVar, function0, num2, imf0Var2), bVarI), aivVar, bVarI, 48);
            bVarI.X(false);
            num = num2;
            imf0Var = imf0Var2;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(num, imf0Var, i) { // from class: ozj
                public final /* synthetic */ Integer b;
                public final /* synthetic */ imf0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    yzj.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
