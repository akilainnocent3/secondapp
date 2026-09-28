package defpackage;

import com.sportybet.android.data.SimpleResponseWrapper;
import com.sportybet.plugin.realsports.data.SwipeBetOddsFilter;
import com.sportybet.plugin.realsports.data.SwipeBetOptions;
import com.sportybet.plugin.realsports.data.SwipeBetPreference;

/* JADX INFO: loaded from: classes7.dex */
public final class zke0 extends SimpleResponseWrapper<SwipeBetPreference> {
    public final /* synthetic */ ble0 a;

    public zke0(ble0 ble0Var) {
        this.a = ble0Var;
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onFailure(Throwable th) {
        super.onFailure(th);
        this.a.b.m(new kqc());
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onSuccess(SwipeBetPreference swipeBetPreference) {
        SwipeBetPreference swipeBetPreference2 = swipeBetPreference;
        SwipeBetOddsFilter swipeBetOddsFilter = swipeBetPreference2.oddsFilter;
        ble0 ble0Var = this.a;
        ble0Var.f = swipeBetOddsFilter;
        for (SwipeBetOptions swipeBetOptions : swipeBetPreference2.leagueOptions) {
            if (swipeBetOptions.isPreferred) {
                ble0Var.d.add(swipeBetOptions);
            }
        }
        for (SwipeBetOptions swipeBetOptions2 : swipeBetPreference2.marketOptions) {
            if (swipeBetOptions2.isPreferred) {
                ble0Var.e.add(swipeBetOptions2);
            }
        }
        String strX1 = ble0Var.x1();
        if (ble0Var.i.isLogin()) {
            ble0Var.v.d(strX1);
        }
        ble0Var.b.m(new nqc(swipeBetPreference2));
    }
}
