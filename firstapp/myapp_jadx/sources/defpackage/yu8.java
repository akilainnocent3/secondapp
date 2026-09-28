package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yu8 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        j78 j78Var = (j78) obj;
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        j78Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= aVar.M(j78Var) ? 4 : 2;
        }
        if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            lkf0.d(cb40.a(R.string.common_functions__back, new Object[0], aVar), h.g(j78Var.c(ht.a.n, d.a.b), 20.0f, 16.0f), j58.f, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H4_M, aVar), aVar, 384, 0, 130040);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
