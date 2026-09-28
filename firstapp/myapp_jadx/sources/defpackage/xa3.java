package defpackage;

import com.sporty.android.common.uievent.a;
import com.sportybet.android.bethistory.presentation.activity.RSportsBetTicketDetailsActivity;
import com.sportybet.plugin.realsports.betsucc.presentation.fragment.BetSuccessfulPageFragment;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xa3 implements lfy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xa3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lfy
    public final void u1(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                BetSuccessfulPageFragment betSuccessfulPageFragment = (BetSuccessfulPageFragment) obj2;
                betSuccessfulPageFragment.z.d((a) obj, betSuccessfulPageFragment, betSuccessfulPageFragment.H.c0, betSuccessfulPageFragment);
                break;
            default:
                RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = (RSportsBetTicketDetailsActivity) obj2;
                jox joxVar = (jox) obj;
                int i2 = RSportsBetTicketDetailsActivity.s0;
                if (joxVar instanceof jox.a) {
                    jox.a aVar = (jox.a) joxVar;
                    eu30 eu30Var = rSportsBetTicketDetailsActivity.E;
                    if (eu30Var != null) {
                        eu30Var.k(false);
                    }
                    rSportsBetTicketDetailsActivity.A1(rSportsBetTicketDetailsActivity.e0, (zha0) aVar.a);
                } else if (joxVar instanceof jox.c) {
                    jox.c cVar = (jox.c) joxVar;
                    eu30 eu30Var2 = rSportsBetTicketDetailsActivity.E;
                    if (eu30Var2 != null) {
                        eu30Var2.k(false);
                    }
                    zyf0.c(1, cVar.a.getMessage());
                }
                break;
        }
    }
}
