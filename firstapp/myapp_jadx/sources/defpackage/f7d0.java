package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f7d0 extends pf implements iaj<Event, Market, Outcome, Boolean, Unit> {
    @Override // defpackage.iaj
    public final Unit d(Event event, Market market, Outcome outcome, Boolean bool) {
        Event event2 = event;
        Market market2 = market;
        Outcome outcome2 = outcome;
        boolean zBooleanValue = bool.booleanValue();
        event2.getClass();
        market2.getClass();
        outcome2.getClass();
        c8d0 c8d0Var = (c8d0) this.a;
        c8d0Var.getClass();
        boolean zN0 = c8d0Var.e.N0(event2, market2, outcome2, zBooleanValue, (14336 & 16) != 0 ? false : false, (14336 & 32) != 0 ? null : null, (14336 & 64) != 0 ? k980.DEFAULT : null, (14336 & 128) != 0 ? false : false, (14336 & 256) != 0 ? false : false, (14336 & 512) != 0 ? false : false, (14336 & 1024) != 0 ? null : null, (14336 & 2048) != 0 ? false : false, (14336 & 4096) != 0 ? false : false, false);
        if (zN0 && zBooleanValue) {
            rdd0 rdd0Var = c8d0Var.d;
            String strC = apg.c(event2);
            String str = market2.id;
            if (str == null) {
                str = "";
            }
            rdd0Var.a(new s7d0(strC, str), k00.d);
        }
        if (!zN0 && c8d0Var.e.R()) {
            c8d0Var.y.a(v7d0.d.a);
        }
        return Unit.a;
    }
}
