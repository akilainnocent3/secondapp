package defpackage;

import com.sportybet.plugin.realsports.type.RegularMarketRule;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k160 implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RegularMarketRule regularMarketRuleA = RegularMarketRule.a("1", "3 Way");
        RegularMarketRule regularMarketRule = null;
        RegularMarketRule regularMarketRuleA2 = RegularMarketRule.a("18", null);
        if (regularMarketRuleA2 != null) {
            regularMarketRuleA2.c = true;
            regularMarketRuleA2.e = "Points";
            regularMarketRule = regularMarketRuleA2;
        }
        return b.k(regularMarketRuleA, regularMarketRule);
    }
}
