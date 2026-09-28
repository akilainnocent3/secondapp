package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes5.dex */
public final class uxi implements g6i0 {
    public final HintView A;
    public final ConstraintLayout a;
    public final ClearEditText b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final ProgressButton i;
    public final LinearLayout v;
    public final ComposeView w;
    public final TextView y;
    public final ComposeView z;

    public uxi(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, ComposeView composeView, ComposeView composeView2, ConstraintLayout constraintLayout, ClearEditText clearEditText, HintView hintView, ProgressButton progressButton) {
        this.a = constraintLayout;
        this.b = clearEditText;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.i = progressButton;
        this.v = linearLayout;
        this.w = composeView;
        this.y = textView5;
        this.z = composeView2;
        this.A = hintView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
