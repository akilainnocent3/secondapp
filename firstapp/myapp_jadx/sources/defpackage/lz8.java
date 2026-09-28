package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.Locale;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lz8 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((j78) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            d dVarG = h.g(d.a.b, 12.0f, 4.0f);
            String upperCase = cb40.a(R.string.page_loyalty__invite_only, new Object[0], aVar).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            lkf0.d(upperCase, dVarG, c68.a(R.color.brand_tertiary, aVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, aVar), aVar, 0, 0, 131064);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
