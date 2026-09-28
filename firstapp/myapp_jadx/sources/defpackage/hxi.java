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
public final class hxi implements g6i0 {
    public final ComposeView A;
    public final ConstraintLayout a;
    public final HintView b;
    public final ClearEditText c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView i;
    public final ComposeView v;
    public final ProgressButton w;
    public final LinearLayout y;
    public final TextView z;

    public hxi(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, ComposeView composeView, ComposeView composeView2, ConstraintLayout constraintLayout, ClearEditText clearEditText, HintView hintView, ProgressButton progressButton) {
        this.a = constraintLayout;
        this.b = hintView;
        this.c = clearEditText;
        this.d = textView;
        this.e = textView2;
        this.f = textView3;
        this.i = textView4;
        this.v = composeView;
        this.w = progressButton;
        this.y = linearLayout;
        this.z = textView5;
        this.A = composeView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
