package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class eph0 {
    public static final void a(phx phxVar, final Function0 function0, final Function0 function1, final Function1 function2, a aVar, final int i) {
        final phx phxVarC;
        int i2;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        b bVarI = aVar.i(-622966357);
        int i3 = i | 2 | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024);
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                phxVarC = mr10.c(new vkx[0], bVarI);
                i2 = i3 & (-15);
            } else {
                bVarI.G();
                i2 = i3 & (-15);
                phxVarC = phxVar;
            }
            bVarI.Y();
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new iki(function0, 2);
                bVarI.r(objY);
            }
            tr1.a(false, (Function0) objY, bVarI, 0, 1);
            d dVarE = j.e(androidx.compose.foundation.a.b(d.a.b, c68.a(R.color.bg_primary_d_base, bVarI), zk40.a), 1.0f);
            boolean zA = ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | bVarI.A(phxVarC) | (i4 == 32);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new Function1() { // from class: aph0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ghx ghxVar = (ghx) obj;
                        ghxVar.getClass();
                        final phx phxVar2 = phxVarC;
                        final Function0 function3 = function1;
                        final Function0 function4 = function0;
                        final Function1 function5 = function2;
                        hhx.b(ghxVar, "FeedbackFieldScreen", null, new op8(94395368, new iaj() { // from class: cph0
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                a aVar2 = (a) obj4;
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                phx phxVar3 = phxVar2;
                                boolean zA2 = aVar2.A(phxVar3);
                                Object objY3 = aVar2.y();
                                if (zA2 || objY3 == a.C0041a.a) {
                                    objY3 = new q9d0(phxVar3, 1);
                                    aVar2.r(objY3);
                                }
                                vhh.d((Function0) objY3, function5, function3, function4, aVar2, 0);
                                return Unit.a;
                            }
                        }, true), 254);
                        hhx.b(ghxVar, "FeedbackSuccessScreen", null, new op8(-268220847, new iaj() { // from class: dph0
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                ((Integer) obj5).intValue();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                eih.a(function5, function3, function4, (a) obj4, 0);
                                return Unit.a;
                            }
                        }, true), 254);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            uix.c(phxVarC, "FeedbackFieldScreen", dVarE, null, null, null, null, null, (Function1) objY2, bVarI, 0, 1016);
        } else {
            bVarI.G();
            phxVarC = phxVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, function2, i) { // from class: bph0
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    eph0.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
