package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportygames.newcms.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class tv8 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            d dVarE = j.e(d.a.b, 1.0f);
            long jD = r58.d(4280958075L);
            i060 i060Var = j060.a;
            mw90.a(c.c(shj.v0.J, new String[0], aVar), "gift", h.f(d35.a(androidx.compose.foundation.a.b(dVarE, jD, i060Var), 1.0f, r58.b(872415231), i060Var), 12.0f), null, null, null, null, aVar, 48, 2040);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
