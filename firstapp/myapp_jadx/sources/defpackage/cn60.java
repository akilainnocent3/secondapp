package defpackage;

import android.os.Bundle;
import android.view.View;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.sportyherov2.components.SHKeypadContainer;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cn60 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ haj b;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zj60 bridge;
        int i = this.a;
        haj hajVar = this.b;
        switch (i) {
            case 0:
                int i2 = SHKeypadContainer.F;
                ((Function1) hajVar).invoke(0);
                break;
            default:
                qst qstVar = (qst) hajVar;
                String str = SportyGamesManager.getInstance().getUser() != null ? "logged-in" : "non logged-in";
                Bundle bundleA = whs.a("popup_name", "how to play", "button_name", AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                bundleA.putString(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, "Spin2Win");
                bundleA.putString("user_state", str);
                SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
                if (sportyGamesManager != null && (bridge = sportyGamesManager.getBridge()) != null) {
                    ((bk60) bridge).a("popup_action", bundleA);
                }
                qstVar.invoke();
                break;
        }
    }

    public /* synthetic */ cn60(Function1 function1) {
        this.b = function1;
    }
}
