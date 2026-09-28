package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sv8 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            d dVarE = j.e(d.a.b, 1.0f);
            long jD = r58.d(4279250518L);
            i060 i060Var = j060.a;
            h9n.a(erz.a(2131233729, 0, aVar), "gift", h.f(d35.a(androidx.compose.foundation.a.b(dVarE, jD, i060Var), 1.0f, r58.d(2164260863L), i060Var), 12.0f), null, null, 0.0f, null, aVar, 48, 120);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
