package defpackage;

import com.sportybet.android.bethistory.presentation.activity.RSportsBetTicketDetailsActivity;
import com.sportybet.plugin.realsports.data.RTicket;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lu30 implements Function1 {
    public final /* synthetic */ eu30.f a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity;
        ds30 ds30Var;
        x350 x350Var = (x350) obj;
        eu30.f fVar = this.a;
        eu30 eu30Var = fVar.c;
        if (x350Var == x350.b.a) {
            h550 h550Var = fVar.b;
            if (h550Var != null) {
                ((x5a0) h550Var.a).setValue(Boolean.TRUE);
            }
            ((RSportsBetTicketDetailsActivity) eu30Var.w).C1(eu30Var.e, eu30Var.f);
        } else if (x350Var == x350.a.a && (ds30Var = (rSportsBetTicketDetailsActivity = eu30Var.G).q0) != null) {
            ej5.c(o8i0.d(ds30Var), null, null, new bs30(ds30Var, null), 3);
            ds30 ds30Var2 = rSportsBetTicketDetailsActivity.q0;
            me8 me8Var = new me8(rSportsBetTicketDetailsActivity, 1);
            ds30Var2.getClass();
            RTicket rTicket = ds30Var2.D;
            if (rTicket != null) {
                ds30Var2.i.b(rTicket.winningStatus);
            }
            me8Var.invoke();
        }
        return Unit.a;
    }
}
