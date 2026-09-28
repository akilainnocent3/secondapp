package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.OUEarlyGoalsSwitch;
import com.sportybet.android.widget.OneUpTwoUpSwitch;

/* JADX INFO: loaded from: classes7.dex */
public final class sih0 implements g6i0 {
    public final TextView A;
    public final ConstraintLayout a;
    public final View b;
    public final BubbleView c;
    public final TabLayout d;
    public final tjd0 e;
    public final ImageView f;
    public final AppCompatImageView i;
    public final LinearLayout v;
    public final TextView w;
    public final OneUpTwoUpSwitch y;
    public final OUEarlyGoalsSwitch z;

    public sih0(ConstraintLayout constraintLayout, View view, BubbleView bubbleView, TabLayout tabLayout, tjd0 tjd0Var, ImageView imageView, AppCompatImageView appCompatImageView, LinearLayout linearLayout, TextView textView, OneUpTwoUpSwitch oneUpTwoUpSwitch, OUEarlyGoalsSwitch oUEarlyGoalsSwitch, TextView textView2) {
        this.a = constraintLayout;
        this.b = view;
        this.c = bubbleView;
        this.d = tabLayout;
        this.e = tjd0Var;
        this.f = imageView;
        this.i = appCompatImageView;
        this.v = linearLayout;
        this.w = textView;
        this.y = oneUpTwoUpSwitch;
        this.z = oUEarlyGoalsSwitch;
        this.A = textView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
