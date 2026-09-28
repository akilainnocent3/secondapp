package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.hb5;
import defpackage.ib5;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ViewPager2.i {
    public final int a;

    public b(int i) {
        if (i >= 0) {
            this.a = i;
        } else {
            hb5.a("Margin must be non-negative");
            throw null;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void a(View view, float f) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if (!(parent instanceof RecyclerView) || !(parent2 instanceof ViewPager2)) {
            ib5.a("Expected the page view to be managed by a ViewPager2 instance.");
            return;
        }
        ViewPager2 viewPager2 = (ViewPager2) parent2;
        float f2 = this.a * f;
        if (viewPager2.getOrientation() != 0) {
            view.setTranslationY(f2);
            return;
        }
        if (viewPager2.b()) {
            f2 = -f2;
        }
        view.setTranslationX(f2);
    }
}
