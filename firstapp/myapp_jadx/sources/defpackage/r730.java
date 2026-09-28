package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes5.dex */
public final class r730 extends ViewPager2.g {
    public final /* synthetic */ q730 a;

    public r730(q730 q730Var) {
        this.a = q730Var;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void c(int i) {
        q730.a aVar = q730.D;
        x730 x730Var = (x730) this.a.i.getValue();
        ztw<Integer> ztwVar = x730Var.a.n.get(Integer.valueOf(x730Var.b));
        if (ztwVar != null) {
            ztwVar.setValue(Integer.valueOf(i));
        }
    }
}
