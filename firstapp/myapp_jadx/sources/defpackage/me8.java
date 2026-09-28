package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.sporty.android.core.model.remixbet.RemixBetRequest;
import com.sportybet.android.bethistory.presentation.activity.RSportsBetTicketDetailsActivity;
import com.sportybet.feature.remixbet.presentation.RemixBetActivity;
import com.sportybet.ntespm.socket.protobuf.NP.tYcQsJyaojE;
import com.sportybet.plugin.realsports.data.RTicket;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class me8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ me8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [dt30] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                re8.a aVar = re8.P;
                Bundle arguments = ((re8) obj).getArguments();
                return Long.valueOf(arguments != null ? arguments.getLong("maxDepositAmount") : 0L);
            default:
                final RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = (RSportsBetTicketDetailsActivity) obj;
                int i2 = RSportsBetTicketDetailsActivity.s0;
                if (!rSportsBetTicketDetailsActivity.isFinishing() && !rSportsBetTicketDetailsActivity.isDestroyed()) {
                    RTicket rTicket = rSportsBetTicketDetailsActivity.q0.D;
                    final RemixBetRequest remixBetRequestA = rTicket != null ? egi.a(rTicket.shareCode, rTicket.orderId, rTicket.currency, Integer.valueOf(rTicket.orderType), rTicket.totalStake, rTicket.selections) : null;
                    if (remixBetRequestA != null) {
                        final boolean z = !rSportsBetTicketDetailsActivity.e.U().isEmpty();
                        hc40 hc40Var = rSportsBetTicketDetailsActivity.f;
                        nas nasVarA = ebs.a(rSportsBetTicketDetailsActivity.getLifecycle());
                        String userId = TextUtils.isEmpty(rSportsBetTicketDetailsActivity.getAccountHelper().getUserId()) ? "" : rSportsBetTicketDetailsActivity.getAccountHelper().getUserId();
                        ?? r6 = new Consumer() { // from class: dt30
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj2) {
                                Boolean bool = (Boolean) obj2;
                                int i3 = RSportsBetTicketDetailsActivity.s0;
                                RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity2 = rSportsBetTicketDetailsActivity;
                                ee<Intent> eeVar = rSportsBetTicketDetailsActivity2.r0;
                                boolean z2 = z && !bool.booleanValue();
                                Intent intent = new Intent(rSportsBetTicketDetailsActivity2, (Class<?>) RemixBetActivity.class);
                                intent.putExtra(tYcQsJyaojE.dFlDQYACp, new eal().j(remixBetRequestA));
                                intent.putExtra("extra_selections_exist", z2);
                                eeVar.b(intent);
                            }
                        };
                        hc40Var.getClass();
                        userId.getClass();
                        ej5.c(nasVarA, null, null, new wb40(r6, hc40Var, userId, null), 3);
                    }
                }
                return Unit.a;
        }
    }
}
