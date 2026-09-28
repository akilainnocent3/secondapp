package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportybet.android.bethistory.presentation.activity.RSportsBetTicketDetailsActivity;
import com.sportybet.plugin.realsports.betsucc.presentation.fragment.BetSuccessfulPageFragment;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sa3 implements lfy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sa3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.lfy
    public final void u1(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                BetSuccessfulPageFragment betSuccessfulPageFragment = (BetSuccessfulPageFragment) obj2;
                gy4.a(betSuccessfulPageFragment.H.Y, (gz4) obj, betSuccessfulPageFragment.Y);
                break;
            default:
                RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = (RSportsBetTicketDetailsActivity) obj2;
                r190 r190Var = (r190) obj;
                int i2 = RSportsBetTicketDetailsActivity.s0;
                if (r190Var instanceof r190.c) {
                    rSportsBetTicketDetailsActivity.Z = ((r190.c) r190Var).a;
                } else if (r190Var instanceof r190.a) {
                    itf0.a aVar = itf0.a;
                    aVar.q(MyLog.TAG_SHOW_OFF_PREVIEW);
                    aVar.a("state = loading", new Object[0]);
                }
                break;
        }
    }
}
