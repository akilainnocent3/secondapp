package defpackage;

import android.os.Bundle;
import android.view.View;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.data.HomeNotification;
import com.sportygames.commons.SportyGamesManager;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pem implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ pem(fq80 fq80Var, eq80 eq80Var) {
        this.b = eq80Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zj60 bridge;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                List<String> list = dfm.v2;
                ((HomeNotification.Show) obj).getDismissCallback().invoke();
                break;
            default:
                eq80 eq80Var = (eq80) obj;
                String str = SportyGamesManager.getInstance().getUser() != null ? "logged-in" : "non logged-in";
                Bundle bundleA = whs.a("popup_name", "how to play", "button_name", AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                bundleA.putString(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, "Spin2Win");
                bundleA.putString("user_state", str);
                SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
                if (sportyGamesManager != null && (bridge = sportyGamesManager.getBridge()) != null) {
                    ((bk60) bridge).a("popup_action", bundleA);
                }
                eq80Var.invoke();
                break;
        }
    }

    public /* synthetic */ pem(HomeNotification.Show show) {
        this.b = show;
    }
}
