package defpackage;

import android.content.Intent;
import com.sportybet.android.country.CountryShutDownActivity;
import com.sportybet.android.home.MainActivity;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class niu implements lfy {
    public final /* synthetic */ MainActivity a;

    @Override // defpackage.lfy
    public final void u1(Object obj) {
        ub90 ub90Var = (ub90) obj;
        int i = MainActivity.m0;
        int i2 = CountryShutDownActivity.a;
        ub90Var.getClass();
        MainActivity mainActivity = this.a;
        Intent intent = new Intent(mainActivity, (Class<?>) CountryShutDownActivity.class);
        intent.putExtra("url", ub90Var.getLink());
        intent.putExtra("data_enable_default_action_bar", false);
        intent.putExtra("disable url redirect", true);
        mainActivity.startActivity(intent);
    }
}
