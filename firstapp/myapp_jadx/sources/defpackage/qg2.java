package defpackage;

import android.content.Context;
import com.sporty.android.book.domain.entity.BetBuilderData;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;

/* JADX INFO: loaded from: classes4.dex */
public final class qg2 {
    public static final /* synthetic */ int a = 0;

    public static final Market a(BetBuilderData betBuilderData, Context context, int i) {
        betBuilderData.getClass();
        Market market = new Market();
        market.id = betBuilderData.getMarketId();
        market.product = i;
        market.status = !betBuilderData.getValid() ? 1 : 0;
        market.desc = sn5.b(context, R.string.bet_builder__bet_builder, new Object[0]);
        return market;
    }

    public static final Outcome b(BetBuilderData betBuilderData, Context context) {
        Outcome outcome = new Outcome();
        outcome.id = betBuilderData.getOutcomeId();
        outcome.odds = betBuilderData.getOdds();
        outcome.probability = betBuilderData.getProbabilityDouble();
        outcome.isActive = (!betBuilderData.getValid() || betBuilderData.getOddsDouble() <= 0.0d) ? 0 : 1;
        outcome.desc = sn5.b(context, R.string.bet_builder__bet_builder, new Object[0]);
        return outcome;
    }
}
