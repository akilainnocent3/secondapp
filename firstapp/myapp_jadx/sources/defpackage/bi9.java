package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bi9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        j3a0 j3a0Var = (j3a0) obj;
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        j3a0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= aVar.M(j3a0Var) ? 4 : 2;
        }
        if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            qyd0 qyd0Var = aqe.a;
            f4a0.d(j3a0Var, h.h(h.j(d.a.b, ((sr0) aVar.O(qyd0Var)).e(), 0.0f, ((sr0) aVar.O(qyd0Var)).b(), 0.0f, 10), 0.0f, ((sr0) aVar.O(qyd0Var)).b(), 1), false, null, c68.a(R.color.background_snackbar, aVar), c68.a(R.color.text_inverse_primary, aVar), 0L, 0L, 0L, aVar, iIntValue & 14, 460);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
