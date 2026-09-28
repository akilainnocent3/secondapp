package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ft9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        d dVar = (d) obj;
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        dVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= aVar.M(dVar) ? 4 : 2;
        }
        if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            d dVarH = g3w.h(j.i(dVar, 36.0f), "sporty_legends_tutorial_lucky_pick_button");
            Object objY = aVar.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new at9(0);
                aVar.r(objY);
            }
            d dVarB = androidx.compose.ui.draw.a.b(dVarH, (Function1) objY);
            alb0 alb0Var = sya.a;
            ak5 ak5VarA = sya.a(c68.a(R.color.bg_inverse_primary_d_base, aVar), 0L, 0L, 0L, aVar, 24576, 14);
            Object objY2 = aVar.y();
            if (objY2 == c0042a) {
                objY2 = new bt9();
                aVar.r(objY2);
            }
            xya.b(dVarB, true, ak5VarA, null, null, 0.0f, null, (Function0) objY2, gt9.b, aVar, 113246256, 120);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
