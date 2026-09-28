package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes5.dex */
public final class vxi implements g6i0 {
    public final TextView A;
    public final AppCompatImageView B;
    public final TextView C;
    public final ConstraintLayout a;
    public final ClearEditText b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final LinearLayout i;
    public final ComposeView v;
    public final ComposeView w;
    public final TextView y;
    public final ProgressButton z;

    public vxi(ConstraintLayout constraintLayout, ClearEditText clearEditText, TextView textView, TextView textView2, TextView textView3, TextView textView4, LinearLayout linearLayout, ComposeView composeView, ComposeView composeView2, TextView textView5, ProgressButton progressButton, TextView textView6, AppCompatImageView appCompatImageView, TextView textView7) {
        this.a = constraintLayout;
        this.b = clearEditText;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.i = linearLayout;
        this.v = composeView;
        this.w = composeView2;
        this.y = textView5;
        this.z = progressButton;
        this.A = textView6;
        this.B = appCompatImageView;
        this.C = textView7;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
