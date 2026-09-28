package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.sportybet.android.globalpay.GlobalDepositActivity;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class o0l extends ViewPager2.g {
    public final /* synthetic */ GlobalDepositActivity a;
    public final /* synthetic */ List<o800> b;
    public final /* synthetic */ zc c;

    public o0l(GlobalDepositActivity globalDepositActivity, List<o800> list, zc zcVar) {
        this.a = globalDepositActivity;
        this.b = list;
        this.c = zcVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void c(int i) {
        if (i != 0) {
            int i2 = GlobalDepositActivity.w;
            a1l a1lVarA1 = this.a.A1();
            o800 o800Var = this.b.get(i - 1);
            o800Var.getClass();
            a1lVarA1.I = o800Var.a.g(a1lVarA1.a);
            a1lVarA1.d.a(o800Var);
        }
        this.c.e.setSelected(i == 0);
    }
}
