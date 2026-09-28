package defpackage;

import androidx.transition.nfj.CaBJCMnsV;
import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class xl20 extends OneUpTwoUpSwitch.d {
    public final /* synthetic */ PreMatchSportActivity a;
    public final /* synthetic */ hjd0 b;

    public xl20(hjd0 hjd0Var, PreMatchSportActivity preMatchSportActivity) {
        this.a = preMatchSportActivity;
        this.b = hjd0Var;
    }

    @Override // com.sportybet.android.widget.OneUpTwoUpSwitch.d
    public final void d(OneUpTwoUpSwitch.f fVar) {
        RegularMarketRule regularMarketRule;
        RegularMarketRule regularMarketRuleB;
        LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
        PreMatchSportActivity preMatchSportActivity = this.a;
        ej20 ej20VarH1 = preMatchSportActivity.H1();
        avy avyVarG = hih0.g(fVar);
        String str = ej20VarH1.t;
        if (str != null && (regularMarketRule = ej20VarH1.u) != null && (regularMarketRuleB = ej20VarH1.i.b(avyVarG, regularMarketRule, str, false)) != null) {
            ej20VarH1.f(regularMarketRule, regularMarketRuleB);
        }
        OneUpTwoUpSwitch.setState$default(this.b.y, fVar, false, false, 4, null);
        hjd0 hjd0Var = preMatchSportActivity.b;
        if (hjd0Var != null) {
            preMatchSportActivity.N1(hjd0Var.F.getSelectedMarket(), false, hih0.g(fVar));
        } else {
            Intrinsics.n(CaBJCMnsV.harjVXDmexzad);
            throw null;
        }
    }
}
