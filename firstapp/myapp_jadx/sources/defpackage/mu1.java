package defpackage;

import com.sportybet.plugin.realsports.type.RegularMarketRule;
import com.sportygames.commons.SportyGamesManager;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class mu1 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ mu1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return a.c(RegularMarketRule.a("186", null));
            case 1:
                SportyGamesManager.getInstance().gotoSportyBet(xae.c, null);
                return Unit.a;
            default:
                return Unit.a;
        }
    }
}
