package defpackage;

import android.view.View;
import com.sportybet.plugin.realsports.data.SwipeBetOddsFilter;
import com.sportybet.plugin.swipebet.activities.SwipeBetSettingActivity;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes7.dex */
public final class yke0 implements View.OnClickListener {
    public final /* synthetic */ SwipeBetSettingActivity a;

    public yke0(SwipeBetSettingActivity swipeBetSettingActivity) {
        this.a = swipeBetSettingActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String[] strArr = SwipeBetSettingActivity.D;
        SwipeBetSettingActivity swipeBetSettingActivity = this.a;
        if (SwipeBetSettingActivity.z1(swipeBetSettingActivity.c) != SwipeBetSettingActivity.z1(swipeBetSettingActivity.d)) {
            boolean z = swipeBetSettingActivity.d == 100.0f;
            String[] strArr2 = SwipeBetSettingActivity.D;
            swipeBetSettingActivity.w.f = new SwipeBetOddsFilter(swipeBetSettingActivity.c, swipeBetSettingActivity.d, new BigDecimal(strArr2[SwipeBetSettingActivity.z1(swipeBetSettingActivity.c)]).doubleValue(), z ? Double.MAX_VALUE : new BigDecimal(strArr2[SwipeBetSettingActivity.z1(swipeBetSettingActivity.d)]).doubleValue(), z);
        }
        ble0 ble0Var = swipeBetSettingActivity.w;
        hle0 hle0Var = ble0Var.v;
        ssw<hqc> sswVar = ble0Var.c;
        sswVar.m(new lqc());
        String strX1 = ble0Var.x1();
        if (ble0Var.i.getAccount() != null) {
            ble0Var.a.e(strX1).G(new ale0(ble0Var, strX1));
            return;
        }
        hle0Var.b();
        hle0Var.a();
        hle0Var.d(strX1);
        sswVar.m(new nqc(new Object()));
    }
}
