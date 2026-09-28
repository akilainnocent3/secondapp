package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ta20 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ta20(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                int i = PreMatchEventActivity.a2;
                str.getClass();
                f00 f00Var = vgb0.a;
                vgb0.c(AnalyticsEvent.CREATE_YOUR_OWN_LIST_SCROLL, jpu.b(new Pair(AnalyticsParam.CONTENT_TYPE, str)), false);
                break;
            default:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                mb80.a(pb80Var);
                break;
        }
        return Unit.a;
    }
}
