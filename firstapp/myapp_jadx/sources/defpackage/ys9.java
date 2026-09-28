package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ys9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e160) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            String strA = cb40.a(R.string.page_instant_virtual__lucky_pick, new Object[0], aVar);
            d.a aVar2 = d.a.b;
            lkf0.d(strA, g3w.h(aVar2, "sporty_legends_lucky_pick_text"), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, aVar), aVar, 48, 0, 131068);
            h9n.a(erz.a(R.drawable.ic_refresh, 0, aVar), "refresh", g3w.h(h.j(aVar2, 8.0f, 0.0f, 0.0f, 0.0f, 14), "sporty_legends_lucky_pick_refresh_icon"), null, null, 0.0f, new gf4(c68.a(R.color.text_type2_primary, aVar), 5), aVar, 432, 56);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
