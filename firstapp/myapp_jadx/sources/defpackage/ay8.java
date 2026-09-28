package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ay8 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((gwr) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            w3d.e(h.h(d.a.b, 16.0f, 0.0f, 2), aVar, 6);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
