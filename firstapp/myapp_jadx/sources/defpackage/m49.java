package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m49 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((gwr) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            String strA = cb40.a(R.string.component_coupon__applicable_gift, new Object[0], aVar);
            imf0 imf0Var = ((ijb0) aVar.O(kjb0.a)).i;
            long j = ((lib0) aVar.O(oib0.a)).a;
            qyd0 qyd0Var = ejb0.a;
            lkf0.d(strA, h.j(d.a.b, 0.0f, ((cjb0) aVar.O(qyd0Var)).f, 0.0f, ((cjb0) aVar.O(qyd0Var)).c, 5), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, aVar, 0, 0, 131064);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
