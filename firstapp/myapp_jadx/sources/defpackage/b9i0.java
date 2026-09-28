package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes5.dex */
public final class b9i0 {
    public static final void a(ViewPager2 viewPager2, boolean z, int i, int i2, int i3) {
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            if (!z) {
                i = i2;
            }
            if (!z) {
                i3 = 0;
            }
            recyclerView.setPadding(i, 0, i3, 0);
            recyclerView.setClipToPadding(false);
            recyclerView.setItemAnimator(null);
        }
    }
}
