package defpackage;

import android.content.SharedPreferences;
import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.prematch.data.UpcomingEventTypes;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class il20 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ il20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                PreMatchSportActivity preMatchSportActivity = (PreMatchSportActivity) obj2;
                uvy uvyVar = (uvy) obj;
                LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
                if (uvyVar == null) {
                    return Unit.a;
                }
                its itsVarD1 = preMatchSportActivity.D1();
                uvy uvyVarE = itsVarD1.k.e();
                zuy zuyVarA = vuy.a(uvyVarE);
                OneUpTwoUpSwitch oneUpTwoUpSwitch = itsVarD1.g;
                zuy zuyVarE = hih0.e(oneUpTwoUpSwitch.getA());
                avy avyVarG = hih0.g(oneUpTwoUpSwitch.getB());
                if (zuyVarA != zuyVarE && avyVarG == avy.c) {
                    hih0.a(oneUpTwoUpSwitch, vuy.a(uvyVarE));
                }
                ej20 ej20VarH1 = preMatchSportActivity.H1();
                uvy uvyVarE2 = ej20VarH1.f.e();
                zuy zuyVarA2 = vuy.a(uvyVarE2);
                OneUpTwoUpSwitch oneUpTwoUpSwitch2 = ej20VarH1.b;
                zuy zuyVarE2 = hih0.e(oneUpTwoUpSwitch2.getA());
                avy avyVarG2 = hih0.g(oneUpTwoUpSwitch2.getB());
                if (zuyVarA2 != zuyVarE2 && avyVarG2 == avy.c) {
                    hih0.a(oneUpTwoUpSwitch2, vuy.a(uvyVarE2));
                }
                hjd0 hjd0Var = preMatchSportActivity.b;
                if (hjd0Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                boolean zIsChecked = hjd0Var.B.a.e.isChecked();
                boolean zK1 = preMatchSportActivity.K1(UpcomingEventTypes.PRE_MATCH.getValue());
                RegularMarketRule selectedMarket = hjd0Var.v.getSelectedMarket();
                if (selectedMarket != null) {
                    preMatchSportActivity.D1().c(selectedMarket, !zIsChecked);
                }
                RegularMarketRule selectedMarket2 = hjd0Var.F.getSelectedMarket();
                if (selectedMarket2 != null) {
                    preMatchSportActivity.H1().d(selectedMarket2, !zK1);
                }
                return Unit.a;
            default:
                kab0 kab0Var = (kab0) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                GameDetails gameDetails = kab0Var.b;
                wz.a("OneTapBetClicked", gameDetails != null ? gameDetails.getName() : null, zBooleanValue ? "On" : "Off");
                SharedPreferences.Editor editor = kab0Var.E;
                if (editor != null) {
                    editor.putBoolean("spin_match_one_tap", zBooleanValue);
                }
                SharedPreferences.Editor editor2 = kab0Var.E;
                if (editor2 != null) {
                    editor2.apply();
                }
                return Unit.a;
        }
    }
}
