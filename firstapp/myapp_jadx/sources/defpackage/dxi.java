package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes5.dex */
public final class dxi implements g6i0 {
    public final ConstraintLayout a;
    public final HintView b;
    public final TextView c;
    public final TextView d;
    public final ProgressButton e;
    public final LinearLayout f;
    public final TextView i;
    public final ClearEditText v;
    public final TextView w;

    public dxi(ConstraintLayout constraintLayout, HintView hintView, TextView textView, TextView textView2, ProgressButton progressButton, LinearLayout linearLayout, TextView textView3, ClearEditText clearEditText, TextView textView4) {
        this.a = constraintLayout;
        this.b = hintView;
        this.c = textView;
        this.d = textView2;
        this.e = progressButton;
        this.f = linearLayout;
        this.i = textView3;
        this.v = clearEditText;
        this.w = textView4;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
