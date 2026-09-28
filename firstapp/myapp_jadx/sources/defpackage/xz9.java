package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xz9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e160) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            crz crzVarA = erz.a(R.drawable.ic_play_arrow_black_16dp, 0, aVar);
            d.a aVar2 = d.a.b;
            h9n.a(crzVarA, null, j.r(aVar2, 10.0f), null, null, 0.0f, new gf4(c68.a(R.color.brand_tertiary, aVar), 5), aVar, 432, 56);
            ty0.a(aVar, j.w(aVar2, 8.0f));
            lkf0.d(cb40.a(R.string.common_functions__play, new Object[0], aVar), null, c68.a(R.color.brand_tertiary, aVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.C2_R, aVar), aVar, 0, 0, 131066);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
