package defpackage;

import android.os.Bundle;
import android.view.View;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.jackpot.activities.JackpotSuccessfulPageActivity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m7p implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m7p(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                JackpotSuccessfulPageActivity jackpotSuccessfulPageActivity = (JackpotSuccessfulPageActivity) obj;
                int i2 = JackpotSuccessfulPageActivity.c;
                jackpotSuccessfulPageActivity.finish();
                Bundle bundle = new Bundle();
                bundle.putInt("tab_index", 0);
                jackpotSuccessfulPageActivity.b.e(wae.ME_JACKPOT_BET_HISTORY, bundle);
                break;
            default:
                tj60 tj60Var = (tj60) obj;
                tj60Var.c.invoke();
                tj60Var.dismiss();
                wz.a("popup_action", "Ping Pong", "how to play", AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                break;
        }
    }
}
