package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f39 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            h9n.a(erz.a(R.drawable.ic_back_gray_16dp, 0, aVar), AnalyticsParam.STORY_SKIP_REASON_CLOSE, null, null, null, 0.0f, new gf4(c68.a(R.color.text_type1_secondary, aVar), 5), aVar, 48, 60);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
