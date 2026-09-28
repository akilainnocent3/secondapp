package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.TicketResult;
import com.sportybet.plugin.realsports.data.BetSelection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class li6 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ li6(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                BetSelection betSelection = (BetSelection) obj;
                betSelection.getClass();
                return Long.valueOf(betSelection.startTime);
            case 1:
                return Unit.a;
            default:
                TicketResult ticketResult = (TicketResult) obj;
                boolean z = false;
                if (ticketResult != null && ticketResult.bizCode == 80001) {
                    z = true;
                }
                return new xho(z, ticketResult);
        }
    }
}
