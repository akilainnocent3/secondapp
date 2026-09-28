package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.widget.OutcomeButton;

/* JADX INFO: loaded from: classes7.dex */
public final class iq10 implements u8z.a {
    public final /* synthetic */ gaj<Event, Market, Outcome, f8z> a;
    public final /* synthetic */ jaj<Event, Market, Outcome, Boolean, Boolean, Boolean> b;

    /* JADX WARN: Multi-variable type inference failed */
    public iq10(gaj<? super Event, ? super Market, ? super Outcome, f8z> gajVar, jaj<? super Event, ? super Market, ? super Outcome, ? super Boolean, ? super Boolean, Boolean> jajVar) {
        this.a = gajVar;
        this.b = jajVar;
    }

    @Override // u8z.a
    public final void b(OutcomeButton outcomeButton) {
        Object tag = outcomeButton.getTag();
        Selection selection = tag instanceof Selection ? (Selection) tag : null;
        if (selection == null) {
            return;
        }
        Outcome outcome = selection.c;
        Market market = selection.b;
        Event event = selection.a;
        event.getClass();
        market.getClass();
        outcome.getClass();
        f8z f8zVarInvoke = this.a.invoke(event, market, outcome);
        event.getClass();
        market.getClass();
        outcome.getClass();
        if (this.b.l(event, market, outcome, Boolean.valueOf(outcomeButton.isChecked()), Boolean.valueOf(f8zVarInvoke.b != null)).booleanValue()) {
            return;
        }
        outcomeButton.setChecked(!outcomeButton.isChecked());
    }
}
