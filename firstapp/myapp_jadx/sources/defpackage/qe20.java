package defpackage;

import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.prematch.data.PreMatchEventData;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes7.dex */
public final class qe20 implements u8z.a {
    public final /* synthetic */ PreMatchEventData a;
    public final /* synthetic */ ue20 b;

    public qe20(ue20 ue20Var, PreMatchEventData preMatchEventData) {
        this.a = preMatchEventData;
        this.b = ue20Var;
    }

    @Override // u8z.a
    public final boolean a(Outcome outcome) {
        PreMatchEventData preMatchEventData = this.a;
        BigDecimal oddsMin = preMatchEventData.getOddsMin();
        BigDecimal oddsMax = preMatchEventData.getOddsMax();
        String str = outcome.odds;
        str.getClass();
        return zog.i(str, oddsMin, oddsMax);
    }

    @Override // u8z.a
    public final void b(OutcomeButton outcomeButton) {
        this.b.d(outcomeButton);
    }
}
