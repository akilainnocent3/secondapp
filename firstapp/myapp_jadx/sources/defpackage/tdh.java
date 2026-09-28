package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.sportybet.plugin.realsports.home.featuredsection.FeaturedContainer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class tdh extends ViewPager2.g {
    public final /* synthetic */ ydh a;
    public final /* synthetic */ FeaturedContainer b;

    public tdh(ydh ydhVar, FeaturedContainer featuredContainer) {
        this.a = ydhVar;
        this.b = featuredContainer;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void b(float f, int i, int i2) {
        if (i2 != 0) {
            return;
        }
        FeaturedContainer featuredContainer = this.b;
        ydh ydhVar = this.a;
        if (i == 0) {
            ViewPager2 viewPager2 = ydhVar.c;
            yy4 yy4Var = featuredContainer.n0;
            if (yy4Var != null) {
                viewPager2.setCurrentItem(yy4Var.getItemCount() - 2, false);
                return;
            } else {
                Intrinsics.n("featuredCodesAdapter");
                throw null;
            }
        }
        yy4 yy4Var2 = featuredContainer.n0;
        if (yy4Var2 == null) {
            Intrinsics.n("featuredCodesAdapter");
            throw null;
        }
        if (i == yy4Var2.getItemCount() - 1) {
            ydhVar.c.setCurrentItem(1, false);
        }
    }
}
