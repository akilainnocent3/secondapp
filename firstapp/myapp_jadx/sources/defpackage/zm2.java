package defpackage;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.sportyherov2.components.OverUnderComponent;
import com.sportygames.sportyherov2.remote.models.SideBetConfigsList;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zm2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ zm2(KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zj60 bridge;
        int i = this.a;
        KeyEvent.Callback callback = this.b;
        switch (i) {
            case 0:
                fo2 fo2Var = (fo2) callback;
                String str = fo2Var.A;
                String str2 = SportyGamesManager.getInstance().getUser() != null ? "logged-in" : "non logged-in";
                Bundle bundleA = whs.a("popup_name", "show bet history", "button_name", AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                bundleA.putString(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, str);
                bundleA.putString("user_state", str2);
                SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
                if (sportyGamesManager != null && (bridge = sportyGamesManager.getBridge()) != null) {
                    ((bk60) bridge).a("popup_action", bundleA);
                }
                fo2Var.dismiss();
                return;
            default:
                OverUnderComponent overUnderComponent = (OverUnderComponent) callback;
                double dA = hez.a(overUnderComponent.binding.T0, 1, overUnderComponent.binding.T0.getText().toString(), 0);
                SideBetConfigsList sideBetConfigsList = overUnderComponent.c;
                if (sideBetConfigsList == null) {
                    Intrinsics.n("sideBetConfigsList");
                    throw null;
                }
                if (dA <= sideBetConfigsList.getMinCoefficient()) {
                    return;
                }
                if (overUnderComponent.giftItem != null) {
                    if (hez.a(overUnderComponent.binding.T0, 1, overUnderComponent.binding.T0.getText().toString(), 0) <= overUnderComponent.Q) {
                        return;
                    }
                }
                wz.a("CoefficientMinClick", "Sporty Hero", "OVER_UNDER");
                GiftItem giftItem = overUnderComponent.giftItem;
                ru80 ru80Var = overUnderComponent.binding;
                if (giftItem != null) {
                    TextView textView = ru80Var.T0;
                    TreeMap treeMap = pw.a;
                    pr7.b(overUnderComponent.Q, "x", textView);
                } else {
                    TextView textView2 = ru80Var.T0;
                    TreeMap treeMap2 = pw.a;
                    SideBetConfigsList sideBetConfigsList2 = overUnderComponent.c;
                    if (sideBetConfigsList2 == null) {
                        Intrinsics.n("sideBetConfigsList");
                        throw null;
                    }
                    textView2.setText(pw.q(sideBetConfigsList2.getMinCoefficient()).concat("x"));
                }
                overUnderComponent.d(0.4f, false);
                overUnderComponent.e(1.0f, true);
                return;
        }
    }
}
