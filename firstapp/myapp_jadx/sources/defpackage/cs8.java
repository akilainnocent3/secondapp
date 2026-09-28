package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cs8 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        r75 r75Var = (r75) obj;
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        r75Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= aVar.M(r75Var) ? 4 : 2;
        }
        if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            h6n.b(erz.a(R.drawable.close, 0, aVar), "Cancel", j.r(d.a.b, r75Var.e() / 1.5f), j58.f, aVar, 3120, 0);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
