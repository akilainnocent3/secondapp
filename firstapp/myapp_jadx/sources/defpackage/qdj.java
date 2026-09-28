package defpackage;

import android.content.SharedPreferences;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.compose.lobbyv2.models.LobbyV2GameDetailsModel;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class qdj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qdj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer id;
        zt50 zt50Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ijf0 ijf0Var = (ijf0) obj;
                ijf0Var.getClass();
                ((Function1) obj2).invoke(new zcj.e(ijf0Var));
                return Unit.a;
            case 1:
                Integer num = (Integer) obj;
                LobbyV2GameDetailsModel lobbyV2GameDetailsModel = (LobbyV2GameDetailsModel) ((h0s) obj2).e(num.intValue());
                return (lobbyV2GameDetailsModel == null || (id = lobbyV2GameDetailsModel.getId()) == null) ? num : id;
            default:
                zy10 zy10Var = (zy10) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                String str = zBooleanValue ? "MusicOn" : "MusicOff";
                GameDetails gameDetails = zy10Var.B;
                wz.a(str, gameDetails != null ? gameDetails.getName() : null, "HamMenu");
                SharedPreferences.Editor editor = zy10Var.y;
                if (zBooleanValue) {
                    if (editor != null) {
                        editor.putBoolean("ROCKET_MUSIC", true);
                    }
                    SharedPreferences.Editor editor2 = zy10Var.y;
                    if (editor2 != null) {
                        editor2.apply();
                    }
                    if (zy10Var.getContext() != null && (zt50Var = zy10Var.b) != null) {
                        ProgressMeterComponent progressMeterComponent = zt50Var.Q;
                        ypa0 ypa0VarA1 = zy10Var.a1();
                        Boolean bool = Boolean.TRUE;
                        String string = zy10Var.getString(R.string.bg_music);
                        string.getClass();
                        progressMeterComponent.K(ypa0VarA1, bool, string);
                    }
                } else {
                    if (editor != null) {
                        editor.putBoolean("ROCKET_MUSIC", false);
                    }
                    SharedPreferences.Editor editor3 = zy10Var.y;
                    if (editor3 != null) {
                        editor3.apply();
                    }
                    if (zy10Var.b != null) {
                        zy10Var.a1().I1();
                    }
                }
                return Unit.a;
        }
    }
}
