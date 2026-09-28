package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z49 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g75.a(androidx.compose.foundation.a.b(j.t(h.j(d.a.b, 0.0f, 16.0f, 0.0f, 0.0f, 13), 56.0f, 3.0f), c68.a(R.color.text_type1_secondary, aVar), j060.c(100.0f)), aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                fxc fxcVar = (fxc) obj2;
                Long lE = fxcVar.e();
                Long lValueOf = Long.valueOf(fxcVar.a());
                IntRange intRange = fxcVar.a;
                return b.k(lE, lValueOf, Integer.valueOf(intRange.a), Integer.valueOf(intRange.b), Integer.valueOf(fxcVar.d()));
        }
    }
}
