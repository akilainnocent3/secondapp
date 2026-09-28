package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ab9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        r75 r75Var = (r75) obj;
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        r75Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= aVar.M(r75Var) ? 4 : 2;
        }
        if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            float fMin = Math.min(r75Var.e() * 1.29f * 1.0495627f, r75Var.d());
            long jA = jc1.a(fMin, 0.9527778f * fMin);
            FillElement fillElement = j.a;
            d dVarO = j.o(d.a.b, k7f.c(jA), k7f.b(jA));
            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
            nan.a aVar2 = new nan.a((Context) aVar.O(qyd0Var));
            aVar2.c = b6u.b.a.g((Context) aVar.O(qyd0Var));
            uan.a(aVar2);
            aVar2.c().a(abn.a, new s3c.a(500));
            abn.e(aVar2, R.drawable.lucky_number_trophy_place_holder);
            mw90.a(aVar2.a(), "trophy", dVarO, null, null, d0b.a.b, null, aVar, 1572912, 1976);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
