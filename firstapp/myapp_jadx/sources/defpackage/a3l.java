package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.sportybet.android.globalpay.GlobalWithdrawActivity;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class a3l extends ViewPager2.g {
    public final /* synthetic */ GlobalWithdrawActivity a;
    public final /* synthetic */ List<o800> b;

    public a3l(GlobalWithdrawActivity globalWithdrawActivity, List<o800> list) {
        this.a = globalWithdrawActivity;
        this.b = list;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void c(int i) {
        if (i != 0) {
            int i2 = GlobalWithdrawActivity.y;
            h3l h3lVarA1 = this.a.A1();
            o800 o800Var = this.b.get(i - 1);
            o800Var.getClass();
            h3lVarA1.d.a(o800Var);
        }
    }
}
