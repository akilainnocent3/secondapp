package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.plugin.realsports.sportssoccer.expandview.TimeFilterPopupView;

/* JADX INFO: loaded from: classes8.dex */
public final class yjd0 implements g6i0 {
    public final TimeFilterPopupView a;
    public final TextView b;
    public final ComposeView c;
    public final ComposeView d;
    public final LinearLayout e;
    public final TextView f;

    public yjd0(TimeFilterPopupView timeFilterPopupView, TextView textView, TextView textView2, ConstraintLayout constraintLayout, ComposeView composeView, ComposeView composeView2, LinearLayout linearLayout, TextView textView3) {
        this.a = timeFilterPopupView;
        this.b = textView2;
        this.c = composeView;
        this.d = composeView2;
        this.e = linearLayout;
        this.f = textView3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
