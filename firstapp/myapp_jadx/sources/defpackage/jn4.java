package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class jn4 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((qn70) obj).getClass();
                ((wrz) obj2).getClass();
                return w5b.a(CoroutineContext.Element.a.d(lfe0.a(), fse.a));
            default:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h6n.b(erz.a(R.drawable.ic_odds_filter_close, 0, aVar), AnalyticsParam.STORY_SKIP_REASON_CLOSE, null, c68.a(R.color.text_type1_primary, aVar), aVar, 48, 4);
                } else {
                    aVar.G();
                }
                return Unit.a;
        }
    }
}
