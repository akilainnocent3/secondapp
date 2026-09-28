package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l49 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((gwr) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            lkf0.d(cb40.a(R.string.component_coupon__note_cashout_is_unavailable_with_bets_using_gifts, new Object[0], aVar), j.g(h.j(d.a.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), ((lib0) aVar.O(oib0.a)).b, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) aVar.O(kjb0.a)).n, aVar, 48, 0, 130040);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
