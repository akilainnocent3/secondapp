package yads;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class xw1 extends dt {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ns.o[] f158024g = {wb.a(xw1.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jx1 f158025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bx1 f158026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lm2 f158027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ww1 f158028f = ww1.f157562b;

    public xw1(ViewPager2 viewPager2, jx1 jx1Var, bx1 bx1Var) {
        this.f158025c = jx1Var;
        this.f158026d = bx1Var;
        this.f158027e = mm2.a(viewPager2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr.w2 w2Var;
        ViewPager2 viewPager2;
        lm2 lm2Var = this.f158027e;
        ns.o oVar = f158024g[0];
        ViewPager2 viewPager3 = (ViewPager2) lm2Var.f152056a.get();
        if (viewPager3 != null) {
            if (kl3.f151600a.a(viewPager3).f157907a > 0) {
                RecyclerView.h adapter = viewPager3.getAdapter();
                int itemCount = adapter != null ? adapter.getItemCount() : 0;
                if (itemCount != 0) {
                    int currentItem = viewPager3.getCurrentItem();
                    if (currentItem == 0) {
                        this.f158028f = ww1.f157562b;
                    } else if (currentItem == itemCount - 1) {
                        this.f158028f = ww1.f157563c;
                    }
                } else {
                    this.f148346b = ct.f147887c;
                }
                int iOrdinal = this.f158028f.ordinal();
                if (iOrdinal == 0) {
                    ViewPager2 viewPager4 = (ViewPager2) this.f158025c.f151297a.get();
                    if (viewPager4 != null) {
                        viewPager4.s(viewPager4.getCurrentItem() + 1, true);
                    }
                } else if (iOrdinal == 1 && (viewPager2 = (ViewPager2) this.f158025c.f151297a.get()) != null) {
                    viewPager2.s(viewPager2.getCurrentItem() - 1, true);
                }
                bx1 bx1Var = this.f158026d;
                if (bx1Var.f147391e) {
                    bx1Var.a("first_auto_swipe");
                    bx1Var.f147391e = false;
                }
            }
            w2Var = dr.w2.f79517a;
        } else {
            w2Var = null;
        }
        if (w2Var == null) {
            this.f148346b = ct.f147887c;
        }
    }
}
