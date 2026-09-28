package defpackage;

import android.content.Intent;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.swipebet.activities.SwipeBetActivity;
import com.sportybet.plugin.swipebet.activities.SwipeBetSettingActivity;

/* JADX INFO: loaded from: classes7.dex */
public final class xke0 implements lfy<hqc> {
    public final /* synthetic */ SwipeBetSettingActivity a;

    public xke0(SwipeBetSettingActivity swipeBetSettingActivity) {
        this.a = swipeBetSettingActivity;
    }

    @Override // defpackage.lfy
    public final void u1(hqc hqcVar) {
        hqc hqcVar2 = hqcVar;
        if (hqcVar2 instanceof lqc) {
            SwipeBetSettingActivity swipeBetSettingActivity = this.a;
            String[] strArr = SwipeBetSettingActivity.D;
            swipeBetSettingActivity.A.setVisibility(0);
            swipeBetSettingActivity.z.setVisibility(8);
            return;
        }
        if (hqcVar2 instanceof kqc) {
            SwipeBetSettingActivity swipeBetSettingActivity2 = this.a;
            String[] strArr2 = SwipeBetSettingActivity.D;
            swipeBetSettingActivity2.A.setVisibility(8);
            swipeBetSettingActivity2.z.setVisibility(0);
            zyf0.b(R.string.common_feedback__sorry_something_went_wrong, 0);
            return;
        }
        if (hqcVar2 instanceof nqc) {
            hp0 hp0Var = hp0.A;
            Intent intent = new Intent(hp0Var, (Class<?>) SwipeBetActivity.class);
            intent.setFlags(335544320);
            hp0Var.startActivity(intent);
            this.a.finish();
        }
    }
}
