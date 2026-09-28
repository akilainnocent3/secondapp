package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i19 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            h6n.b(erz.a(R.drawable.ic_clear_market_search, 0, aVar), pwo.e(R.string.common_functions__clear, aVar), null, j58.m, aVar, 3072, 4);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
