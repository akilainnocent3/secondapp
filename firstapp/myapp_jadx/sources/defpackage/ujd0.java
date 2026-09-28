package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.widget.LoadingView;

/* JADX INFO: loaded from: classes7.dex */
public final class ujd0 implements g6i0 {
    public final ConstraintLayout a;
    public final View b;
    public final ConstraintLayout c;
    public final ComposeView d;
    public final TextView e;
    public final TextView f;
    public final LoadingView i;
    public final TextView v;
    public final TextView w;
    public final View y;

    public ujd0(ConstraintLayout constraintLayout, View view, ConstraintLayout constraintLayout2, ComposeView composeView, TextView textView, TextView textView2, LoadingView loadingView, TextView textView3, TextView textView4, View view2) {
        this.a = constraintLayout;
        this.b = view;
        this.c = constraintLayout2;
        this.d = composeView;
        this.e = textView;
        this.f = textView2;
        this.i = loadingView;
        this.v = textView3;
        this.w = textView4;
        this.y = view2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
