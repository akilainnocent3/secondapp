package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class us9 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            h6n.b(erz.a(R.drawable.ic_footer_arrow_left, 0, aVar), "Left arrow icon", g3w.h(j.r(d.a.b, 12.0f), "sporty_legends_stats_left_arrow_icon"), ((lib0) aVar.O(oib0.a)).a0, aVar, 432, 0);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
