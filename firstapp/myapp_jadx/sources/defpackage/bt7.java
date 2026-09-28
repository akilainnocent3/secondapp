package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class bt7 {
    public static final void a(final int i, a aVar, final d dVar, final Function0 function0) {
        int i2;
        b bVar;
        function0.getClass();
        b bVarI = aVar.i(-1512426217);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarA = ls7.a(j.r(dVar, 40.0f), j060.a);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = rzk.a(bVarI);
            }
            d dVarC = androidx.compose.ui.graphics.a.c(androidx.compose.foundation.d.b(dVarA, (psw) objY, ut50.b(0.0f, 7, 0L, false), false, null, function0, 28), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 45.0f, 0L, null, 524031);
            rbn rbnVarB = dg.a;
            if (rbnVarB == null) {
                rbn.a aVar2 = new rbn.a("Outlined.AddCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                m2g m2gVar = lwh0.a;
                soa0 soa0Var = new soa0(j58.b);
                fxz fxzVar = new fxz();
                fxzVar.f(12.0f, 2.0f);
                qxz.c cVar = new qxz.c(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                ArrayList<qxz> arrayList = fxzVar.a;
                arrayList.add(cVar);
                fxzVar.g(4.48f, 10.0f, 10.0f, 10.0f);
                fxzVar.g(10.0f, -4.48f, 10.0f, -10.0f);
                arrayList.add(new qxz.h(17.52f, 2.0f, 12.0f, 2.0f));
                fxzVar.a();
                fxzVar.f(17.0f, 13.0f);
                fxzVar.c(-4.0f);
                fxzVar.h(4.0f);
                fxzVar.c(-2.0f);
                fxzVar.h(-4.0f);
                fxzVar.d(7.0f, 13.0f);
                fxzVar.h(-2.0f);
                fxzVar.c(4.0f);
                fxzVar.d(11.0f, 7.0f);
                fxzVar.c(2.0f);
                fxzVar.h(4.0f);
                fxzVar.c(4.0f);
                fxzVar.h(2.0f);
                fxzVar.a();
                rbn.a.a(aVar2, arrayList, soa0Var);
                rbnVarB = aVar2.b();
                dg.a = rbnVarB;
            }
            bVar = bVarI;
            h6n.a(rbnVarB, AnalyticsParam.STORY_SKIP_REASON_CLOSE, dVarC, j58.c(0.4f, c68.a(R.color.background_type2_for_iv_primary, bVarI)), bVar, 48, 0);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: at7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bt7.a(qj40.a(i | 1), (a) obj, dVar, function0);
                    return Unit.a;
                }
            };
        }
    }
}
