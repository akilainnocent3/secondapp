package defpackage;

import android.view.View;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.virtual.presentation.activity.MatchEventDetailActivity;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d98 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d98(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                e98 e98Var = (e98) obj;
                z4w z4wVar = e98Var.c;
                if (z4wVar != null) {
                    e98Var.d(z4wVar);
                }
                break;
            default:
                MatchEventDetailActivity matchEventDetailActivity = (MatchEventDetailActivity) obj;
                int i2 = MatchEventDetailActivity.U;
                matchEventDetailActivity.V1(AnalyticsParam.AN_EVENT_PLACE_BET);
                if (!((n4p) matchEventDetailActivity.C1()).s()) {
                    matchEventDetailActivity.B1();
                    i5s.b(matchEventDetailActivity.getAccountHelper(), matchEventDetailActivity, new txb(matchEventDetailActivity));
                } else {
                    matchEventDetailActivity.startActivity(matchEventDetailActivity.A1().i(matchEventDetailActivity, matchEventDetailActivity.H));
                }
                break;
        }
    }
}
