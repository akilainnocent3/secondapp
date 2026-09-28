package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yt8 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e160) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            lkf0.d(cb40.a(R.string.cashout__rebet_in_sim, new Object[0], aVar), null, ((lib0) aVar.O(oib0.a)).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar.O(kjb0.a)).f, aVar, 0, 0, 131066);
            float f = ((cjb0) aVar.O(ejb0.a)).d;
            d.a aVar2 = d.a.b;
            ty0.a(aVar, j.w(aVar2, f));
            h6n.b(pib0.a(R.drawable.ic__arrow_chevron_right, 0, aVar), null, j.r(aVar2, 16.0f), 0L, aVar, 432, 8);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
