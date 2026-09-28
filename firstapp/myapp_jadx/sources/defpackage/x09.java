package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x09 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            ihe0.a(h.h(d.a.b, 0.0f, 10.0f, 1), j060.c(4.0f), c68.a(R.color.line_type1_primary, aVar), 0L, 0.0f, 0.0f, null, a19.a, aVar, 12582918, 120);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
