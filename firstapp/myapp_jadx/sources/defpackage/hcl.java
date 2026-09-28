package defpackage;

import com.sportybet.plugin.realsports.type.RegularMarketRule;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class hcl implements Function0 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RegularMarketRule regularMarketRule;
        switch (this.a) {
            case 0:
                RegularMarketRule regularMarketRuleA = RegularMarketRule.a("1", "3 Way");
                RegularMarketRule regularMarketRuleA2 = RegularMarketRule.a("18", null);
                RegularMarketRule regularMarketRuleA3 = RegularMarketRule.a("10", null);
                RegularMarketRule regularMarketRuleA4 = RegularMarketRule.a("11", "Draw No Bet");
                if (regularMarketRuleA4 != null) {
                    regularMarketRuleA4.g("1", "2");
                } else {
                    regularMarketRuleA4 = null;
                }
                RegularMarketRule regularMarketRuleA5 = RegularMarketRule.a("26", null);
                RegularMarketRule regularMarketRuleA6 = RegularMarketRule.a("16", "Handicap");
                if (regularMarketRuleA6 != null) {
                    regularMarketRuleA6.g("1", "2");
                    regularMarketRule = regularMarketRuleA6;
                } else {
                    regularMarketRule = null;
                }
                return b.k(regularMarketRuleA, regularMarketRuleA2, regularMarketRuleA3, regularMarketRuleA4, regularMarketRuleA5, regularMarketRule);
            default:
                return Unit.a;
        }
    }
}
