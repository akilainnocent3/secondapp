package defpackage;

import android.text.TextUtils;
import com.sportybet.android.bethistory.presentation.activity.RSportsBetTicketDetailsActivity;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes5.dex */
public final class xt30 implements nr7 {
    public final /* synthetic */ RSportsBetTicketDetailsActivity a;

    public xt30(RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity) {
        this.a = rSportsBetTicketDetailsActivity;
    }

    @Override // defpackage.nr7
    public final void a(final String str) {
        RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = this.a;
        rSportsBetTicketDetailsActivity.v.c();
        rdd0 rdd0Var = rSportsBetTicketDetailsActivity.c0.c;
        nn2 nn2Var = nn2.a;
        k00 k00Var = k00.d;
        rdd0Var.a(nn2Var, k00Var);
        rdd0Var.a(go2.a, k00Var);
        hc40 hc40Var = rSportsBetTicketDetailsActivity.f;
        nas nasVarA = ebs.a(rSportsBetTicketDetailsActivity.getLifecycle());
        String userId = TextUtils.isEmpty(rSportsBetTicketDetailsActivity.getAccountHelper().getUserId()) ? "" : rSportsBetTicketDetailsActivity.getAccountHelper().getUserId();
        boolean z = !rSportsBetTicketDetailsActivity.e.U().isEmpty();
        Consumer consumer = new Consumer() { // from class: wt30
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                lws lwsVar = (lws) obj;
                RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity2 = this.a.a;
                int i = RSportsBetTicketDetailsActivity.s0;
                rSportsBetTicketDetailsActivity2.i0.x1(str, g08.REBET_FROM_HISTORY, true, false, lwsVar);
            }
        };
        hc40Var.getClass();
        userId.getClass();
        ej5.c(nasVarA, null, null, new dc40(consumer, hc40Var, nasVarA, userId, z, null), 3);
    }

    @Override // defpackage.nr7
    public final void b(String str) {
        RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = this.a;
        rSportsBetTicketDetailsActivity.c0.x1(str, rSportsBetTicketDetailsActivity.H);
    }
}
