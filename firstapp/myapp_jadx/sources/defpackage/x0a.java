package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x0a implements gaj {
    public final /* synthetic */ int a;

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((e160) obj).getClass();
                if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    lkf0.d(cb40.a(R.string.common_functions__retry, new Object[0], aVar), null, ((lib0) aVar.O(oib0.a)).h, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar.O(kjb0.a)).n, aVar, 0, 0, 131066);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                d dVar = (d) obj;
                a aVar2 = (a) obj2;
                e3w.a((Integer) obj3, dVar, aVar2, -1980953366);
                d dVarJ = h.j(dVar, 0.0f, 0.0f, 0.0f, 48.0f, 7);
                aVar2.H();
                return dVarJ;
        }
    }
}
