package defpackage;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import java.util.WeakHashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ba9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        gwr gwrVar = (gwr) obj;
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        gwrVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= aVar.M(gwrVar) ? 4 : 2;
        }
        if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            d dVarC = gwrVar.c(d.a.b, yi0.e(300, 0, null, 6), yi0.d(0.0f, 200.0f, null, 5), yi0.e(300, 0, null, 6));
            WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
            ty0.a(aVar, dVarC.n(new kae(new ydh0(q8j0.a.a(aVar).c, q8j0.a.a(aVar).e), gnn.a)));
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
