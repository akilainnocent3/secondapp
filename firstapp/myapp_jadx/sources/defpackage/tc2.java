package defpackage;

import com.sportybet.plugin.realsports.type.RegularMarketRule;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class tc2 implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RegularMarketRule regularMarketRule = null;
        RegularMarketRule regularMarketRuleA = RegularMarketRule.a("219", null);
        RegularMarketRule regularMarketRuleA2 = RegularMarketRule.a("18", null);
        if (regularMarketRuleA2 != null) {
            regularMarketRuleA2.c = true;
            regularMarketRuleA2.e = "Points";
        } else {
            regularMarketRuleA2 = null;
        }
        RegularMarketRule regularMarketRuleA3 = RegularMarketRule.a("16", null);
        RegularMarketRule regularMarketRuleA4 = RegularMarketRule.a("14", "3 Way Handicap");
        if (regularMarketRuleA4 != null) {
            regularMarketRuleA4.c = true;
            regularMarketRuleA4.e = "Handicap";
            regularMarketRuleA4.g("1 H", "X H", "2 H");
            regularMarketRule = regularMarketRuleA4;
        }
        return b.k(regularMarketRuleA, regularMarketRuleA2, regularMarketRuleA3, regularMarketRule);
    }
}
