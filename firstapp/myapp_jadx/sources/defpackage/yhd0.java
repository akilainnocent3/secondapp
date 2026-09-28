package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class yhd0 implements g6i0 {
    public final ConstraintLayout a;
    public final TabLayout b;
    public final ImageView c;
    public final ImageView d;
    public final ViewPager2 e;

    public yhd0(ConstraintLayout constraintLayout, ImageView imageView, TabLayout tabLayout, ImageView imageView2, ImageView imageView3, ViewPager2 viewPager2) {
        this.a = constraintLayout;
        this.b = tabLayout;
        this.c = imageView2;
        this.d = imageView3;
        this.e = viewPager2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
