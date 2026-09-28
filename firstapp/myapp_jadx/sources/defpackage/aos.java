package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.OUEarlyGoalsSwitch;
import com.sportybet.android.widget.OneUpTwoUpSwitch;

/* JADX INFO: loaded from: classes7.dex */
public final class aos implements g6i0 {
    public final ConstraintLayout a;
    public final AppCompatCheckBox b;
    public final ComposeView c;
    public final ComposeView d;
    public final View e;
    public final BubbleView f;
    public final TabLayout i;
    public final gid0 v;
    public final OneUpTwoUpSwitch w;
    public final OUEarlyGoalsSwitch y;
    public final AppCompatImageView z;

    public aos(ConstraintLayout constraintLayout, AppCompatCheckBox appCompatCheckBox, ComposeView composeView, ComposeView composeView2, View view, BubbleView bubbleView, TabLayout tabLayout, gid0 gid0Var, OneUpTwoUpSwitch oneUpTwoUpSwitch, OUEarlyGoalsSwitch oUEarlyGoalsSwitch, AppCompatImageView appCompatImageView) {
        this.a = constraintLayout;
        this.b = appCompatCheckBox;
        this.c = composeView;
        this.d = composeView2;
        this.e = view;
        this.f = bubbleView;
        this.i = tabLayout;
        this.v = gid0Var;
        this.w = oneUpTwoUpSwitch;
        this.y = oUEarlyGoalsSwitch;
        this.z = appCompatImageView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
