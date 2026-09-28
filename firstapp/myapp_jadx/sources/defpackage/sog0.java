package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.sportybet.feature.payment.impl.common.presentation.activity.TradingActivity;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class sog0 extends ViewPager2.g {
    public final /* synthetic */ TradingActivity a;

    public sog0(TradingActivity tradingActivity) {
        this.a = tradingActivity;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void c(int i) {
        List<y200> list;
        y200 y200Var;
        if (i < 0) {
            return;
        }
        int i2 = TradingActivity.X;
        TradingActivity tradingActivity = this.a;
        z200 value = tradingActivity.z1().x1().getValue();
        if (value == null || (list = value.a) == null || (y200Var = list.get(i)) == null) {
            return;
        }
        tradingActivity.z1().z1(y200Var);
    }
}
