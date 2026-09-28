package defpackage;

import android.widget.ImageView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.roulette.activities.RouletteActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class sx50 implements lfy<Long> {
    public final /* synthetic */ RouletteActivity a;

    public sx50(RouletteActivity rouletteActivity) {
        this.a = rouletteActivity;
    }

    @Override // defpackage.lfy
    public final void u1(Long l) {
        int[] iArr = RouletteActivity.A0;
        RouletteActivity rouletteActivity = this.a;
        long jLongValue = rouletteActivity.t0.d().longValue();
        long j = rouletteActivity.r0;
        ImageView imageView = rouletteActivity.q0;
        if (jLongValue < j) {
            imageView.setVisibility(0);
            rouletteActivity.p0.setBackgroundResource(R.drawable.hamberger_add_more_red);
        } else {
            imageView.setVisibility(8);
            rouletteActivity.p0.setBackgroundResource(R.drawable.menu_add_more_bg_plain);
        }
    }
}
