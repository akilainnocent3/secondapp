package defpackage;

import com.sporty.android.common.uievent.a;
import com.sportybet.android.bethistory.presentation.activity.RSportsBetTicketDetailsActivity;
import com.sportybet.plugin.realsports.betsucc.presentation.fragment.BetSuccessfulPageFragment;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ua3 implements lfy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ua3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.lfy
    public final void u1(Object obj) {
        h550 h550Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                BetSuccessfulPageFragment betSuccessfulPageFragment = (BetSuccessfulPageFragment) obj2;
                betSuccessfulPageFragment.z.c((a) obj, betSuccessfulPageFragment.requireActivity(), betSuccessfulPageFragment.H.c0, null);
                break;
            default:
                Boolean bool = (Boolean) obj;
                int i2 = RSportsBetTicketDetailsActivity.s0;
                eu30 eu30Var = ((RSportsBetTicketDetailsActivity) obj2).E;
                if (eu30Var != null) {
                    bool.getClass();
                    eu30.f fVar = eu30Var.z;
                    if (fVar != null && (h550Var = fVar.b) != null) {
                        ((x5a0) h550Var.b).setValue(bool);
                        break;
                    }
                }
                break;
        }
    }
}
