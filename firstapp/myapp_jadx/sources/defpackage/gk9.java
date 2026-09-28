package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gk9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        tmz tmzVar = (tmz) obj;
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        tmzVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= aVar.M(tmzVar) ? 4 : 2;
        }
        if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            r520.c(h.e(j.e(d.a.b, 1.0f), tmzVar), null, aVar, 0, 2);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
