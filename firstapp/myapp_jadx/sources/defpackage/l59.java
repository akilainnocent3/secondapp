package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l59 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            h9n.a(erz.a(R.drawable.ic_customer_service, 0, aVar), null, g3w.h(j.r(d.a.b, 14.0f), "ib_commentary_icon"), null, null, 0.0f, new gf4(c68.a(R.color.text_primary, aVar), 5), aVar, 432, 56);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
