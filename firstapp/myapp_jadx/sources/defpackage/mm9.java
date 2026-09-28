package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mm9 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            h6n.b(pib0.a(R.drawable.ic__arrow_tail_left, 0, aVar), cb40.a(R.string.common_functions__back, new Object[0], aVar), j.r(d.a.b, 24.0f), ((lib0) aVar.O(oib0.a)).P, aVar, 384, 0);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
