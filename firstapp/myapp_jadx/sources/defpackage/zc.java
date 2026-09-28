package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class zc implements g6i0 {
    public final ConstraintLayout a;
    public final ImageButton b;
    public final ConstraintLayout c;
    public final ImageButton d;
    public final TextView e;
    public final TabLayout f;
    public final View i;
    public final ImageButton v;
    public final ViewPager2 w;
    public final LinearLayout y;
    public final TextView z;

    public zc(ConstraintLayout constraintLayout, ImageButton imageButton, ConstraintLayout constraintLayout2, ImageButton imageButton2, TextView textView, TabLayout tabLayout, View view, ImageButton imageButton3, ViewPager2 viewPager2, LinearLayout linearLayout, TextView textView2) {
        this.a = constraintLayout;
        this.b = imageButton;
        this.c = constraintLayout2;
        this.d = imageButton2;
        this.e = textView;
        this.f = tabLayout;
        this.i = view;
        this.v = imageButton3;
        this.w = viewPager2;
        this.y = linearLayout;
        this.z = textView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
