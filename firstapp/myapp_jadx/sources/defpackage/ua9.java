package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ua9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((gwr) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            d dVarG = j.g(d.a.b, 1.0f);
            qyd0 qyd0Var = ejb0.a;
            lkf0.d(cb40.a(R.string.page_lucky_numbers__recent_search, new Object[0], aVar), h.i(dVarG, ((cjb0) aVar.O(qyd0Var)).d, ((cjb0) aVar.O(qyd0Var)).d, ((cjb0) aVar.O(qyd0Var)).d, ((cjb0) aVar.O(qyd0Var)).d), ((lib0) aVar.O(oib0.a)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar.O(kjb0.a)).j, aVar, 0, 0, 131064);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
