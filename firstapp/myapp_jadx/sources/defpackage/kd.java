package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class kd implements g6i0 {
    public final ConstraintLayout a;
    public final ConstraintLayout b;
    public final ConstraintLayout c;
    public final TextView d;
    public final ViewPager2 e;
    public final TabLayout f;
    public final TextView i;
    public final ConstraintLayout v;
    public final AppCompatTextView w;

    public kd(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, TextView textView, ViewPager2 viewPager2, TabLayout tabLayout, TextView textView2, ConstraintLayout constraintLayout4, AppCompatTextView appCompatTextView) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
        this.c = constraintLayout3;
        this.d = textView;
        this.e = viewPager2;
        this.f = tabLayout;
        this.i = textView2;
        this.v = constraintLayout4;
        this.w = appCompatTextView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
