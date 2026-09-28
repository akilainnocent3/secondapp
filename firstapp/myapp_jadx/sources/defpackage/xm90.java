package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class xm90 {
    public final igo a;
    public final rdd0 b;
    public final y8j c;

    public xm90(igo igoVar, rdd0 rdd0Var, y8j y8jVar) {
        this.a = igoVar;
        this.b = rdd0Var;
        this.c = y8jVar;
    }

    public final void a(boolean z, boolean z2) {
        this.b.a(new gi90(z, z2), k00.d);
        y8j.a(this.c, AnalyticsEvent.SIM_BETSLIP_CONFIRM_TO_PAY_BTN);
    }

    public final void b(boolean z) {
        if (z) {
            this.b.a(new ji90(0), k00.d);
            y8j.a(this.c, AnalyticsEvent.SIM_BETSLIP_PAGE);
        }
    }

    public final void c() {
        this.b.a(new hi90(), k00.d);
        y8j.a(this.c, AnalyticsEvent.SIM_BETSLIP_PLACEBET_BTN);
    }
}
