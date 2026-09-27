package yads;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vw1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ns.o[] f157105g = {wb.a(vw1.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jx1 f157106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bx1 f157107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f157108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lm2 f157109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ph1 f157110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f157111f = true;

    public vw1(ViewPager2 viewPager2, jx1 jx1Var, bx1 bx1Var, qh1 qh1Var) {
        this.f157106a = jx1Var;
        this.f157107b = bx1Var;
        this.f157108c = qh1Var;
        this.f157109d = mm2.a(viewPager2);
    }

    public final void a() {
        ph1 ph1Var = this.f157110e;
        if (ph1Var != null) {
            ph1Var.f153937a.removeCallbacksAndMessages(null);
        }
        this.f157110e = null;
    }
}
