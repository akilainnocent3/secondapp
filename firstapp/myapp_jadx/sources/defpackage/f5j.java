package defpackage;

import android.view.View;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.sportysoccer.widget.StakeLayout;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f5j implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f5j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((u6j) obj).getClass();
                SportyGamesManager.getInstance().gotoSportyBet(xae.c, null);
                break;
            case 1:
                ((hy50) obj).dismiss();
                wz.a("popup_action", "Pocket Rockets", "biggest coefficient", AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                break;
            default:
                StakeLayout stakeLayout = (StakeLayout) obj;
                int i2 = StakeLayout.S;
                if (stakeLayout.L.getVisibility() == 0) {
                    stakeLayout.L.setVisibility(8);
                }
                break;
        }
    }
}
