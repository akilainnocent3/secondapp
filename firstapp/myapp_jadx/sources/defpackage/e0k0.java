package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e0k0 extends saj implements jaj<Event, Market, Outcome, Boolean, Boolean, Boolean> {
    @Override // defpackage.jaj
    public final Boolean l(Event event, Market market, Outcome outcome, Boolean bool, Boolean bool2) {
        Event event2 = event;
        Market market2 = market;
        Outcome outcome2 = outcome;
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        event2.getClass();
        market2.getClass();
        outcome2.getClass();
        t0k0 t0k0Var = (t0k0) this.receiver;
        t0k0Var.getClass();
        boolean zN0 = t0k0Var.v.N0(event2, market2, outcome2, zBooleanValue, (14336 & 16) != 0 ? false : false, (14336 & 32) != 0 ? null : null, (14336 & 64) != 0 ? k980.DEFAULT : null, (14336 & 128) != 0 ? false : false, (14336 & 256) != 0 ? false : false, (14336 & 512) != 0 ? false : false, (14336 & 1024) != 0 ? null : null, (14336 & 2048) != 0 ? false : false, (14336 & 4096) != 0 ? false : false, false);
        if (!zN0) {
            v6k0 v6k0Var = t0k0Var.z;
            String strB = apg.b(event2, market2);
            brg brgVar = t0k0Var.F.a;
            v6k0Var.getClass();
            v6k0Var.a.a(new y7z(brgVar, strB, zBooleanValue2), k00.d);
            ej5.c(o8i0.d(t0k0Var), null, null, new c1k0(event2, market2, outcome2, t0k0Var, null), 3);
        }
        return Boolean.valueOf(zN0);
    }
}
