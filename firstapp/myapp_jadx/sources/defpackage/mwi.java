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
public final class mwi implements g6i0 {
    public final TextView A;
    public final ComposeView B;
    public final HintView C;
    public final ComposeView D;
    public final ConstraintLayout a;
    public final ComposeView b;
    public final ComposeView c;
    public final ClearEditText d;
    public final TextView e;
    public final TextView f;
    public final TextView i;
    public final TextView v;
    public final ProgressButton w;
    public final LinearLayout y;
    public final ComposeView z;

    public mwi(ConstraintLayout constraintLayout, ComposeView composeView, ComposeView composeView2, ClearEditText clearEditText, TextView textView, TextView textView2, TextView textView3, TextView textView4, ProgressButton progressButton, LinearLayout linearLayout, ComposeView composeView3, TextView textView5, ComposeView composeView4, HintView hintView, ComposeView composeView5) {
        this.a = constraintLayout;
        this.b = composeView;
        this.c = composeView2;
        this.d = clearEditText;
        this.e = textView;
        this.f = textView2;
        this.i = textView3;
        this.v = textView4;
        this.w = progressButton;
        this.y = linearLayout;
        this.z = composeView3;
        this.A = textView5;
        this.B = composeView4;
        this.C = hintView;
        this.D = composeView5;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
