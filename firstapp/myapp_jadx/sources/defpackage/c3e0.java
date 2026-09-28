package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c3e0 extends saj implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        c2e0 c2e0Var = (c2e0) this.receiver;
        Integer numY1 = c2e0Var.y1();
        if ((numY1 != null ? numY1.intValue() : 0) > 0) {
            c2e0Var.C1(AnalyticsParam.STORY_SWIPE_LEFT);
        }
        c2e0Var.D1();
        return Unit.a;
    }
}
