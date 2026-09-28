package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f0k0 extends saj implements gaj<Event, Market, Outcome, f8z> {
    @Override // defpackage.gaj
    public final f8z invoke(Event event, Market market, Outcome outcome) {
        Event event2 = event;
        Market market2 = market;
        Outcome outcome2 = outcome;
        event2.getClass();
        market2.getClass();
        outcome2.getClass();
        t0k0 t0k0Var = (t0k0) this.receiver;
        t0k0Var.getClass();
        z7z z7zVarA = t0k0Var.w.a(event2, market2, outcome2);
        boolean z = z7zVarA instanceof z7z.b;
        if (z) {
            t0k0Var.y.a(apg.b(event2, market2), t0k0Var.F.a);
        }
        boolean zW0 = t0k0Var.v.w0(event2, market2, outcome2);
        z7z.b bVar = z ? (z7z.b) z7zVarA : null;
        return new f8z(zW0, bVar != null ? bVar.a : null);
    }
}
