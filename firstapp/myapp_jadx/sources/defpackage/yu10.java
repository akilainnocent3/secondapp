package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.pocketrocket.model.response.RoundBetResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class yu10 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yu10(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Object objE = new eal().e(x54.a(Base64.decode((String) obj, 0)), RoundBetResponse.class);
                objE.getClass();
                ((zy10) obj2).c1((RoundBetResponse) objE);
                break;
            case 1:
                l560 l560Var = (l560) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                GameDetails gameDetails = l560Var.S;
                wz.a("SoundClicked", gameDetails != null ? gameDetails.getName() : null, zBooleanValue ? "On" : "Off");
                SharedPreferences.Editor editor = l560Var.P;
                if (editor != null) {
                    editor.putBoolean("rush_sound", zBooleanValue);
                }
                l560Var.E0().y1().d = zBooleanValue;
                SharedPreferences.Editor editor2 = l560Var.P;
                if (editor2 != null) {
                    editor2.apply();
                }
                l560Var.E0().J1(l560Var.E0().y1().d);
                break;
            default:
                ((goa0) obj2).c.j(AnalyticsEvent.BI_TRACKING_KIND_ERROR);
                break;
        }
        return Unit.a;
    }
}
