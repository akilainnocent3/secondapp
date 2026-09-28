package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jro implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        d dVar = (d) obj;
        a aVar = (a) obj2;
        e3w.a((Integer) obj3, dVar, aVar, 57981735);
        d dVarH = h.h(dVar, 16.0f, 0.0f, 2);
        if (1.0f <= 0.0d) {
            ukn.a("invalid weight; must be greater than zero");
        }
        d dVarN = dVarH.n(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
        aVar.H();
        return dVarN;
    }
}
