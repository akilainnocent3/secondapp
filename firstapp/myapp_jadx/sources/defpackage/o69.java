package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o69 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            h6n.b(erz.a(R.drawable.ic__arrow_chevron_right, 0, aVar), "Right arrow icon", j.r(d.a.b, 12.0f), c68.a(R.color.icon_inverse_primary, aVar), aVar, 432, 0);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
