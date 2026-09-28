package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes5.dex */
public final class cxi implements g6i0 {
    public final TextView A;
    public final ScrollView a;
    public final HintView b;
    public final ClearEditText c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView i;
    public final ProgressButton v;
    public final LinearLayout w;
    public final TextView y;
    public final ClearEditText z;

    public cxi(ScrollView scrollView, HintView hintView, ClearEditText clearEditText, TextView textView, TextView textView2, TextView textView3, TextView textView4, ProgressButton progressButton, LinearLayout linearLayout, TextView textView5, ClearEditText clearEditText2, TextView textView6) {
        this.a = scrollView;
        this.b = hintView;
        this.c = clearEditText;
        this.d = textView;
        this.e = textView2;
        this.f = textView3;
        this.i = textView4;
        this.v = progressButton;
        this.w = linearLayout;
        this.y = textView5;
        this.z = clearEditText2;
        this.A = textView6;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
