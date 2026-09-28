package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.Locale;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class vx9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((gwr) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            String upperCase = pm5.MORE_PRIZES.a().toUpperCase(Locale.ROOT);
            upperCase.getClass();
            lkf0.b(upperCase, j.g(dw.a(d.a.b, 0.6f), 1.0f), a6g0.g, 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, ni60.g(((sfd0) aVar.O(ni60.b)).b, R.dimen._11ssp, aVar), aVar, 432, 0, 65016);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
