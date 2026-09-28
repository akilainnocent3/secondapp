package defpackage;

import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cl20 implements Function0 {
    public final /* synthetic */ PreMatchSportActivity a;

    public /* synthetic */ cl20(PreMatchSportActivity preMatchSportActivity) {
        this.a = preMatchSportActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        PreMatchSportActivity preMatchSportActivity = this.a;
        hjd0 hjd0Var = preMatchSportActivity.b;
        if (hjd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        boolean z = false;
        boolean z2 = hjd0Var.i.getVisibility() == 0;
        boolean zA = ((sn20) preMatchSportActivity.y.getValue()).a.a("market_early_goals_switch_hint_displayed");
        if (!z2 && !zA) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
