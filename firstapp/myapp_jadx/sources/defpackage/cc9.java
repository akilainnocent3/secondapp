package defpackage;

import androidx.compose.foundation.layout.c;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cc9 implements iaj {
    @Override // defpackage.iaj
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Integer) obj2).intValue();
        a aVar = (a) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        ((tur) obj).getClass();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= aVar.d(iIntValue) ? 32 : 16;
        }
        if (aVar.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
            d dVarA = d.a.b;
            d dVarA2 = c.a(dVarA, 1.0f);
            if (iIntValue == 0) {
                dVarA = androidx.compose.ui.platform.d.a(dVarA, "lobby_v2_games_append_loading");
            }
            u9t.a(dVarA2.n(dVarA), aVar, 0);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
