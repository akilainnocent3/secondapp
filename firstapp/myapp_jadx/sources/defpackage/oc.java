package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.common_ui.widgets.CommonTitleBar;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.LoadingView;

/* JADX INFO: loaded from: classes5.dex */
public final class oc implements g6i0 {
    public final ViewPager2 A;
    public final ImageView B;
    public final ConstraintLayout a;
    public final TabLayout b;
    public final BubbleView c;
    public final LinearLayout d;
    public final ImageView e;
    public final ImageView f;
    public final LoadingView i;
    public final View v;
    public final View w;
    public final View y;
    public final CommonTitleBar z;

    public oc(ConstraintLayout constraintLayout, TabLayout tabLayout, BubbleView bubbleView, LinearLayout linearLayout, ImageView imageView, ImageView imageView2, LoadingView loadingView, View view, View view2, View view3, CommonTitleBar commonTitleBar, ViewPager2 viewPager2, ImageView imageView3) {
        this.a = constraintLayout;
        this.b = tabLayout;
        this.c = bubbleView;
        this.d = linearLayout;
        this.e = imageView;
        this.f = imageView2;
        this.i = loadingView;
        this.v = view;
        this.w = view2;
        this.y = view3;
        this.z = commonTitleBar;
        this.A = viewPager2;
        this.B = imageView3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
