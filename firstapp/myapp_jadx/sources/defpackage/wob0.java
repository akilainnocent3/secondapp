package defpackage;

import android.os.Bundle;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class wob0 implements izm {
    public final b5 a;

    public wob0(b5 b5Var) {
        b5Var.getClass();
        this.a = b5Var;
    }

    @Override // defpackage.izm
    public final void a(String str) {
        Bundle bundleA = mll0.a(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, "piggy-bash");
        b5 b5Var = this.a;
        if (b5Var.getAccessToken() != null) {
            bundleA.putString("user_state", "logged-in");
        } else {
            bundleA.putString("user_state", "non logged-in");
        }
        b5Var.logEvent(str, bundleA);
    }

    @Override // defpackage.izm
    public final void logNonFatalException(Throwable th, Map<String, String> map) {
        th.getClass();
        this.a.logNonFatalException(th, map);
    }
}
