package defpackage;

import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.prematch.data.LiveEventDataInPreMatch;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes7.dex */
public final class ums implements u8z.a {
    public final /* synthetic */ LiveEventDataInPreMatch a;
    public final /* synthetic */ xms b;

    public ums(LiveEventDataInPreMatch liveEventDataInPreMatch, xms xmsVar) {
        this.a = liveEventDataInPreMatch;
        this.b = xmsVar;
    }

    @Override // u8z.a
    public final boolean a(Outcome outcome) {
        LiveEventDataInPreMatch liveEventDataInPreMatch = this.a;
        BigDecimal oddsMin = liveEventDataInPreMatch.getOddsMin();
        BigDecimal oddsMax = liveEventDataInPreMatch.getOddsMax();
        String str = outcome.odds;
        str.getClass();
        return zog.i(str, oddsMin, oddsMax);
    }

    @Override // u8z.a
    public final void b(OutcomeButton outcomeButton) {
        this.b.e(outcomeButton);
    }
}
