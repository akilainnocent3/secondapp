package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.feature.payment.impl.common.presentation.widget.AssetLabelTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class f3p implements g6i0 {
    public final ConstraintLayout a;
    public final AppCompatImageView b;
    public final View c;
    public final View d;
    public final AppCompatImageView e;
    public final AssetLabelTextView f;
    public final AppCompatImageView i;
    public final AppCompatImageView v;
    public final TextView w;

    public f3p(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, View view, View view2, AppCompatImageView appCompatImageView2, AssetLabelTextView assetLabelTextView, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, TextView textView) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
        this.c = view;
        this.d = view2;
        this.e = appCompatImageView2;
        this.f = assetLabelTextView;
        this.i = appCompatImageView3;
        this.v = appCompatImageView4;
        this.w = textView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
