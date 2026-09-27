package yads;

import android.view.View;
import android.view.ViewParent;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class dx1 implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewParent parent = view != null ? view.getParent() : null;
        ViewParent parent2 = parent != null ? parent.getParent() : null;
        ViewPager2 viewPager2 = parent2 instanceof ViewPager2 ? (ViewPager2) parent2 : null;
        if (viewPager2 != null) {
            viewPager2.callOnClick();
        }
    }
}
