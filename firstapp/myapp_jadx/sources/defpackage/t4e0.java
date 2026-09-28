package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t4e0 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        d dVar = (d) obj;
        a aVar = (a) obj2;
        e3w.a((Integer) obj3, dVar, aVar, 1335125408);
        if (1.55f <= 0.0d) {
            ukn.a("invalid weight; must be greater than zero");
        }
        d dVarN = dVar.n(new LayoutWeightElement(1.55f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.55f, true));
        aVar.H();
        return dVarN;
    }
}
