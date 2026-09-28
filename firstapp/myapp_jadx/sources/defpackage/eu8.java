package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class eu8 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            lkf0.d(cb40.a(R.string.page_loyalty__challenge_detail_prizes_tooltip, new Object[0], aVar), h.f(d.a.b, ((cjb0) aVar.O(ejb0.a)).d), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar.O(kjb0.a)).r, aVar, 0, 0, 131068);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
