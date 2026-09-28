package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.sporty.android.common_ui.widgets.CashOutLoadingButton;

/* JADX INFO: loaded from: classes5.dex */
public final class xgd0 implements g6i0 {
    public final TextView A;
    public final TextView B;
    public final ConstraintLayout a;
    public final View b;
    public final TextView c;
    public final ImageView d;
    public final CashOutLoadingButton e;
    public final AppCompatTextView f;
    public final AppCompatImageView i;
    public final Group v;
    public final TextView w;
    public final ComposeView y;
    public final TextView z;

    public xgd0(ConstraintLayout constraintLayout, View view, TextView textView, ImageView imageView, CashOutLoadingButton cashOutLoadingButton, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, Group group, TextView textView2, ComposeView composeView, TextView textView3, TextView textView4, TextView textView5) {
        this.a = constraintLayout;
        this.b = view;
        this.c = textView;
        this.d = imageView;
        this.e = cashOutLoadingButton;
        this.f = appCompatTextView;
        this.i = appCompatImageView;
        this.v = group;
        this.w = textView2;
        this.y = composeView;
        this.z = textView3;
        this.A = textView4;
        this.B = textView5;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
