package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import com.sportygames.newcms.c;
import java.util.Locale;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class dx9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e160) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            String upperCase = c.d(v5g0.Z.O, "Join", aVar).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            lkf0.b(upperCase, null, j58.b, 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar.O(pi60.a)).d, R.dimen._13ssp, aVar), aVar, 384, 0, 65018);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
