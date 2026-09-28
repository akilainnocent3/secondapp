package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.sportybet.feature.payment.impl.common.presentation.widget.PayTabLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class ye implements g6i0 {
    public final ConstraintLayout a;
    public final ImageButton b;
    public final TextView c;
    public final rrr d;
    public final View e;
    public final wh7 f;
    public final ImageButton i;
    public final ImageButton v;
    public final PayTabLayout w;
    public final ViewPager2 y;
    public final ComposeView z;

    public ye(ConstraintLayout constraintLayout, ImageButton imageButton, TextView textView, rrr rrrVar, View view, wh7 wh7Var, ImageButton imageButton2, ImageButton imageButton3, PayTabLayout payTabLayout, ViewPager2 viewPager2, ComposeView composeView) {
        this.a = constraintLayout;
        this.b = imageButton;
        this.c = textView;
        this.d = rrrVar;
        this.e = view;
        this.f = wh7Var;
        this.i = imageButton2;
        this.v = imageButton3;
        this.w = payTabLayout;
        this.y = viewPager2;
        this.z = composeView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
