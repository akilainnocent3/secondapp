package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportygames.newcms.c;
import java.util.Locale;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wx9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((gwr) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            String upperCase = c.d(v5g0.Z.u, "More prizes for", aVar).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            lkf0.b(upperCase, j.g(dw.a(d.a.b, 0.6f), 1.0f), b6g0.h, 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar.O(pi60.a)).b, R.dimen._11ssp, aVar), aVar, 432, 0, 65016);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
