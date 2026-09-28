package defpackage;

import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class wl20 extends OneUpTwoUpSwitch.d {
    public final /* synthetic */ PreMatchSportActivity a;
    public final /* synthetic */ hjd0 b;

    public wl20(hjd0 hjd0Var, PreMatchSportActivity preMatchSportActivity) {
        this.a = preMatchSportActivity;
        this.b = hjd0Var;
    }

    @Override // com.sportybet.android.widget.OneUpTwoUpSwitch.d
    public final void d(OneUpTwoUpSwitch.f fVar) {
        RegularMarketRule regularMarketRule;
        RegularMarketRule regularMarketRuleB;
        LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
        PreMatchSportActivity preMatchSportActivity = this.a;
        its itsVarD1 = preMatchSportActivity.D1();
        avy avyVarG = hih0.g(fVar);
        itsVarD1.getClass();
        String str = itsVarD1.t;
        if (str != null && (regularMarketRule = itsVarD1.u) != null && (regularMarketRuleB = itsVarD1.m.b(avyVarG, regularMarketRule, str, true)) != null) {
            itsVarD1.d(regularMarketRule, regularMarketRuleB);
        }
        OneUpTwoUpSwitch.setState$default(this.b.G, fVar, false, false, 4, null);
        hjd0 hjd0Var = preMatchSportActivity.b;
        if (hjd0Var != null) {
            preMatchSportActivity.N1(hjd0Var.v.getSelectedMarket(), true, hih0.g(fVar));
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }
}
