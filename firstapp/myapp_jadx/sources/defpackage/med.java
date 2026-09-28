package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Outcome;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes7.dex */
public final class med implements egy {
    public final s1p a;
    public final sfy b;

    public med(s1p s1pVar, sfy sfyVar) {
        sfyVar.getClass();
        this.a = s1pVar;
        this.b = sfyVar;
    }

    @Override // defpackage.egy
    public final BigDecimal a(Selection selection) {
        selection.getClass();
        String eventId = selection.getEventId();
        int i = selection.b.status;
        Outcome outcome = selection.c;
        boolean zA = this.a.a(eventId, i, outcome);
        sfy sfyVar = this.b;
        if (zA) {
            outcome.getClass();
            return sfyVar.a(outcome);
        }
        outcome.getClass();
        return sfyVar.c(outcome);
    }
}
