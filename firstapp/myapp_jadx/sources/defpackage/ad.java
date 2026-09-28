package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class ad implements g6i0 {
    public final TabLayout A;
    public final ConstraintLayout a;
    public final ImageButton b;
    public final TextView c;
    public final ConstraintLayout d;
    public final TextView e;
    public final AppCompatImageView f;
    public final TextView i;
    public final View v;
    public final ImageButton w;
    public final ViewPager2 y;
    public final ImageButton z;

    public ad(ConstraintLayout constraintLayout, ImageButton imageButton, TextView textView, ConstraintLayout constraintLayout2, TextView textView2, AppCompatImageView appCompatImageView, TextView textView3, View view, ImageButton imageButton2, ViewPager2 viewPager2, ImageButton imageButton3, TabLayout tabLayout) {
        this.a = constraintLayout;
        this.b = imageButton;
        this.c = textView;
        this.d = constraintLayout2;
        this.e = textView2;
        this.f = appCompatImageView;
        this.i = textView3;
        this.v = view;
        this.w = imageButton2;
        this.y = viewPager2;
        this.z = imageButton3;
        this.A = tabLayout;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
