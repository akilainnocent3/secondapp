package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.flexbox.FlexboxLayout;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes5.dex */
public final class pwi implements g6i0 {
    public final AppCompatTextView A;
    public final AppCompatTextView B;
    public final LinearLayout C;
    public final LinearLayout a;
    public final ProgressButton b;
    public final AppCompatImageView c;
    public final ClearEditText d;
    public final AppCompatImageView e;
    public final AppCompatImageView f;
    public final FlexboxLayout i;
    public final AppCompatTextView v;
    public final AppCompatTextView w;
    public final AppCompatTextView y;
    public final AppCompatTextView z;

    public pwi(LinearLayout linearLayout, ProgressButton progressButton, AppCompatImageView appCompatImageView, ClearEditText clearEditText, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, FlexboxLayout flexboxLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, LinearLayout linearLayout2) {
        this.a = linearLayout;
        this.b = progressButton;
        this.c = appCompatImageView;
        this.d = clearEditText;
        this.e = appCompatImageView2;
        this.f = appCompatImageView3;
        this.i = flexboxLayout;
        this.v = appCompatTextView;
        this.w = appCompatTextView2;
        this.y = appCompatTextView3;
        this.z = appCompatTextView4;
        this.A = appCompatTextView5;
        this.B = appCompatTextView6;
        this.C = linearLayout2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
