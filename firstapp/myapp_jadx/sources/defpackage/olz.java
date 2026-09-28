package defpackage;

import android.content.SharedPreferences;
import androidx.fragment.app.Fragment;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.pocketrocket.component.PRBetToggle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class olz implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ olz(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ssw<Boolean> sswVar;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                PRBetToggle pRBetToggle = (PRBetToggle) obj2;
                if (((Boolean) obj).booleanValue()) {
                    pRBetToggle.setStatus(!pRBetToggle.I);
                    pRBetToggle.getStatusListener().invoke(Boolean.valueOf(pRBetToggle.I));
                    SharedPreferences.Editor editor = pRBetToggle.Q;
                    if (editor != null) {
                        editor.putBoolean("ROCKET_ONE_TAP", true);
                    }
                    SharedPreferences.Editor editor2 = pRBetToggle.Q;
                    if (editor2 != null) {
                        editor2.apply();
                    }
                    GameMainActivity gameMainActivity = pRBetToggle.J;
                    if (gameMainActivity == null) {
                        Intrinsics.n("gameMainActivity");
                        throw null;
                    }
                    Fragment fragmentG = gameMainActivity.getSupportFragmentManager().G(R.id.main_game_container);
                    fragmentG.getClass();
                    ((zy10) fragmentG).g1();
                    pRBetToggle.K = null;
                    GameMainActivity gameMainActivity2 = pRBetToggle.J;
                    if (gameMainActivity2 == null) {
                        Intrinsics.n("gameMainActivity");
                        throw null;
                    }
                    gameMainActivity2.getSupportFragmentManager().a0();
                } else {
                    pRBetToggle.K = null;
                    GameMainActivity gameMainActivity3 = pRBetToggle.J;
                    if (gameMainActivity3 == null) {
                        Intrinsics.n("gameMainActivity");
                        throw null;
                    }
                    gameMainActivity3.getSupportFragmentManager().a0();
                }
                return Unit.a;
            default:
                q1c0 q1c0Var = (q1c0) obj2;
                if (Intrinsics.g((Boolean) obj, Boolean.TRUE)) {
                    q1c0Var.V2("OVER_UNDER");
                    ql60 ql60Var = q1c0Var.p0;
                    if (ql60Var != null && (sswVar = ql60Var.M) != null) {
                        sswVar.m(Boolean.FALSE);
                    }
                }
                return Unit.a;
        }
    }
}
