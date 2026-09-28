package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;

/* JADX INFO: loaded from: classes5.dex */
public final class tgd0 implements g6i0 {
    public final AppCompatImageView A;
    public final TextView B;
    public final ConstraintLayout a;
    public final AppCompatTextView b;
    public final View c;
    public final View d;
    public final TextView e;
    public final Group f;
    public final AppCompatImageView i;
    public final LinearLayout v;
    public final TextView w;
    public final LinearLayout y;
    public final LinearLayout z;

    public tgd0(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, View view, View view2, TextView textView, Group group, AppCompatImageView appCompatImageView, LinearLayout linearLayout, TextView textView2, LinearLayout linearLayout2, LinearLayout linearLayout3, AppCompatImageView appCompatImageView2, TextView textView3) {
        this.a = constraintLayout;
        this.b = appCompatTextView;
        this.c = view;
        this.d = view2;
        this.e = textView;
        this.f = group;
        this.i = appCompatImageView;
        this.v = linearLayout;
        this.w = textView2;
        this.y = linearLayout2;
        this.z = linearLayout3;
        this.A = appCompatImageView2;
        this.B = textView3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
