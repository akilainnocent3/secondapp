package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class xxi implements g6i0 {
    public final ConstraintLayout a;
    public final ij90 b;
    public final TabLayout c;
    public final ViewPager2 d;

    public xxi(ConstraintLayout constraintLayout, ij90 ij90Var, TabLayout tabLayout, ViewPager2 viewPager2) {
        this.a = constraintLayout;
        this.b = ij90Var;
        this.c = tabLayout;
        this.d = viewPager2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
