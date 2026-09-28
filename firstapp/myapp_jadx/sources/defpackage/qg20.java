package defpackage;

import android.app.Activity;
import com.sportybet.feature.winning.WinningDialogActivity;
import com.sportybet.plugin.myfavorite.activities.PreMatchMyFavoriteActivity;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qg20 implements lfy {
    public final /* synthetic */ int a;
    public final /* synthetic */ py1 b;

    public /* synthetic */ qg20(py1 py1Var, int i) {
        this.a = i;
        this.b = py1Var;
    }

    @Override // defpackage.lfy
    public final void u1(Object obj) {
        lww lwwVar;
        String str;
        int i = this.a;
        py1 py1Var = this.b;
        switch (i) {
            case 0:
                PreMatchMyFavoriteActivity preMatchMyFavoriteActivity = (PreMatchMyFavoriteActivity) py1Var;
                e880 e880Var = (e880) obj;
                int i2 = PreMatchMyFavoriteActivity.b1;
                if (e880Var != null && (lwwVar = preMatchMyFavoriteActivity.L) != null) {
                    Selection selection = e880Var.a;
                    String str2 = selection.a.eventId;
                    String str3 = selection.b.id;
                    for (jpc jpcVar : lwwVar.w) {
                        if (jpcVar instanceof ing) {
                            Event event = ((ing) jpcVar).a;
                            if (str2.equals(event.eventId)) {
                                for (Market market : event.markets) {
                                    String str4 = market.specifier;
                                    boolean z = (str4 == null && e880Var.a.b.specifier == null) || ((str = e880Var.a.b.specifier) != null && str.equals(str4));
                                    if (market.id.equals(str3) && z) {
                                        market.update(e880Var.b);
                                        lwwVar.o();
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                WinningDialogActivity winningDialogActivity = (WinningDialogActivity) py1Var;
                WeakHashMap<Activity, Object> weakHashMap = WinningDialogActivity.f0;
                if (((Boolean) obj).booleanValue()) {
                    winningDialogActivity.H.m0.a();
                }
                break;
        }
    }
}
