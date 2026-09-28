package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n69 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h6n.b(erz.a(R.drawable.ic__arrow_chevron_left, 0, aVar), "Left arrow icon", j.r(d.a.b, 12.0f), c68.a(R.color.icon_inverse_primary, aVar), aVar, 432, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                oyc oycVar = (oyc) obj2;
                Long lF = oycVar.f();
                Long lE = oycVar.e();
                Long lValueOf = Long.valueOf(oycVar.a());
                IntRange intRange = oycVar.a;
                return b.k(lF, lE, lValueOf, Integer.valueOf(intRange.a), Integer.valueOf(intRange.b), Integer.valueOf(oycVar.d()));
        }
    }
}
