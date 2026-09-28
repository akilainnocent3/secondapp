package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes5.dex */
public final class bxi implements g6i0 {
    public final ScrollView a;
    public final HintView b;
    public final TextView c;
    public final TextView d;
    public final ProgressButton e;
    public final LinearLayout f;
    public final ClearEditText i;
    public final TextView v;

    public bxi(ScrollView scrollView, HintView hintView, TextView textView, TextView textView2, ProgressButton progressButton, LinearLayout linearLayout, ClearEditText clearEditText, TextView textView3) {
        this.a = scrollView;
        this.b = hintView;
        this.c = textView;
        this.d = textView2;
        this.e = progressButton;
        this.f = linearLayout;
        this.i = clearEditText;
        this.v = textView3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
