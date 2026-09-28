package defpackage;

import android.content.SharedPreferences;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w260 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w260(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                l560 l560Var = (l560) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                GameDetails gameDetails = l560Var.S;
                wz.a("OneTapBetClicked", gameDetails != null ? gameDetails.getName() : null, zBooleanValue ? "On" : "Off");
                SharedPreferences.Editor editor = l560Var.P;
                if (editor != null) {
                    editor.putBoolean("rush_one_tap", zBooleanValue);
                }
                SharedPreferences.Editor editor2 = l560Var.P;
                if (editor2 != null) {
                    editor2.apply();
                }
                if (!zBooleanValue && l560Var.F) {
                    l560Var.F = false;
                    l560Var.V0();
                }
                break;
            default:
                ((foa0) obj2).y.j(AnalyticsEvent.BI_TRACKING_KIND_ERROR);
                break;
        }
        return Unit.a;
    }
}
