package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;

/* JADX INFO: loaded from: classes4.dex */
public final class bgd0 implements g6i0 {
    public final ConstraintLayout a;
    public final ImageView b;
    public final TextView c;
    public final View d;
    public final View e;
    public final Group f;
    public final FrameLayout i;
    public final ConstraintLayout v;
    public final TextView w;
    public final TextView y;

    public bgd0(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, View view, View view2, Group group, FrameLayout frameLayout, ConstraintLayout constraintLayout2, TextView textView2, TextView textView3) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = textView;
        this.d = view;
        this.e = view2;
        this.f = group;
        this.i = frameLayout;
        this.v = constraintLayout2;
        this.w = textView2;
        this.y = textView3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
