package defpackage;

import android.content.SharedPreferences;
import androidx.fragment.app.Fragment;
import com.sporty.android.book.data.entity.BetBuilderError;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.pingpong.components.SHBetToggle;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class sb20 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sb20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String cMSString;
        String message;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj2;
                Throwable th = (Throwable) obj;
                int i2 = PreMatchEventActivity.a2;
                if (th == null) {
                    return Unit.a;
                }
                if (th instanceof BetBuilderError) {
                    BetBuilderError betBuilderError = (BetBuilderError) th;
                    int code = betBuilderError.getCode();
                    if (code == 4710) {
                        cMSString = preMatchEventActivity.getCMSString(R.string.bet_builder__selections_limit_exceeded_error, betBuilderError.getMessage());
                        message = AnalyticsParam.BB_ERROR_SNACKBAR_MAX_AMOUNT;
                    } else if (code != 4720) {
                        cMSString = betBuilderError.getMessage();
                        message = betBuilderError.getMessage();
                    } else {
                        cMSString = preMatchEventActivity.getCMSString(R.string.bet_builder__odds_limit_exceeded_error, betBuilderError.getMessage());
                        message = AnalyticsParam.BB_ERROR_SNACKBAR_MAX_ODDS;
                    }
                    String str = cMSString;
                    f00 f00Var = vgb0.a;
                    vgb0.c(AnalyticsEvent.BB_ERROR_SNACKBAR_VIEW, jpu.b(new Pair(AnalyticsParam.CONTENT_TYPE, message)), false);
                    js.d(preMatchEventActivity, R.string.page_instant_virtual__warning, str, null, null, 48);
                } else {
                    zyf0.d(th.getMessage());
                }
                return Unit.a;
            case 1:
                SHBetToggle sHBetToggle = (SHBetToggle) obj2;
                if (((Boolean) obj).booleanValue()) {
                    sHBetToggle.setStatus(!sHBetToggle.I);
                    sHBetToggle.getStatusListener().invoke(Boolean.valueOf(sHBetToggle.I));
                    SharedPreferences.Editor editor = sHBetToggle.Q;
                    if (editor != null) {
                        editor.putBoolean("PING_PONG_ONE_TAP", true);
                    }
                    SharedPreferences.Editor editor2 = sHBetToggle.Q;
                    if (editor2 != null) {
                        editor2.apply();
                    }
                    GameMainActivity gameMainActivity = sHBetToggle.J;
                    if (gameMainActivity == null) {
                        Intrinsics.n("gameMainActivity");
                        throw null;
                    }
                    Fragment fragmentG = gameMainActivity.getSupportFragmentManager().G(R.id.main_game_container);
                    fragmentG.getClass();
                    ((m410) fragmentG).V0();
                    sHBetToggle.K = null;
                    GameMainActivity gameMainActivity2 = sHBetToggle.J;
                    if (gameMainActivity2 == null) {
                        Intrinsics.n("gameMainActivity");
                        throw null;
                    }
                    gameMainActivity2.getSupportFragmentManager().a0();
                } else {
                    sHBetToggle.K = null;
                    GameMainActivity gameMainActivity3 = sHBetToggle.J;
                    if (gameMainActivity3 == null) {
                        Intrinsics.n("gameMainActivity");
                        throw null;
                    }
                    gameMainActivity3.getSupportFragmentManager().a0();
                }
                return Unit.a;
            default:
                n27 n27Var = (n27) obj2;
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                wd0<Float, ij0> wd0Var = n27Var.l;
                a7lVar.b(1.0f - wd0Var.d().floatValue());
                a7lVar.f(wd0Var.d().floatValue() * (-((u5a0) n27Var.j).D()) * 0.35f);
                return Unit.a;
        }
    }
}
