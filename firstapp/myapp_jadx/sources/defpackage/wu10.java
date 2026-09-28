package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.sportyherov2.remote.models.RoundInfoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wu10 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wu10(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        eo80 eo80Var;
        eo80 eo80Var2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                zy10 zy10Var = (zy10) obj2;
                RoundInfoResponse roundInfoResponse = (RoundInfoResponse) q97.a(RoundInfoResponse.class, (String) obj);
                zy10Var.P = zy10Var.O;
                zy10Var.O = roundInfoResponse.getRoundId();
                break;
            case 1:
                l560 l560Var = (l560) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                GameDetails gameDetails = l560Var.S;
                wz.a("MusicClicked", gameDetails != null ? gameDetails.getName() : null, zBooleanValue ? "On" : "Off");
                SharedPreferences.Editor editor = l560Var.P;
                if (zBooleanValue) {
                    if (editor != null) {
                        editor.putBoolean("rush_music", true);
                    }
                    SharedPreferences.Editor editor2 = l560Var.P;
                    if (editor2 != null) {
                        editor2.apply();
                    }
                    SharedPreferences sharedPreferences = l560Var.O;
                    Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("rush_sound", true)) : null;
                    Context context = l560Var.getContext();
                    if (context != null && (eo80Var2 = l560Var.l0) != null) {
                        ProgressMeterComponent progressMeterComponent = eo80Var2.o0;
                        String string = l560Var.getString(R.string.rush_name);
                        string.getClass();
                        Boolean bool = Boolean.TRUE;
                        rk60.b bVar = rk60.b.a;
                        progressMeterComponent.J(string, boolValueOf, bool, l560Var.S, context, l560Var.E0());
                    }
                } else {
                    if (editor != null) {
                        editor.putBoolean("rush_music", false);
                    }
                    SharedPreferences.Editor editor3 = l560Var.P;
                    if (editor3 != null) {
                        editor3.apply();
                    }
                    SharedPreferences sharedPreferences2 = l560Var.O;
                    Boolean boolValueOf2 = sharedPreferences2 != null ? Boolean.valueOf(sharedPreferences2.getBoolean("rush_sound", true)) : null;
                    Context context2 = l560Var.getContext();
                    if (context2 != null && (eo80Var = l560Var.l0) != null) {
                        ProgressMeterComponent progressMeterComponent2 = eo80Var.o0;
                        String string2 = l560Var.getString(R.string.rush_name);
                        string2.getClass();
                        Boolean bool2 = Boolean.FALSE;
                        rk60.b bVar2 = rk60.b.a;
                        progressMeterComponent2.J(string2, boolValueOf2, bool2, l560Var.S, context2, l560Var.E0());
                    }
                }
                break;
            default:
                ((Function1) obj2).invoke(new kli0.n(((Integer) obj).intValue()));
                break;
        }
        return Unit.a;
    }
}
