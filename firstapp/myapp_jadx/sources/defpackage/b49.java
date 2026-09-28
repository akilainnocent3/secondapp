package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b49 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            h6n.b(erz.a(R.drawable.ic_round_cancel, 0, aVar), AnalyticsParam.STORY_SKIP_REASON_CLOSE, null, j58.c(0.35f, c68.a(R.color.brand_tertiary, aVar)), aVar, 48, 4);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
