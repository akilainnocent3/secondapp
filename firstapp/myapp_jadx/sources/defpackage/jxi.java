package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.ClearEditText;

/* JADX INFO: loaded from: classes5.dex */
public final class jxi implements g6i0 {
    public final ComposeView A;
    public final ConstraintLayout a;
    public final ClearEditText b;
    public final TextView c;
    public final TextView d;
    public final ComposeView e;
    public final ComposeView f;
    public final ComposeView i;
    public final LinearLayout v;
    public final ComposeView w;
    public final ComposeView y;
    public final ComposeView z;

    public jxi(LinearLayout linearLayout, TextView textView, TextView textView2, ComposeView composeView, ComposeView composeView2, ComposeView composeView3, ComposeView composeView4, ComposeView composeView5, ComposeView composeView6, ComposeView composeView7, ConstraintLayout constraintLayout, ClearEditText clearEditText) {
        this.a = constraintLayout;
        this.b = clearEditText;
        this.c = textView;
        this.d = textView2;
        this.e = composeView;
        this.f = composeView2;
        this.i = composeView3;
        this.v = linearLayout;
        this.w = composeView4;
        this.y = composeView5;
        this.z = composeView6;
        this.A = composeView7;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
