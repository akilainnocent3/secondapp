package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ld9 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            h6n.b(erz.a(R.drawable.circle_close, 0, aVar), AnalyticsParam.STORY_SKIP_REASON_CLOSE, j.r(d.a.b, 48.0f), j58.c(0.4f, r58.d(4288454827L)), aVar, 3504, 0);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
