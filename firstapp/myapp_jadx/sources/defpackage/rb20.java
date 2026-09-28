package defpackage;

import android.content.SharedPreferences;
import androidx.fragment.app.Fragment;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.event.PreMatchEventAdapter;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.sportyherov2.components.SHBetToggle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rb20 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rb20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                PreMatchEventAdapter preMatchEventAdapter = ((PreMatchEventActivity) obj2).A0;
                if (preMatchEventAdapter != null) {
                    preMatchEventAdapter.notifyDataSetChanged();
                }
                return Unit.a;
            case 1:
                SHBetToggle sHBetToggle = (SHBetToggle) obj2;
                if (((Boolean) obj).booleanValue()) {
                    sHBetToggle.setStatus(!sHBetToggle.I);
                    sHBetToggle.getStatusListener().invoke(Boolean.valueOf(sHBetToggle.I));
                    SharedPreferences.Editor editor = sHBetToggle.Q;
                    if (editor != null) {
                        editor.putBoolean("SPORTY_HERO_ONE_TAP", true);
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
                    ((q1c0) fragmentG).F1();
                    sHBetToggle.K = null;
                    GameMainActivity gameMainActivity2 = sHBetToggle.J;
                    if (gameMainActivity2 == null) {
                        Intrinsics.n("gameMainActivity");
                        throw null;
                    }
                    gameMainActivity2.getOnBackPressedDispatcher().d();
                } else {
                    sHBetToggle.K = null;
                    GameMainActivity gameMainActivity3 = sHBetToggle.J;
                    if (gameMainActivity3 == null) {
                        Intrinsics.n("gameMainActivity");
                        throw null;
                    }
                    gameMainActivity3.getOnBackPressedDispatcher().d();
                }
                return Unit.a;
            default:
                q8i0 q8i0Var = ((sne0) obj2).w;
                une0 une0Var = (une0) obj;
                une0Var.getClass();
                if (une0Var instanceof une0.b) {
                    ((xne0) q8i0Var.getValue()).z1(((une0.b) une0Var).a);
                } else {
                    if (!(une0Var instanceof une0.a)) {
                        uhc.a();
                        return null;
                    }
                    ((xne0) q8i0Var.getValue()).d.a(new vne0.c(((une0.a) une0Var).a));
                }
                return Unit.a;
        }
    }
}
