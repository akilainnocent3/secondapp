package defpackage;

import android.content.SharedPreferences;
import com.sportygames.common.network.campaign.CampaignsData;
import com.sportygames.commons.views.NavigationActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h8a implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h8a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                final db6 db6Var = (db6) obj2;
                CampaignsData campaignsData = (CampaignsData) obj;
                campaignsData.getClass();
                final int id = campaignsData.getActiveOrPausedCampaignTier().getId();
                db6Var.x1(id, new Function0() { // from class: i8a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Integer numValueOf = Integer.valueOf(id);
                        db6 db6Var2 = db6Var;
                        db6Var2.y1("Lobby", numValueOf, new a8a(db6Var2, 0));
                        return Unit.a;
                    }
                });
                return Unit.a;
            case 1:
                NavigationActivity navigationActivity = (NavigationActivity) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i2 = NavigationActivity.y;
                navigationActivity.A1().J1(navigationActivity.A1().y1().d);
                SharedPreferences.Editor editor = navigationActivity.d;
                if (zBooleanValue) {
                    if (editor != null) {
                        editor.putBoolean("EVEN_ODD_ONE_TAP", true);
                    }
                } else if (editor != null) {
                    editor.putBoolean("EVEN_ODD_ONE_TAP", false);
                }
                SharedPreferences.Editor editor2 = navigationActivity.d;
                if (editor2 != null) {
                    editor2.apply();
                }
                return Unit.a;
            default:
                eoa0 eoa0Var = (eoa0) obj2;
                bbs bbsVar = (bbs) obj;
                bbsVar.getClass();
                int iOrdinal = bbsVar.a.ordinal();
                if (iOrdinal == 0) {
                    eoa0Var.y = true;
                } else if (iOrdinal == 1) {
                    eoa0Var.y = false;
                    eoa0Var.c.j("closed");
                } else if (iOrdinal != 2 && iOrdinal != 3) {
                    uhc.a();
                    return null;
                }
                return Unit.a;
        }
    }
}
