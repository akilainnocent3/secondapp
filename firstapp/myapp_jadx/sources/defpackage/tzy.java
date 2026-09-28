package defpackage;

import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes4.dex */
public final class tzy implements ViewPager.i {
    public final /* synthetic */ vzy a;

    public tzy(vzy vzyVar) {
        this.a = vzyVar;
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void N0(int i) {
        vzy vzyVar = this.a;
        if (i == 0) {
            vzyVar.F.j();
            yie0.b(vzyVar, mie0.b);
        } else {
            yie0.b(vzyVar, mie0.c);
        }
        vzyVar.G.d(i == 1 ? u420.b.a : u420.h.a);
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void K0(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void H(float f, int i, int i2) {
    }
}
