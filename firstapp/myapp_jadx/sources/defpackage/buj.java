package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class buj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8i0 b;

    public /* synthetic */ buj(j8i0 j8i0Var, int i) {
        this.a = i;
        this.b = j8i0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        j8i0 j8i0Var = this.b;
        switch (i) {
            case 0:
                ((fuj) j8i0Var).c.j(AnalyticsEvent.BI_TRACKING_KIND_ERROR);
                break;
            default:
                Integer num = (Integer) obj;
                num.getClass();
                h2j0.x1((h2j0) j8i0Var, null, null, num, 3);
                break;
        }
        return Unit.a;
    }
}
