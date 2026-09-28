package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bu implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj).intValue();
                ahh ahhVar = (ahh) obj2;
                ahhVar.getClass();
                return ahhVar.a;
            default:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h6n.b(erz.a(R.drawable.spr_ic_close_black_24dp, 0, aVar), AnalyticsParam.STORY_SKIP_REASON_CLOSE, null, c68.a(R.color.brand_tertiary, aVar), aVar, 48, 4);
                } else {
                    aVar.G();
                }
                return Unit.a;
        }
    }
}
