package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.sporty.android.common_ui.widgets.CashOutLoadingButton;

/* JADX INFO: loaded from: classes5.dex */
public final class sgd0 implements g6i0 {
    public final ConstraintLayout A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final View E;
    public final AppCompatTextView F;
    public final AppCompatImageView G;
    public final TextView H;
    public final TextView I;
    public final ConstraintLayout a;
    public final View b;
    public final Group c;
    public final TextView d;
    public final ImageView e;
    public final TextView f;
    public final CashOutLoadingButton i;
    public final ImageView v;
    public final TextView w;
    public final ImageView y;
    public final ImageView z;

    public sgd0(ConstraintLayout constraintLayout, View view, Group group, TextView textView, ImageView imageView, TextView textView2, CashOutLoadingButton cashOutLoadingButton, ImageView imageView2, TextView textView3, ImageView imageView3, ImageView imageView4, ConstraintLayout constraintLayout2, TextView textView4, TextView textView5, TextView textView6, View view2, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, TextView textView7, TextView textView8) {
        this.a = constraintLayout;
        this.b = view;
        this.c = group;
        this.d = textView;
        this.e = imageView;
        this.f = textView2;
        this.i = cashOutLoadingButton;
        this.v = imageView2;
        this.w = textView3;
        this.y = imageView3;
        this.z = imageView4;
        this.A = constraintLayout2;
        this.B = textView4;
        this.C = textView5;
        this.D = textView6;
        this.E = view2;
        this.F = appCompatTextView;
        this.G = appCompatImageView;
        this.H = textView7;
        this.I = textView8;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
