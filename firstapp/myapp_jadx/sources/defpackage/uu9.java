package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class uu9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        g7f g7fVar = (g7f) obj;
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= aVar.c(g7fVar.a) ? 4 : 2;
        }
        if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            h6n.b(erz.a(R.drawable.cross_gift, 0, aVar), "Decrease", j.r(d.a.b, g7fVar.a), j58.m, aVar, 3120, 0);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
