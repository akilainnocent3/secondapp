package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gf9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((j78) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            h6n.b(pib0.a(R.drawable.ic__arrow_chevron_right, 0, aVar), "more", j.r(d.a.b, 16.0f), ((lib0) aVar.O(oib0.a)).b, aVar, 432, 0);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
